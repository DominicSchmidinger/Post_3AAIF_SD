public class Student
{
    private String name;
    private float kg;
    private int cm;
    private char gender;

    // Constructor
    // name: mind. 3 char, max 50
    public Student (String name, float kg, int cm) {
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
    }
    // setter für name
    public void setName (String name) {
        // TODO separate Meldungen zu kurz bzw. zu lang
        if (name.length() < 3 || name.length() > 50) {
            throw new IllegalArgumentException("Name muss 3-50 Buchstaben haben");
        }
        this.name = name;
    }

    // setter für kg
    public void setKg (float kilogramm) {
        this.kg = kilogramm;
    }

    // setter für cm
    public void setCm (int cm) {
        this.cm = cm;
    }

    // calculate bmi
    public float bmi () {
        return this.kg/((this.cm/100.0f)*(this.cm/100.0f));
    }

    public String mannOderFrau () {
        if (this.gender == 'm') return "männlich";
        // this.
        return "weblich";
    }

    public String toString () {
        return "Name: " + this.name + " (" + this.mannOderFrau() + ")";
    }
}

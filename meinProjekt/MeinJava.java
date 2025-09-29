public class Student {

    // ===========================
    // 1) Attribute (Datenfelder)
    // ===========================
    private String name;
    private float kg;
    private int cm;
    private char gender;
    // =========================================
    // 2) Konstruktor
    // =========================================
    public Student(String name, float kg, int cm, char gender) {
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        this.setGender(gender);
    }

    public Student(String name, boolean isMann, int cm, int kg) {
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        if (isMann) {
            this.setGender('m');
        } else {
            this.setGender('f');
        }
    }

    // =========================================
    // 3) Setter-Methoden
    // =========================================
    public void setName(String name) {
        if (name.length() < 3 || name.length() > 50) {
            throw new IllegalArgumentException("Name muss 3-50 Buchstaben haben");
        }
        this.name = name;
    }

    public void setKg(float kg) {
        if (kg < 2 || kg > 635) {
            throw new IllegalArgumentException("Bruder geh Gym");
        }
        this.kg = kg;
    }

    public void setCm(int cm) {
        if (cm < 50 || cm > 250){
            throw new IllegalArgumentException("Als ob du so groß bist");
        }
        this.cm = cm;
    }

    public void setGender(char gender) {
        gender = Character.toLowerCase(gender);
        if (gender != 'm' && gender != 'f'){
            throw new IllegalArgumentException("Bruder nimm ein gscheites gender");
        }
        this.gender = gender;
    }

    // =========================================
    // 3b) Getter-Methoden
    // =========================================
    public String getName() {
        return this.name;
    }

    public float getKg() {
        return this.kg;
    }

    public int getCm() {
        return this.cm;
    }

    public char getGender() {
        return this.gender;
    }
    
    // =========================================
    // 4) BMI berechnen
    // =========================================
    public float bmi() {
        float meter = this.cm / 100.0f;
        return this.kg / (meter * meter);
    }

    // =========================================
    // 5) Geschlecht als Text zurückgeben
    // =========================================
    public String mannOderFrau() {
        if (this.gender == 'm' || this.gender == 'M') return "männlich";
        if (this.gender == 'w' || this.gender == 'W') return "weiblich";
        return "Fehler: kein gültiges Geschlecht";
    }

    // =========================================
    // 6) Gewichtsklasse bestimmen
    // =========================================
    public String gewichtsklasse() {
        float bmi = this.bmi();
        if (this.gender == 'm' || this.gender == 'M') {
            if (bmi < 20f) return "Untergewicht";
            else if (bmi <= 25f) return "Normalgewicht";
            else return "Übergewicht";
        } else if (this.gender == 'w' || this.gender == 'W') {
            if (bmi < 19f) return "Untergewicht";
            else if (bmi <= 24f) return "Normalgewicht";
            else return "Übergewicht";
        } else {
            throw new IllegalArgumentException ("Es gibt nur zwei biologische gender");
        }
    }

    // =========================================
    // 7) Alle Studentendaten als Text zurückgeben
    // =========================================
    public String printStudent() {
        return "Name: " + this.name
        + " (" + this.mannOderFrau() + "), "
        + this.kg + "kg, "
        + this.cm + "cm ("
        + this.gewichtsklasse() + ")";
    }
}
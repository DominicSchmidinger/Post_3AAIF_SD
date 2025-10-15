import java.util.Calendar;

public class AutoTest {
    private String name;
    private int eigengewicht;
    private Person fahrer;
    private Person beifahrer;
    private Person rueckbank;

    //kopnstrukter

    // Methoden
    public void einsteigen(Person person) {
        // 1. Prüfung ob Referenz person nicht null
        if (person == null) {
            throw new IllegalArgumentException ("dont gimme null");
        }
        if (this.fahrer == null){
            this.fahrer = person;
            return;
        }
        if (this.beifahrer == null){
            this.beifahrer = person;
            return;
        }
        if (this.rueckbank == null){
            this.rueckbank = person;
        }
        if (this.fahrer == null){
            throw new IllegalArgumentException ("bruder einer muss fahren");
        }
    }

    public void aussteigenFahrer() {
        fahrer = null;
    }

    public void aussteigenBeifahrer() {
        beifahrer = null;
    }

    public void aussteigenRueckbank() {
        rueckbank = null;
    }

    public void aussteigen(Person person) {
        if (person == null) {
            throw new IllegalArgumentException ("es sitzt keiner im auto");
        }

        if (this.fahrer == person ){
            this.fahrer = null;
            return;
        }

        if (this.beifahrer == person){
            this.beifahrer = null;
            return;
        } 

        if (this.rueckbank == person){
            this.rueckbank = null;
            return;
        }
        throw new IllegalArgumentException ("person ist und war nie im auto");
    }

    public void aussteigen(String name) {
        if (name == null) {
            throw new IllegalArgumentException ("name ist nichtmal im auto");
        }
        if (this.fahrer != null && name.equals(fahrer.getName())) {
            this.fahrer = null;
            return;
        }
        if (this.beifahrer != null && name.equals(beifahrer.getName())) {
            this.beifahrer = null;
            return;
        }
        if (this.rueckbank != null && name.equals(rueckbank.getName())) {
            this.rueckbank = null;
            return;
        }
    }

    public float gesamtGewicht() {
        float gesamtGewicht = getEigengewicht();
        if (this.fahrer != null) {
            gesamtGewicht = gesamtGewicht + this.fahrer.getKg();
        }
        if (this.beifahrer != null) {
            gesamtGewicht = gesamtGewicht + this.beifahrer.getKg();
        }
        if (this.rueckbank != null) {
            gesamtGewicht = gesamtGewicht + this.rueckbank.getKg();
        }
        return gesamtGewicht;
    }

    public void printAuto() {
        System.out.println("Auto: " + name + ", Eigengewicht: " + eigengewicht);
        System.out.println("--------------------------------------------------------");
        System.out.print("Fahrer: ");
        if (this.fahrer != null) {
            this.fahrer.printPerson();
            System.out.print("Beifahrer: ");
        }
        if (this.beifahrer != null) {
            this.beifahrer.printPerson();
        }    
        System.out.println(" --frei--");
        System.out.print("Rueckbank: ");
        if (this.rueckbank != null) {
            this.rueckbank.printPerson(); // <-- Das fehlte!
        } else {
            System.out.println(" --frei--");
        }
        System.out.println("--------------------------------------------------------");
    }

    // Getter und Setter für name und eigengewicht (falls benötigt)
    public int getEigengewicht() {
        return this.eigengewicht;
    }

    public void setEigengewicht(int eigengewicht) {
        this.eigengewicht = eigengewicht;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
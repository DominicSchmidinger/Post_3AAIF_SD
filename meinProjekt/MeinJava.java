import java.util.Calendar;
public class Person { // Definiert eine öffentliche Klasse Student

    // ===========================
    // 1) Attribute (Eigenschaften des Objekts)
    // ===========================
    private String name; // Name des Studenten (Zeichenkette)
    private float kg;    // Gewicht in Kilogramm (Zahl mit Nachkommastellen)
    private int cm;      // Größe in Zentimetern (Ganzzahl)
    private char gender; // Geschlecht ('m' für männlich, 'f' für weiblich)
    private int geburtsjahr;
    private int alter;
    
    
    // ===========================
    // 2) Konstruktoren (werden beim Erstellen eines Objekts aufgerufen)
    // ===========================
    public Person (String name, float kg, int cm, char gender, int geburtsjahr) { 
        // Setzt alle Attribute direkt
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        this.setGender(gender);
        this.setGeburtsjahr(geburtsjahr);
    }

    public Person (String name, boolean isMann, int cm, int kg, int geburtsjahr) { 
        // Konstruktor mit Boolean: true = männlich, false = weiblich
        this.setName(name);
        this.setKg(kg);
        this.setCm(cm);
        this.setGeburtsjahr(geburtsjahr);
        if (isMann) {
            this.setGender('m'); // Attribut wird auf 'm' gesetzt
        } else {
            this.setGender('f'); // Attribut wird auf 'f' gesetzt
        }
    }

    // ===========================
    // 3) Setter-Methoden (ändern Werte nachträglich)
    // ===========================
      public void setGeburtsjahr(int geburtsjahr){
       this.geburtsjahr = geburtsjahr;
       this.alter = Calendar.getInstance().get(Calendar.YEAR) - geburtsjahr;
    }
    
    public void setName(String name) { 
        // Prüft die Länge des Namens
        if (name.length() < 3 || name.length() > 50) {
            throw new IllegalArgumentException("Name muss 3-50 Buchstaben haben");
        }
        this.name = name; // Speichert den Parameterwert im Attribut
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
        gender = Character.toLowerCase(gender); // Wandelt Buchstaben in Kleinbuchstaben um
        if (gender != 'm' && gender != 'f'){
            throw new IllegalArgumentException("Bruder nimm ein gscheites gender");
        }
        this.gender = gender;
    }

    // ===========================
    // 3b) Getter-Methoden (holen Werte aus dem Objekt)
    // ===========================
    public int getAlter() {
        return this.alter;
    }
    
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
    
    // ===========================
    // 4) BMI berechnen
    // ===========================
    public float bmi() { 
        float meter = this.cm / 100.0f; // Zentimeter in Meter umrechnen
        return this.kg / (meter * meter); // BMI = Gewicht / (Größe * Größe)
    }

    // ===========================
    // 5) Geschlecht als Text zurückgeben
    // ===========================
    public String mannOderFrau() { 
        if (this.gender == 'm') return "männlich";
        if (this.gender == 'f') return "weiblich";
        return "Fehler: kein gültiges Geschlecht";
    }

    // ===========================
    // 6) Gewichtsklasse bestimmen
    // ===========================
    public String gewichtsklasse() { 
        float bmi = this.bmi();
        if (this.gender == 'm') {
            if (bmi < 20f) return "Untergewicht";
            else if (bmi <= 25f) return "Normalgewicht";
            else return "Übergewicht";
        } else if (this.gender == 'f') {
            if (bmi < 19f) return "Untergewicht";
            else if (bmi <= 24f) return "Normalgewicht";
            else return "Übergewicht";
        } else { 
            throw new IllegalArgumentException ("Es gibt nur zwei biologische gender");
        }
    }

    // ===========================
    // 7) Alle Studentendaten als Text zurückgeben
    // ===========================
    public String printPerson() { 
        return "Name: " + this.name
        + " (" + this.mannOderFrau() + "), "
        + this.kg + "kg, "
        + this.cm + "cm ("
        + this.gewichtsklasse() + ")"
        + this.alter + "Jahre";
    }
} // Ende der Klasse Student
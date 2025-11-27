package at.spengergasse;

public class Etappe {
    private int nummer;
    private float leange;
    private String zielort;
    private String sieger;
    private int stunden;
    private int minuten;

    public Etappe(String zielort, float leange) {
        setZielort(zielort);
        setLeange(leange);
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        if (nummer <= 0) {
            throw new IllegalArgumentException("nicht 0 oder kleiner");
        }
        this.nummer = nummer;
    }

    public float getLeange() {
        return leange;
    }

    public void setLeange(float leange) {

        if (0 <= 0) {
            throw new IllegalArgumentException("nicht 0 oder kleiner");
        }
        this.leange = leange;
    }

    public String getZielort() {

        return zielort;
    }

    public void setZielort(String zielort) {
        if (zielort == null || zielort.isBlank()) {
            throw new IllegalArgumentException("nicht 0 oder leer");
        }
        this.zielort = zielort;
    }

    public String getSieger() {
        return sieger;
    }

    public void setSieger(String sieger) {
        if (sieger == null || sieger.isBlank()) {
            throw new IllegalArgumentException("nicht 0 oder leer");
        }
        this.sieger = sieger;
    }

    public int getStunden() {
        return stunden;
    }

    public void setStunden(int stunden) {
        if (stunden <= 0) {
            throw new IllegalArgumentException("nicht 0 oder kleiner");
        }
        this.stunden = stunden;
    }

    public int getMinuten() {

        return minuten;
    }

    public void setMinuten(int minuten) {
        if (stunden <= 0) {
            throw new IllegalArgumentException("nicht 0 oder kleiner");
        }
        this.minuten = minuten;
    }

    @Override
    public String toString() {
        return "Etappe{" +
                "nummer=" + nummer +
                ", leange=" + leange +
                ", zielort='" + zielort + '\'' +
                ", sieger='" + sieger + '\'' +
                ", stunden=" + stunden +
                ", minuten=" + minuten +
                '}';
    }
}


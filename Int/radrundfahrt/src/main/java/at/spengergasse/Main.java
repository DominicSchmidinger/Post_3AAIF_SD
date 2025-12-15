package at.spengergasse;
public class Main {
    public static void main(String[] args) {
        try {
            Etappe etappe = new Etappe("Bad Aussee", 151);
            System.out.println(etappe);
        } catch (IllegalArgumentException ex){
            System.out.println("unerwartete exception: " +ex.getMessage());
        }

    }
}
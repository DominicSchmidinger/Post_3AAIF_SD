package spengergasse.at;

public class Main {
    public static void main(String[] args) {
        PlaylistManeger playlist1 = new PlaylistManeger();
        Song s1 = new Song("Alex mein Bubu", "Jakob", "Rock");
        Song s2 = new Song("Meine Hoden brennen", "Julius", "Pop");

        playlist1.addSongs(s1);
        playlist1.addSongs(s2);
        playlist1.addSongs(s1);
        playlist1.addSongs(s1);
        playlist1.addSongs(s1);
        playlist1.addSongs(s2);
        playlist1.addSongs(s2);
        playlist1.addSongs(s1);
        // Filter Genre new Array Test
        System.out.println(playlist1.filterByGernre("Rock"));
        System.out.println(playlist1.filterByGernre("Pop"));

        // Pre Remove
        System.out.println(playlist1);
        // s1 sollte nicht removed werden
        playlist1.removeDuplicate(s1);
        playlist1.removeDuplicate(s2);
        // After Remove
        System.out.println(playlist1);
    }
}
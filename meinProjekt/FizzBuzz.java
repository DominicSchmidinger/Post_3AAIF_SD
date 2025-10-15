public class Main
{
    public static void fizzbuzz() {

        /*
         * Aufgabe eine fizz buzz whizz bang liste machen die beu FizzBuzzWhizzBang
         * und regeln einführen das sie bei bestimmten if statments wenn diese
         * durch drei 5 7 und 11 teilbar sind ohne rest (modulo) einen string ausdrücken

         */

        for (int i  = 1; true; i++) {
            String printme = ""; //ich sage ihm er soll einen string printen also einem namen den ich ihm gebe
            if (i % 3 == 0) printme +="Fizz"; //wenn ich die zahl i durch 3 rechne und mir kein rest bleibt schreibt er mir den string nach print me (in dem fall print me)
            if (i % 5 == 0) printme += "Buzz"; 
            if (i % 7 == 0) printme += "Whizz"; 
            if (i % 11 == 0) printme += "Bang"; 
            // Prüfen, ob alle vier Bedingungen erfüllt sind
            if (printme.equals("FizzBuzzWhizzBang")) {  //sobald ich FizzBuzzWhizzBang erreicht hab soll mein program das printen und dann aber stoppen
                System.out.println(printme);
                break; // Schleife hier stoppen
            }

            if (printme.isEmpty()) System.out.println(i); //solang oben nich erreicht soll es weitermachen
            else System.out.println(printme);              //es soll wenn printme nixh empty is also einer der bedingungen erfüllt ist jene printen 
        }
    }

    public static void main(String[] args) { //Das startet mir mein Programm ich erstelle diesmal kein objekt sondern machen ein Programm :) yai
        fizzbuzz();
    }
}

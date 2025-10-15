public class SameEqual{
    public boolean equals (Object other){
        return false;
    }
    public static void false_false(){
        SameEqual a = new SameEqual();
        SameEqual b = new SameEqual();
        System.out.println (a == b);
        System.out.println (a.equals(b)); 
        //funktioniert
    }
    public static void true_false(){
        SameEqual a = new SameEqual();
        SameEqual b = a;
        System.out.println (a == b);
        System.out.println (a.equals(b));
        //funktioniert
        
    }
    
    public static void false_true(){
        SameEqual a = new SameEqual();
        SameEqual b = new SameEqual();
        System.out.println (a == b);
        System.out.println (!a.equals(b)); 
    }
    public static void true_true(){
        SameEqual a = new SameEqual();
        SameEqual b = a;
        System.out.println (a== b);
        System.out.println (!a.equals(b));
    }
}
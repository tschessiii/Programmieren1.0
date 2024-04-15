package Übungen_PR1_Gerzic.Klassen;

public class Hund_Klasse {
    private int alter;
    private String rasse;
    private String name;

    public Hund_Klasse(int alter,int name,int rasse){

    }

    public String bellen(){
        return "Woof, ich bin "+name;
    }

    public void springen(){
        System.out.println("Hupf,Hupf");
    }


}

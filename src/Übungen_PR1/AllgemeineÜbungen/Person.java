package Übungen_PR1.AllgemeineÜbungen;

public class Person {

    //
    public String nachname;
    public String vorname;
    public int alter;
    public String[] haustier;

    //Constructor erstellen
    public Person(String name, String vorname, int alter) {
        this.nachname = name;
        this.vorname = vorname;
        this.alter = alter;
        haustier = new String[3];
    }

    //Methode erstellen
    public String name(){
        return vorname+ " "+nachname;
    }

    //Haustier hinzufügen
    public void neuesHaustier(String tier){

        for (int i = 0; i < haustier.length;i++){//laufen alle Haustiere durch
            if(haustier[i]==null){//Sobald an einer Stelle null also ein Platz für ein neues Tier ist kommt eins rein
                System.out.println("Willkommen "+tier+"!");
                haustier[i] = tier;
                break;
            }
        }
    }

    public int anzahlHaustier(){
        int counter = 0;
        for (String tier:haustier){//Wir gehen jedes Tier durch
            if(tier != null){//Wenn es an einer Stelle ein Tier gibt, erhöhen wir den Counter um 1
                counter++;
            }
        }
        return counter;
    }

    public void haustiereInfo(){
        System.out.println(vorname+" hat "+anzahlHaustier()+" Haustier(e).");
        for (String tier :haustier){
            if(tier != null){
                System.out.println(tier);
            }
        }
    }




    //To String zum Ausgeben erstellen
    @Override
    public String toString() {
        return "Der Name ist: "+name()+"\nDas alter ist: "+alter;
    }
}

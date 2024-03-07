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
                haustier[i] = tier;
                break;
            }
        }
    }
    //To String zum Ausgeben erstellen
    @Override
    public String toString() {
        return "Der Name ist: "+name()+"\nDas alter ist: "+alter;
    }
}

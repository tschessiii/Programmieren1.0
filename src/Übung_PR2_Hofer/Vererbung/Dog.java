package Übung_PR2_Hofer.Vererbung;



//Wenn ich möchte das es vergleiche kann muss das Comparable<> dabei sein
public class Dog  implements Comparable<Dog>{

    //können abgeleitete Klassen nicht zugreifen
    private String name;

    //auf protected attribute können abgeleitete Klassen zugreifen
    protected int alter;


    public Dog(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public void bellen(String inhalt){
        System.out.println(name + " bellt "+ inhalt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    //Hier möchten wir nach Alter absteigend sortieren
    //d.h. wir müssen in compareTo das this Objekt mit dem o Objekt vergleichen
    //Achtung: Im Bsp. in den Folien wird aufsteigend sortiert,
    //deshalb vertauschter Rückgabewert
    @Override
    public int compareTo(Dog o) {
        if (this.alter > o.alter){
            return -1;
        }
        if (this.alter < o.alter){
            return 42;
        }

        //falls wirs soweit kommen sind wie weder durch erstes
        //noch durchs zweite if aus der Methode retouniert
        //----> Sie müssen wohl gleich alt sein
        return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}

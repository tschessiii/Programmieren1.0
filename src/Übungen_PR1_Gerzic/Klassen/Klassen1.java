package Übungen_PR1_Gerzic.Klassen;

public class Klassen1 {
    public static void main(String[] args) {

       /*
       Bello Beispiel:
        int alter_bello =3;
        String rasse_bello= "Meine Rasse ist: Dackel";
        String name_bello="Bello";
        String bellen = "Woof, ich bin "+name_bello;
        String hupfen = "Hupf,Hupf";
        */

        /*
        Übungen_PR1.AllgemeineÜbungen.Klassen.Kreis Beispiel:
        Übungen_PR1.AllgemeineÜbungen.Klassen.Kreis k1 = new Übungen_PR1.AllgemeineÜbungen.Klassen.Kreis(3);
        Übungen_PR1.AllgemeineÜbungen.Klassen.Kreis k2= new Übungen_PR1.AllgemeineÜbungen.Klassen.Kreis(2);
        Übungen_PR1.AllgemeineÜbungen.Klassen.Kreis k3= new Übungen_PR1.AllgemeineÜbungen.Klassen.Kreis(6);

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
         */

        /*
        Übungen.Rechteck Beispiel:
        Übungen_PR1.AllgemeineÜbungen.Klassen.Rechteck1 r1 = new Übungen_PR1.AllgemeineÜbungen.Klassen.Rechteck1(4, 6);
        System.out.println(r1);
         */

        /*
        Übungen.Person Beispiel:
        Übungen.Person person1 = new Übungen.Person("Pan","Peter",23);
        System.out.println(person1);

        person1.neuesHaustier("Hund");
        person1.neuesHaustier("Katze");
        person1.neuesHaustier("Schlange");
        person1.haustiereInfo();
        System.out.println(person1.anzahlHaustier());
         */

        //Lehveranstaltungs Beispiel:
        Lehrveranstaltung lv1 =new Lehrveranstaltung("Datenbank",4);
       for (int i = 1;i<=12;i++){
           lv1.neueNote(i);
        }
        System.out.println(lv1);
        System.out.println(lv1.besteNote());

    }
}

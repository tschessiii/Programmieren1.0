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
        Klassen.Kreis Beispiel:
        Klassen.Kreis k1 = new Klassen.Kreis(3);
        Klassen.Kreis k2= new Klassen.Kreis(2);
        Klassen.Kreis k3= new Klassen.Kreis(6);

        System.out.println(k1);
        System.out.println(k2);
        System.out.println(k3);
         */

        /*
        Rechteck Beispiel:
        Klassen.Rechteck1 r1 = new Klassen.Rechteck1(4, 6);
        System.out.println(r1);
         */

        Person person1 = new Person("Pan","Peter",23);
        System.out.println(person1);

        person1.neuesHaustier("Hund");
        person1.neuesHaustier("Katze");
        person1.neuesHaustier("Schlange");
        person1.haustiereInfo();
        System.out.println(person1.anzahlHaustier());
    }
}

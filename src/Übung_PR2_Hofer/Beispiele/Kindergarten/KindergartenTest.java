package Übung_PR2_Hofer.Beispiele.Kindergarten;

public class KindergartenTest {


    public static void main(String[] args) {
        Kindergarten kindergarten = new Kindergarten("IgelGruppe");

        kindergarten.addKind(new Kind("Sebastian","Maier", 3));
        kindergarten.addKind(new Kind("Jan","Müller", 4));
        kindergarten.addKind(new Kind("Pascal","Mauer", 5));

        System.out.println(kindergarten.getKinder());

        System.out.println("--------------------------------------------------------------------------------------------");

        kindergarten.sortAlphabetical();
        System.out.println(kindergarten.getKinder());

        System.out.println("---------------------------------------------------------------------------------------------");

        kindergarten.sortAge();
        System.out.println(kindergarten.getKinder());

    }




}

package Übungen_PR1_Gerzic.Part5;

public class AutoTest {
    public static void main(String[] args){

        Auto a1 = new Auto("Audi","R08",2023);
        Auto a2 = new Auto("Porsche","Cayenne",2012);

        //Auto 1 gibt gas und bremst wieder ab
        a1.gasGeben(100);
        System.out.println(a1.toString());
        System.out.println("Achtung ein Reh kreuzt den Weg! --> BREMSEN");

        a1.bremsen(60);
        System.out.println(a1.toString());
        System.out.println("GEBREMST");


        //Auto zwei gibt währendessen Gas
        a2.gasGeben(260);
        System.out.println(a2.toString());



    }


}

package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.Example01Person;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable p1 = new Person("Andreas");
        Runnable p2 = new Person("Annika");

        Thread t1 = new Thread(p1);
        Thread.sleep(500);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();

        try {
            System.out.println("Warte auf Thread 1...");
            t1.join();
            System.out.println("Warte auf Thread 2...");
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("MAIN: ENDE");

    }
}

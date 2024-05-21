package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.SingleThread;

public class SingleThread {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Thread aktuellFaden = Thread.currentThread();
        System.out.println("I am inside: "+aktuellFaden.getName());
    }
}

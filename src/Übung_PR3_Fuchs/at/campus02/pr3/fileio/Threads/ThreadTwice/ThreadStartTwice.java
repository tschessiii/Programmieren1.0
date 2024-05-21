package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.ThreadTwice;

public class ThreadStartTwice extends Thread {
    public void run() {
        System.out.println("Hello Wolrd! This is Demo2.");
        Thread aktuellFaden = Thread.currentThread();
        System.out.println("I am inside: "+aktuellFaden.getName());
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadStartTwice t1 = new ThreadStartTwice();
        t1.start();
        Thread.sleep(2000);
        ThreadStartTwice t2 = new ThreadStartTwice();
        t2.start();
    }




}
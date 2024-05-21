package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.RunnableExample;

public class RunnableExample implements Runnable{


    @Override
    public void run() {
        System.out.println("I am inside: " +Thread.currentThread().getName());
    }

    public static void speziell(){
        System.out.println("lol");
    }

    public static void main(String[] args) {
        System.out.println("Hello from Demo3: RunnableExample");

        System.out.println("Creating Runnable...");
        RunnableExample r1 = new RunnableExample();

        System.out.println("Creating Thread...");
        Thread t1 = new Thread(r1);
        System.out.println("Name of the new Thread: "+t1.getName());

        System.out.println("Starting Thread...");
        t1.start();


    }
}

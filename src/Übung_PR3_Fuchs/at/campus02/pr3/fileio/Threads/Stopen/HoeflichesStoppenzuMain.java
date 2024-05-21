package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.Stopen;

public class HoeflichesStoppenzuMain {
    public static void main(String[] args) throws InterruptedException {
        HoeflichesStoppen_Person p1 = new HoeflichesStoppen_Person("Andreas");
        HoeflichesStoppen_Person p2 = new HoeflichesStoppen_Person("Annika");

        Thread t1 = new Thread(p1);
        Thread.sleep(500);
        Thread t2 = new Thread(p2);

        t1.start();
        t2.start();

        System.out.println("State t1..."+t1.getState());
        System.out.println("State t2 ..."+t2.getState());

        Thread.sleep(1200);
        p1.RequestShutDown();
        Thread.sleep(1200);
        p2.RequestShutDown();

        System.out.println("MAIN: ENDE");
    }

}

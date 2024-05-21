package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.kritischeSenktionen;

import java.util.Date;

public class kritischeSenktion implements Runnable {

        private boolean isRunning = true;
        private String name;

        public static Object lock = new Object();


    public kritischeSenktion(String name) {
        this.name = name;
    }

    @Override
        public void run() {
            synchronized (lock);
            for (int i = 0; i < 10; i++) {
                if(isRunning == false){
                    break;
                }
                System.out.println("Ich bin: "+name+" und ich bin inside: "+Thread.currentThread().getName());
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    throw new RuntimeException(e);
                }

            }

            System.out.println(Thread.currentThread().getName()+" is finished!");
        }

}


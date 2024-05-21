package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.ue3_1;

import java.util.Date;

public class ClockThread implements Runnable {

    private boolean isRunning = true;

    @Override
    public void run() {
        while(isRunning){
            Date date = new Date();
            System.out.println("Aktuelle Uhrzeit: "+date.toString());
        }try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void stopRunning(){
        this.isRunning = false;
    }
}

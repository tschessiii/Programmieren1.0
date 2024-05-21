package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.Stopen;

public class HoeflichesStoppen_Person implements Runnable {
    private String name;
    private boolean isRunning = true;

    public HoeflichesStoppen_Person(String name) {
        this.name= name;
    }

    public void RequestShutDown(){
        isRunning = false;
    }

    @Override
    public void run() {
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


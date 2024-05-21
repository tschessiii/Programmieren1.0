package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.Example01Person;

public class Person implements Runnable {

    private String name;


    public Person(String name) {
        this.name= name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Ich bin: "+name+" und ich bin inside: "+Thread.currentThread().getName());
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }

        }
    }
}

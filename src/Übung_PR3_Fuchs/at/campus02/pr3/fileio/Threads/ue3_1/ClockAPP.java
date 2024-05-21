package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Threads.ue3_1;

import java.util.Scanner;

public class ClockAPP {
    public static void main(String[] args) {
        // Erstellen des Hintergrund-Threads
        ClockThread clockThread = new ClockThread();
        Thread thread = new Thread(clockThread);
        thread.start();


        // Haupt-Thread, der auf Benutzereingabe wartet
        System.out.println("Press any key to stop the clock...");

        // Scanner für Benutzereingaben
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();  // Wartet auf Benutzereingabe

        // Den ClockThread höflich stoppen
        clockThread.stopRunning();
        scanner.close();

        try {
            // Warten auf das Ende des Hintergrund-Threads
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Clock stopped. Application exiting.");
    }
}

package Übung_PR3_Fuchs.at.campus02.pr3.fileio.FileIO.ue4;

import java.io.File;

public class ue4 {
    public static void main(String[] args) {

        String directoryPath = "C:\\Users\\s54825\\Downloads";
        File directory = new File(directoryPath);

        // Überprüfen, ob das angegebene Verzeichnis existiert und ein Verzeichnis ist
        if (directory.exists() && directory.isDirectory()) {
            // Methode aufrufen, um die Dateiattribute auszugeben
            printFilesAttributes(directory);
        } else {
            System.out.println("Das angegebene Verzeichnis existiert nicht oder ist kein Verzeichnis.");
        }
    }

    public static void printFilesAttributes(File directory) {
        // Abrufen der Liste von Dateien und Verzeichnissen im angegebenen Verzeichnis
        File[] files = directory.listFiles();

        if (files != null) {
            // Variable zur Berechnung der Gesamtgröße aller Dateien initialisieren
            long totalFileSize = 0;

            // Iteration über jedes Element im Verzeichnis
            for (File file : files) {
                // Überprüfen, ob das Element eine Datei ist
                if (file.isFile()) {
                    // Dateiname ausgeben
                    System.out.println("Dateiname: " + file.getName());
                    // Dateipfad ausgeben
                    System.out.println("Dateipfad: " + file.getAbsolutePath());


                    // Dateigröße ausgeben
                    long fileSize = file.length();
                    System.out.println("Dateigröße: " + fileSize + " bytes");
                    // Die Dateigröße zur Gesamtgröße hinzufügen
                    totalFileSize += fileSize;
                    // Leere Zeile für bessere Lesbarkeit ausgeben
                    System.out.println();
                }
            }

            // Gesamtgröße aller Dateien ausgeben
            System.out.println("Gesamtspeicherplatz aller Dateien: " + totalFileSize + " bytes");
        } else {
            System.out.println("Das Auflisten von Dateien im angegebenen Verzeichnis ist fehlgeschlagen.");
        }
    }
}
package Übung_PR3_Fuchs.at.campus02.pr3.fileio.ue6;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class ue6 {

    public static void main(String[] args) {
        String path = "C:\\Users\\s54825\\Documents\\ÜbungsOrdner";

        //Methode zum erstellen der 10 Files
        createFiles(path);

        //Methode zum renamen der 10 files
        //renameFiles(path);

        //Methode zum Deleten
        //deleteFiles(path);
    }

    public static void createFiles(String path) {
        // Erstellen eines File-Objekts für den angegebenen Verzeichnispfad
        File directory = new File(path);

        // Überprüfen, ob das Verzeichnis existiert und ein Verzeichnis ist
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Das angegebene Verzeichnis existiert nicht oder ist kein Verzeichnis.");
            return;
        }

        // Schleife zum Erstellen von 10 Dateien
        for (int i = 0; i < 10; i++) {
            // Generierung eines zufälligen Dateinamens
            String fileName = "file_" + ThreadLocalRandom.current().nextInt(1000)+".txt";

            // Konstruktion des vollständigen Dateipfads
            String filePath = directory.getAbsolutePath() + File.separator + fileName;

            // Erstellen der Datei
            File newFile = new File(filePath);

            if (newFile.exists()) {
                System.out.println("Datei bereits vorhanden: " + filePath);
            }
            //Try um etwas auszuprobieren
            try {
                // Versuch, die Datei zu erstellen
                if (newFile.createNewFile()) {
                    // Wenn das Erstellen erfolgreich war, eine Erfolgsmeldung ausgeben
                    System.out.println("Datei erstellt: " + filePath);
                } else {
                    // Wenn das Erstellen nicht erfolgreich war, eine Fehlermeldung ausgeben
                    System.out.println("Fehler beim Erstellen der Datei: " + filePath);
                }
                //Sollte das Try mal nicht funktionieren nimmt das Catch auf
            } catch (IOException e) {
                // Falls eine IOException auftritt, eine Fehlermeldung ausgeben
                System.out.println("Fehler beim Erstellen der Datei: " + e.getMessage());
            }
        }
    }

    public static void renameFiles(String directoryPath) {
        File directory = new File(directoryPath);

        // Überprüfen, ob das Verzeichnis existiert
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Das angegebene Verzeichnis existiert nicht.");
            return;
        }

        // Liste der Dateien im Verzeichnis abrufen
        File[] files = directory.listFiles();

        // Iteration über alle Dateien
        for (File file : files) {
            if (file.isFile()) {
                // Konstruktion des neuen Dateinamens
                String newName = file.getParent() + File.separator + "1_" + file.getName();

                // Umbenennen der Datei
                File newFile = new File(newName);
                if (file.renameTo(newFile)) {
                    System.out.println("Umbenennen erfolgreich: " + file.getAbsolutePath() + " -> " + newName);
                } else {
                    System.out.println("Umbenennen fehlgeschlagen: " + file.getAbsolutePath());
                }
            }
        }
    }


    public static void deleteFiles(String directoryPath) {
        File directory = new File(directoryPath);

        // Überprüfen, ob das Verzeichnis existiert
        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("Das angegebene Verzeichnis existiert nicht.");
            return;
        }

        // Liste der Dateien im Verzeichnis abrufen
        File[] files = directory.listFiles();

        // Iteration über alle Dateien
        for (File file : files) {
            if (file.isFile()) {
                // Löschen der Datei
                if (file.delete()) {
                    System.out.println("Datei gelöscht: " + file.getAbsolutePath());
                } else {
                    System.out.println("Löschen fehlgeschlagen: " + file.getAbsolutePath());
                }
            }
        }
    }




}


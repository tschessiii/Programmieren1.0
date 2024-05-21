package Übung_PR3_Fuchs.at.campus02.pr3.fileio.ue5;

import java.io.File;

public class ue5 {

    public static void main(String[] args) {
        String path = "C:\\Users\\s54825\\Ordner1";

        // Methodenaufruf zum Erstellen von Verzeichnissen und Ausgeben des Ergebnisses
        boolean verzeichnisErstellt = createDirectory(path);
        System.out.println("Verzeichnis " + path + " erstellt?: " + verzeichnisErstellt);

    }

    public static boolean createDirectory(String path){
        // Erstellen eines File-Objekts für den angegebenen Verzeichnispfad
        File verzeichnis = new File(path);

        // Verwenden von mkdirs(), um Verzeichnisse zu erstellen und zu überprüfen, ob sie erfolgreich erstellt wurden
        boolean verzeichnisErstellt = verzeichnis.mkdirs();

        // Rückgabe von true, wenn die Verzeichnisse erfolgreich erstellt wurden, ansonsten false
        return verzeichnisErstellt;
    }
}

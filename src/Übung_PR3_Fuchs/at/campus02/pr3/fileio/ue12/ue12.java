package Übung_PR3_Fuchs.at.campus02.pr3.fileio.ue12;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ue12 {

    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
        FileInputStream fileInputStream = new FileInputStream(file);
        // Für Optimierung der Performance -> BufferedInputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
        // While-Schleife liest somit Zeichen um Zeichen aus.
        int byteRead;
        int i=0;
        while ((byteRead = bufferedInputStream.read()) != -1) {
            // char[] ch = Character.toChars(byteRead);
            // System.out.println(ch);
            // Byte wird in char umgewandelt und ausgegeben.
            //System.out.print("Zeichen " + i + ": ");
            System.out.print((int) ((char) byteRead));
            System.out.println("\t'" + (char) byteRead + "'");
            i++;
        }
        // close() gibt die Datei wieder frei.
        bufferedInputStream.close();
    }

}

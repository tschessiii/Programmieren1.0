package Übung_PR3_Fuchs.at.campus02.pr3.fileio.ue8;

import java.io.*;

public class ue8 {
    public static void main(String[] args) throws IOException {


        // Erstellen des InputStreamReader-Objekts, das den InputStream liest und in Zeichen umwandelt
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        // Erstellen des BufferedReader-Objekts, das Zeilenweise Eingaben liest
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String inputLine;
        // Schleife, die solange läuft, bis das Wort "STOP" eingegeben wird
        while (!(inputLine = reader.readLine()).equals("STOP")) {
            // Ausgabe der eingegebenen Zeile auf die Konsole
            System.out.println("Eingabe: " + inputLine);
        }

        // Schließen des BufferedReader, um Ressourcen freizugeben
        reader.close();

    }
}


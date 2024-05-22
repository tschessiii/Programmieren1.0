package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Network;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ue1 {

    public static void main(String[] args) throws FileNotFoundException {
        String urlFilePath = "C:\\Users\\s54825\\Documents\\Übung\\url.txt";
        String outPutFile = "content.html";

        try {
            // Lese die URL aus der Datei
            BufferedReader urlReader = new BufferedReader(new FileReader(urlFilePath));
            String urlString = urlReader.readLine();

            urlReader.close();


            if (urlString != null && !urlString.isEmpty()) {
                //Öffnen des Files
                URL url = new URL(urlString);
                BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

                //den Inhalt in die Datei content.html geben
                BufferedWriter out = new BufferedWriter(new FileWriter(outPutFile));
                String inputLine;

                while ((inputLine = in.readLine()) != null) {
                    out.write(inputLine);
                    out.newLine();
                }


                // Schließe die Streams
                in.close();
                out.close();
                System.out.println("Der Inhalt der URL wurde erfolgreich in 'content.html' geschrieben.");

            } else {
                System.out.println("Die Datei 'url.txt' ist leer oder enthält keine gültige URL.");
            }
        } catch (IOException e) {
            System.out.println("Ein Fehler ist aufgetreten: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Demo1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Demo1_ReadFromURL startin...");
        URL myurl = new URL("https://www.youtube.com");

        BufferedReader bf = new BufferedReader(
                new InputStreamReader(myurl.openStream()));

        String myString = null;

        while((myString= bf.readLine()) != null){
            System.out.println(myString);
        }

        bf.close();


    }
}

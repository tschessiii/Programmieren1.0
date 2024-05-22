package Übung_PR3_Fuchs.at.campus02.pr3.fileio.FileIO.ue7;


import java.io.*;

public class ue7 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s54825\\Documents\\ÜbungsOrdner\\Help_Me.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }

        bufferedReader.close();

    }

}

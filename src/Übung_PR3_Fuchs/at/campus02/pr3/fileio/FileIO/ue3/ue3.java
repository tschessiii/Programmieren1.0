package Übung_PR3_Fuchs.at.campus02.pr3.fileio.FileIO.ue3;

import java.io.File;

public class ue3 {

    public static void main(String[] args) {
        RecursiveFileDirectoryLister();
    }

    public static void RecursiveFileDirectoryLister(){
        String directorypath = "C:\\Users\\s54825\\Downloads";
        System.out.println("Original Path: "+directorypath);

        File directory = new File(directorypath);

        if(directory.exists() && directory.isDirectory()){
            listFilesAndDirectories(directory);
        }else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }

    }

    public static void listFilesAndDirectories(File directory) {
        File[] files = directory.listFiles();


        //If Schleife , falls files also die directory gleich null ist
        if (files != null) {
            //For Schleife um durch das komplette Array durch zu gehen
            for (File file : files) {
                //Wenn es ein File ist dann gebend as aus!
                if (file.isFile()) {
                    System.out.println("File: " + file.getAbsolutePath());
                //Wenn es eine Directory ist gebe das aus
                } else if (file.isDirectory()) {
                    System.out.println("Dir: " + file.getAbsolutePath());
                    //Methode erneut erwähnen damit er die Methode auch wieder aufruft
                    listFilesAndDirectories(file);
                }
            }
            //Sollte die File gleich Null sein gebe das aus
        } else {
            System.out.println("Failed to list files and directories in the specified directory.");
        }
    }
}

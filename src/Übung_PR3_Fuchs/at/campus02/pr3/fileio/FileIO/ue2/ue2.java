package Übung_PR3_Fuchs.at.campus02.pr3.fileio.FileIO.ue2;

import java.io.File;

public class ue2 {
    public static void main(String[] args) {

        File directory = new File("C:\\Users\\s54825");

        if (directory.exists() && directory.isDirectory()) {
            listFilesAndDirectories(directory);
        } else {
            System.out.println("The specified directory does not exist or is not a directory.");
        }

        System.out.println("____________________________________________________");

        File firectory2 = new File("C:\\Users\\s54825\\downloads");
        listFilesAndDirectories(firectory2);
    }

    public static void listFilesAndDirectories(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getAbsolutePath());
                } else if (file.isDirectory()) {
                    System.out.println("Dir: " + file.getAbsolutePath());
                }
            }
        } else {
            System.out.println("Failed to list files and directories in the specified directory.");
        }
    }
}

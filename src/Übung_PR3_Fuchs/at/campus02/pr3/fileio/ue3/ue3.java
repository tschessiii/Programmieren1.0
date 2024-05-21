package Übung_PR3_Fuchs.at.campus02.pr3.fileio.ue3;

import java.io.File;

public class ue3 {

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\Work\\Desktop\\PR3-21\\01 - File IO");
        System.out.println("Original Path: " + dir.getAbsolutePath());
        listFilesAndDirectoriesWithSubFolders(dir.getAbsolutePath());
    }

    public static void listFilesAndDirectoriesWithSubFolders(String path) {
        File root = new File(path);
        File[] list = root.listFiles();

        if (list == null) return;

        for (File f : list) {
            if (f.isDirectory()) {
                // rekursiver Aufruf
                System.out.println("Directory: " + f.getAbsolutePath());
                listFilesAndDirectoriesWithSubFolders(f.getAbsolutePath());
            } else {
                System.out.println("File: " + f.getAbsolutePath());
            }
        }

    }
}


package Übung_PR3_Fuchs.at.campus02.pr3.fileio.ue1;

import java.io.File;

public class ue1 {
    public static void main(String[] args) {
        System.out.println("Hallo");


        File file = new File("C:\\Users\\s54825\\Documents\\WEB1");
        if(file.exists()){
            System.out.println("Exists!");
        }else {
            System.out.println("File does not Exist!");
        }
        System.out.println("_________________________________________________________");

        //Example Usage
        File file2 = new File("C:\\Users\\s54825\\Documents\\WEB1\\bibliothek.html");
        printfile(file2);

    }

    public static void printfile(File file){

        //Checkt ob die File existiert
        System.out.println("Does this file exist? " + file.exists());

        //Checkt den Namen der File
        System.out.println("Name of the File: "+file.getName());

        //Checkt Parent Directory vom File
        System.out.println("Parent Directory of the File: " + file.getParent());

        // Den Pfad dieses Files checken
        System.out.println("Path to this File: " + file.getAbsolutePath());

        // Ist das eine Directory
        System.out.println("Is this a directory? " + file.isDirectory());

        //Ist es eine Versteckte File
        System.out.println("Is hidden file? "+file.isHidden());

        // Checken ob das ein File ist
        System.out.println("Is this a file? " + file.isFile());

        //Checken ob die File lesbar ist
        System.out.println("Is this file readable? "+ file.canRead());

        //Checken ob man das File überschreiben kann
        System.out.println("Is the file writeable? "+ file.canWrite());

        //Checken die File Size
        System.out.println("File Size? "+ file.length()+ " bytes");


    }
}

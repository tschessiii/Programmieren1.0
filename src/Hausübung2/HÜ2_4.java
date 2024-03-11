package Hausübung2;

import java.util.Scanner;

public class HÜ2_4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Anzahl der Fächer:");
        int faecher = scanner.nextInt();

        System.out.println("Anzah der Schüler:");
        int schueler = scanner.nextInt();

        //2D Array für Noten:
        int [][] noten = new int[faecher][schueler];

        //Noten für jedes Fach eingeben:
        for (int i = 0; i < faecher; i++){
            System.out.println("Noten für Fach " +(i+1)+":");
            for(int j=0; j< schueler;j++){
                System.out.println("Schüler "+(i+1)+":");
                noten[i][j]= scanner.nextInt();
            }
        }

        //Notendurchschnitt pro Fach ausgeben:
        for(int i =0;i<faecher;i++){
            double durchschnitt = berechnendurschnitt(noten[i]);
            System.out.println("Durchschnitt für Fach "+(i+1)+": "+durchschnitt);
        }

        // Gesamtdurchschnitt ausgeben
        double totalAverage = calculateTotalAverage(noten);
        System.out.println("Gesamtdurchschnitt: " + totalAverage);

        scanner.close();

    }

    //Methode zur Berechnung des Durschnitts pro Fach
    public static double berechnendurschnitt(int noten[]){
        int sum = 0;
        for(int note:noten){
            sum= sum+note;
        }

        return (double) sum/ noten.length;
    }

    public static double calculateTotalAverage(int[][] noten) {
        int sum = 0;
        int totalGrades = 0;
        for (int[] subjectGrades : noten) {
            for (int note : subjectGrades) {
                sum += note;
                totalGrades++;
            }
        }
        return (double) sum / totalGrades;
    }
}

package Übungen_PR1.SchiffeVersenken;

import java.util.Scanner;

public class SchiffeVersenken {

    private static final int GRID_SIZE = 5; // Größe des Spielfelds
    private static final char EMPTY_CELL = '-';
    private static final char SHIP_CELL = 'S';
    private static final char HIT_CELL = 'X';
    private static final char MISS_CELL = 'O';

    private  char [][] spielfeld;
    private int schiffe;

    //Constructor
    public SchiffeVersenken() {
        spielfeld = new char[GRID_SIZE][GRID_SIZE];
        initializeSpielfeld();
        schiffe = GRID_SIZE; // Anzahl der Schiffe gleich der Größe des Spielfelds
    }


    //Spielfeld initalisieren
    private void initializeSpielfeld() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                spielfeld[i][j] = EMPTY_CELL;
            }
        }
    }



    //Spielfeld abbilden
    private void printSpielfeld() {
        for (int i = 0; i < GRID_SIZE; i++) {
            for (int j = 0; j < GRID_SIZE; j++) {
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println();
        }
    }



    // Schiffe platzieren
    private void platzierenSchiffe() {
        // Vereinfachte Platzierung der Schiffe - ein Schiff pro Zeile
        for (int i = 0; i < GRID_SIZE; i++) {
            int j = (int) (Math.random() * GRID_SIZE);
            spielfeld[i][j] = SHIP_CELL;
        }
    }




    //Checken ob es ein gültiger Schuss ist
    private boolean isGültigerSchuss(int row, int col) {
        return row >= 0 && row < GRID_SIZE && col >= 0 && col < GRID_SIZE;
    }


    //Checken ob da ein Schiff ist
    private boolean istSchiff(int row, int col) {
        return spielfeld[row][col] == SHIP_CELL;
    }



    //Eingabe des Spielers
    public void spielen() {
        Scanner scanner = new Scanner(System.in);
        platzierenSchiffe();
        while (schiffe > 0) {
            System.out.println("Spielfeld:");
            printSpielfeld();
            System.out.print("Schuss abfeuern (Zeile Spalte): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (!isGültigerSchuss(row, col)) {
                System.out.println("Ungültiger Schuss! Bitte geben Sie eine gültige Zeile und Spalte ein.");
                continue;
            }
            if (spielfeld[row][col] == HIT_CELL || spielfeld[row][col] == MISS_CELL) {
                System.out.println("Sie haben bereits auf dieses Feld geschossen!");
                continue;
            }
            if (istSchiff(row, col)) {
                System.out.println("Treffer!");
                spielfeld[row][col] = HIT_CELL;
                schiffe--;
            } else {
                System.out.println("Verfehlt!");
                spielfeld[row][col] = MISS_CELL;
            }
        }
        System.out.println("Alle Schiffe versenkt! Sie haben gewonnen!");
        scanner.close();
    }
}

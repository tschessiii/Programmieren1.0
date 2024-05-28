package Übung_PR3_Fuchs.at.campus02.pr3.fileio.ProbePrüfung;

import java.io.*;
import java.net.Socket;

public class Beispiel2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("bernhardfuchs.at", 40061);
            System.out.println("Verbunden mit dem Server...");

            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter serverWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter logWriter = new BufferedWriter(new FileWriter("chat_log.txt", true));


            String username = "-->";

            Thread readerThread = new Thread(() -> {
                String serverMessage;
                try {
                    while ((serverMessage = serverReader.readLine()) != null) {
                        System.out.println("<--: " + serverMessage);
                        logWriter.write("<--: " + serverMessage);
                        logWriter.newLine();
                        logWriter.flush();
                    }
                } catch (IOException e) {
                    System.err.println("Verbindung zum Server unterbrochen.");
                }
            });

            readerThread.start();

            String userMessage;
            while ((userMessage = userInputReader.readLine()) != null) {
                String messageToSend = username + ": " + userMessage;
                serverWriter.write(messageToSend);
                serverWriter.newLine();
                serverWriter.flush();

                logWriter.write(messageToSend);
                logWriter.newLine();
                logWriter.flush();
            }

        } catch (IOException e) {
            System.err.println("Fehler beim Verbinden mit dem Server: " + e.getMessage());
        }
    }
}


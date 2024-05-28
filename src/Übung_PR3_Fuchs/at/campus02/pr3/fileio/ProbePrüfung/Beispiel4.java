package Übung_PR3_Fuchs.at.campus02.pr3.fileio.ProbePrüfung;

import java.io.*;
import java.net.Socket;

public class Beispiel4 {

    private static volatile boolean running = true;

    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader serverReader = null;
        BufferedWriter serverWriter = null;
        BufferedReader userInputReader = null;
        BufferedWriter logWriter = null;

        try {
            socket = new Socket("bernhardfuchs.at", 40061);
            System.out.println("Verbunden mit dem Server...");

            serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            serverWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            userInputReader = new BufferedReader(new InputStreamReader(System.in));
            logWriter = new BufferedWriter(new FileWriter("chat_log.txt", true));

            String username = "-->";

            BufferedReader finalServerReader = serverReader;
            BufferedWriter finalLogWriter = logWriter;

            Thread readerThread = new Thread(() -> {
                String serverMessage;
                try {
                    while ((serverMessage = finalServerReader.readLine()) != null) {
                        System.out.println("<--: " + serverMessage);
                        finalLogWriter.write("<--: " + serverMessage);
                        finalLogWriter.newLine();
                        finalLogWriter.flush();
                    }
                } catch (IOException e) {
                    System.err.println("Verbindung zum Server unterbrochen.");
                } finally {
                    running = false;
                }
            });

            readerThread.start();

            Thread logSizeThread = new Thread(() -> {
                File logFile = new File("chat_log.txt");
                while (running) {
                    try {
                        System.out.println("Logfile-Größe: " + logFile.length() + " bytes");
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.err.println("LogSizeThread wurde unterbrochen.");
                    }
                }
                System.out.println("LogSizeThread beendet.");
            });

            logSizeThread.start();

            String userMessage;
            while (running && (userMessage = userInputReader.readLine()) != null) {
                if (userMessage.equalsIgnoreCase("Ende")) {
                    System.out.println("Programm wird beendet...");
                    running = false;
                    break;
                }

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
        } finally {
            running = false;
            try {
                if (serverReader != null) serverReader.close();
                if (serverWriter != null) serverWriter.close();
                if (userInputReader != null) userInputReader.close();
                if (logWriter != null) logWriter.close();
                if (socket != null && !socket.isClosed()) socket.close();
            } catch (IOException e) {
                System.err.println("Fehler beim Schließen der Ressourcen: " + e.getMessage());
            }
        }
    }
}



package Übung_PR3_Fuchs.at.campus02.pr3.fileio.Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.Socket;
import java.nio.Buffer;

public class ue3_Socket {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting UE3-3 Network time from Server...");

        //Server: time-a.timefreq.bldrdoc.gov
        Socket timeSocket = //port 37 oder 13, lets try both!
                new Socket("time-a.timefreq.bldrdoc.gov", 13);

        Reader InputStreamReader;
        BufferedReader br = new BufferedReader(new InputStreamReader(timeSocket.getInputStream()));
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());
        System.out.println(br.readLine());

    }
}

package server;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {

        try {
            //Open socket to connect
            ServerSocket server = new ServerSocket(6013);
            Socket sock = server.accept();

            PrintWriter pout = new PrintWriter(sock.getOutputStream(),true);
            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            //Echo back text to socket
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                pout.println(inputLine);
            }
            //Close socket connection
            sock.close();
        }
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }
}
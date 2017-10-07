package reader;

import java.io.*;
import java.net.*;

public class readSocket {
    public static void main(String[] args) {

        try {
            //ServerSocket sock = new ServerSocket(6013);
            
            while (true) {
                ServerSocket server = new ServerSocket(6013);
                Socket client = server.accept();
                
                
                //Socket clientSocket = client;
                
                PrintWriter pout = new PrintWriter(client.getOutputStream(),true);
                BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    pout.println(inputLine);
                }
            }      
        } 
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }
}

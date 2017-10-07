package reader;

import java.io.*;
import java.net.*;

public class readSocket {
    public static void main(String[] args) {
        try {
            ServerSocket sock = new ServerSocket(6013);
            //Listen for connections
            while (true) {
                Socket client = sock.accept();
                //Get input stream
                InputStream in = client.getInputStream();
                System.out.println(in.toString());
                //Output stream to client
                PrintWriter pout = new PrintWriter(client.getOutputStream(),true);
                pout.println(in.toString());
                pout.println(client.toString());
                //Checks to see if connection exists
                //If exists, close connection and break loop
                if(sock.isBound()){
                    System.out.println("Bound!");
                    client.close();
                    break;
                }
            }
        }
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }
}

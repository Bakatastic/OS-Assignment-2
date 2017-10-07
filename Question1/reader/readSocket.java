
package reader;

import java.io.*;
import java.net.*;

public class readSocket {
    public static void main(String[] args) {
        try {
            ServerSocket sock = new ServerSocket(6013);
            while (true) {
                Socket client = sock.accept();
                
                InputStream in = client.getInputStream();

                System.out.println(in.toString());

                PrintWriter pout = new PrintWriter(client.getOutputStream(),true);

                pout.println(in.toString());
                pout.println(client.toString());
                client.close();       
            }      
        } 
        catch(IOException ioe){
            System.err.println(ioe);
        }
    }
}

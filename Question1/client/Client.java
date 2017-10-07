package client;
import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[] args) {
        try
        {
            //Open socket to connect
            Socket sock = new Socket("127.0.0.1", 6013);

            PrintWriter pout = new PrintWriter(sock.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
            //Read user input
            String userInput = stdIn.readLine();
            pout.println(userInput);
            System.out.println("echo: " +  in.readLine());
            //Close socket connection
            sock.close();
        } catch (Exception e){
        }
    }
}
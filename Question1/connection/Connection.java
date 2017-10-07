package connection;
import java.net.*;
import java.io.*;
public class Connection {
    public static void main(String[] args) {

        try
        {
            Socket eSocket = new Socket("127.0.0.1", 6013);
            PrintWriter pout = new PrintWriter(eSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(eSocket.getInputStream()));
            BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

            String userInput = "TEST";

            while ((userInput = stdIn.readLine()) != null)
            {
                pout.println(userInput);
                System.out.println("echo: " +  in.readLine());
            }
            eSocket.close();
        } catch (Exception e){
        }
    }
}
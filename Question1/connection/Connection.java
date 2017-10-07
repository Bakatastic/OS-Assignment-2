package connection;
import java.net.*;
import java.io.*;
public class Connection {
    public static void main(String[] args) {
        try
        {
            //Connect to server socket
            Socket sock = new Socket("127.0.0.1", 6013);
            
            InputStream in = sock.getInputStream();
            BufferedReader bin = new BufferedReader(new InputStreamReader(in));
            //Read stream from server
            String line;
            while ((line = bin.readLine())!= null)
            {
                System.out.println(line);
            }
            //Close connection with server
            sock.close();
        }
        catch(IOException ioe)
        {
            System.err.println(ioe);
        }
    }
    
}

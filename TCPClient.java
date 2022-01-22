import java.io.OutputStream; import java.net.InetAddress; import java.net.Socket; import java.util.Scanner; import java.io.DataOutputStream;

public class TCPClient {

    public static final void main(final String[] args){
        Socket client;
        DataOutputStream dos;
        InetAddress connection;
        int random = (int)(Math.random()*10+1);

        try{
        connection = InetAddress.getByName("10.10.10.0");
        client = new Socket(connection, 9999);

        dos = new DataOutputStream(client.getOutputStream());
       
        dos.write(random);

        client.close();

        } catch (Throwable t){
        t.printStackTrace();
        }
    }
}

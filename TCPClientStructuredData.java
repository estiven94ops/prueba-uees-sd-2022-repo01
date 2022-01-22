import java.io.OutputStream; import java.net.InetAddress; import java.net.Socket; import java.util.Scanner; import java.io.DataOutputStream;

public class TCPClientStructuredData {

    public static final void main(final String[] args){
        Socket client;
        DataOutputStream dos;
        InetAddress jorge;
        int numero = (int)(Math.random()*10+1);

        try{
        jorge = InetAddress.getByName("10.10.10.1");
        client = new Socket(jorge, 9999);

        dos = new DataOutputStream(client.getOutputStream());
       
        dos.write(numero);

        client.close();

        } catch (Throwable t){
        t.printStackTrace();
        }
    }
}

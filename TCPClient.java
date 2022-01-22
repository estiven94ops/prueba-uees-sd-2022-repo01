import java.io.OutputStream;  import java.net.InetAddress;  import java.net.Socket;

public class TCPClient {

  public static final void main(final String[] args) {
    DataOutputStream os;
    Socket        client;
    InetAddress   ia;
    
    int random = (int)(Math.random()*10+1);

    try {
      ia = InetAddress.getByName("10.10.10.0");//get local host address
      client = new Socket(ia, 9999); //create socket (*@\clientBox{1+2)}@*)
      
      os = new DataOutputStream(client.getOutputStream()); //get stream to write to
      cos.write(random);  //write one byte of value 1 (*@\clientBox{3)}@*)
      
      client.close(); //close (*@\clientBox{4)}@*)
    } catch (Throwable t) {
      t.printStackTrace();
    }
  }
}

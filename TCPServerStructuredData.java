
import java.io.InputStream; import java.net.ServerSocket; import java.net.Socket; import java.io.DataInputStream;

public class TCPServerStructuredData {
    public static final void main(final String[] args) {
    ServerSocket server;
    Socket client;
    InputStream is;
    DataInputStream dis;
    int n;

    try {
        server = new ServerSocket(9999);

        for (int j = 5; (--j) >= 0;){
            client = server.accept();

            dis = new DataInputStream(client.getInputStream());
            n = dis.read();

            for(int i =0; i<n; i++){
                System.out.print("X");
            }
            System.out.print('\n');

            client.close();
            }
        server.close();

        } catch (Throwable t){
            t.printStackTrace();
        }

    }


}
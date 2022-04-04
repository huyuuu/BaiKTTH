package th61130384;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class server {
public static void main(String[] args) throws IOException{

    DataOutputStream dos = null;

    DataInputStream dis=null;

    try {

    	ServerSocket serverSocket = new ServerSocket(8888);

    	System.out.print("Tôi lắng nghe trong cổng 8888 ...");

        Socket clientSocket = null;

        clientSocket = serverSocket.accept();

        dos=new DataOutputStream(clientSocket.getOutputStream());

        dis=new DataInputStream(clientSocket.getInputStream());

        String inline="";

        while(true)

        {

            inline = dis.readUTF();

            char ch[]=inline.toCharArray();

            if(Character.isDigit(ch[0]))

                {

                int i=Integer.parseInt(inline);

                switch(i)

                {

                    case 0:inline="Zero";break;
                    case 1:inline="One";break;
                    case 2:inline="Two";break;
                    case 3:inline="Three";break;
                    case 4:inline="for";break;
                    case 5:inline="five";break;
                    case 6:inline="six";break;
                    case 7:inline="seven";break;
                    case 8:inline="eight";break;
                    case 9:inline="nine	";break;

                }

                dos.writeUTF(inline);

            }

            else

                dos.writeUTF("Thoát");

        }

    }

    catch(Exception e) {

        System.out.print(e.getMessage());

    }

}

}

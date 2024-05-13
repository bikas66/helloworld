import java.util.*;
import java.io.*;
import java.net.*;

class  CRCServer {
public static void main (String []  args) throws Exception 
{
try{

String clientSentence;
ServerSocket serverSocket= new ServerSocket(4444);
while(true)
{
 Socket connectionSocket =serverSocket.accept();
BufferedReader infromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());

clientSentence = infromClient.readLine();

System.out.println("Server is Running.....);

System.out.println("FROM CLIENT"+ clientSentence);
clientSentence =clientSentence.toUpperCase();
outToClient.writeBytes("The uppercase String is: "+clientSentence);
outToClient.close();
serverSocket.close();
}
}
}
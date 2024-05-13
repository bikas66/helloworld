import java.util.*;
import java.io.*;
import java.net.*;

class CRCClient
{
public static void main (String [] args) throws Exception{

try{

String sentence="";
String upperSentence;

BufferedReader infromUser= new BufferedReader( new InputStreamReader(System.in));
Socket clientSocket =new Socket("localhost",4444);

DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

BufferedReader infromServer = new BufferedReader (new InputStreamReader(clientSocket.getInputStream()));

System.out.println("CLIENT RUNNING");
why socket is required
upperSentence=infromUser.readLine();
outToServer.writeBytes(sentence +'\n');
System.out.println("FROM SERVER "+ upperSentence);
clientSocket.close();
}
}
}
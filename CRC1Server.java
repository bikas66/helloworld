import java.io.*;
import java.util.*;
import java.io.net;
public class CRC1Client
{
public static void main(String args[])throws exception{
try
{

                                                                                                                                            



String sentence="";


BufferedReader infromUser= new BufferedReader( new InputStreamReader(System.in));
Socket clientSocket =new Socket("localhost",4444);

DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());

BufferedReader infromServer = new BufferedReader (new InputStreamReader(clientSocket.getInputStream()));

System.out.println("SERVER RUNNING");
upperSentence=infromUser.readLine();
outToServer.writeBytes(sentence +'\n');
System.out.println("FROM SERVER "+ upperSentence);
clientSocket.close();
}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
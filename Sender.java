import java.util.*;
import java.util.Scanner;
public class Sender{
	public static String calcCheckSum(String data){
		int sum=0;
		for(int i=0;i<data.length();i++){
			sum+=(int)data.charAt(i);
		}
		sum=~sum;
		return Integer.toBinaryString(sum);
	}
                                                                               

public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter data:");
	String data=sc.nextLine();
	String checkSum=calcCheckSum(data);
	String recievedCheckSum=sum+checkSum;
	System.out.println("Recieved checksum:" +recievedChecksum);
}}

import java.util.Scanner;
public class Reciever{
	public static boolean verifyCheckSum(String DataWithCheckSum){
		String DataWithCheckSum=data.SubString(0,data.length());
		String recievedCheckSum=data.SubString(0,DataWithCheckSum.length()-10);
		int sum=0;
		for(int i=0;i<data.length();i++){
			sum=+(int)data.charAt(i);
		}
		sum=~sum;
		String calcCheckSum=sum+DataWithChecksum;
		return calcCheckSum.equals(verifyCheckSum(DataWithCheckSum));
	}
}
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter data:");
	String DataWithCheckSum=sc.nextLine();
	if(verifyCheckSum){
		System.out.println("Recieved code is correct");
	}else{
		System.out.println("recieved code has error");
	}
}
	
	
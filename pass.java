package projects;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class pass 
{
	public static void main(String args[])
	{
		System.out.println("Choose 1 for password with special charcaters or 2 for without them :");
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int x=sc.nextInt();
		String str1,str2,str3,str4,result="";
		String word;
		if(x==1)
		{
			for(int i=0;i<2;i++)
			{
				char capChar = (char) ('A' + rnd.nextInt(26));
				str1=Character.toString(capChar);
				char lowChar = (char) ('a' + rnd.nextInt(26));
				str2=Character.toString(lowChar);
				char splChar = (char) ('!' + rnd.nextInt(14));
				str3=Character.toString(splChar);
				char num = (char) ('0' + rnd.nextInt(10));
				str4=Character.toString(num);
				result=result+str1+str2+str3+str4;
			}
		}
		else if(x==2)
		{
			for(int i=0;i<3;i++)
			{
				char capChar = (char) ('A' + rnd.nextInt(26));
				str1=Character.toString(capChar);
				char lowChar = (char) ('a' + rnd.nextInt(26));
				str2=Character.toString(lowChar);
				char num = (char) ('0' + rnd.nextInt(10));
				str4=Character.toString(num);
				result=result+str1+str2+str4;
			}
		}
		else
		{
			System.out.println("Choose among 1 and 2 retry");
		}
		System.out.println(result);
	}
}

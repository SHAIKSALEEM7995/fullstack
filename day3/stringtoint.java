package day3;
import java.util.Scanner;

public class stringtoint {

	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=sc.nextLine();
		int a=Integer.parseInt(str);
		int b=Integer.parseInt(str2);
		System.out.println(a);
		System.out.println(b);
		String str3=sc.nextLine();
		System.out.print(str3.substring(0,2)+" ");
		System.out.print(str3.substring(3,5));
		
		
		
	}
}

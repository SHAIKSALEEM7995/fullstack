package day8;
import java.util.Scanner;

public class argureturn {
	
	//creating a function
	//arguments with return values
	static int sum(int a,int b)
	{
		return a+b;
	}
	  
	
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int sum1=sum(a,b);
		System.out.println(sum1);
	}

}

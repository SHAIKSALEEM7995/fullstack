package day8;
import java.util.Scanner;

public class noargreturn {
	
	//no arguments with return values
	static int sum() {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		return a+b;
		
	}
	
	
	
	
	public static void main(String args[])
	{
		int sum1=sum();
		System.out.println(sum1);
	}

}

package day3;
import java.util.Scanner;
public class whilehell {
	public static void main(String args[]) {
		int sum=0;
		int b=0;
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			int a=sc.nextInt();
			
			b=(a>=0)?sum+a:sum;
		}
		System.out.println(b);
	}

}

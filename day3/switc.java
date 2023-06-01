package day3;
import java.util.Scanner;
public class switc {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a=");
		int a=sc.nextInt();
		System.out.print("Enter b=");
		int b=sc.nextInt();
		System.out.println("1.Addition");
		System.out.println("2.Substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter your option:");
		int i=sc.nextInt();
		
		
		     switch(i) 
		     {
		           case 1: 
		        	   System.out.println("Addition="+(a+b));
		        	   break;
		           case 2: 
		        	   System.out.println("Substraction="+(a-b));
		        	   break;
		           case 3:
		        	   System.out.println("Multiplication="+(a*b));
		        	   break;
		           case 4:
		        	   System.out.println("Division="+(a/b));
		        	   break;
		           default:
		        	   System.out.println("Please enter correct value");
		     }
		
	}

}

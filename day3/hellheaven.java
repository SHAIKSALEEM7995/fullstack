package day3;
import java.util.Scanner;
public class hellheaven {
	 
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		do {
			
			System.out.println("Enter a no.:");
			int a= sc.nextInt();
			
			
			if(a>=0)
			{
					sum=sum+a;
				
			}
			else {
				break;
			}
			
		}while(true);
		System.out.println("Sum="+sum);

}}

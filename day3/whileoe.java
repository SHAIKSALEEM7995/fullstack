package day3;
import java.util.Scanner;

public class whileoe {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		int end=sc.nextInt();
		while(st<=end)
		{
			if(st%2==0)
			{
				System.out.print(st+" ");
			}
			st++;
		}
	}

}

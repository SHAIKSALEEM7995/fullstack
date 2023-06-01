package day3;
import java.util.Scanner;
public class evenodd {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int st=sc.nextInt();
		int end=sc.nextInt();
		for(int i=st;i<=end;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
	}

}

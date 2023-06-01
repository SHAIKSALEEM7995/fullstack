package day8;
import java.util.Scanner;

public class argnoreturn {
	//arguments with no return values
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}

	public void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		argnoreturn ar=new argnoreturn();
		ar.sum(a, b);
	}
}

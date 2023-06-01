package day9;
import java.util.Scanner;

public class method {
	public void sum(int a,int b)
	{
		System.out.println(a+b);
		
	}
	public void sum(int a,int b)
	{
		System.out.println(a+b);
	}


public static void main(String args[])
{
	method ob=new method();
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	ob.sum(a,b);
	System.out.println("First method executed");
	
	
	
}}

package day6;
import java.util.Scanner;

public class reverse15 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double arr[]=new double[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		System.out.println("Enter your % value:");
		float f=sc.nextFloat();
		for(int i=0;i<n;i++)
		{
			arr[i]= (f/100.0)*arr[i];
		}
		System.out.println("Before Array");
		for(int i=0;i<n;i++)
		{
			System.out.printf("%.2f ",arr[i]);
		}
		int i=0;
		int j=n-1;
		double temp;
		while(i<j)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		System.out.println();
		System.out.println("After Array");
		for(int k=0;k<n;k++)
		{
			System.out.printf("%.2f ",arr[k]);
		}
	}

}

package day6;
import java.util.Scanner;

public class search {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key to find to its index:");
		int key=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("The "+key+" find at index : "+i);
			}
		}
	}

}

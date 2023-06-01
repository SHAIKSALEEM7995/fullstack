package day6;
import java.util.Arrays;
import java.util.Scanner;
public class find {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key value:");
		int key=sc.nextInt();
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==key)
			{
				System.out.println("Index= "+i);
				break;
			}
			else {
				flag=0;
			}
		}
		if(flag==0)
		{
			System.out.println("Element is not found");
		}
		
		
	}

}

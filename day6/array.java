package day6;
import java.util.Scanner;

public class array {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		System.out.println("Enter sum value:");
	   int sum=sc.nextInt();
		int l=0;
		
		for(int k=0;k<n-2;k++)
		{
			for(int s=1;s<n-1;s++)
			{
				for(int j=2;j<n;j++)
				{
					l=arr[k]+arr[s]+arr[j];
					if(l==sum)
					{
						System.out.println("Sum is equal and their indexes are:"+k+" "+s+" "+j);
					}
				}
			}
		}
		sc.close();
		
	}

}

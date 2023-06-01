package day6;
import java.util.Scanner;

public class binarysearch {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int low=1;
		int high=n;
		int mid;
		
		System.out.println("enter key value:");
		int key=sc.nextInt();
		int flag=0;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(arr[mid]==key)
			{
				System.out.println(mid);
				flag=0;
				break;
			}
			
			else if(key>mid)
			{
				low=mid+1;
			}
			else if(key<mid)
			{
				high=mid-1;
			}
			else {
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("NO the value is not present");
		}
	}

}

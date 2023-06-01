package day6;
import java.util.Arrays;
import java.util.Scanner;

public class array2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter key value:");
		int key=sc.nextInt();
		int low=2;
		int high=8;
		int result=Arrays.binarySearch(arr,low,n-1,key);
		System.out.println("Element found at "+result);
	}

}

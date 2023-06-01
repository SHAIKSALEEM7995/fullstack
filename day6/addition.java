package day6;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;

public class addition {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		int arr1[][]=new int[n][n];
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			
		}
		System.out.println();
		for(int k=1;k<=n;k++)
		{
			for(int l=1;l<=n;l++)
			{
				arr1[k][l]=sc.nextInt();
			}
			
		}
		System.out.println();
		int arr2[][]=new int[n][n];
		for(int m=1;m<=n;m++)
		{
			for(int N=1;N<=n;N++)
			{
				arr2[m][N]=arr[m][N]+arr1[m][N];
			}
			
		}
		for(int d=1;d<=n;d++)
		{
			for(int a=1;a<=n;a++)
			{
				System.out.println(arr2[d][a]);
			}
			System.out.println();
		}
	}

}

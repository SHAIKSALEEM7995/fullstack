package day6;
import java.util.Arrays;
import java.util.Scanner;

public class string {
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the n value:");
	  int n=sc.nextInt();
	  System.out.println("your matrix will be "+n+"x"+n);
	  int arr[][]=new int[n][n];
	  System.out.println("Enter "+(n*n)+" Elements:");
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<n;j++)
		  {
			  arr[i][j]=sc.nextInt();
			  System.out.print(arr[i][j]+" ");
		  }
		  System.out.println();
	  }
	  System.out.println("Matrix created successfully..");
	  
	  
  }
}

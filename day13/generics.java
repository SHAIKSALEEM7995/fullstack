package day13;
import java.util.Scanner;
import java.util.ArrayList;
public class generics {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> array2=new ArrayList<Integer>();
	//array2.add(null);
//		array2.add(89);
		//array2.add("saleem");
		//array2.add(23.4f);
		//System.out.println(array2);
		array2.add(10);
		array2.add(11);
		System.out.println("Enter n value:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			//int j = 0;
			//array2.set( i, j=array2.add(sc.nextInt())?j:j);
			int j=sc.nextInt();
			array2.add(array2.set(i,j));
		}
		System.out.println(array2);
		for(int i:array2)
		{
			System.out.println(i);
		}
	}

}

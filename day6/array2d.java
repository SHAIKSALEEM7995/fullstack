package day6;
import java.util.Scanner;
import java.util.Arrays;
public class array2d {
	public static void main(String args[]) {
		
	
	Scanner sc=new Scanner(System.in);
	int college[][]=new int[4][];
	college[0]=new int[] {1,2};
	college[1]=new int[] {3,4};
	college[2]=new int[] {1,2,3,4};
	college[3]=new int[] {1};
	for(int[] column:college)
	{
		System.out.println(Arrays.toString(column));
	}
	

}
}
package day13;
import java.util.Scanner;
import java.util.LinkedList;


public class linkedlist {
	public static void main(String args[])
	{
		LinkedList<Integer> L1=new LinkedList<Integer>();
		  L1.add(1);
	      L1.add(2);
	      L1.add(3);

	      
	      Scanner sc=new Scanner(System.in);
	      int n=sc.nextInt();
	      /*for(int i=0;i<n;i++)
	      {
	    	  int j=sc.nextInt();
	    	  L1.add(L1.set(i, j));
	      }*/
	    
	      
	      System.out.println(L1);
	      System.out.println(L1.getFirst());
		     System.out.println(L1.getLast());
		     System.out.println(L1.pop());
		     L1.push(5);
		     System.out.println(L1);
		     
	      
		
	}

}

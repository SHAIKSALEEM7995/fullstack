package day15;
import java.util.PriorityQueue;
import java.util.Collections;

public class priority {
	public static void main(String args[])
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		pq.add(1);
		pq.offer(20);
		pq.add(2);
		System.out.println(pq);
		 boolean bb=pq.isEmpty();
		for(int i=0;i<3;i++)
		{
			System.out.println(pq.remove());
		}
		 
		
		
		
	}

}

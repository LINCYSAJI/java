import java.util.*;
class Main
{
	public static void main(String args[])
	{
		PriorityQueue<String>cities_queue=new PriorityQueue<String>();
		cities_queue.add("Sydney");
		cities_queue.add("Venice");
		cities_queue.add("New York");
		cities_queue.add("California");
		cities_queue.add("Melbourne");
		System.out.println("PriorityQueue Head:"+cities_queue.element());

		System.out.println("\n PriorityQueue contents:");
		Iterator iter=cities_queue.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next()+" ");
		}
	}
}

output
************
PriorityQueue Head:California

 PriorityQueue contents:
California Melbourne Sydney Venice New York
import java.util.*;
public class DqEx
{
	public static void main(String[] args)
	{
		Deque<String>deque=new LinkedList<String>();
		
		deque.add("Element 1(Tail)");
		deque.addFirst("Element 2(Head)");
		deque.addLast("Element 3(Tail)");
		deque.push("Element 4(Head)");
		deque.offer("Element 5(Tail)");
		deque.offerFirst("Element 6(Head)");
		
		System.out.println(deque+"\n");
		
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing"+"first and last:"+deque);
	}
}

OUTPUT
***********
[Element 6(Head), Element 4(Head), Element 2(Head), Element 1(Tail), Element 3(Tail), Element 5(Tail)]

Deque after removingfirst and last:[Element 4(Head), Element 2(Head), Element 1(Tail), Element 3(Tail)]
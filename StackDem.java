import java.util.*;
public class StackDem
{
	public static void main(String args[])
	{
		Stack<String>stack=new Stack<String>();

		stack.add("10");
		stack.add("20");
		stack.add("30");
		stack.add("40");
		stack.add("50");
		
		System.out.println("Stack:"+stack);
		String rem_ele=stack.remove(0);
		System.out.println("removed element:"+rem_ele);
		System.out.println("Final stack:"+stack);
	}
}
output
*********

Stack:[10, 20, 30, 40, 50]
removed element:10
Final stack:[20, 30, 40, 50]
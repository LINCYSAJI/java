import java.util.*;
public class StackDemo
{
	public static void main(String args[])
	{
		Stack<String>stack=new Stack<String>();

		stack.add("Greeks");
		stack.add("for");
		stack.add("Geeks");
		stack.add("10");
		stack.add("20");
		
		System.out.println("Stack:"+stack);
		String rem_ele=stack.remove(4);
		System.out.println("removed element:"+rem_ele);
		System.out.println("Final stack:"+stack);
	}
}

output
***********
Stack:[Greeks, for, Geeks, 10, 20]
removed element:20
Final stack:[Greeks, for, Geeks, 10]
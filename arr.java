import java.util.*;
class arr
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int i,n,search,flag=0;
		System.out.println("enter the no of elements:");
		n=s.nextInt();
		int[]a=new int[n];
		System.out.println("enter the elements");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the element to be searched");
		search=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==search)
			{
				System.out.println("element"+search+"found at"+i+"position");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("element"+search+"not found");
		}
	}
#enter the no of elements:
5
enter the elements
4
1
7
3
5
enter the element to be searched
7
element7found at2position
#enter the no of elements:
3
enter the elements
2
8
9
enter the element to be searched
4
element4not found
}
public class scom
{
	public static void main(String[]args)
	{
		String str1="Hello";
		String str2="hello";
		String str3=str1.toLowerCase();
		String str4=str2.toLowerCase();
		int i=str3.compareTo(str4);
		if(i==0)
		{
			System.out.println("both strings are equal");
		}
		else
		{
			System.out.println("strings are not equal");
		}
	}
}
OUTPUT
=======
both strings are equal
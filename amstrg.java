public class amstrg
{
	public static void main(String args[])
	{
		int number=371,on,rem,res=0;
		on=number;
		while(on!=0)
		{
			rem=on%10;
			res+=Math.pow(rem,3);
			on/=10;
		}
		if(res==number)
			System.out.println(number+"is an armstrong number");
		else
			System.out.println(number+"is not an armstrong number");
	}
}


OUTPUT
---------
371is an armstrong number
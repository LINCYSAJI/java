class OverloadDemo
{
	void area(float x)
	{
		System.out.println("the area of the square is"+Math.pow(x, 2)+"sq units");
	}
	void area(float x, float y)
 	{
		 System.out.println("the area of the rectangle is"+x*y+"sq units");
	}
	void area(double x)
	{
		double z=3.14*x*x;
		System.out.println("the area of the circle is"+z+"sq units");
	}
	public static void main(String args[])
	{
		OverloadDemo ob=new OverloadDemo();
		ob.area(5);
		ob.area(11,12);
		ob.area(2.5);
	}
}	

OUTPUT
==========
the area of the square is25.0sq units
the area of the rectangle is132.0sq units
the area of the circle is19.625sq units
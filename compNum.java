class compNum
{
	int real,image;
	public compNum(int r,int i)
	{
		this.real=r;
		this.image=i;
	}
	public void show()
	{
		System.out.print(this.real+"+i"+this.image);
	}
	public static compNum add(compNum n1,compNum n2)
	{
		compNum res=new compNum(0,0);
		res.real=n1.real+n2.real;
		res.image=n1.image+n2.image;
		return res;
	}
	public static void main(String arg[])
	{
		compNum c1=new compNum(4,5);
		compNum c2=new compNum(10,5);

		System.out.print("first complex number:");
		c1.show();

		System.out.print("\n second Complex number:");
		c2.show();
		compNum res=add(c1,c2);
		
		System.out.println("\n addition is:");
		res.show();
	}
}
output:
first complex number:4+i5
 second Complex number:10+i5
 addition is:
14+i10	
import java.io.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+"*"+5+"="+(i*5));
		}
		System.out.println("END OF THE 1st THREAD");
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=7;j++)
		{
			System.out.println(j+"*"+7+"="+(j*7));
		}
		System.out.println("END OF THE 2nd THREAD");
	}
}
class C extends Thread
{
	public void run()
	{
	for(int k=1;k<=13;k++)
	{
		System.out.println(k+"*"+13+"="+(k*13));
	}
	System.out.println("END OF THE 3rd THREAD");
	}
}
public class list4
{
public static void main(String args[])throws IOException
{
	A ThreadA=new A(); B ThreadB=new B();
	C ThreadC=new C();
	ThreadA.setPriority(Thread.MAX_PRIORITY);
	ThreadB.setPriority(Thread.NORM_PRIORITY);
	ThreadC.setPriority(Thread.MIN_PRIORITY);
	ThreadA.start();
	ThreadB.start();
	ThreadC.start();
} }


OUTPUT
=======
1*5=5
1*7=7
1*13=13
2*7=14
2*5=10
3*7=21
2*13=26
4*7=28
3*5=15
5*7=35
3*13=39
6*7=42
4*5=20
7*7=49
4*13=52
END OF THE 2nd THREAD
5*5=25
END OF THE 1st THREAD
5*13=65
6*13=78
7*13=91
8*13=104
9*13=117
10*13=130
11*13=143
12*13=156
13*13=169
END OF THE 3rd THREAD		

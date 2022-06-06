class Prime implements Runnable
{
long j,c;
Prime()
{
super();
c=0;
}
public void run()
{
for(long i=0;i<=100;i++)
{
for(j=2;j<=i;j++)
{
if(i%j==0)
break;
}
if(j==i)
{
c++;
System.out.println(c+"th"+"Prime no:="+i);
}
}
}
}
class Fib implements Runnable
{
long a,b,c,n;
Fib()
{
a=c=n=0;
b=1;
}
public void run()
{
while(n++<75)
{
System.out.println(n+"th"+"Fib no:="+a);
c=a+b;
a=b;
b=c;
try
{
if(n==50)
{
System.out.println("Thread fibonacci is put into sleep.");
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("Error:"+e);
}
}
}
}
public class MyPriFib 
{
public static void main(String[] args)
{
Thread ct=Thread.currentThread();
System.out.println("Main thread name:"+ct.getName());
Prime p=new Prime();
Fib f=new Fib();
Thread fib=new Thread(f,"fibonacci");
Thread prime=new Thread(p,"prime");
fib.start();
System.out.println("Thread"+fib.getName()+"started.");
prime.start();
System.out.println("Thread"+ prime.getName()+"started.");
}
}


OUTPUT
============
Main thread name:main
1thFib no:=0
2thFib no:=1
3thFib no:=1
4thFib no:=2
5thFib no:=3
6thFib no:=5
7thFib no:=8
8thFib no:=13
9thFib no:=21
10thFib no:=34
11thFib no:=55
12thFib no:=89
13thFib no:=144
14thFib no:=233
15thFib no:=377
16thFib no:=610
17thFib no:=987
18thFib no:=1597
19thFib no:=2584
20thFib no:=4181
21thFib no:=6765
22thFib no:=10946
23thFib no:=17711
24thFib no:=28657
25thFib no:=46368
26thFib no:=75025
27thFib no:=121393
28thFib no:=196418
29thFib no:=317811
30thFib no:=514229
31thFib no:=832040
32thFib no:=1346269
33thFib no:=2178309
Threadfibonaccistarted.
34thFib no:=3524578
35thFib no:=5702887
Threadprimestarted.
36thFib no:=9227465
1thPrime no:=2
2thPrime no:=3
37thFib no:=14930352
3thPrime no:=5
4thPrime no:=7
38thFib no:=24157817
5thPrime no:=11
39thFib no:=39088169
6thPrime no:=13
40thFib no:=63245986
7thPrime no:=17
41thFib no:=102334155
42thFib no:=165580141
8thPrime no:=19
9thPrime no:=23
43thFib no:=267914296
10thPrime no:=29
44thFib no:=433494437
11thPrime no:=31
12thPrime no:=37
45thFib no:=701408733
13thPrime no:=41
46thFib no:=1134903170
14thPrime no:=43
47thFib no:=1836311903
15thPrime no:=47
48thFib no:=2971215073
16thPrime no:=53
49thFib no:=4807526976
17thPrime no:=59
50thFib no:=7778742049
18thPrime no:=61
Thread fibonacci is put into sleep.
19thPrime no:=67
20thPrime no:=71
21thPrime no:=73
22thPrime no:=79
23thPrime no:=83
24thPrime no:=89
25thPrime no:=97
51thFib no:=12586269025
52thFib no:=20365011074
53thFib no:=32951280099
54thFib no:=53316291173
55thFib no:=86267571272
56thFib no:=139583862445
57thFib no:=225851433717
58thFib no:=365435296162
59thFib no:=591286729879
60thFib no:=956722026041
61thFib no:=1548008755920
62thFib no:=2504730781961
63thFib no:=4052739537881
64thFib no:=6557470319842
65thFib no:=10610209857723
66thFib no:=17167680177565
67thFib no:=27777890035288
68thFib no:=44945570212853
69thFib no:=72723460248141
70thFib no:=117669030460994
71thFib no:=190392490709135
72thFib no:=308061521170129
73thFib no:=498454011879264
74thFib no:=806515533049393
75thFib no:=1304969544928657
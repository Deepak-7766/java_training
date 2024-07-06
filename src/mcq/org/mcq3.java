package mcq.org;

public class mcq3 {
	 private static int num1 = 100;
	private int num2 = 200;
	public static void myMethod1()
	{ num1 = 300;
	//num2 = 400;
	//System.out.println(num1 + "," + num2);
	}
	public static void myMethod2()
	{
	num1 = 300;
	//mcq3.num2 = 400;
	}
	public void myMethod3()
	{
	num1 = 300;
	num2 = 400;
	}
	public void myMethod4()
	{
	mcq3.num1 = 300;
	num2 = 400;
	}
	public static void main(String args[])
	{
	mcq3 q = new mcq3();
	q.myMethod1();
	}
}

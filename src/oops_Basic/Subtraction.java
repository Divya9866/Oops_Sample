package oops_Basic;

public class Subtraction
{
	
	int a;
	int b;
	
	Subtraction()
	{
		a=6;
		b=1;
	}
	
	public int sub()
	{
		int c=a-b;
		return c;
	}
	
	public static void main (String args[])
	{
		Subtraction sb=new Subtraction();
		int d=sb.sub();
		System.out.println("substraction numb is"+d );
	}

}

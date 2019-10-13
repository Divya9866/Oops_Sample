package oops_Basic;

public class Method_Overloading
{
	int d;
	public void add(int a,int b) 
	{
		d=a+b;
		System.out.println(d);
	}
	
	public void add(int a,int b,int c) 
	{
		d=a+b+c;
	}
	
	public void add(int c) 
	{
		d=c;
	}
	public static void main(String args[]) 
	{
		Method_Overloading MOD=new Method_Overloading();
		MOD.add(5, 6);
		MOD.add(5, 6,7);
	}
	
}

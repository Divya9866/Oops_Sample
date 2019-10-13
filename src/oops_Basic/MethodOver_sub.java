package oops_Basic;

public class MethodOver_sub {

	public int sub(int a,int b)
	{
		int d=a-b;
		return d;

	}
	
	public int sub(int a,int b,int c)
	{
		int e=a-b-c;
		return e;
	}
	
	public static void main(String args[])
	{
		MethodOver_sub MOS=new MethodOver_sub();
		int f=MOS.sub(2, 3,7);
		System.out.println(f);
	}
	
}

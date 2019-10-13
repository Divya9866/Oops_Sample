package oops_Basic;

public class WithOut_Object 
{
	static String a="Thummala";
	static String b="Divya";
	
	static void behavior() 
	{
		System.out.println("this is behavior method");
	}
	
	static 
	{
		System.out.println("This is static 1st  block");
	}
	
	static 
	{
		System.out.println("This is static 2nd  block");
	}
	
	public static void main(String args[]) 
	{
		System.out.println(WithOut_Object.a);
		System.out.println(WithOut_Object.b);
		WithOut_Object.behavior();
	}
	
}

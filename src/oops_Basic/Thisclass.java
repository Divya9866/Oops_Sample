package oops_Basic;

public class Thisclass 
{
	String a;
	String b;
	
	public void displayName(String a, String b) 
	{
		this.a=a;
		this.b=b;
	}
	
	public void printname() 
	{
		System.out.println("this is name a variable "+a);
		System.out.println("this is name b variable "+b);
		
	}
	
	public static void main(String args[]) 
	{
		Thisclass th=new Thisclass();
		th.displayName("Thummala", "Divya");
		th.printname();
	}

}

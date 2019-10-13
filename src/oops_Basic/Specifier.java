package oops_Basic;

class Specifier 
{
	protected final String name="divya";
	
	public final void divya() 
	{
		int a=10,b=20,c ;
	
		c=a+b;	
		System.out.println(c);
		
		}
	
	public static void main(String args[]) 
	{
		Specifier sp=new Specifier();
	System.out.println(sp.name);
		
	}
}

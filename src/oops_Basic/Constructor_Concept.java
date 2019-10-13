package oops_Basic;

public class Constructor_Concept 
{
	String n="divya";
	int age=26;
	
	public Constructor_Concept() 
	{
	}
	
	public Constructor_Concept(String n,int age) 
	{
		System.out.println(n+" "+age);
	}
	
	public static void main(String args[]) 
	{
		Constructor_Concept CC=new Constructor_Concept("vinay",26);
		//System.out.println(CC.n);
		
		//CC.Constructor_Concept("Vinay",26);
	}

}

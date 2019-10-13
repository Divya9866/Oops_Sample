package oops_Basic;

public class Class_Human 
{
	
	public void behavior(String name, int age, String gender) 
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}

	public static void main(String args[]) 
	{
		Class_Human divya=new Class_Human();
		divya.behavior("Divya",26,"Female");
		
		Class_Human vinay=new Class_Human();
		vinay.behavior("Vinay",27,"Male");
		
	}
}

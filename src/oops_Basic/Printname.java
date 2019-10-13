package oops_Basic;

public class Printname {
	
	 

	 public String name(String s)
	 {
		 return s;
	 }
	
	public static void main (String args[])
	{
		Printname pn=new Printname();
		Printname pn1=new Printname();

		String name1=pn.name("Divya");
		System.out.println("name is " +name1);

		String name2=pn1.name("Vinay");
		System.out.println("name is " +name2);
	}

}

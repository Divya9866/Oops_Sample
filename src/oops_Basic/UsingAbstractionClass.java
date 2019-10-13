package oops_Basic;

public class UsingAbstractionClass extends Abstraction
{

	void add() 
	{
		System.out.println("this is add method in non abstract class");
	}
	

	public static void main(String args[]) 
	{
		UsingAbstractionClass USB= new UsingAbstractionClass();
		USB.add();
	}
		
}



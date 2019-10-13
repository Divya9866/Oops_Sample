package oops_Basic;

public class Concept_Interface_2 extends Abstraction implements Concept_interface 
{

	public void interfaceMethod() 
	{
		System.out.println("interface Method is implemented");
	}

	public static void main(String args[]) 
	{
		Concept_Interface_2 CI =new Concept_Interface_2();
		CI.interfaceMethod();
		
		Classb CB=new Classb();
		CB.add();
		
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}
}

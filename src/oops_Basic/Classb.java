package oops_Basic;

public class Classb extends Abstact1 implements Interface1 
{
	
	

	
	public static void main(String args[]) 
	{
		Classb cc=new Classb();
		cc.add();
		cc.mul();
		cc.sub();
	}

	@Override
	public void add() {
		System.out.println("Add method");
		
	}

	@Override
	void sub() {
		System.out.println("Sub method");
	}
}

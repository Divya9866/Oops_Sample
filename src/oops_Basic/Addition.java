package oops_Basic;

public class Addition {

	 int a=1;
	 int b=7;
	
	 public int add()
	 {
		 int c=a+b;
			//System.out.println("the value of a & b "+c);
			return c;

	 }
	public static void main (String args[])
	{
		Addition ab=new Addition();
		int d=ab.add();
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@ " +d);
		
	}
	
	
	

}

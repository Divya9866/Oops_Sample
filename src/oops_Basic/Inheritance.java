package oops_Basic;

class Inheritance 
{
	String surname;
	public Inheritance() 
	{
		System.out.println("this method is in parent class");
	}
	
	public void display() 
	{
		System.out.println("this method is for displaying");
	}
	
	public void Emp_details(String name,int age,String organisation,double salary) 
	{
		System.out.println("Name is " + name);
		System.out.println("age is " + age);
		System.out.println("organisation is " + organisation);
		System.out.println("Salary is " + salary);
	}
			
}

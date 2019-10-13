package oops_Basic;

import java.util.Scanner;

public class Multiply 
{
	
	
	
	public int mul(int a,int b)
	{
		return (a*b);
	}
public static void main(String args[])
{
	Multiply ml=new Multiply();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a value");
	int a=sc.nextInt();
	System.out.println("Enter b value");
	int b=sc.nextInt();
	int mul1=ml.mul(a,b);
	System.out.println("mul of number "+mul1 );
}
}

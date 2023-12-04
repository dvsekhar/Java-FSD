package pillarsofoops;

import java.util.Scanner;

class Base
{
	int a;
	void readA()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a value: ");
		a=sc.nextInt();
	}
	void displayA()
	{
		System.out.println("a="+a);
	}
	
};
class Derived extends Base
{
	int b;
	void readB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter b value: ");
		b=sc.nextInt();
	}
	void displayB()
	{
		System.out.println("b="+b);
	}
};

public class Inheritance {
	public static void main(String []args)
	{
		Derived d=new Derived();
		d.readA();
		d.readB();
		d.displayA();
		d.displayB();
	}
}

package innerclass;


class Outer
{
	void fun1()
	{
		System.out.println("Fun1()");
	}
	static void fun2()
	{
		System.out.println("Fun2()");
	}
	static class Inner
	{
		void fun3()
		{
			System.out.println("Fun3()");
		}
		static void fun4()
		{
			System.out.println("Fun4()");
		}
	}
}

public class InnerClass {

	public static void main(String[] args) {
		
		Outer o=new Outer();
		o.fun1();
		Outer.fun2();
		Outer.Inner i=new Outer.Inner();
		i.fun3();
		Outer.Inner.fun4();
		// TODO Auto-generated method stub

	}

}

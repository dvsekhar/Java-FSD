package mythread;

class A extends Thread
{
public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				sleep(2000);
				System.out.println("Good Morning");
			}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
   }
};
class B extends Thread
{
public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				sleep(2000);
				System.out.println("Hello");
			}
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	}
};

public class MyThread extends Thread
{
 	public static void main( String args[] )
 	{
 		A a = new A();
  		B b = new  B();
  		
  		a.start();
  		b.start();
 	}
}

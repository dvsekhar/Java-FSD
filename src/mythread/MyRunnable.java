package mythread;

class X implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				Thread.sleep(1000);
				System.out.println("Good Morning");
				}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
};

class Y implements Runnable
{
	public void run()
	{
		try
		{
			for(int j=1;j<=10;j++)
			{
				Thread.sleep(1100);
				System.out.println("Hi");
				}
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
};


public class MyRunnable {

	public static void main(String[] args) {
		
		X a = new X();
		Y b = new Y();
		Thread t1 = new Thread(a);
		Thread t2 = new Thread(b);
		t1.start();
		t2.start();
		// TODO Auto-generated method stub

	}

}

package callingmethod;

public class CallingMethod {
	public void sum(int a, int b)
	{
		System.out.println("Sum: " +(a+b));
	}
	public void sub(int a, float b)
	{
		System.out.println("Sub: " +(a-b));
	}
	public void mul(int a,int b)
	{
		System.out.println("Mul: " +(a*b));
	}
	public static void main(String[] args)
	{
		CallingMethod c = new CallingMethod();
		c.sum(10,20);
		c.sub(50, 20.23f);
		c.mul(12, 5);
	}

}

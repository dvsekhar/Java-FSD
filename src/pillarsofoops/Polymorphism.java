package pillarsofoops;

public class Polymorphism {
	public void Add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void Add(float a, float b)
	{
		System.out.println(a+b);
	}
	public void Add(double a, double b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.Add(10, 20);
		p.Add(10.23f, 30.43f);
		p.Add(30.256, 25.2023);

	}

}

package pillarsofoops;
abstract class Myclass
{
	abstract void calculate(double a);
}
class Sub1 extends Myclass
{
	void calculate(double a)
	{
		System.out.println(a + " Square =" +(a*a));
	}
};
class Sub2 extends Myclass
{
	void calculate(double a)
	{
		System.out.println(a + " Square root =" + Math.sqrt(a));
	}
};

public class MyAbstract {

	public static void main(String[] args) {
		Myclass mc;
		mc = new Sub1();
		mc.calculate(5.0);
		mc = new Sub2();
		mc.calculate(25.0);
		// TODO Auto-generated method stub

	}

}

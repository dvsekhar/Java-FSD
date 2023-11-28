package implicitexplicit;

public class ImplicitExplicit {

	public static void main(String[] args) {
		System.out.println("Implicit");
		int a = 20;
		System.out.println("Int : " +a);
		long b = a;
		System.out.println("long : " +b);
		float c = b;
		System.out.println("float : " +c);
		
		System.out.println("Explicit");
		double x = 50.50;
		System.out.println("Double : " +x);
		float y = (float)x;
		System.out.println("float : " +y);
		long z = (long)x;
		System.out.println("long : " +z);
		
		// TODO Auto-generated method stub

	}

}

package constructor;

public class Constructor {
	Constructor()
	{
		System.out.println("I am constructing a building");
	}
	void dealer()
	{
		System.out.println("I am Cement dealer");
		
		
	}
	public static void main(String []args)
	{
		Constructor c=new Constructor();
		c.dealer();
	}

}

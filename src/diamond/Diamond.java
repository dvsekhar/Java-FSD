package diamond;

interface X
{
	default void show()
	{
		System.out.println("Hello");
	}
};
interface Y
{
	default void show()
	{
		System.out.println("Hi");
	}
};
public class Diamond implements X,Y 
{
	public void show()
	{
		X.super.show();
		Y.super.show();
	}

	public static void main(String[] args) 
	{
		Diamond d = new Diamond();
		d.show();
	}

}

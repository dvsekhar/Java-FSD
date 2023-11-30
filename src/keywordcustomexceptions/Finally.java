package keywordcustomexceptions;
import java.util.*;
public class Finally {
	public static void main(String[] args)
	{
		int a=26, b=3, c=0;
		try
		{
			c = a / b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n Error: " + e.getMessage());
		}
		finally
		{
			System.out.println("\nThis final result is " + c);
		}
	}
}

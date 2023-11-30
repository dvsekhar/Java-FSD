package keywordcustomexceptions;
import java.util.*;

public class Throw {
	public static void checkAge(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("Person is not eligible to vote.");
		}
		else
		{
			System.out.println("Person is eligible to vote!!");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the age of a person: ");
		int age = s.nextInt();
		try
		{
			checkAge(age);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("The minimum voting age in our country is 18.");
		}
	}

}

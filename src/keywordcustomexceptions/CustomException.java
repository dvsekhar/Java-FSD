package keywordcustomexceptions;
import java.util.Scanner;

class AgeException extends Exception
{
	AgeException(String s)
	{
		super(s);
	}
};

public class CustomException {
	
	public static void checkAge(int age) throws AgeException
	{
		if (age < 18)
		{
			throw new AgeException("Person is not eligible to vote.");
		}
		else
		{
			System.out.println("Person is eligible to vote!!");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the age of a person: ");
		int age = sc.nextInt();
		try
		{
			checkAge(age);
		}
		
		catch(AgeException e)
		{
			System.out.println(e);
			System.out.println("The minimum voting age in our country is 18.");
		}
	}
	

}

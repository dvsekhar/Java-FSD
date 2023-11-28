package regularexpression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		String text = "I am Ram, My phone numer is 8529633698";
		
		String regex = "\\d+";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		
		boolean b = matcher.matches();
		System.out.println(b);
		
		if (matcher.matches()) 
		{
			
			System.out.println("Yes, there are numbers in the given text!");
			
		}
		else 
		{
			System.out.println("Text does not have any numbers !!");
		}
		
		
	 }
	
}
	


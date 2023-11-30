package keywordcustomexceptions;

public class Throws {
	void Division() throws ArithmeticException
    {
        int a=45,b=5;
        float result;
        result = a / b;
        System.out.print("The result is : " + result);
    }
     public static void main(String[] args)
    {
    	 Throws T = new Throws();
         try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.out.print("Error : " + Ex.getMessage());
        }
        System.out.print("\nEnd of program.");
    }

}

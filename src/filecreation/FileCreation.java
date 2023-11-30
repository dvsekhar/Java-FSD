package filecreation;

import java.io.*;
import java.io.IOException;

public class FileCreation {
	
	public static void main(String[] args) 
	{
		CreateFile();
		WriteFile();
		ReadFile();
		DeleteFile();
		
	}
	public static void CreateFile() 
	{
		File f = new File("textfile1.txt");
		try 
		{
			f.createNewFile();	
			if(f.createNewFile())
			{
				System.out.println("File created: " + f.getName());
			}
			else
			{
				System.out.println("File already exists.");
			}
		} 
		catch (IOException e) 
		{			
			System.out.println("An error occurred.");
			e.printStackTrace();
		}		
	}
	public static void WriteFile() {
		String testFilePath = "C:\\Users\\dvsek\\eclipse-workspace\\Phase1_Practice_Project\\textfile.txt";

		FileWriter writer = null;
		try 
		{
			writer = new FileWriter(testFilePath, false);
			
			writer.write("Hello World");
			
			System.out.println("Done");

		}
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				writer.close();
			}
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}

	}
	public static void ReadFile() {
		String testFilePath = "C:\\Users\\dvsek\\eclipse-workspace\\Phase1_Practice_Project\\textfile.txt";


		FileReader in = null;
		try 
		{
			in = new FileReader(testFilePath);

			int b = in.read();
			System.out.println(b);

		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				in.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}

	}
	
	public static void DeleteFile() {
		
		File f = new File("C:\\Users\\dvsek\\eclipse-workspace\\Phase1_Practice_Project\\textfile1.txt");
			if(f.delete())
			{
				System.out.println("File Deleted");
			}
			else
			{
				System.out.println("File not Deleted");
			}


	}
}

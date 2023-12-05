package linearsearch;

import java.util.Scanner;

public class LinearSearch {
	
	static int search(int arr[], int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==x)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = {1,5,6,8,9,2,3};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Search Value");
		int x = sc.nextInt();
		int index = search(arr,x);
		if (index == -1)
		{
			System.out.println("Value is not found");
		}
		else
		{
			System.out.println("Value is found in " +index);
		}

	}

}

package exponentialsearch;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {
	
	static int exponentialSearch(int arr[],int n, int x)
	{
		if (arr[0] == x)
		{
			return 0;
		}
		int i = 1;
		while (i < n && arr[i] <= x)
			i = i*2;

		return Arrays.binarySearch(arr, i/2, Math.min(i, n-1), x);
	}
	
	public static void main(String args[])
	{
		int arr[] = {12, 4, 10, 40, 2};
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Search value: ");
		int x = sc.nextInt();
		int result = exponentialSearch(arr, arr.length, x);
		
		
		if (result < 0)
		{
			System.out.println("value not present in array");
		}
		else
		{
			System.out.println("Value is present at index " + result);
		}

}
}

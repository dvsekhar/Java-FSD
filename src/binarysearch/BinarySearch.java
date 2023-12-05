package binarysearch;

import java.util.Scanner;

public class BinarySearch {
	
	int binarySearch(int arr[], int s ,int e, int x)
	{
		while(s<=e)
		{
			int mid = (s+e)/2;
			if (arr[mid] == x)
			{
				return mid;
			}
			else if(arr[mid] > x)
			{
				e = mid-1;
			}
			else
			{
				s = mid+1;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		BinarySearch ob = new BinarySearch();
		 
        int arr[] = { 22, 31, 4, 10, 40, 88 };
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Search Value");
        int x = sc.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x);
 
        if (result == -1)
        {
            System.out.println("value not found");
        }
        else
        {
            System.out.println("value is found in " + result);
        }
    }

}

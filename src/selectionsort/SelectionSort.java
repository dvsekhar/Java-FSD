package selectionsort;

public class SelectionSort {
	static void selectionSort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			int index = i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[index])
				{
					index = j;
				}
			}
			int smallnumber = arr[index];
			arr[index]=arr[i];
			arr[i]=smallnumber;
		}
	}

	public static void main(String[] args) {
		int arr[] = {25,66,12,7,56,3,4};
		selectionSort(arr);
		  System.out.println("The sorted elements are:");
		    for(int i:arr)
		    {

		        System.out.println(i);
		         
		    }
	}

}

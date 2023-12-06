package bubblesort;

public class BubbleSort {
	static void bubbleSort(int arr[])
	{
		int n = arr.length;
        int temp = 0;
        for(int i=0;i<n;i++)
        {
            for (int j=1;j<n;j++)
            {
                if(arr[j-1]>arr[j])
                {
                	temp = arr[j-1];
                	arr[j-1]= arr[j];
                	arr[j]= temp;
                }
            }
        }

	}

	public static void main(String[] args) {
		int arr[] = {25,9,63,1,14,33};
		bubbleSort(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

}

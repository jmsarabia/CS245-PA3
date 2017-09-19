/* Utilities: class used across most of the algorithms for swapping purposes and printing the array
 * 			swap(int[]a, int i, int j ): swaps values at indices i and j in array a
 * 			printArray(a): prints array for testing purposes, at each step
 * 			main(): tests each algorithm
 */


public class Utilities {

	
	public static void swap(int[] arr, int i, int j)
	{
		//System.out.println("First num: "+inputArray[i]+ "\tSecond Num: "+inputArray[j]+"\n");
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
		
	}
	
	public static void printArray(int[] a)
	{

		System.out.print("{");
		for(int i = 0; i < a.length; i++)
		{
			if(i != a.length - 1)
				System.out.print(a[i] + ", ");
			else
				System.out.print(a[i]);
		}
		System.out.print("}\n");
	}
	
	public static void main(String[] args)
	{
		int[] testingArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		printArray(testingArray);
		
		System.out.println("\n\nTesting bubble sort:");

		//BUBBLE SORT
		System.out.println("Original array:");
		int[] arr = {8, 2, 4, 1, 7, 9, 5, 10, 3, 6};
		printArray(arr);
		System.out.println("Newly sorted array:");
		BubbleSort bs = new BubbleSort();
		bs.longerSort(arr);
		printArray(arr);
		
		System.out.println("NEWEST SORTED ARRAY");
		BubbleSort bubble = new BubbleSort();
		int[] arr2 = {8, 2, 4, 1, 7, 9, 5, 10, 3, 6};
		printArray(arr2);
		bubble.sort(arr2);
		printArray(arr2);

		System.out.println("\n------------------------------------------------------------------------------\n");
		
		System.out.println("\n\nINSERTION SORT");
		InsertionSort is = new InsertionSort();
		int[] arr3 = {8, 2, 4, 1, 7, 9, 5, 10, 3, 6};
		printArray(arr3);
		is.sort(arr3);
		printArray(arr3);
		

		System.out.println("\n------------------------------------------------------------------------------\n");
		
		System.out.println("\nMERGE SORT");
		MergeSort ms = new MergeSort();
		int[] arr4 = {8, 2, 4, 1, 7, 9, 5, 10, 3, 6};
		printArray(arr4);
		ms.sort(arr4);
		printArray(arr4);
		
		System.out.println("\n------------------------------------------------------------------------------\n");
		
		System.out.println("\nSELECTION SORT");
		SelectionSort ss = new SelectionSort();
		int[] arr5 = {8, 2, 4, 1, 7, 9, 5, 10, 3, 6};
		printArray(arr5);
		ss.sort(arr5);
		printArray(arr5);
		
		
		System.out.println("\n------------------------------------------------------------------------------\n");
		
		System.out.println("\nQUICK SORT");
		QuickSort quickSort = new QuickSort();
		int[] arr6 = {8, 2, 4, 1, 7, 9, 5, 10, 3, 6};
		printArray(arr6);
		quickSort.sort(arr6);
		
		printArray(arr6);
		


	}
}

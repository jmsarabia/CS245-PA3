
public class BubbleSort implements SortingAlgorithm{
	
	//First attempt at bubbleSort
	public void longerSort(int [] a)
	{
		
		for(int i = 0; i < a.length - 1; i++)
		{
			for(int j = 0; j < a.length-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					Utilities.swap(a, j, j+1);
					//System.out.println("THIS SHOULD CHANGE IT");
					//int tmp = a[j];
					//a[j] = a[j+1];
					//a[j+1] = tmp;
				}
				//Utilities.printArray(a);		print to see array and debug sort
			}	
		}//end outer for	
	}
	
	
	//Following class notes, this is the efficient version of bubble sort
	public void sort(int[] a)
	{
		boolean swapped = true;
		for(int i = 0; i < a.length && swapped; i++)
		{
			swapped = false;
			for(int j = 0; j< a.length-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					Utilities.swap(a, j, j+1);		//swap the values
					swapped = true;
				}//end if
			}//end inner for
			//Utilities.printArray(a);
		}//end outer for
	}
	
	

	
}

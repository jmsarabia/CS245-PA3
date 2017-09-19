
public class InsertionSort implements SortingAlgorithm{

	public void sort(int[] a)
	{
	
		//Implement insertion sort: shuffle elements to correct spot
		for(int i = 1; i < a.length; i++)
		{
			int tmp = a[i];
			int j = i - 1;
			while(j >= 0 && tmp < a[j])
			{
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = tmp;
			//Utilities.printArray(a);
		}
		
	}
	
	
}

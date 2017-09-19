
public class SelectionSort implements SortingAlgorithm {

	public void sort(int[] a)
	{
		//loop through, find the smallest starting at index 0, then insert where it belongs
		for(int i = 0; i < a.length-1; i++)
		{
			int smallest = i;
			for(int j = i+1; j< a.length; j++)
			{
				if(a[j] < a[smallest])
				{
					smallest = j;
				}
			}
			Utilities.swap(a, smallest, i);
		}
	}
	
	
	
	
	
}

import java.util.*;

public class QuickSort implements SortingAlgorithm{

	//Final implementation of quick sort, getting rid of partition class because it was confusing me
	public void sort(int[] a) 
	{
        sort(a, 0, a.length - 1);
    }
 
    private void sort(int a[], int bot, int top) 
    {     
        int i = bot;
        int j = top;
        // taking pivot number as median
        //TODO: Try as median of random 3 numbers
        int pivot = a[bot+(top-bot)/2];
        // Divide into two arrays: Partitioning portion
        while (i <= j) 
        {
        	//Iterate through till i and j cross
            while (a[i] < pivot) 
            {
                i++;
            }
            while (a[j] > pivot) 
            {
                j--;
            }
            //Swap, then increment indices
            if (i <= j) 
            {
                Utilities.swap(a, i, j);
                i++;
                j--;
            }
        }
        // recursively sort the smaller sections
        if (bot < j)
            sort(a, bot, j);
        if (i < top)
            sort(a, i, top);
    }
    
    //FOLLOWING: CLASS NOTES/LECTURE, READER/TEXTBOOK, GOOGLE SEARCHES; NONE WORKED WITH ALL MY MESSING WITH THEM
	/*public void sort(int[] a)
	{
		int top = a.length-1;
		int bot = 0;
		sort(a, top, bot);
		Utilities.printArray(a);
	}

	protected void sort(int[] a, int top, int bot)
	{
		// Call partition to divide the array. Everything above pivot is smaller than everything below.
		int pivot = partition(a, top, bot);
		// Recursively call quick sort on the top and bottom sub-arrays.
		if (top < pivot-1)  // Base case 1: must have at least 1 element to sort
			sort(a, top, pivot-1);
		if (pivot < bot)    // Base case 2: same for the bottom subarray
			sort(a, pivot, bot);
	}

	public int partition(int [] a, int top, int bot) {
		 Plan:
		 * a) Start i at "top" (lowest index) and loop down (forward) until a[i] > a[pivot]
		 * b) Start j at "bot" and loop up until a[j] < a[pivot]
		 * c) Where appropriate, swap a[i] and a[j], but keep an eye on the pivot at all times
		 * d) return i since that's either exactly where the pivot is or near enough.
		 
		int i = top;  // Loop down from here.
		int j = bot;  // Loop up from here.
		Random rand = new Random(top);
		int pivot = rand.nextInt(); 
		System.out.print(top+" "+bot+" "+pivot);
		
		while (i <= j) {
			// Find a large value (greater than pivot) in the start of the (sub-)array
			while (a[i] < a[pivot])
				i++;
			// Find a small value in the end of the (sub-)array
			while (a[j] > a[pivot])
				j--;
			// Swap these values, if appropriate.
			if (i <= j) {
				// ... but first: make sure to keep track of the pivot even if it moves.
				if (i == pivot)
					pivot = j;
				else if (j == pivot)
					pivot = i;
				Utilities.swap(a, i++, j--);
			}
		}
		// That's all. Return the pivot location (or close enough to it).
		return pivot;
	}



*/
	/*public void sort(int[] a)
	{
		qs(a, 0, a.length - 1);
	}
	public int partition(int [] a, int top, int bot) {
		int i = bot - 1;
		System.out.print("We done messed up");
		int pivot = a[top];
		for(int j = bot; j < top; j++)
		{
			if(a[j] <= pivot)
			{
				i++;
				Utilities.swap(a, i, j);
			}
		}
		
		Utilities.swap(a, i+1, top);
		
		return i+1;
	}
	
	// Quick sort: a recursive algorithm for sorting.
	public void qs(int [] a, int bot, int top) {
	
		if(bot < top)
		{
			int pivot = partition(a, bot, top);
			qs(a, bot, pivot-1);
			qs(a, pivot+1, top);
		}
		Utilities.printArray(a);
	}
*/
	
	
	
	
	/*public int partition(int [] a, int top, int bot) {
		 Plan:
		 * a) Start i at "top" (lowest index) and loop down (forward) until a[i] > a[pivot]
		 * b) Start j at "bot" and loop up until a[j] < a[pivot]
		 * c) Where appropriate, swap a[i] and a[j], but keep an eye on the pivot at all times
		 * d) return i since that's either exactly where the pivot is or near enough.
		 
		int i = top;  // Loop down from here.
		int j = bot;  // Loop up from here.
		int pivot = (top + bot) / 2; // One of several pivot selection strategies.
		
		while (i <= j) {
			// Find a large value (greater than pivot) in the start of the (sub-)array
			while (a[i] < a[pivot])
				i++;
			// Find a small value in the end of the (sub-)array
			while (a[j] > a[pivot])
				j--;
			// Swap these values, if appropriate.
			if (i <= j) {
				// ... but first: make sure to keep track of the pivot even if it moves.
				if (i == pivot)
					pivot = j;
				else if (j == pivot)
					pivot = i;
				Utilities.swap(a, i++, j--);
				i++;
				j--;
			}
		}
		// That's all. Return the pivot location (or close enough to it).
		return i;
	}
	
	// Quick sort: a recursive algorithm for sorting.
	public void qs(int [] a, int top, int bot) {
		// Call partition to divide the array. Everything above pivot is smaller than everything below.
		int pivot = partition(a, top, bot);
		// Recursively call quick sort on the top and bottom sub-arrays.
		if (top < pivot-1)  // Base case 1: must have at least 1 element to sort
			qs(a, top, pivot-1);
		if (pivot < bot)    // Base case 2: same for the bottom subarray
			qs(a, pivot, bot);
	}
	
	public void sort(int[] a)
	{
		qs(a, a.length - 1, 0);
	}*/
}

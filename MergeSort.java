
public class MergeSort implements SortingAlgorithm{

	public void sort(int[] a) {
		if (a.length > 1) {
			
			//Make copy of first half of the array, then sort
			int[] top = new int[a.length / 2];
			System.arraycopy(a, 0, top, 0, a.length / 2);	//Faster than looping with for loops. Thanks Google
			sort(top);
			int lowIndex = a.length - a.length / 2;
			//Make copy of second half of array, then sort
			int[] bot = new int[lowIndex];
			System.arraycopy(a, a.length / 2, bot, 0, lowIndex);
			sort(bot);
			// Merge top half with bottom half into list a 
			merge(top, bot, a);
		}
	}
	public static void merge(int[] botArr, int[] topArr, int[] a) {
		
		int top_index = 0; 
		int bot_index = 0; 
		int a_index = 0; 

		//Loop through both ends of array, then comparing the two arrays and putting elements in 
		//    the final array in correct order, incrementing after we add elements
		while (top_index < botArr.length && bot_index < topArr.length) 
		{
			if (botArr[top_index] < topArr[bot_index])
			{
				a[a_index++] = botArr[top_index++];
			}
			else
			{
				a[a_index++] = topArr[bot_index++];
			}
		}
		//Looping bottom against top, top against bottom
		while (top_index < botArr.length)
		{
			a[a_index++] = botArr[top_index++];
		}
		while (bot_index < topArr.length)
		{
			a[a_index++] = topArr[bot_index++];
	
		}
	}
	

}

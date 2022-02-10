import java.util.Vector;
import java.util.Arrays;
public class Sorts {

	// Gnome Sort 
	// Codigo para Gnome Sort recuperado de la pagina web: https://www.geeksforgeeks.org/gnome-sort-a-stupid-one/
	
	static void gnomeSort(int arr[], int n)
	    {
	        int index = 0;
	 
	        while (index < n) {
	            if (index == 0)
	                index++;
	            if (arr[index] >= arr[index - 1])
	                index++;
	            else {
	                int temp = 0;
	                temp = arr[index];
	                arr[index] = arr[index - 1];
	                arr[index - 1] = temp;
	                index--;
	            }
	        }
	        return;
	    }
	
	
	
	
	
	// MergeSort
	// Codigo recuperado del libro de texto del curso Java Structures, de Duane A. Bailey, en la pagina 127
	
	private static void merge(int data[], int temp[], int low, int middle, int high) {
		
		int ri = low; 
		int ti = low;
		int di = middle; 
		
		while (ti < middle && di <= high) {
			
			if (data[di] < temp[ti]) {
				
				data[ri++] = data[di++];
								
			}else {
				
				data[ri++] = temp[ti++];
			}
		}
		while (ti < middle) {
			
			data[ri++] = temp[ti++];
		}
		
	}
	
	
	private static void mergeSortRecursive(int data[], int temp[], int low, int high) {
		
		int n = high-low+1;
		int middle = low + n/2;
		int i;
		
		if (n<2) return;
		
		for (i = low; i < middle; i++) {
			
			temp[i] = data[i];
			
		}
		
		mergeSortRecursive(temp, data, low, middle-1);
		mergeSortRecursive(data, temp, middle, high);
		merge(data, temp, low, middle, high);
		
	}
	
	
	public static void mergeSort(int data[], int n) {
		
		mergeSortRecursive(data, new int[n], 0, n-1);
	}
	
	
	//quickSort
	//Codigo para quick sort recuperado de la pagina web: https://www.geeksforgeeks.org/quick-sort/
	
	// A utility function to swap two elements
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	 
	/* This function takes last element as pivot, places
	   the pivot element at its correct position in sorted
	   array, and places all smaller (smaller than pivot)
	   to left of pivot and all greater elements to right
	   of pivot */
	static int partition(int[] arr, int low, int high)
	{
	     
	    // pivot
	    int pivot = arr[high];
	     
	    // Index of smaller element and
	    // indicates the right position
	    // of pivot found so far
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	         
	        // If current element is smaller
	        // than the pivot
	        if (arr[j] < pivot)
	        {
	             
	            // Increment index of
	            // smaller element
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	 
	/* The main function that implements QuickSort
	          arr[] --> Array to be sorted,
	          low --> Starting index,
	          high --> Ending index
	 */
	static void quickSort(int[] arr, int low, int high)
	{
	    if (low < high)
	    {
	         
	        // pi is partitioning index, arr[p]
	        // is now at right place
	        int pi = partition(arr, low, high);
	 
	        // Separately sort elements before
	        // partition and after partition
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	}
	
	
	// radixSort
	// Codigo para raddix recuperado de la página web: https://www.geeksforgeeks.org/radix-sort/
	
	// A utility function to get maximum value in arr[]
    static int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(int arr[], int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
 
    // The main function to that sorts arr[] of size n using
    // Radix Sort
    static void radixSort(int arr[], int n)
    {
        // Find the maximum number to know number of digits
        int m = getMax(arr, n);
 
        // Do counting sort for every digit. Note that
        // instead of passing digit number, exp is passed.
        // exp is 10^i where i is current digit number
        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);
    }
	
	
	
	
	
	
}

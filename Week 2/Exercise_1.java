// use debug to show tracing 2.1.1

// 2.1.11 Implement a version of shellsort that keeps the increment sequence in an array, rather than computing it.

/** Student Notes:
 * 
 * My setup was giving me issues on the debug side of things, but I can provide the code for the given exercise (2.1.11).
 * 
 * The shellsort function provided meets given requirements and sorts numbers as demonstrated in main().
*/

import java.util.Random;
import java.util.Arrays;

public class Exercise_1 {
    public static void main(String[] args) {
        // Initialize an array of size 10
        int[] arr = new int[10];
        
        // Fill the array with random integers between 0 and 99
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(100);
        }
        
        // Print the original unsorted array
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Sort the array using shellSort
        shellSort(arr);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

	public static void shellSort(int[] arr) {
		int numSize = arr.length;
		// Define the increment sequence
		int[] increments = { 5, 3, 1 };
		
		// Iterate over each gap in the increment sequence
		for (int gap : increments) {
			// Perform a gapped insertion sort for this gap size
			for (int i = gap; i < numSize; i++) {
				int temp = arr[i];
				int j = i;
				// Shift earlier gap-sorted elements up until the correct location for arr[i] is found
				while (j >= gap && arr[j - gap] > temp) {
					arr[j] = arr[j - gap];
					j -= gap;
				}
				// Put temp (the original arr[i]) in its correct location
				arr[j] = temp;
			}
		}
	}
}

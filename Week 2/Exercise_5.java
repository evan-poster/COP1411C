// modify either merge sort or quick sort ( refer to Student Resources section ) to sort letters.

/** Original mergeSort
 * 
 *     public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            // recursively sort left & right halves
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge the sorted halves
            merge(arr, l, m, r);
        }
 */

/** Student Notes:
 * 
 * The assignment mentions sorting LETTERS. Since Java makes a distinction between letters (char) and strings (String), I'm going to assume that the assignment is referring to an array of chars.
 * 
 * No guidance is given regarding case. Since case have different ASCII values, this will result in upper before lower, but otherwise be in order. Both are demonstrated to show the algorithm properly accounts for each.
 * 
 * No mention of sorting non-alphabetical characters is given. Assuming they are not to be considered for this exercise.
 */

import java.util.Arrays;

public class Exercise_5 {
	public static void main(String[] args) {
		// Initialize an array of size 10
		char[] arr = new char[10];
		
		// Fill the array with random characters between 'A' and 'Z'
		for (int i = 0; i < arr.length; i++) {
			boolean lowerCase = Math.random() < 0.5;
			arr[i] = (char) ((lowerCase ? 'a' : 'A') + (int)(Math.random() * ('z' - 'a' + 1)));
		}
		
		// Print the original unsorted array
		System.out.println("Original array: " + Arrays.toString(arr));
		
		// Sort the array using shellSort
		mergeSort(arr);
		
		// Print the sorted array
		System.out.println("Sorted array: " + Arrays.toString(arr));
	}

	public static void mergeSort(char[] arr) {
		if (arr.length > 1) {
			// Split the array into two halves
			int mid = arr.length / 2;
			char[] left = Arrays.copyOfRange(arr, 0, mid);
			char[] right = Arrays.copyOfRange(arr, mid, arr.length);

			// Recursively sort the two halves
			mergeSort(left);
			mergeSort(right);

			// Merge the two sorted halves
			merge(arr, left, right);
		}
	}


	public static void merge(char[] arr, char[] left, char[] right) {
		// Initialize counters for left and right arrays, and the output array
		int i = 0, j = 0, k = 0;
		
		// Merge the two sorted halves
		while (i < left.length && j < right.length) {
			// Compare elements from the two halves
			if (left[i] < right[j]) {
				// Copy element from the left array to the output array
				arr[k++] = left[i++];
			} else {
				// Copy element from the right array to the output array
				arr[k++] = right[j++];
			}
		}
		
		// Copy any remaining elements from the left array
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		
		// Copy any remaining elements from the right array
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}
}

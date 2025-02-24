// apply a sorting alglrithm to confirm your manual finding (for example: create a small set of strings ( book titles) in no particular order. pass the list of book titles to your sorting algorithm.

/** Student Notes:
 * 
 * It seems the assignment is asking me to write a function that sorts a list of book titles in alphabetical order.
 * 
 * No mention of algorithm preference is given, so a bubble sort is used.
*/
import java.util.Arrays;

public class Exercise_4 {
	public static void main(String[] args) {
		// Create an array of book titles
		String[] bookTitles = { "The Great Gatsby", "To Kill a Mockingbird", "1984", "Pride and Prejudice", "The Catcher in the Rye" };

		// Print the original book titles
		System.out.println("Original book titles: " + Arrays.toString(bookTitles));

		// Sort the book titles in alphabetical order
		bookTitles = sortBookTitles(bookTitles);

		// Print the sorted book titles
		System.out.println("Sorted book titles: " + Arrays.toString(bookTitles));
	}

	public static String[] sortBookTitles(String[] bookTitles) {
		// Using Bubble Sort algorithm

		// Sort the book titles in alphabetical order
		for (int i = 0; i < bookTitles.length - 1; i++) {
			for (int j = 0; j < bookTitles.length - i - 1; j++) {
				// Compare the current element with the next
				// one and swap if the current element is
				// greater than the next
				if (bookTitles[j].compareTo(bookTitles[j + 1]) > 0) {
					String temp = bookTitles[j];
					bookTitles[j] = bookTitles[j + 1];
					bookTitles[j + 1] = temp;
				}
			}
		}
		// Return the sorted book titles
		return bookTitles;
	}
}
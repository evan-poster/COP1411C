// use some small data sets to prove or disapprove the sorting order above

/** Student Note:
 * 
 * I took liberties regarding how to interpret this. It sounds like I'm intended to use my code from Exercise_2.
 * 
 * Rather than put everything in one large class, I've placed each exercise in its own class. As a result, this one will be referencing the previous one to perform the relevant functions.
 * 
 * Finally, it says to prove/disprove, but does not say that a call to a sorting algorithm is required. As such, I simply show how each number is handled and show the time complexity for each function. When viewed. This should demonstrate that the given order is correct.
 */
import java.util.Random;

public class Exercise_3 {
	public static void main(String[] args) {
		// generate random numbers for testing our algorithms
		Random random = new Random();
		int[] numbers = new int[10];
		for (int i = 0; i < numbers.length; i++) {
			// fill array with random numbers between 1 and 10
			numbers[i] = random.nextInt(10) + 1;
		}

		// print the random numbers
		System.out.println("Random numbers: ");
		for (float number : numbers) {
			System.out.println(number);
		}
		
		// print the numbers to demonstrate order is correct
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Number: " + numbers[i]);
			System.out.println("O(1) = " + Exercise_2.o1(numbers[i]));
			System.out.println("O(log n) = " + Exercise_2.logn(numbers[i]));
			System.out.println("O(n) = " + Exercise_2.n(numbers[i]));
			System.out.println("O(n log n) = " + Exercise_2.nlogn(numbers[i]));
			System.out.println("O(n^2) = " + Exercise_2.n2(numbers[i]));
			System.out.println("O(n!) = " + Exercise_2.nfactorial(numbers[i]));
			// print a blank line to separate the different numbers
			System.out.println("------------------------");
		}
	}
}

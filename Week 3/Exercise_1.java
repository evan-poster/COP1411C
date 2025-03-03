/**
 * 
 * 3.1.1 Write a client that creates a symbol table mapping letter grades to numerical scores, as in the table below, then reads from standard input a list of letter grades and computes and prints the GPA (the average of the numbers corresponding to the grades).
 * 
 * Note: Keiser has simpler grading scale: A,B,C,D,F, whereas the exercise has much granular scales, follow the exercise instruction to create the symbol table, aka dictionary, or Map in Java lingo)
 * 
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise_1 {
	public static void main(String[] args) {
		// Create a symbol table mapping letter grades to numerical scores
		Map<String, Double> letterGrades = new HashMap<>();
		letterGrades.put("A+", 4.33);
		letterGrades.put("A", 4.0);
		letterGrades.put("A-", 3.67);
		letterGrades.put("B+", 3.33);
		letterGrades.put("B", 3.0);
		letterGrades.put("B-", 2.67);
		letterGrades.put("C+", 2.33);
		letterGrades.put("C", 2.0);
		letterGrades.put("C-", 1.67);
		letterGrades.put("D+", 1.33);
		letterGrades.put("D", 1.0);
		letterGrades.put("D-", 0.67);
		letterGrades.put("F", 0.0);

		// Read from standard input a list of letter grades and compute and print the GPA
		Scanner scanner = new Scanner(System.in);
		double total = 0.0;
		int count = 0;
		while (true) {
			System.out.print("Enter a letter grade ('q' to quit): ");
			String line = scanner.nextLine();
			if (line.equals("q") || line.equals("")) {
				break;
			}
			String grade = line.trim();
			total += Double.parseDouble(line);
			count++;
		}
		scanner.close();

		// Compute the GPA
		double gpa = total / count;

		// Determine GPA from table using Map
		String grade = "";
		for (Map.Entry<String, Double> entry : letterGrades.entrySet()) {
			if (gpa >= entry.getValue()) {
				grade = entry.getKey();
				break;
			}
		}
		System.out.println("GPA: " + gpa + " (" + grade + ")");

		// Print GPA
		System.out.println("GPA: " + gpa);
	}
}
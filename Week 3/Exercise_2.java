/**
 * 
 * build your dictionary which keeps track of unique words and their frequency count from a text (refer to the tinyTale.txt on p371 of our text. The output should conform to the left column on page 371
 * 
 * Student Notes:
 * 
 * No reference made to an exercise. Text provided in book was used as directed.
 * 
 * Guidance regarding page 371 isn't entirely clear based on PDF of book. There is a table, however, on the page following the text. This was used as reference.
 */

import java.util.HashMap;
import java.util.Map;

public class Exercise_2 {
	public static String text = "it was the best of times it was the worst of times it was the age of wisdom it was the age of foolishness it was the epoch of belief it was the epoch of incredulity it was the season of light it was the season of darkness it was the spring of hope it was the winter of despair";

	public static void main(String[] args) {
		// Create a map to store unique words and their frequency count
		Map<String, Integer> wordCount = new HashMap<>();

		// Split the text into words
		String[] words = text.split("\\s+");

		// Count the frequency of each word
		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		// Print the word count
		System.out.println("Words\t\t\tDistinct");
		System.out.println("-----\t\t\t--------------");
		System.out.println("all words" + "\t\t" + allWords(wordCount) + "\t" + distinctWords(wordCount));
		System.out.println("at least 8 letters" + "\t" + atLeast8Letters(wordCount) + "\t" + distinctAtLeast8Letters(wordCount));
		System.out.println("at least 10 letters" + "\t" + atLeast10Letters(wordCount) + "\t" + distinctAtLeast10Letters(wordCount));
	}
	
	private static int allWords(Map<String, Integer> wordCount) {
		int count = 0;
		for (int num : wordCount.values()) {
			count += num;
		}
		return count;
	}
	
	private static int distinctWords(Map<String, Integer> wordCount) {
		return wordCount.size();
	}
	
	private static int atLeast8Letters(Map<String, Integer> wordCount) {
		int count = 0;
		for (String word : wordCount.keySet()) {
			if (word.length() >= 8) {
				count += wordCount.get(word);
			}
		}
		return count;
	}
	
	private static int distinctAtLeast8Letters(Map<String, Integer> wordCount) {
		int count = 0;
		for (String word : wordCount.keySet()) {
			if (word.length() >= 8) {
				count++;
			}
		}
		return count;
	}
	
	private static int atLeast10Letters(Map<String, Integer> wordCount) {
		int count = 0;
		for (String word : wordCount.keySet()) {
			if (word.length() >= 10) {
				count += wordCount.get(word);
			}
		}
		return count;
	}
	
	private static int distinctAtLeast10Letters(Map<String, Integer> wordCount) {
		int count = 0;
		for (String word : wordCount.keySet()) {
			if (word.length() >= 10) {
				count++;
			}
		}
		return count;
	}
}
// Reimplement 1.1.9, without using Integer.toBinaryString

// Update 1: Using StringBuilder per instructions

import java.lang.StringBuilder;

public class Exercise_1 {
	public static void main(String[] args) {
		int N = 10;
		StringBuilder s = new StringBuilder();
		StringBuilder stringBuilder = new StringBuilder();
		for (int n = N; n > 0; n /= 2) {
			System.out.println("Current n: " + n);
			stringBuilder.insert(0, (n % 2 == 0 ? "0" : "1"));
			System.out.println("Current binary string: " + stringBuilder.toString());
		}
		System.out.println("Final binary string: " + stringBuilder.toString());
	}
}

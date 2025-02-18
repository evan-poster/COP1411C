// Reimplement 1.1.9, without using Integer.toBinaryString

public class Exercise_1 {
	public static void main(String[] args) {
		int N = 10;
		String s = "";
		for (int n = N; n > 0; n /= 2) {
			System.out.println("Current n: " + n);
			s = (n % 2 == 0 ? "0" : "1") + s;
			System.out.println("Current binary string: " + s);
		}
		System.out.println("Final binary string: " + s);
	}
}

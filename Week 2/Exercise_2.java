// implement O(1), O(logn), O(n), O(nlogn), O(n^2), O(2^n) & O(n!)  ( you can leverage math library when you build each function )

/** Student Note:
 * 
 * It mentionsn that I may use a math library, so I'm assuming it's referencing the log() function.
 * 
 * Functions are listed in the order of increasing complexity. 10 is used as a sample value.
*/

public class Exercise_2 {
	public static void main(String[] args) {
		System.out.println("O(1) = " + o1(10));
		System.out.println("O(log n) = " + logn(10));
		System.out.println("O(n) = " + n(10));
		System.out.println("O(n log n) = " + nlogn(10));
		System.out.println("O(n^2) = " + n2(10));
		System.out.println("O(n!) = " + nfactorial(10));
	}

	public static float o1(float n) { return 1; }

	public static float logn(float n) { return (float)Math.log(n); }

	public static float n(float n) { return n; }

	public static float nlogn(float n) { return (float)(n * Math.log(n)); }

	public static float n2(float n) { return n * n; }

	public static float nfactorial(float n) {
		float result = 1;
		for (float i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}

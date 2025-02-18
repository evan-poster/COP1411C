// 1.1.11

// Write a code fragment that prints the contents of a two-dimensional boolean array, using * to represent true and a space to represent false . Include row and column numbers.

// Student Note: I took liberties on the output format since it wasn't specific and I wanted to provide extra clarity that spaces were generated.

public class Exercise_2 {
	public static void main(String[] args) {
		boolean[][] matrix = {
			{ true, false, false },
			{ true, true, false },
			{ false, true, true },
		};
		
		System.out.println("Matrix:");
		System.out.println("     0    1    2");
		for (int x = 0; x < matrix.length; x++) {
			System.out.print(x + " : ");
			for (int y = 0; y < matrix[x].length; y++) {
				System.out.print("[" + (matrix[x][y] ? "*" : " ") + "]");
				if (y < matrix[x].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println();
		}
	}
}

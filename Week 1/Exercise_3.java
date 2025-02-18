// 1.1.13

// Write a code fragment to print the transposition (rows and columns changed) of a two- dimensional array with M rows and N columns.

public class Exercise_3 {
	public static void main(String[] args) {
		int[][] matrix = {
			{ 1, 2 },
			{ 3, 4 }
		};

		System.out.println("Original matrix:");
		printMatrix(matrix);

		// Simply reverse x and y indices to transpose
		int [][] transposed = new int[matrix[0].length][matrix.length];
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				transposed[y][x] = matrix[x][y];
			}
		}

		System.out.println("Transposed matrix:");
		printMatrix(transposed);
	}

	public static void printMatrix(int[][] matrix) {
		for (int x = 0; x < matrix.length; x++) {
			for (int y = 0; y < matrix[x].length; y++) {
				System.out.print(matrix[x][y] + " ");
			}
			System.out.println();
		}
	}
}

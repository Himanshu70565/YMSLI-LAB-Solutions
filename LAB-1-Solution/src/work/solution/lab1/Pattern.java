package work.solution.lab1;

public class Pattern {

	/*
	 * 1 
	 * 1 2 
	 * 1 2 3 
	 */
	public static void printPattern(int numOfRows) {

		for (int row = 1; row <= numOfRows; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		printPattern(10);

	}
}

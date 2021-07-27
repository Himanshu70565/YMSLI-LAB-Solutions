package work.solution.lab1;

public class TimeTable {

	public static void printTimeTable(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print((i * j) + " ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		printTimeTable(10);
	}
}

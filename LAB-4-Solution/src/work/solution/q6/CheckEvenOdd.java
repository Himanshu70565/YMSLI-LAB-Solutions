package work.solution.q6;

import java.util.*;

class InputException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InputException(int number) {
		super("Number can’t be greater than [" + number + "]");
	}

}

public class CheckEvenOdd {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Please enter a number or enter '-1' if you want to quit");
			int input = sc.nextInt(); // goes to the InputMismatch catch block if wrong input

			// Exit Condition
			if (input == -1) {
				System.out.println("---Exit---");
				return;
			}

			if (input > 100) {
				throw new InputException(100);
			}

			if (input % 2 == 0) {
				System.out.println("You have entered an even number");
			} else {
				System.out.println("You have entered an odd number");
			}

		} catch (InputMismatchException e) {
			System.out.println("You must enter an integer");
			e.printStackTrace();
		} catch (InputException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}

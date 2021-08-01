package work.solution.q4;

import java.util.*;

public class CheckEvenOdd {
	public static void main(String[] args) {

			// ARM : Automatic Resource Management Syntax is giving error ???
			try(Scanner sc = new Scanner(System.in);){
				
				System.out.println("Please enter a number or enter '-1' if you want to quit");
				int input = sc.nextInt(); /// goes to the InputMismatch catch block if wrong input

				if (input == -1) {
					// we have to exit from the programme
					return;
				}
				if (input % 2 == 0) {
					// we have entered a even number
					System.out.println("You have entered an even number");
				} else {
					// we have entered a odd number
					System.out.println("You have entered an odd number");
				}

			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer");
				e.printStackTrace();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
	}
}

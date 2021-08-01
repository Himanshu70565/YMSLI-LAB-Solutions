package work.solution.q5;

import java.util.*;

public class CheckEvenOdd {
	public static void main(String[] args) {

		
			try(Scanner sc=new Scanner(System.in);) {

				System.out.println("Please enter a number or enter '-1' if you want to quit");
				int input = sc.nextInt(); // goes to the InputMismatch catch block if wrong input

				//Exit Condition
				if (input == -1) {
					System.out.println("----Exiting---");
					return;
				}
				
				if(input>100) {
					throw new Exception("Number can’t be greater than 100");
				}

				if (input % 2 == 0) {
					System.out.println("You have entered an even number");
				} else {
					System.out.println("You have entered an odd number");
				}

			} catch (InputMismatchException e) {
				System.out.println("You must enter an integer");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}	
	}
}

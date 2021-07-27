package work.solution.lab1;

import java.util.Scanner;

public class Fibonacci {

	//A function for printing fibonacci number upto n and their average
	public static void printFib(int n) {

		int fib[] = new int[n];
		fib[0] = fib[1] = 1;

		for (int i = 2; i < n; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}

		double sumOfFib = 0;

		System.out.println("The first " + n + " Fibonacci numbers are :");
		for (int i = 0; i < n; i++) {
			System.out.print(fib[i] + " ");
			sumOfFib += fib[i];
		}
		System.out.println();
		System.out.println("The average is " + (sumOfFib / n));

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of n for printing fibonacci series");
		int n = sc.nextInt();

		printFib(n);
	}
}

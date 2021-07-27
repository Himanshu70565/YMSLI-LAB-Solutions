package work.solution.lab1;

import java.util.Scanner;
public class GradesAverage {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of students");
		int numOfStudent = sc.nextInt();
		double grades[]=new double[numOfStudent];
		double totalGrade = 0;

		for (int i = 1; i <= numOfStudent; i++) {

			System.out.println("Enter the grade of student " + i);
			double grade = sc.nextDouble();
			
			// Invalid grade
			if (grade < 0 || grade > 100) {
				System.out.println("Invalid grade,try again ...");
				i--;
				continue;
			}

			grades[i-1]=grade;
			totalGrade += grade;
		}

		System.out.println("The average is : " + totalGrade / numOfStudent);
	}
}

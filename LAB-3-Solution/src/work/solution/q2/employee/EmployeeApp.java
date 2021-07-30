package work.solution.q2.employee;

import java.util.*;

public class EmployeeApp {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int choice;

		do {
			System.out.println("Enter 1: Add Employee ,2 :Print Employees, 3:Increasing Rate, 4:Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addNewEmployee(sc, list);
				break;
			case 2:
				printAllEmployee(list);
				break;
			case 3:
				increaseRate(sc, list);
				break;
			case 4:
				System.out.println("----Exiting----");
				break;
			default:
				System.out.println("---Wrong choice---");
				break;
			}

		} while (choice != 4);

	}

	private static void increaseRate(Scanner sc, List<Employee> list) {
		System.out.println("Enter ==> 1.Hourly Employee 2.Salaried Employee 3.Comission Employee");
		int type = sc.nextInt();
		System.out.println("Enter increase rate :");
		double increasePercentage = sc.nextDouble();
		switch (type) {
		case 1:
			for (Employee e : list) {
				if (e instanceof HourlyEmployee) {
					e.increaseRate(increasePercentage);
				}
			}
			break;
		case 2:
			for (Employee e : list) {
				if (e instanceof SalariedEmployee) {
					e.increaseRate(increasePercentage);
				}
			}
			break;
		case 3:
			for (Employee e : list) {
				if (e instanceof CommissionEmployee) {
					e.increaseRate(increasePercentage);
				}
			}
			break;
		default:
			System.out.println("Wrong choice!!!");
			break;
		}
	}

	private static void printAllEmployee(List<Employee> list) {
		int index = 0;
		for (Employee emp : list) {
			System.out.println("***Employee [" + index + "] ***");
			emp.getPayment();
			System.out.println();
			index++;
		}
	}

	private static void addNewEmployee(Scanner sc, List<Employee> list) {
		System.out.println("Enter ==> 1.Hourly Employee 2.Salaried Employee 3.Comission Employee");
		int type = sc.nextInt();
		System.out.println("Enter employee id:");
		int id = sc.nextInt();
		System.out.println("Enter employee name:");
		String name = sc.next();

		switch (type) {
		case 1:
			System.out.println("Enter salaryPerHour");
			double salaryPerHour = sc.nextDouble();
			System.out.println("Enter hourWorkedPerWeek");
			int hourWorkedPerWeek = sc.nextInt();
			Employee e1 = new HourlyEmployee(id, name, salaryPerHour, hourWorkedPerWeek);
			list.add(e1);
			System.out.println("--Hourly Employee Added--");
			break;
		case 2:
			System.out.println("Enter weeklySalary");
			double weeklySalary = sc.nextDouble();
			Employee e2 = new SalariedEmployee(id, name, weeklySalary);
			list.add(e2);
			System.out.println("--Salaried Employee Added--");
			break;
		case 3:
			System.out.println("Enter weeklySale");
			double weeklySale = sc.nextDouble();
			System.out.println("Enter percentageRate");
			double percentageRate = sc.nextDouble();
			Employee e3 = new CommissionEmployee(id, name, weeklySale, percentageRate);
			list.add(e3);
			System.out.println("--Commission Employee Added--");
			break;
		default:
			System.out.println("Wrong Choice !!!");
			break;
		}
	}
}

package work.solution.q2.employee;

import java.text.DecimalFormat;

import work.solution.q2.Payable;

public abstract class Employee implements Payable {

	private int id;
	private String name;
	private final String accountNumber;
	private double salary;
	public static final int DAYSOFMONTH = 31;
	static DecimalFormat df = new DecimalFormat("#.##");

	Employee(int id,String name, double salary) {
		this.id=id;
		this.name = name;
		this.salary = salary;
		accountNumber = 10000 + (int) (Math.random() * 89999) + "";
	}

	public String getName() {
		return name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getSalary() {
		return salary;
	}

	public abstract void setRate(double x);

	public abstract double getWeeklySalary();

	public abstract void increaseRate(double percent);

	public void getPayment() {
		System.out.println("Name :" + getName());
		System.out.println("Account number :" + getAccountNumber());
	}
}

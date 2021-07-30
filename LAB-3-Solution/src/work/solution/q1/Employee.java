package work.solution.q1;

import java.text.DecimalFormat;

public abstract class Employee {

	private int id;
	private String name;
	private final String accountNumber;
	private double salary;
	public static final int DAYSOFMONTH=31;
	static DecimalFormat df=new DecimalFormat("#.##");

	Employee(int id,String name, double salary) {
		this.id=id;
		this.name = name;
		this.salary = Double.valueOf(df.format(salary));
		accountNumber = 10000 + (int)(Math.random()*89999) + "";
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	public abstract void setRate(double x);

	public abstract double getWeeklySalary();

	public abstract void increaseRate(double percent);

	public void display() {
		System.out.println("Name :" + getName());
	}
}

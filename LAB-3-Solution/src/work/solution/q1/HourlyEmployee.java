package work.solution.q1;

public class HourlyEmployee extends Employee{

	private double salaryPerHour;
	private int hourWorkedPerWeek=8;
	
 	public HourlyEmployee(int id,String name, double salaryPerHour,int hourWorkedPerWeek) {
		super(id,name, DAYSOFMONTH*(hourWorkedPerWeek*salaryPerHour/7));
		this.salaryPerHour=salaryPerHour;
		this.hourWorkedPerWeek=hourWorkedPerWeek;
	}

	@Override
	public void setRate(double salaryPerHour) {
		this.salaryPerHour=salaryPerHour;
	}

	@Override
	public double getWeeklySalary() {
		return hourWorkedPerWeek*salaryPerHour;
	}

	@Override
	public void increaseRate(double percent) {
		salaryPerHour+=(percent*salaryPerHour)/100;
	}

	@Override
	public void display() {
		super.display();
		System.out.println("Hourly salary :" + salaryPerHour);
		System.out.println("Weekly salary :" + df.format(getWeeklySalary()));
		System.out.println("Total salary :" + df.format(getSalary()));
	}

}

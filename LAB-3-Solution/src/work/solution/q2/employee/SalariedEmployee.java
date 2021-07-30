package work.solution.q2.employee;

public class SalariedEmployee extends Employee {

	private double weeklySalary;

	public SalariedEmployee(int id,String name, double weeklySalary) {
		super(id,name, DAYSOFMONTH * (weeklySalary / 7));
		this.weeklySalary = weeklySalary;
	}

	@Override
	public void setRate(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getWeeklySalary() {
		return weeklySalary;
	}

	@Override
	public void increaseRate(double percent) {
		weeklySalary += (weeklySalary * percent) / 100;
	}

	@Override
	public void getPayment() {
		super.getPayment();
		System.out.println("Daily salary:" + df.format(weeklySalary / 7));
		System.out.println("Weekly salary :" + df.format(weeklySalary));
		System.out.println("Total salary :" + df.format(getSalary()));
	}

}

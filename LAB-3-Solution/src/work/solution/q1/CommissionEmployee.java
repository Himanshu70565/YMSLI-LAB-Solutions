package work.solution.q1;

public class CommissionEmployee extends Employee {

	private double weeklySale;
	private double percentageRate;
	
	CommissionEmployee(int id,String name, double weeklySale,double percentageRate) {
		super(id,name, DAYSOFMONTH*((weeklySale*percentageRate)/(100*7)));
		this.weeklySale=weeklySale;
		this.percentageRate=percentageRate;
	}

	@Override
	public void setRate(double percentageRate) {
		this.percentageRate=percentageRate;
	}

	@Override
	public double getWeeklySalary() {
		return weeklySale*percentageRate/100;
	}

	@Override
	public void increaseRate(double percent) {
		percentageRate+=(percent*percentageRate)/100;
	}
	
	public void display() {
		super.display();
		System.out.println("Weekly sale :" + weeklySale);
		System.out.println("Percentage rate:" + percentageRate);
		System.out.println("Daily salary :" + df.format(getWeeklySalary() / 7));
		System.out.println("Weekly salary :" + df.format(getWeeklySalary()));
		System.out.println("Total salary :" + df.format(getSalary()));
	}
	
}

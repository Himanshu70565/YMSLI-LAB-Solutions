package work.solution.q5;

public class Convertible extends Vehicle {
	private boolean isHoodOpen;
	
	public Convertible(String make, int model, int noOfWheel, int noOfPassenger) {
		super(make, model, noOfWheel, noOfPassenger);
	}

	public Convertible(String make, int model, int noOfWheel, int noOfPassenger,boolean isHoodOpen) {
		super(make, model, noOfWheel, noOfPassenger);
		this.isHoodOpen=isHoodOpen;
	}

	@Override
	public void display() {
		System.out.println("**** Convertible ****");
		super.display();
		System.out.println("HoodOpen : "+isHoodOpen);
	}
	
}	

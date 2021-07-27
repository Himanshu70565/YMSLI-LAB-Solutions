package work.solution.q5;

public class Vehicle {
	
	private String make;
	private int model;
	private int noOfWheel;
	private int noOfPassenger;
	
	public Vehicle(String make, int model, int noOfWheel, int noOfPassenger) {
		this.make = make;
		this.model = model;
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
	}

	public void display() {
		System.out.println("Model : " + model);
		System.out.println("Maker : " + make);
		System.out.println("Number of wheel : " + noOfWheel);
		System.out.println("Number of Passenger : " + noOfPassenger);
	}

}

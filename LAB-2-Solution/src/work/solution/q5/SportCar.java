package work.solution.q5;

public class SportCar extends Vehicle{
	
	private int noOfDoor;

	public SportCar(String make, int model, int noOfWheel, int noOfPassenger, int noOfDoor) {
		super(make, model, noOfWheel, noOfPassenger);
		this.noOfDoor = noOfDoor;
	}

	public SportCar(String make, int model, int noOfWheel, int noOfPassenger) {
		super(make, model, noOfWheel, noOfPassenger);
		this.noOfDoor=2;
	}
	
	public void display() {
		System.out.println("**** Sports Car ****");
		super.display();
		System.out.println("Number of Door :"+noOfDoor);
	}
	
}

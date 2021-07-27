package work.solution.q5;

public class Car extends Vehicle{
	private int noOfDoor;
		
	public Car(String make, int model, int noOfWheel, int noOfPassenger,int noOfDoor) {
		super(make, model, noOfWheel, noOfPassenger);
		this.noOfDoor=noOfDoor;
	}

	public void display() {
		System.out.println("**** Car ****");
		super.display();
		System.out.println("Number of Door :" + noOfDoor);
	}
}

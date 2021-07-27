package work.solution.q5;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Vehicle vehicle = null;
		
		System.out.println("Enter 1 : to create a Vehicle object");
		System.out.println("Enter 2 : to create a Car object");
		System.out.println("Enter 3 : to create a Convertible object");
		System.out.println("Enter 4 : to create a SportCar object");
		int input = sc.nextInt();
		
		System.out.println("Enter the vehicle detail :");
		System.out.println("Format : make-model-noOfWheel-noOfPassenger");

		String str = sc.next();
		String vehicleInformationArray[] = str.split("-");
		
		String make = vehicleInformationArray[0];
		int model = Integer.parseInt(vehicleInformationArray[1]);
		int noOfWheel = Integer.parseInt(vehicleInformationArray[2]);
		int noOfPassenger = Integer.parseInt(vehicleInformationArray[3]);

		switch (input) {
		case 1:
			vehicle = new Vehicle(make, model, noOfWheel, noOfPassenger);
			break;
		case 2:
			System.out.println("Enter the Car number of door");
			int noOfDoor=sc.nextInt();
			vehicle = new Car(make, model, noOfWheel, noOfPassenger, noOfDoor);
			break;
		case 3:
			System.out.println("Does the convertible has open hood : Y/N");
			String openHood=sc.next();
			if(openHood.equals("Y")||openHood.equals("y")) {
				vehicle = new Convertible(make, model, noOfWheel, noOfPassenger, true);
			}else {
				vehicle = new Convertible(make, model, noOfWheel, noOfPassenger, false);
			}
			break;
		case 4:
			System.out.println("Enter the SportsCar number of door");
			int noOfDoors=sc.nextInt();
			vehicle = new SportCar(make, model, noOfWheel, noOfPassenger, noOfDoors);
			break;
		default:
			break;
		}
		vehicle.display();
	}
}

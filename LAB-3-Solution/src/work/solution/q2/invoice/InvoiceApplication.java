package work.solution.q2.invoice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InvoiceApplication {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Invoice> list = new ArrayList<>();
		int choice = 0;

		do {
			System.out.println("Enter 1: Add new Invoice");
			System.out.println("Enter 2: Print all invoice");
			System.out.println("Enter 3: Get Total Payment");
			System.out.println("Enter 4: Exit");
			
			choice=sc.nextInt();

			switch (choice) {
			case 1:
				addNewInvoice(sc, list);
				break;
			case 2:
				printAllInvoice(list);
				break;
			case 3:
				getTotalPayment(list);
				break;
			default:
				System.out.println("---Exiting---");
				break;
			}


		}while(choice!=4);
			
	}

	private static void getTotalPayment(List<Invoice> list) {
		int index=0;
		for(Invoice inv:list) {
			System.out.println("Invoice [" + index + "]");
			inv.getPayment();
			System.out.println();
			index++;
		}
	}
	
	private static void printAllInvoice(List<Invoice> list) {

		int index = 0;
		for (Invoice inv : list) {
			System.out.println("Invoice [" + index + "]");
			System.out.println(inv);
			System.out.println();
			index++;
		}

	}

	private static void addNewInvoice(Scanner sc, List<Invoice> list) {

		System.out.println("Enter partNumber :");
		String partNum = sc.next();
		System.out.println("Enter partDescription:");
		String partDescription = sc.next();
		System.out.println("Enter quantity:");
		int quantity = sc.nextInt();
		System.out.println("Enter pricePerItem:");
		double pricePerItem = sc.nextDouble();
		Invoice obj = new Invoice(partNum, partDescription, quantity, pricePerItem);
		list.add(obj);
		System.out.println("---New invoice added---");

	}

}
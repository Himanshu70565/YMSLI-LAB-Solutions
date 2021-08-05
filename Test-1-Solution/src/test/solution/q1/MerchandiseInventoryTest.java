package test.solution.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MerchandiseInventoryTest {

	// A function for printing the list
	public static void printList(List<Merchandise> merchandiseItemslist) {
		int index = 0;
		for (Merchandise merchandise : merchandiseItemslist) {
			System.out.println("[" + index + "] " + merchandise);
			index++;
		}
	}

	public static void main(String[] args) {
		String filePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI Lab Solutions\\Test-1-Solution\\src\\test\\solution\\q1\\input.txt";
		File file = new File(filePath);

		// In case the file don't exists
		if (!file.exists()) {
			System.out.println("No file at given path");
			return;
		}

		List<Merchandise> listOfMerchandiseItems = new ArrayList<>();

		// ARM Syntax
		try (BufferedReader in = new BufferedReader(new FileReader(file));) {

			String str = "";
			while ((str = in.readLine()) != null) {
				String tokens[] = str.split(" ");

				String itemId = tokens[0];
				int quantity = Integer.valueOf(tokens[1]);
				double price = Double.valueOf(tokens[2]);

				Merchandise merchandise = new Merchandise(itemId, quantity, price);
				listOfMerchandiseItems.add(merchandise);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		System.out.println("-----Sorting merchandise items by itemId(name)----");
		Collections.sort(listOfMerchandiseItems); // default sorting order by itemId
		printList(listOfMerchandiseItems);

		System.out.println("\n-----Sorting merchandise items by price-----");
		Collections.sort(listOfMerchandiseItems, new Comparator<Merchandise>() {

			@Override
			public int compare(Merchandise o1, Merchandise o2) {
				return Double.compare(o2.getPrice(), o1.getPrice());
			}
		});
		printList(listOfMerchandiseItems);
	}
}

package work.solution.q4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DisplayMaxDouble {
	public static void main(String[] args) {

		String sourceFilePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI Lab Solutions\\Lab-6-Solution\\src\\work\\solution\\q4\\data.txt";
		File sourceFile = new File(sourceFilePath);
		if (!sourceFile.exists()) {
			System.out.println("---File not found---");
		}

		PriorityQueue<Double> queue = new PriorityQueue<>(new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {
				return Double.compare(o2, o1);
			}
		});

		try (Scanner sc = new Scanner(sourceFile);) {
			while (sc.hasNextDouble()) {
				Double data = sc.nextDouble();
				queue.add(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		// removing data from queue
		while (!queue.isEmpty()) {
			System.out.println(queue.poll());
		}

	}
}

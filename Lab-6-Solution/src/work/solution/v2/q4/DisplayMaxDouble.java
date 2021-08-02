package work.solution.v2.q4;

import java.util.*;
import java.io.*;

public class DisplayMaxDouble {
	public static void main(String[] args) {
		String outputFilePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI Lab Solutions\\Lab-6-Solution\\src\\work\\solution\\v2\\data.txt";
		File outputFile = new File(outputFilePath);

		double array[] = { 97.59780253225763, 23.705044359023198, 72.97025259152822, 18.986484094410137,
				77.56528079180427, 88.5456385076513, 59.09494795452861, 72.71304984780839, 80.0202893029642,
				29.58427968260707, 74.66713563267237, 27.40345943374961, 15.990164966686493, 58.852582668688534,
				45.58743329596889, 77.2227556103568, 53.49035808405568, 93.5583604428736, 35.09314691785803,
				9.812059847790467, 51.438605600928376, 6.081908597641594, 2.604194278086147, 99.43752090812772,
				20.355993598952395 };

		try (BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {
			for (Double d : array) {
				out.write(d + "\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		PriorityQueue<Double> pq = new PriorityQueue<>(new Comparator<Double>() {
			@Override
			public int compare(Double o1, Double o2) {
				return Double.compare(o2, o1);
			}
		});

		try (BufferedReader in = new BufferedReader(new FileReader(outputFile))) {
			String str;
			while ((str = in.readLine()) != null) {
				Double data = Double.valueOf(str);
				pq.add(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Polling out in Descending order");
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

	}
}

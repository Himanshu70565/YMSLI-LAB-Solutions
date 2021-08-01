package work.solution.q2;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;
public class PrintFrequency {
	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

	
		String sourceFilePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI Lab Solutions\\Lab-6-Solution\\src\\work\\solution\\q2\\story.txt";
		File source = new File(sourceFilePath);

		// ARM
		try (Scanner sc = new Scanner(source);) {

			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] words = line.split(" ");

				for (String word : words) {

					if (!map.containsKey(word)) {
						map.put(word, 1);
					} else {
						int freq = map.get(word);
						map.put(word, ++freq);
					}
				}

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " appears " + entry.getValue());
		}

	}
}

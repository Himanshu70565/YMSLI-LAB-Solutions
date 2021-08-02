package work.solution.v2.q2;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class PrintFrequency {
	public static void main(String[] args) {

		String outputFilePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI Lab Solutions\\Lab-6-Solution\\src\\work\\solution\\v2\\story.txt\\";
		File outputFile = new File(outputFilePath);

		try (BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {
			String str1 = "life is full of fun life is full of fun life is full of fun life\n";
			String str2 = "night is full of terror is night full of terror";
			out.write(str1);
			out.write(str2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		try (BufferedReader in = new BufferedReader(new FileReader(outputFile))) {
			String line;
			while ((line = in.readLine()) != null) {
				String wordsArray[] = line.split(" ");
				for (String word : wordsArray) {
					if (!map.containsKey(word)) {
						map.put(word, 1);
					} else {
						int freq = map.get(word);
						map.put(word, ++freq);
					}
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " appears " + entry.getValue() + " times");
		}
	}
}

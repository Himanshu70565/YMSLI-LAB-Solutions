package work.solution.q2;

import java.io.*;
public class CharacterStreamReadWrite {
	public static void main(String[] args) {

		String outputFilePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI Lab Solutions\\LAB-4-Solution\\src\\work\\solution\\q2\\demo2.txt";
		File outputFile = new File(outputFilePath);

		try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {
			System.out.println("Enter the text : ");
			String str;

			while (!(str = in.readLine()).equals("")) {
				out.write(str + "\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Writing Done !!");

		// Reading data from the same file where we write data
		System.out.println("Reading from file : ");
		try (BufferedReader in = new BufferedReader(new FileReader(outputFile));) {
			String str;
			while ((str = in.readLine()) != null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}
}

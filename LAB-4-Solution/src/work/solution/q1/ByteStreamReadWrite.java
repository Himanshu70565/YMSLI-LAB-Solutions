package work.solution.q1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamReadWrite {
	public static void main(String[] args) {

		String inputFilePath = "C:\\Users\\ve00ym259\\Desktop\\YMSLI Lab Solutions\\LAB-4-Solution\\src\\work\\solution\\q1\\inputFile.txt";
		File inputFile = new File(inputFilePath);

		if (!inputFile.exists()) {
			System.out.println("---No such input file exists at given path---");
			return;
		}

		try (BufferedInputStream inStream = new BufferedInputStream(new FileInputStream(inputFilePath));
				BufferedOutputStream outStream = new BufferedOutputStream(System.out)) {

			System.out.println("Printing using BufferedOutputStream to console");
			int byteRead;
			while ((byteRead = inStream.read()) != -1) {
				outStream.write((char) byteRead);
				System.out.print((char)byteRead);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {

		}

//		try (BufferedInputStream inStream2 = new BufferedInputStream(new FileInputStream(inputFilePath));) {
//
//			System.out.println("Printing using formatted output(System.out.print or println)");
//			int byteRead;
//			while ((byteRead = inStream2.read()) != -1) {
//				System.out.print((char) byteRead);
//			}
//
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}

	}
}

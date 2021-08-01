package work.solution.q3;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestEmployeeDeserialization {
	public static void main(String[] args) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("demo1.txt")));

			//order need to be same
			Employee e1 = (Employee) ois.readObject();
			BankAccount bankAccount = (BankAccount) ois.readObject();

			System.out.println("Deserialization done");

			e1.display();
			System.out.println("During Serialization account Number is :" + bankAccount.getAccountNumber());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}

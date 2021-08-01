package work.solution.q3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestEmployeeSerialization {
	public static void main(String[] args) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("demo1.txt")));

			BankAccount account1 = new BankAccount();
			Address address1 = new Address("Yamunanagar,Haryana");
			Employee e1 = new Employee("YM259", "Himanshu", account1, address1);
			e1.salary = 12000; // since salary is static ,salary is still 10000 while deserialization
			
			
			oos.writeObject(e1);
			oos.writeObject(e1.getBankAccount()); //for checking account number is same while deserialization
			
			System.out.println("Serialization done");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

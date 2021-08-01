package work.solution.q3;

import java.io.Serializable;

class BankAccount implements Serializable {
	private String accountNumber;

	public BankAccount() {
		accountNumber = 10000 + (int) (Math.random() * 89999) + "";
	}

	public String getAccountNumber() {
		return accountNumber;
	}

}

class Address implements Serializable {
	private String address;

	public Address(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

}

public class Employee implements Serializable {

	private String id;
	private String name;
	private BankAccount bankAccount;
	private Address empAddress;
	static double salary = 10000;

	public Employee(String id, String name, BankAccount bankAccount, Address empAddress) {
		this.id = id;
		this.name = name;
		this.bankAccount = bankAccount;
		this.empAddress = empAddress;
	}

	void display() {
		System.out.println("***Employee Information***");
		System.out.println("id :" + id + ",name :" + name + ",bankAccount :" + bankAccount.getAccountNumber());
		System.out.println("address :" + empAddress.getAddress());
		System.out.println("salary :" + salary);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

}

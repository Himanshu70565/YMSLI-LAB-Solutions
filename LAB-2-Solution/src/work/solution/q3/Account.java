package work.solution.q3;

public class Account {
	private String memberName;
	private String accountNumber;
	private double accountBalance;
	
	public Account(String memberName,double accountBalance) {
		accountNumber = 10000 + (int)(Math.random()*89999) + "";
		this.memberName=memberName;
		this.accountBalance=accountBalance;
	}
	
	public void deposit(double amount) {
		accountBalance+=amount;
		System.out.println("***Amount Deposited***");
	}
	
	public double getBalance() {
		return accountBalance;
	}
	
	public void setBalance(double accountBalance) {
		this.accountBalance=accountBalance;
	}
	
	public void withdraw(double amount) {
		this.accountBalance=this.accountBalance-amount;
	}
	
}

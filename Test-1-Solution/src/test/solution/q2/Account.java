package test.solution.q2;

public class Account {
	private Owner owner;
	private float balance;
	private String number;

	public Account() {
		number = 10000 + (int) (Math.random() * 89999) + "";
		balance = 0f;
	}

	public Account(Owner owner, String number, float balance) {
		this.owner = owner;
		this.number = number;
		this.balance = balance;
	}

	// Shallow copy created
	public Account(Account account) {
		this.owner = account.owner;
		this.balance = account.balance;
		this.number = account.number;
	}

	public void input() {
		System.out.println("Enter input for Account");
	}

	public void print() {
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}

	public void deposit(float amount) {
		this.balance += amount;
	}

	public void withdraw(float amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("!!Limited balance");
		}
	}
	
	public float getBalance() {
		return balance;
	}

}

package work.solution.q3;

public class CurrentAccount extends Account {

	private int tradeLicenseNumber;

	public CurrentAccount(String userName, double initialBalance, int tradeLicenseNumber) {
		super(userName, initialBalance);
		this.tradeLicenseNumber = tradeLicenseNumber;
	}

	@Override
	public double getBalance() {
		return super.getBalance();
	}

	@Override
	public void withdraw(double amount) {

		if (getBalance() >= amount) {
			setBalance(getBalance() - amount);
			System.out.println("***Amount Withdrawn***");
		} else {
			System.out.println("You don't have sufficient balance in your account");
		}

	}
}

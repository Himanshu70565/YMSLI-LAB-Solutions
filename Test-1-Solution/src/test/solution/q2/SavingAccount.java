package test.solution.q2;

public class SavingAccount extends Account{
	
	private static float interestRate=5.0f;
	
	private float interestRate() {
		return interestRate;
	}
	
	public SavingAccount() {
		System.out.println("Default Constructor of SavingAccount class");
	}
	
	public SavingAccount(SavingAccount savingAccount) {
		super(savingAccount);
	}
	
	public void input() {
		System.out.println("Enter input for saving account");
	}
	
	
	public void print() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		StringBuilder str=new StringBuilder(super.toString());
		str.append("SavingAccount : interestRate"+interestRate);
		return str.toString();
	}
	
	
	
}

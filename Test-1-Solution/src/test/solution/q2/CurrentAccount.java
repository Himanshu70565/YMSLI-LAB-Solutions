package test.solution.q2;

public class CurrentAccount extends Account{
	private float minimumBalance=2000;
	
	public CurrentAccount() {
		super();
		System.out.println("Default constructor of CurrentAccount class");
	}
	
	public CurrentAccount(CurrentAccount account) {
		super(account);
		System.out.println("Parameterized constructor of CurrentAccount class");
	}
	
	public void input() {
		System.out.println("Enter the input for current account");
	}
	
	public void print() {
		super.print();
		System.out.println("MinimumBalance should be :"+minimumBalance);
	}

	
	@Override
	public String toString() {
		StringBuilder str=new StringBuilder(super.toString());
		str.append("CurrentAccount : minimumBalance="+minimumBalance);
		return str.toString();
	}
	
	public float getCharges() {
		return 0.5f;//sample charges
	}
	
	
}

package work.solution.q3;

public class SavingAccount extends Account{
	private int interest;
	private double maximumWithdrawAmount;
	private double minimumBalance;
	
	public SavingAccount(String userName,double initialBalance) {
		super(userName,initialBalance);
		this.interest=5;
		this.maximumWithdrawAmount=50000;
	}
	
	public double getBalance() {
		return super.getBalance()+(interest*super.getBalance()/100);
	}
	
	public void withdraw(double amount) {
		if(amount<maximumWithdrawAmount) {
			if(getBalance()>=amount) {
				if(getBalance()-amount>=minimumBalance) {
					setBalance(getBalance()-amount);
					System.out.println("***Amount Withdrawn***");
				}else {
					System.out.println("Minimum Balance limit !!!!");
				}
				
			}else {
				System.out.println("You don't have sufficient balance in your account !!!!");
			}
		}else {
			System.out.println("Withdraw amount exceeded !!!!");
		}
	}
	
}

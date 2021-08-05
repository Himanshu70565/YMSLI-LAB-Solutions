package test.solution.q2;

public class AccountTestingApp {
	public static void main(String[] args) {
		Account account1=new CurrentAccount();
		System.out.println(account1);
		
		
		Account account2=new SavingAccount();
		System.out.println(account2);
		
		Owner owner=new Owner("Himanshu", "1232dsa", new Date(23,11,1999));
		System.out.println(owner);
	}
}

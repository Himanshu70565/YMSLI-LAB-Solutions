package test.solution.q2;


public class Owner implements Cloneable{
	
	private String name;
	private Date dateOfBirth;
	private String nic;
	
	public Owner() {
		System.out.println("Owner DefaultConstructor called");
	}
	
	public Owner(String name,String nic,Date dateOfBirth) {
		this.name=name;
		this.nic=nic;
		this.dateOfBirth=dateOfBirth;
	}

	
	//Shallow copy
	public Owner(Owner owner) {
		this.name=owner.name;
		this.dateOfBirth=owner.dateOfBirth; //mutable field 
		this.nic=owner.nic;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void input() {
		System.out.println("Enter input for owner: ");
	}
	
	public void print() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", dateOfBirth=" + dateOfBirth + ", nic=" + nic + "]";
	}
	
	
}

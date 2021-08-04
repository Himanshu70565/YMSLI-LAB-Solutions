package work.solution.image2;

class Address {
	private String address;

	public Address(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}

class Phone {
	private String number;

	public Phone(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}

public class Customer {
	private String id;
	private Address address;
	private Phone phone;
	private String email;
	private Account account;

	public Customer(String id, Address address, Phone phone, String email) {
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public void setAccount(Account account) {
		this.account=account;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

package work.solution.image2;


import java.time.LocalDate;
import java.util.*;
public class Account {
	private final String id;
	private Address billing_Address;
	private Boolean is_closed;
	private LocalDate open;
	private LocalDate closed;
	private ShoppingCart cart;
	private List<Payment> paymentsList;
	private List<Order> ordersList;
	
	public Account(String id, Address billing_Address) {
		this.id = 10000 + (int) (Math.random() * 89999) + "";
		this.billing_Address = billing_Address;
		this.is_closed = false;
		this.open=LocalDate.now();
		this.cart=new ShoppingCart();
		this.paymentsList=new ArrayList<>(); 
		this.ordersList=new ArrayList<>();
	}

	public Address getBilling_Address() {
		return billing_Address;
	}

	public void setBilling_Address(Address billing_Address) {
		this.billing_Address = billing_Address;
	}

	public Boolean getIs_closed() {
		return is_closed;
	}

	public void setIs_closed(Boolean is_closed) {
		this.is_closed = is_closed;
	}

	public LocalDate getOpen() {
		return open;
	}

	public LocalDate getClosed() {
		return closed;
	}

	public void setClosed(LocalDate closed) {
		this.closed = closed;
	}

	public String getId() {
		return id;
	}

}

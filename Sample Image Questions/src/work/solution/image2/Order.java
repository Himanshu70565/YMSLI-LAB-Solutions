package work.solution.image2;

import java.time.LocalDate;

public class Order {
	private final String number;
	private LocalDate ordered;
	private LocalDate shipped;
	private Address ship_to;
	private OrderStatus status;
	private double total;
	
	public Order(double total) {
		this.number= 10000 + (int) (Math.random() * 89999) + "";
		this.ordered=LocalDate.now();
		this.status=OrderStatus.NEW;
		this.total=total;
	}
	
}

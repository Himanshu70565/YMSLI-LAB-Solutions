package work.solution.image2;

import java.time.LocalDate;

public class Payment {
	private final String id;
	private LocalDate paid;
	private double total;
	private String details;
	
	public Payment(double total,String details) {
		this.id=10000 + (int) (Math.random() * 89999) + "";
		this.paid=LocalDate.now();
		this.total=total;
		this.details=details;
	}
	
}

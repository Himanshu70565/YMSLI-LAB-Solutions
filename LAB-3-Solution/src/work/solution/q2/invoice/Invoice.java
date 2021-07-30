package work.solution.q2.invoice;

import work.solution.q2.Payable;

public class Invoice implements Payable{
	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	private double totalPrice;
	public static double totalPayment;
	
	

	public Invoice(String partNum, String partDescription, int quantity, double pricePerItem) {
		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem =pricePerItem;
		this.totalPrice=quantity*pricePerItem;
		totalPayment+=quantity*pricePerItem;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		totalPayment=totalPayment-pricePerItem*this.quantity;
		this.quantity = quantity;
		totalPayment=totalPayment+pricePerItem*quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		totalPayment=totalPayment-(this.pricePerItem*quantity);
		this.pricePerItem = pricePerItem;
		totalPayment=totalPayment+(pricePerItem*quantity);
	}

	
	@Override
	public String toString() {
		return "Invoice [partNum=" + partNum + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + ", totalPrice=" + totalPrice + "]";
	}

	@Override
	public void getPayment() {
		System.out.println(this);
		System.out.println("Total Payment : "+totalPayment);
	}

}

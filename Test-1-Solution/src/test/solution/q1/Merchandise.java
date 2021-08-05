package test.solution.q1;

public class Merchandise implements Comparable<Merchandise> {

	private String itemId;
	private int quantity;
	private double price;

	public Merchandise(String itemId, int quantity, double price) {
		this.itemId = itemId;
		this.quantity = quantity;
		this.price = price;
	}

	public String getItemId() {
		return itemId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Merchandise [itemId=" + itemId + ", quantity=" + quantity + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Merchandise o) {
		return this.itemId.compareTo(o.itemId);
	}

}

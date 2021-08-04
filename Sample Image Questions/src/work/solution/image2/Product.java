package work.solution.image2;

public class Product {
	private final String id;
	private String name;
	
	public Product(String name) {
		this.id=10000 + (int) (Math.random() * 89999) + "";
		this.name=name;
	}
}

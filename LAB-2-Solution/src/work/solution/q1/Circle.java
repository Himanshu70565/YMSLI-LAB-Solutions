package work.solution.q1;

public class Circle {
	private double radius;
	private String color = "red";

	public Circle() {
		this.radius = 1.0;
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}

}

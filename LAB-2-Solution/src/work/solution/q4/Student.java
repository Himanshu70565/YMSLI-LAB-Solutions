package work.solution.q4;

public class Student {
	private String name;
	private String id;
	private double grade;

	public Student(String name, String id, double grade) {
		this(name,id);
		this.grade = grade;
	}

	public Student(String name, String id) {
		this(id);
		this.name = name;
	}

	public Student(String id) {
		this.id = id;
	}

	public void display() {
		System.out.println("Name : " + this.name);
		System.out.println("Id : " + this.id);
		System.out.println("Grade " + this.grade);
	}

	public void display(int year) {
		display();
		System.out.println("Year " + year);
		System.out.println();
	}

}

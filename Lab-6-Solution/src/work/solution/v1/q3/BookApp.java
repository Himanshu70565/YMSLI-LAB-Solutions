package work.solution.v1.q3;

public class BookApp {
	public static void main(String[] args) {
		Book books[] = { new Book("Cheque book", "Vasdev Mohi"), 
						 new Book("Politics of Opportunism", "R P N Singh"), 
						 new Book("Malayalam poetry", "Akkitham Achuthan Namboodri	"), 
						 new Book("The Testaments", "Margaret Atwood"),
						 new Book("Fakir Hassen", "Roopa Pai"),
						 new Book("Celestial Bodies", "Jokha Alharthi"),
						 new Book("New India", "APJ Abdul Kaalam"),
						 new Book("Old India", "Richard Powers"),
						 new Book("Java in depth","Joshua Bloch")
		};
		
		BookCollection collection1 = new BookCollection("Himanshu", books);

		System.out.println(collection1.hasBook(new Book("New India","APJ Abdul Kaalam")));
		System.out.println(collection1.hasBook(new Book("Java in depth","Joshua Bloch")));
		
			
		System.out.println("Before sorting : ");
		System.out.println(collection1);
		collection1.sort();
		System.out.println("After sorting : ");
		System.out.println(collection1);
		
		
		

	}
}

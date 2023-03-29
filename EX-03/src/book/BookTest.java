package book;

import java.sql.Date;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book(0, "Sigrist Cedric", "42", "21.01.2003");
		Book book2 = new Book(1, "Moritz Scholz", "IDFK", new Date(System.currentTimeMillis()));
		Book book3 = Book.fromInput();
		
		
		
		TestAllFunctions(book1);
		TestAllFunctions(book2);
		TestAllFunctions(book3);
		
		
		
	}
	/** tests all functions of a given book */
	public static void TestAllFunctions(Book book) {
		
		System.out.println(book);
		System.out.println("age: "+book.age());
	}
}

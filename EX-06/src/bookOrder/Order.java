package bookOrder;

import java.util.ArrayList;

public class Order {
	private static int NEXT_ID = 1;

	private int id;
	private String customerName;
	private String customerAddress;
	private ArrayList<Book> orderedBooks;

	public Order() {
		this.id = NEXT_ID++;
		this.orderedBooks = new ArrayList<Book>();
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;

	}

	public void addBook(Book book) {
		this.orderedBooks.add(book);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Order id: %d Customer: %s, %s", this.id, this.customerName, this.customerAddress));
		
		for(int i = 0; i<this.orderedBooks.size(); i++) {
			sb.append('\n' + this.orderedBooks.get(i).toString());
		}
		
		return sb.toString();
	}

}

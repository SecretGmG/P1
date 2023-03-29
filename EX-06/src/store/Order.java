package store;

import java.util.ArrayList;

public class Order {
	private static int NEXT_ID = 1;

	private int id;
	private String customerName;
	private String customerAddress;
	private ArrayList<IArticle> orderedArticles;


	public Order() {
		this.id = NEXT_ID++;
		this.orderedArticles = new ArrayList<IArticle>();
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return this.customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Iterable<IArticle> getOrderedArticles() {
		return orderedArticles;
	}
	public int getTotalPrice() {
		int sum = 0;
		for(IArticle a: this.orderedArticles) {
			sum += a.getPrice();
		}
		return sum;
	}


	public void add(IArticle a) {
		this.orderedArticles.add(a);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Order id: %d Customer: %s, %s", this.id, this.customerName, this.customerAddress));
		
		for(int i = 0; i<this.orderedArticles.size(); i++) {
			sb.append('\n' + this.orderedArticles.get(i).toString());
		}
		
		return sb.toString();
	}

}

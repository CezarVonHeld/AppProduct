package Entities;

public class OrderItem {
	private Product product;
	private int quantity;
	private double price;
		
	public OrderItem() {
	}

	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		return "OrderItem [product=" + product + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}

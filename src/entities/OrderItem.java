package entities;

public class OrderItem {
	int quantity;
	double price;
	private Product product;

	public OrderItem(int quantity, double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		return this.quantity;	
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double subTotal() {
		return this.quantity * this.price;
	}
	
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public Product getProduct() {
		return this.product;
	}
		
}

package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesEnum.OrderStatus;

public class Order {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Date moment;
	OrderStatus status;
	private Client client;
	private List <OrderItem> items = new ArrayList<OrderItem>();
	
	Order(){
		
	}
	
	Order(Date moment, OrderStatus status, Client client){
		this.moment = moment;
		this.status = status;
		this.client = client;
	}
	
	public Date getMoment() {
		return this.moment;
	}
	
	public void setMoment(Date moment){
		this.moment = moment;
	}
	
	public OrderStatus getOrderStatus() {
		return this.status;
	}
	
	public void setOrderStatus(OrderStatus status){
		this.status = status;
	}
	

	public Client getClient() {
		return this.client;
	}
	
	public void setClient(Client client){
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		this.items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		this.items.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		
		for(OrderItem item : items) {
			sum += item.subTotal();
		}
		
		return sum;
	}
}

package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enums.OrderStatus;

public class Order {
	private Client client;
	private Date moment;
	private OrderStatus orderStatus;
	private List<OrderItem> orderItems = new ArrayList<>();
	
	public Order(Client client, Date moment, OrderStatus orderStatus) {
		this.client = client;
		this.moment = moment;
		this.orderStatus = orderStatus;
	}

	public Order() {
	}

	public void addOrderItem(OrderItem order) {
		orderItems.add(order);
	}
	
	public void removeOrderItem(OrderItem order) {
		orderItems.remove(order);
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	
	
	
}

package com.Orders;



public class Orders{
	private double price;
	private String status;
	public Orders(double price, String status) {
		super();
		this.price = price;
		this.status = status;
	}
	public double getPrice() {
		return price;
	}
	public String getStatus() {
		return status;
	}
	@Override
	public String toString() {
		return "Orders [price=" + price + ", status=" + status + "]";
	}
}

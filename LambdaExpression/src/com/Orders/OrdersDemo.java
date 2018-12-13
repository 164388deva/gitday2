package com.Orders;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public class OrdersDemo {
	public static void main(String[] args) {
		ArrayList<Orders> orders=new ArrayList<Orders>();
		orders.add(new Orders(1500,"Accepted"));
		orders.add(new Orders(20000,"Accepted"));
		orders.add(new Orders(11000000,"Completed"));
		orders.add(new Orders(1000,"Pending"));
		

		orders.forEach((i)->{
			if(i.getPrice()>10000 &&(i.getStatus()=="Completed" || i.getStatus()=="Accepted"))
				System.out.println(i+"\n");});
		
		
 
		
		
		orders.stream().filter(order->order.getPrice()>10000&&((order.getStatus()=="Completed" || order.getStatus()=="Accepted"))).forEach(i->System.out.println(i));

	}
}

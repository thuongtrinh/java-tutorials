package com.txt.command.order;

public class Waiter {

	public void takeOrder(Order order) {
		System.out.println("Waiter take new order " + order.toString());
		order.execute();
	}
}

package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		
		OrderStatus status = OrderStatus.PENDING_PAYMENT;
		
		Order order = new Order (1080, new Date(), status);

		System.out.println(order);
	}

}

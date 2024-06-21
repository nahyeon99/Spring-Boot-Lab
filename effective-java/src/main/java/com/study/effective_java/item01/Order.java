package com.study.effective_java.item01;

public class Order {

	private boolean prime;
	private boolean urgent;
	private Product product;

	// 생성자의 선언부는 타입까지 비교하며, 동일하면 컴파일 오류 발생한다.
	// public Order(Product product, boolean prime) {
	// 	this.product = product;
	// 	this.prime = prime;
	// }

	// public Order(Product product, boolean urgent) {
	// 	this.product = product;
	// 	this.urgent = urgent;
	// }

	public static Order primeOrder(Product product) {
		Order order = new Order();
		order.prime = true;
		order.product = product;
		return order;
	}

	public static Order urgentOrder(Product product) {
		Order order = new Order();
		order.urgent = true;
		order.product = product;
		return order;
	}
}

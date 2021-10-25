package com.qa.ims.persistence.domain;

import java.util.Objects;

public class OrderLine {
	private Long orderline_id;
	private Long order_id;
	private int quantity;
	private Long product_id;
	private float price;
	
	public OrderLine(Long orderline_id, Long order_id, int quantity, Long product_id, float price) {
		super();
		this.orderline_id = orderline_id;
		this.order_id = order_id;
		this.quantity = quantity;
		this.product_id = product_id;
		this.price = price;
	}

	public Long getOrderline_id() {
		return orderline_id;
	}

	public void setOrderline_id(Long orderline_id) {
		this.orderline_id = orderline_id;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderLine [orderline_id=" + orderline_id + ", order_id=" + order_id + ", quantity=" + quantity
				+ ", product_id=" + product_id + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(order_id, orderline_id, price, product_id, quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderLine other = (OrderLine) obj;
		return Objects.equals(order_id, other.order_id) && Objects.equals(orderline_id, other.orderline_id)
				&& Float.floatToIntBits(price) == Float.floatToIntBits(other.price)
				&& Objects.equals(product_id, other.product_id) && quantity == other.quantity;
	}
	
	

}

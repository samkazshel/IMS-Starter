package com.qa.ims.persistence.domain;

import java.sql.Date;
import java.util.Objects;

public class Order {
	private Long order_id;
	private Long customer_id;
	private String customer_name;
	private Date order_date;
	
	//may need to include overloaded constructor without the order_id but that doesn't seem
	//necessary
	
	public Order(Long order_id, Long customer_id, String customer_name, Date order_date) {
		super();
		this.order_id = order_id;
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.order_date = order_date;
	}

	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}

	public Long getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(Long customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", customer_id=" + customer_id + ", customer_name=" + customer_name
				+ ", order_date=" + order_date + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(customer_id, customer_name, order_date, order_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customer_id, other.customer_id) && Objects.equals(customer_name, other.customer_name)
				&& Objects.equals(order_date, other.order_date) && Objects.equals(order_id, other.order_id);
	}
	
	
	
	
}

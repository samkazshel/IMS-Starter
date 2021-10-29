package com.qa.ims.persistence.domain;

import java.util.Objects;

public class Product {
	private Long product_id;
	private String product_name;
	private Double product_value;
	
	public Product(String product_name, Double product_value) {
		this.product_name = product_name;
		this.product_value = product_value;
	}

	public Product(Long product_id, String product_name, Double product_value) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_value = product_value;
	}

	public Long getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public Double getProduct_value() {
		return product_value;
	}

	public void setProduct_value(Double product_value) {
		this.product_value = product_value;
	}
	

	
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_value="
				+ product_value + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(product_id, product_name, product_value);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(product_id, other.product_id) && Objects.equals(product_name, other.product_name)
				&& Objects.equals(product_value, other.product_value);
	}

	
	
	
	
	

}

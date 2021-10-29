package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderLineDAO;
import com.qa.ims.persistence.domain.OrderLine;
import com.qa.ims.persistence.domain.Product;
import com.qa.ims.utils.Utils;

public class OrderLineController implements CrudController<OrderLine>{
	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderLineDAO orderlineDAO;
	private Utils utils;
	private Product product;

	public OrderLineController(OrderLineDAO orderlineDAO, Utils utils) {
		this.orderlineDAO = orderlineDAO;
		this.utils = utils;
	}

	@Override
	public List<OrderLine> readAll() {
		return null;
	}

	@Override
	public OrderLine create() {
		LOGGER.info("Please enter order id: ");
		Long order_id = utils.getLong();
		LOGGER.info("Please enter product id: ");
		Long product_id = utils.getLong();
		LOGGER.info("Please enter the quantity of this product: ");
		int quantity = utils.getInt();
		Double price = orderlineDAO.getPrice(product_id);
		OrderLine orderline = orderlineDAO.create(new OrderLine(order_id, quantity, product_id, price));
		return orderline;
	}

	@Override
	public OrderLine update() {
		return null;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order line item you would like to delete: ");
		Long id = utils.getLong();
		return orderlineDAO.delete(id);
	}

	
	
	
	
	
}

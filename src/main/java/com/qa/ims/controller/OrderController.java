package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderDAO;
import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {

	public static final Logger LOGGER = LogManager.getLogger();
	
	private OrderDAO orderDAO;
	private Utils utils;
	
	public OrderController(OrderDAO orderDAO, Utils utils) {
		super();
		this.orderDAO = orderDAO;
		this.utils = utils;
	}

	@Override
	public List<Order> readAll() {
		List<Order> orders = orderDAO.readAll();
		for (Order order : orders) {
			LOGGER.info(orders);
		}
		return orders;
	}

	@Override
	public Order create() {
		LOGGER.info("Please enter customer id: ");
		Long customer_id = utils.getLong();
		LOGGER.info("Please enter the customer name: ");
		String customer_name = utils.getString();
		LOGGER.info("Please enter the date the order was made: ");
		String order_date = utils.getString();
		Order order = orderDAO.create(new Order(customer_id, customer_name, order_date));
		return order;
	}

	@Override
	public Order update() {
		return null;
	}

	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete: ");
		Long id = utils.getLong();
		return orderDAO.delete(id);
	}
	

}

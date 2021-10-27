package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ProductDAO;
import com.qa.ims.persistence.domain.Product;
import com.qa.ims.utils.Utils;

public class ProductController implements CrudController<Product>{

	public static final Logger LOGGER = LogManager.getLogger();
	
	private ProductDAO productDAO;
	private Utils utils;
	
	/**
	 * Reads all products to the logger
	 */
	@Override
	public List<Product> readAll() {
		List<Product> products = productDAO.readAll();
		for(Product product : products) {
			LOGGER.info(product);
		}
		return null;
	}

	/**
	 * Creates a product by taking in user input
	 */
	@Override
	public Product create() {
		LOGGER.info("Please enter a product name: ");
		String product_name = utils.getString();
		LOGGER.info("Please enter a product value: ");
		Double product_value = utils.getDouble();
		Product product = productDAO.create(new Product(product_name, product_value));
		LOGGER.info("Product Created");
		return product;
	}

	/**
	 * Updated an existing product by taking in user input
	 */
	@Override
	public Product update() {
		LOGGER.info("Please enter the id of the product you would like to update: ");
		Long id = utils.getLong();
		LOGGER.info("Please enter a product name: ");
		String product_name = utils.getString();
		LOGGER.info("Please enter a product value: ");
		Double product_value = utils.getDouble();
		Product product = productDAO.update(new Product(id, product_name, product_value));
		LOGGER.info("Product updated");
		return product;
	}

	/**
	 * Deletes an existing product by the id of the product
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the product you would like to delete: ");
		Long id = utils.getLong();
		return productDAO.delete(id);
	}
	
	
	

}

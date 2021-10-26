package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.persistence.domain.Product;
import com.qa.ims.utils.DBUtils;


public class ProductDAO implements Dao<Product> {

	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public List<Product> readAll() {
		try (Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * FROM products");) {
			List<Product> products = new ArrayList<>();
			while (resultSet.next()) {
				products.add(modelFromResultSet(resultSet));
			}
			return products;
		} catch (SQLException e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return new ArrayList<>();
	}

	@Override
	public Product read(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product create(Product t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product update(Product t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Product modelFromResultSet(ResultSet resultSet) throws SQLException {
		Long product_id = resultSet.getLong("product_id");
		String product_name = resultSet.getString("product_name");
		float product_value = resultSet.getFloat("product_value");
		return new Product(product_id, product_name, product_value);
	}	
	

}

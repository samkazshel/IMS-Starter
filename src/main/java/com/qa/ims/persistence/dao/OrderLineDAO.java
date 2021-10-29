package com.qa.ims.persistence.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.domain.OrderLine;
import com.qa.ims.persistence.domain.Product;
import com.qa.ims.utils.DBUtils;

public class OrderLineDAO{
	
	public static final Logger LOGGER = LogManager.getLogger();
	Product product;

	public OrderLine readLatest() {
		try(Connection connection = DBUtils.getInstance().getConnection();
				Statement statement = connection.createStatement();
				ResultSet resultSet = statement.executeQuery("SELECT * orderlines ORDER BY orderline_id DESC LIMIT 1");) {
			resultSet.next();
			return modelFromResultSet(resultSet);
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}

	public OrderLine create(OrderLine orderline) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection
						.prepareStatement("INSERT INTO order_lines(order_id, quantity, product_id) VALUES (?, ?, ?)");) {
			statement.setLong(1, orderline.getOrder_id());
			statement.setInt(2, orderline.getQuantity());
			statement.setLong(3, orderline.getProduct_id());
			statement.setDouble(4, product.getProduct_value());
			return readLatest();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return null;
	}


	public int delete(long id) {
		try (Connection connection = DBUtils.getInstance().getConnection();
				PreparedStatement statement = connection.prepareStatement("DELETE FROM orderlines WHERE orderline_id = ?");) {
			statement.setLong(1, id);
			return statement.executeUpdate();
		} catch (Exception e) {
			LOGGER.debug(e);
			LOGGER.error(e.getMessage());
		}
		return 0;
	}

	public OrderLine modelFromResultSet(ResultSet resultSet) throws SQLException {
		Long order_id = resultSet.getLong("order_id");
		int quantity = resultSet.getInt("quantity");
		Long product_id = resultSet.getLong("product_id");
		Double price = resultSet.getDouble("price");
		return new OrderLine(order_id, quantity, product_id, price);
	}

}

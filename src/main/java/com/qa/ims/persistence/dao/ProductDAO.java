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

import com.qa.ims.persistence.domain.Product;
import com.qa.ims.utils.DBUtils;


public class ProductDAO implements Dao<Product> {

	public static final Logger LOGGER = LogManager.getLogger();

	@Override
	public List<Product> readAll() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}	
	

}

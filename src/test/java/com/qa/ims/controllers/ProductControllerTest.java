package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.ProductController;
import com.qa.ims.persistence.dao.ProductDAO;
import com.qa.ims.persistence.domain.Product;
import com.qa.ims.utils.Utils;

//@RunWith(MockitoJUnitRunner.class)
//public class ProductControllerTest {
//	
//	@Mock
//	private Utils utils;
//	
//	@Mock
//	private ProductDAO dao;
//	
//	@Mock 
//	private ProductController controller;
//	
//	@Test
//	public void testCreate() {
//		final Long pro_Id = 1L;
//		final String pro_Name = "BackPack";
//		final Double pro_Value = 10.0;
//		final Product created = new Product(pro_Id, pro_Name, pro_Value);
//		
//		Mockito.when(utils.getLong()).thenReturn(pro_Id);
//		Mockito.when(utils.getString()).thenReturn(pro_Name);
//		Mockito.when(utils.getDouble()).thenReturn(pro_Value);
//		Mockito.when(dao.create(created)).thenReturn(created);
//		
//		assertEquals(created, controller.create());
//		
//		Mockito.verify(utils, Mockito.times(1)).getLong();
//		Mockito.verify(utils, Mockito.times(1)).getString();
//		Mockito.verify(utils, Mockito.times(1)).getDouble();
//		Mockito.verify(dao, Mockito.times(1)).create(created);
//	}
//	
//	@Test
//	public void restReadAll() {
//		List<Product> products = new ArrayList<>();
//		products.add(new Product(1L, "BackPack", 10.0));
//		
//		Mockito.when(dao.readAll()).thenReturn(products);
//		
//		assertEquals(products, controller.readAll());
//		
//		Mockito.verify(dao, Mockito.times(1)).readAll();
//	}
//	

//}

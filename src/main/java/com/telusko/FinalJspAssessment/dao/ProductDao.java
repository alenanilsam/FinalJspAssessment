package com.telusko.FinalJspAssessment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.telusko.FinaJspAssessment.model.Product;
import com.telusko.FinalJspAssessment.Database.Db;

public class ProductDao {

	
	public ProductDao() {
		
		
	}
	
	public List<Product> getAllProducts() throws ClassNotFoundException{
		
		List<Product> products = new ArrayList<>();
			
			
			try {
				Db d=new Db();
				Connection l=d.getConn();
				String sql = "select * from products';";
				
				Statement stmt = l.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()) {
					Product pdt = new Product();
					pdt.setPid(rs.getInt("id"));
					pdt.setPdtname(rs.getString("pdtname"));
					pdt.setPdtcategory(rs.getString("category"));
					pdt.setPdtprice(rs.getInt("price"));
					
					products.add(pdt);
				}
				} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
			
		
		return products;
		
	}
	
	
}

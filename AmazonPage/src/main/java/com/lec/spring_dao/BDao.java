package com.lec.spring_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.lec.spring_dto.BDto;

public class BDao {

	DataSource dataSource;
	public BDao(){
		try {
			Context context = new InitialContext();
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/DatabaseTheory");
		} catch (NamingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

	public ArrayList<BDto> list() {
		
		ArrayList<BDto> dtos = new ArrayList<BDto>();
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		try {
			connection = dataSource.getConnection();
			String query = "select * from amazon";
			
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
                String Uid = resultSet.getString("id");
                String Ucountry = resultSet.getString("country");
                String Uname = resultSet.getString("name");
                String Ustreet1 = resultSet.getString("street1");
                String Ustreet2 = resultSet.getString("street2");
                String Ucity = resultSet.getString("city");
                String Ustate = resultSet.getString("state");
                String Uzipcode = resultSet.getString("zipcode");
                String Uphone = resultSet.getString("phone");
				BDto dto = new BDto(Uid, Ucountry, Uname, Ustreet1, Ustreet2, Ucity, Ustate, Uzipcode, Uphone);
				dtos.add(dto);
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null) resultSet.close();
				if(preparedStatement != null) preparedStatement.close();
				if(connection != null) connection.close();
				
			}catch(Exception e2) {
				
			}
		}
		
		return dtos;
		
	}
	
	public void addNew(String id, String country, String name, String street1, String street2, String city, String state, String zipcode, String phone) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			String query = "INSERT INTO amazon VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, country);
			preparedStatement.setString(3, name);
			preparedStatement.setString(4, street1);
			preparedStatement.setString(5, street2);
			preparedStatement.setString(6, city);
			preparedStatement.setString(7, state);
			preparedStatement.setString(8, zipcode);
			preparedStatement.setString(9, phone);

			int row = preparedStatement.executeUpdate();
			if (row > 0)
				System.out.println("Row insert successful");

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteNew(String id) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			String query = "DELETE FROM amazon WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, id);

			int row = preparedStatement.executeUpdate();
			if (row > 0)
				System.out.println("Row deletion successful");

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void editNew (String id, String country, String name, String street1, String street2, String city, String state, String zipcode, String phone) {
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		try {
			connection = dataSource.getConnection();
			String query = "UPDATE amazon SET country=?, name=?, street1=?, street2=?,"
					+ "city=?, state=?, zipcode=?, phone=? WHERE id = ?";
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, country);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, street1);
			preparedStatement.setString(4, street2);
			preparedStatement.setString(5, city);
			preparedStatement.setString(6, state);
			preparedStatement.setString(7, zipcode);
			preparedStatement.setString(8, phone);
			preparedStatement.setString(9, id);

			int row = preparedStatement.executeUpdate();
			if (row > 0)
				System.out.println("Row insert successful");
			else
				System.out.println("No ID found");

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

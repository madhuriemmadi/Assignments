package com.example.DatabaseDemo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class QueriesMain {
	
	public static final String INSERT_EMP_QUERY ="INSERT INTO EMPLOYEE(ID,FIRST_NAME,LAST_NAME,DID,ADDRESS) VALUES(?,?,?,?,?,)";
	public static final String INSERT_DEPT_QUERY ="INSERT INTO DEPARTMENT(ID,DEPT_NAME) VALUES(?,?)";
	public static final String INSERT_ADDRESS_QUERY ="INSERT INTO ADDRESS(HNO,STREET,CITY,STATE,ZIPCODE) VALUES(?,?,?,?,?,)";
	public static final String UPDATE_EMP_QUERY ="UPDATE EMPLOYEE SET FIRST_NAME = ? WHERE ID = ?";
	public static final String UPDATE_DEPT_QUERY ="UPDATE DEPARTMENT SET DEPT_NAME = ? WHERE ID = ?";
	public static final String UPDATE_ADDRESS_QUERY ="UPDATE ADDRESS SET STREET = ? WHERE HNO = ?";
	public static final String GET_EMP_DATA = "SELCT * FROM EMPLOYEE";
	public static final	String  GET_DATA ="select * from employee where did=? ";
	
	public static void main(String[] args) {
		
		Address addr1 =new Address(100,"202", "over cup", "herndon", "VA", "20171");
		List<Integer> addrList=new ArrayList<>();
		addrList.add(addr1.getaId());
		Employee emp1 =new Employee(1, "Jeff", "Dsliva", 201, addrList);
		Department dept1 =new Department("Electrical", 201);
		try {
		Connection con = JdbcConnection.getConnection();
		PreparedStatement ps1 =con.prepareStatement(INSERT_EMP_QUERY);
		PreparedStatement ps2 =con.prepareStatement(INSERT_DEPT_QUERY);
		PreparedStatement ps3 =con.prepareStatement(INSERT_ADDRESS_QUERY);
		PreparedStatement ps4 =con.prepareStatement(UPDATE_EMP_QUERY);
		PreparedStatement ps5 =con.prepareStatement(UPDATE_DEPT_QUERY);
		PreparedStatement ps6 =con.prepareStatement(UPDATE_ADDRESS_QUERY);
		PreparedStatement ps7= con.prepareStatement(GET_EMP_DATA);
		
		
		ps1.executeUpdate();
		ps2.executeUpdate();
		ps3.executeUpdate();
		
		ps4.setString(1, "James");
		ps4.setInt(2, 1);
		ps4.executeUpdate();
		
		ps5.setString(1, "Electronics");
		ps5.setInt(2, 1);
		ps5.executeUpdate();
	
		
		ps6.setString(1, "Oer cup oak");
		ps6.setString(2, "202");
		ps6.executeUpdate();
		
		ResultSet rs= ps7.executeQuery();
		System.out.print("-------Employee Data---------");
		System.out.print("id		First Name		Last Name");
		while(rs.next()) {
			
			rs.getInt("id");
			rs.getString("first_name");
			rs.getString("last_name");
		}
		rs.close();
		System.out.print("Executed all the Quereis");
		ps1.close();
		ps2.close();
		ps3.close();
		ps4.close();
		ps5.close();
		ps6.close();
		con.close();
		
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}

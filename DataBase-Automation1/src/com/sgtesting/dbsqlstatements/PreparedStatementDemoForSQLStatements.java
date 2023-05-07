package com.sgtesting.dbsqlstatements;

import java.sql.*;

public class PreparedStatementDemoForSQLStatements {

	public static void main(String[] args) {
		getRecordsFromDatabase();
	//	insertRecords();
	//	deleteRecords();
	}
	
	private static void getRecordsFromDatabase()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			System.out.println("Connection has successful!!!");
			
			String strQuery="select * from Employee";
			PreparedStatement stmt=conn.prepareStatement(strQuery);
			ResultSet rs=stmt.executeQuery();
			ResultSetMetaData rsmeta=rs.getMetaData();
			String colname1=rsmeta.getColumnName(1);
			String colname2=rsmeta.getColumnName(2);
			String colname3=rsmeta.getColumnName(3);
			String colname4=rsmeta.getColumnName(4);

			System.out.printf("%-12s",colname1);
			System.out.printf("%-12s",colname2);
			System.out.printf("%-12s",colname3);
			System.out.printf("%-12s",colname4);
			System.out.printf("\n");
			while(rs.next())
			{
				String EId=rs.getString("EMPID");
				String EName=rs.getString("EMPNAME");
				String Design=rs.getString("DESIGNATION");
				String Sal=rs.getString("SALARY");
				System.out.printf("%-12s",EId);
				System.out.printf("%-12s",EName);
				System.out.printf("%-12s",Design);
				System.out.printf("%-12s",Sal);
				System.out.printf("\n");
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

	private static void insertRecords()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			
			String strQuery="insert into Employee values(04,'Benzee','MD',90000)";
			PreparedStatement pstmt=conn.prepareStatement(strQuery);
			pstmt.executeUpdate();
			System.out.println("Inserted the records successfully!!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	private static void deleteRecords()
	{
		Connection conn=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "tiger");
			
			String strQuery="delete from Employee where EMPID=04";
			PreparedStatement pstmt=conn.prepareStatement(strQuery);
			pstmt.executeUpdate();
			System.out.println("deleted the records successfully!!!");
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				conn.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

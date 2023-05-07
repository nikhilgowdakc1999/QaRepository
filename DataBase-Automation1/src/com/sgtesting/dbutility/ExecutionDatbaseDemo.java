package com.sgtesting.dbutility;

public class ExecutionDatbaseDemo {

	public static void main(String[] args) {
		
		int rc=DatabaseUtil.getRecords("select * from Employee");
		System.out.println("# of Records :"+rc);

		int cc=DatabaseUtil.getColumnsCount("select * from Employee");
		System.out.println("# of Columns :"+cc);
		
		String val=DatabaseUtil.getColumnData("select * from Employee where EMPID=2", "EMPNAME");
		System.out.println("Column Data :"+val);
	}

}

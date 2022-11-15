package com.sgtesting.assignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class StateNames20Diagonally {

	public static void main(String[] args) {
         
		writecontent();
	}
	private static void writecontent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet("20-StatesName List");
			for(int i=0;i<20;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(i);
				cell.setCellValue("State"+(i+1));
			}
			fout=new FileOutputStream("E:\\Niki\\Sg notes\\20-StateNames.xlsx");
			wb.write(fout);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				fout.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

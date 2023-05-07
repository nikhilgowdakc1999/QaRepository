package com.sgtesting.assignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Trailz2 {

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
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Demo1");
			row=sh.createRow(8);
			for(int i=0;i<5;i++)
			{
				cell=row.createCell(i);
				cell.setCellValue("Team"+(i+1));
			}
			row=sh.createRow(9);
			for(int k=0;k<5;k++)
			{
				cell=row.createCell(k);
				cell.setCellValue("Player"+(k+1));
			}
			fout=new FileOutputStream("D:\\New folder\\niki\\5-Teams&Players1.xlsx");
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

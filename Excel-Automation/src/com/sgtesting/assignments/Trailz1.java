package com.sgtesting.assignments;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Trailz1 {

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
			sh=wb.createSheet("5 Flowers List");
			String a[]= {"Rose","Jasmine","Lilly","Tulip","Lotus"};
			for(int i=0;i<a.length;i++)
			{
				row=sh.createRow(i);
				cell=row.createCell(0);
				cell.setCellValue((a[i]));
			}
			fout=new FileOutputStream("D:\\New folder\\niki\\5-Flowers1.xlsx");
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

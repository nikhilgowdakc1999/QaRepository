package com.sgtesting.assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PersonelDetailsWb1ToWb2 {

	public static void main(String[] args) {
		ReadAndWriteContent();
	}
	private static void ReadAndWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout1=null;
		Workbook wb=null;
		Workbook wb1=null;
		Sheet sh=null;
		Sheet sh1=null;
		Row row=null;
		Row row1=null;
		Cell cell=null;
		Cell cell1=null;
		try
		{
			fin=new FileInputStream("D:\\New folder\\niki\\PersonelDetails.xlsx");
			wb=new XSSFWorkbook(fin);
			wb1=new XSSFWorkbook();
			
			sh=wb.getSheet("Sheet1");
			sh1=wb1.createSheet();
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				row1=sh1.createRow(r);
				int cc=row.getPhysicalNumberOfCells();
				for(int c=0;c<cc;c++)
				{
					cell=row.getCell(c);
					cell1=row1.createCell(c);
					String data=cell.getStringCellValue();
					System.out.printf("%-12s",data);
					cell1.setCellValue(data);
				}
				System.out.println();
			}
			fout1=new FileOutputStream("D:\\New folder\\niki\\PersonelDetails1.xlsx");
			wb.write(fout1);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fout1.close();
				wb.close();
				wb1.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
}

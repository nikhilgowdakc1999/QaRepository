package com.sgtesting.assignments;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CountryNamesSh1Col1ToSh2Col1 {

	public static void main(String[] args) {
		ReadandWriteContent();
	}
	private static void ReadandWriteContent()
	{
		FileInputStream fin=null;
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Sheet sh1=null;
		Row row=null;
		Row row1=null;
		Cell cell=null;
		Cell cell1=null;

		try {
			fin=new FileInputStream("D:\\New folder\\niki\\Countryname.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("sheet1");
			sh1=wb.createSheet("sheet2");
			int rc=sh.getPhysicalNumberOfRows();
			
			for(int r=0;r<rc;r++)
			{
				row=sh.getRow(r);
				row1=sh1.createRow(r);
				cell=row.getCell(0);
				cell1=row1.createCell(0);
				String data=cell.getStringCellValue();
				System.out.println(data);	
				cell1.setCellValue(data);
			}
			fout=new FileOutputStream("D:\\New folder\\niki\\Countryname.xlsx");
			wb.write(fout);
		} catch (Exception e) {
			e.printStackTrace();
		}		
		finally {
			try {
				fin.close();
				fout.close();
				wb.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}

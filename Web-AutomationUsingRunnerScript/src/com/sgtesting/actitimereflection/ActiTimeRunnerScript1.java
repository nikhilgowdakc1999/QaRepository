package com.sgtesting.actitimereflection;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ActiTimeRunnerScript1 {

	public static void main(String[] args) {

		executeMethods();
	}
	private static void executeMethods()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{  
			fin=new FileInputStream(".\\ActiTimeExcel\\ActiTimeRunnerSuit.xlsx");
			wb=new XSSFWorkbook(fin);
			
			String sheet[]= {"Sheet1","Sheet2","Sheet3","Sheet3","Sheet4","Sheet5","Sheet6","Sheet7","Sheet8"};
			for(int i=0;i<sheet.length;i++)
			{		
				//important step
				System.out.println(sheet[i]);
				sh=wb.getSheet(sheet[i]);

				int rc=sh.getPhysicalNumberOfRows();
				for(int r=1;r<rc;r++)
				{
					row=sh.getRow(r);
					cell=row.getCell(0);
					String methodname=cell.getStringCellValue();
					cell=row.getCell(1);
					String pkgclassname=cell.getStringCellValue();
					System.out.println(methodname+ " --->"+pkgclassname);

					Class clsObject=Class.forName(pkgclassname);
					Object obj=clsObject.getConstructor().newInstance();

					Method method=obj.getClass().getMethod(methodname, null);
					method.invoke(obj, null);
				}
			}

		}catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

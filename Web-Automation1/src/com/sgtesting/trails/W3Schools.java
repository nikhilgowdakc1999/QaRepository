package com.sgtesting.trails;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class W3Schools {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {

		LaunchBrowser();
		Navigate();
		Close();
	}
	private static void LaunchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			ChromeOptions co=new ChromeOptions();
			co.addArguments("start-maximized");
		//	co.addArguments("incognito");
			oBrowser=new ChromeDriver(co);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Navigate()
	{
		try
		{
			oBrowser.get("https://www.w3schools.com/");
			Thread.sleep(2000);
			oBrowser.findElement(By.id("navbtn_tutorials")).click();
			List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
			int count=olinks.size();
			System.out.println(count);
			for(int i=0;i<count;i++)
			{
				WebElement oEle= olinks.get(i);
				String oText=oEle.getText();
				System.out.println(oText);
			}
		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	private static void Close()
	{
		try
		{
			oBrowser.close();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

package com.sgtesting.trails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {

		LaunchBrowser();
		Navigate();
		//Close();
	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
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

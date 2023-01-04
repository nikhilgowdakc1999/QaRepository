package com.sginstitute.javatest5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		Navigate();
		FetchCompanyName();
		
		Close();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:\\TestAutomation\\Automation\\JavaTestProgrammes\\Library\\Driver\\chromedriver.exe");
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

			oBrowser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void FetchCompanyName()
	{
		try
		{

			oBrowser.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		
			oBrowser.findElement(By.name("password")).sendKeys("admin123");
			
			oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/img")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[1]/a")).click();
			Thread.sleep(2000);
			
		    String text=oBrowser.findElement(By.xpath("//p[text()='OrangeHRM']")).getText();
		    Thread.sleep(3000);
		    System.out.print(text);

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

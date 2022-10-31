package com.sgtesting.actionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {

		launchBrowser();
		navigate();
		mouseMovements();

	}
	private static void launchBrowser()
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
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void mouseMovements()
	{
		try
		{
		    oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
			Thread.sleep(2000);
			WebElement a=oBrowser.findElement(By.xpath("//div[text()='Electronics']"));
			Actions oMouse=new Actions(oBrowser);
			oMouse.moveToElement(a).build().perform();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("MobileAccessory")).click();
			Thread.sleep(10000);
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='Electronics']"));
			oMouse.moveToElement(oEle).build().perform();
			Thread.sleep(2000);
			oBrowser.findElement(By.linkText("Memory Cards")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.linkText("Flights"));
			oMouse.contextClick(oLink).build().perform();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

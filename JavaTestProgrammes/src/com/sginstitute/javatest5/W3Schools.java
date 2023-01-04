package com.sginstitute.javatest5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3Schools {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		Navigate();
		NoOfLinks();
		//Close();

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

			oBrowser.get("https://www.w3schools.com/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void NoOfLinks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='navbtn_tutorials']")).click();
			Thread.sleep(1000);
			List<WebElement> a=oBrowser.findElements(By.xpath("//a[@href]"));
			int b=a.size();
			System.out.print(b);
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

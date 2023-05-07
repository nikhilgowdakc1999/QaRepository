package com.sgtesting.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Automation1 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		Navigate();
		UserloginAndlogout();
		closeBrowser();
	}
public static void launchBrowser()
{
	try
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\Drivers\\chromedriver.exe");
		oBrowser=new ChromeDriver();
	}catch (Exception e)
	{
		e.printStackTrace();
	}
}
public static void Navigate()
{
	try
	{
		oBrowser.get("http://localhost/login.do");
		Thread.sleep(2000);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public static void UserloginAndlogout()
{
	try
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("logoutLink")).click();
		Thread.sleep(2000);
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
}
public static void closeBrowser()
{
	try
	{
		oBrowser.close();
	}catch (Exception e) 
	{
	 e.printStackTrace();
	}
}
}

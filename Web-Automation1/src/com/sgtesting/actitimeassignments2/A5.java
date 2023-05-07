package com.sgtesting.actitimeassignments2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A5 {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
	
		launchbrowser();
		navigate();
		login();
		minimize();
		createcustomer();
		modifycustomer();
		deletecustomer();
		logout();
		
	  closebrowser();
		
	}
public static void launchbrowser()
{
	try
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
	
	ChromeOptions options=new ChromeOptions();
	options.addArguments("startmaximized");
	oBrowser=new ChromeDriver(options);
	Thread.sleep(2000);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public static void navigate()
{
	try
	{
		oBrowser.manage().window().maximize();
		oBrowser.get("http://localhost/login.do");
		Thread.sleep(2000);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public static void login()
{
	try
	{
	oBrowser.findElement(By.id("username")).sendKeys("admin");
	oBrowser.findElement(By.name("pwd")).sendKeys("manager");
	oBrowser.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public static void minimize()
{
	try
	{
		oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']")).click();
		Thread.sleep(2000);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public static void createcustomer()
{
	try
	{
	oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
	Thread.sleep(1000);
	oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
	Thread.sleep(1000);
	oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	Thread.sleep(1000);
	oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Acer");
	Thread.sleep(1000);
	oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
	Thread.sleep(1000);
	
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public static void modifycustomer()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")).sendKeys("Acer login feature testing");
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(1000);
	}catch (Exception e) {
		e.printStackTrace();
	}
}

public static void deletecustomer()
{
	try
	{
		oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
		Thread.sleep(1000);
		oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		Thread.sleep(1000);
	}catch (Exception e) 
	{
		e.printStackTrace();
	}
}
public static void logout()
{
	try
	{
	oBrowser.findElement(By.id("logoutLink")).click();	
	Thread.sleep(1000);
	}catch (Exception e) {
		e.printStackTrace();
	}
}
public static void closebrowser()
{
	try
	{
	oBrowser.close();	
	}catch (Exception e) {
		e.printStackTrace();
	}
}
}

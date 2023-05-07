package com.sgtesting.multipledatainputs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class MultipleDataInputs {
	private static WebDriver Obrowser=null;

	@BeforeTest
	public void setup()
	{
		String path=System.getProperty("user.dir");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		Obrowser=new ChromeDriver(options);
	}
	@Test(dataProvider="LoginData")
	public void login(String Uname,String pwd,String Exp) throws InterruptedException
	{
		Obrowser.get("http://localhost/login.do");
		Thread.sleep(2000);
		Obrowser.findElement(By.id("username")).sendKeys(Uname);
		Obrowser.findElement(By.name("pwd")).sendKeys(pwd);
		Obrowser.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(2000);
		
		WebElement Logout=Obrowser.findElement(By.id("logoutLink"));
		
		if(Exp.equals("valid"))
		{
			if(Logout.isDisplayed())
			{
			Obrowser.findElement(By.id("logoutLink")).click();
			Assert.assertTrue(true);	
			}
			else
			{
				Assert.assertTrue(false);	
			}
		}
		else if(Exp.equals("invalid"))
		{
			if(Logout.isDisplayed())
			{
			Obrowser.findElement(By.id("logoutLink")).click();
			Assert.assertTrue(false);	
			}
			else
			{
				Assert.assertTrue(true);	
			}
		}
	}
	@AfterTest
	public void Teardown()
	{
		Obrowser.close();
	}
	@DataProvider(name="LoginData")
	public String[][] getdata()
	{
		String s[][]= {{"admin","manager","valid"},{"adm","manager","invalid"},{"admin","mng","invalid"},{"adm","mng","invalid"}};
		return s;
	}
	{

	}
}

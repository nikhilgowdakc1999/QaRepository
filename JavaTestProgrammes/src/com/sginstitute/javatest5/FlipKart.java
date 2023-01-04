package com.sginstitute.javatest5;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKart {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		Navigate();
		FetchFormalShirts();

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

			oBrowser.get("https://www.flipkart.com/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void FetchFormalShirts()
	{
		try
		{
            oBrowser.findElement(By.xpath("//button[text()='✕']")).click();
            Thread.sleep(1000);
            oBrowser.findElement(By.xpath("//div[text()='Top Offers']")).click();
			Thread.sleep(2000);
			WebElement a=oBrowser.findElement(By.xpath("//*[@id='container']/div/div[2]/div/div/span[3]"));
            Actions oMouse=new Actions(oBrowser);
            oMouse.moveToElement(a).build().perform();
            Thread.sleep(3000);
            oBrowser.findElement(By.xpath("//*[@id=\'container\']/div/div[2]/div/div/div/div[2]/a[4]")).click();
            Thread.sleep(3000);
            
            String s= oBrowser.findElement(By.xpath("//h1[text()='Formal Shirts']")).getText();  
            System.out.print(s);
            
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

package com.sgtesting.googlesearch;


import java.util.List;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch {
	public static  WebDriver oBrowser=null;
	public static void main(String[] args) throws InterruptedException {
	    String path=System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		oBrowser=new ChromeDriver(options);
		oBrowser.get("https://www.google.com/");
		Thread.sleep(3000);
	/*	WebElement oEle=oBrowser.findElement(By.xpath("//button[text()='No thanks']"));
		JavascriptExecutor js=(JavascriptExecutor)oBrowser;
		js.executeScript("arguments[0].click();", oEle);
	*/	
		oBrowser.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("java");
		Thread.sleep(2000);
		List<WebElement> oList=oBrowser.findElements(By.xpath("//ul[@role='listbox']/li/descendant::div[@role='presentation']"));

		System.out.println(oList.size());
		for(int i=0;i<oList.size();i++)
		{
			WebElement link=oList.get(i);
			String Text=link.getText();
			if(Text.contains("javatpoint"))
			{
				link.click();
			}
		}
	//	String Text2=oBrowser.findElement(By.xpath("//h3[text()='Java Tutorial | Learn Java Programming - javatpoint']")).getText();
	//    System.out.println(Text2);
	}

}

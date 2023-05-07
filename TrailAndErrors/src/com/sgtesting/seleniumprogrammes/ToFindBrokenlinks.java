package com.sgtesting.seleniumprogrammes;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToFindBrokenlinks {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) throws InterruptedException {

		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		oBrowser=new ChromeDriver(options);
		oBrowser.manage().window().maximize();
		oBrowser.get("https://tutorialsninja.com/demo/");
		Thread.sleep(2000);

		List <WebElement> oLinks=oBrowser.findElements(By.tagName("a"));
		Thread.sleep(2000);
		for(WebElement a:oLinks)
		{
			String url= a.getAttribute("href");
			System.out.println("==========================");
			System.out.println(url);
			//to rule-out blanc links i.e href empty
			if(url==null||url.isEmpty())
			{
				System.out.println("URL is Empty");
				//to skip these links
				continue;
			}
			try {
				HttpURLConnection huc=(HttpURLConnection)(new URL(url).openConnection());
				huc.connect();
				if(huc.getResponseCode()>=400)
				{
					System.out.println(url+" is broken");
				}
				else
				{
					System.out.println(url+" is valid");
				}

			} catch (MalformedURLException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		oBrowser.quit();
	}

}

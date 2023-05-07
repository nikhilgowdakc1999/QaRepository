package com.sgtesting.trails;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeTrails {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {

		LaunchBrowser();
		Navigate();
		LinksCount();
		Close();

	}
	private static void LaunchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("https://www.youtube.com/");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void LinksCount()
	{
		try
		{
		List<WebElement> obj=oBrowser.findElements(By.xpath("//a[@href][1]"));
				
				for(int i=0;i<obj.size();i++)
				{
					WebElement b=obj.get(i);
					String S=b.getText();
					System.out.println(S);
				}
		
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

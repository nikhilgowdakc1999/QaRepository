package com.sgtesting.retryanalyzer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class RetryAnalyzerTrail {
	public static WebDriver oBrowser=null;
	@BeforeTest
	private static void launchbrowserAndNavigate() throws InterruptedException
	{
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		oBrowser=new ChromeDriver(options);
		oBrowser.get("http://localhost/login.do");
		Thread.sleep(2000);
		
	}
	@Test(retryAnalyzer = RerunAutomation.class)
	private static void Login() throws InterruptedException
	{
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		Thread.sleep(3000);
                    //WebElement is used with true conditioned assertion with xpath partially matching
		WebElement oLink=oBrowser.findElement(By.xpath("//a[contains(text(),'Administrator')]"));//it should be Administrator
		Assert.assertTrue(oLink.isDisplayed());

	}
	@AfterTest
	public void closeBrowser()
	{
		oBrowser.close();
	}

}

package com.sgtesting.TestNGScenarioAssignments;
//launchBrowser --> navigate --> Login --> Create Customer --> Create Project--> delete Project-->delete Customer --> Logout
//--> CloseApplication
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment6Actime {
	public static WebDriver oBrowser=null;
	
	@Test(priority=1)
	private static void launch()
	{
		try 
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
		}catch(Exception e)
		{

		}
	}
	@Test(priority=2)
	private static void Navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");

			Thread.sleep(1000);
			WebElement a=oBrowser.findElement(By.id("headerContainer"));
			Assert.assertTrue(a.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=3,dataProvider = "LoginData")
	private static void login(String User,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(User);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			WebElement b=oBrowser.findElement(By.id("logoutLink"));
			Assert.assertTrue(b.isDisplayed());

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=4)
	private static void Minimize()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority=5,dataProvider = "Customname")
	private static void Createcustomer(String cname)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
			WebElement a=oBrowser.findElement(By.xpath("//div[text()='Customers & Projects']"));
			Assert.assertTrue(a.isDisplayed());
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(cname);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(1000);
			WebElement b=oBrowser.findElement(By.xpath("//div[text()='All Customers']"));
			Assert.assertTrue(b.isDisplayed());
			
						
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority=6,dataProvider = "Projectname")
	private static void CreateProject(String name)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[1]/div[2]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(name);
			Thread.sleep(1000);			
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(3000);
			WebElement b=oBrowser.findElement(By.xpath("//div[text()='All Customers']"));
			Assert.assertTrue(b.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority=7)
	private static void DeleteProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
			WebElement b=oBrowser.findElement(By.xpath("//div[text()='All Customers']"));
			Assert.assertTrue(b.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void Deletecustomer()
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
			WebElement a=oBrowser.findElement(By.xpath("//div[text()='Customers & Projects']"));
			Assert.assertTrue(a.isDisplayed());
							
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			WebElement a=oBrowser.findElement(By.id("headerContainer"));
			Assert.assertTrue(a.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority=10)
	private static void CloseBrowser()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@DataProvider(name="LoginData")
	public Object[][] getlogindata()
	{
		return new Object[][] {{"admin","manager"}};
	}
	
	@DataProvider(name="Customname")
	public Object[][] getcustomdata()
	{
		return new Object[][] {{"Acer"}};
	}
	@DataProvider(name="Projectname")
	public Object[][] getprojectdata()
	{
		return new Object[][] {{"Acer Project"}};
	}
}

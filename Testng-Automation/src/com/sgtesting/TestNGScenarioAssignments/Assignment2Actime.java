package com.sgtesting.TestNGScenarioAssignments;
//launchBrowser --> navigate --> Login --> CreateUser -->ModifyUser--> DeleteUser --> Logout--> CloseApplication
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment2Actime {
	public static WebDriver oBrowser=null;
	
	@Test(priority=1)
	private static void launchBrowser()

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
			e.printStackTrace();
		}
	}
	@Test(priority=2)
	private static void Navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
			WebElement a=oBrowser.findElement(By.id("headerContainer"));
			Assert.assertTrue(a.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=3,dataProvider = "LoginData")
	private static void login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			WebElement b=oBrowser.findElement(By.id("logoutLink"));
			Assert.assertTrue(b.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=4)
	private static void minimize()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=5,dataProvider = "UserLogin")
	private static void User(String fname1,String mname1,String lname1,String mail1,String user1,String pwd1,String rpwd1)
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			WebElement c=oBrowser.findElement(By.xpath("//span[text()='User List']"));
			Assert.assertTrue(c.isDisplayed());
			oBrowser.findElement(By.xpath("//*[@id='createUserDiv']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(fname1);
			oBrowser.findElement(By.name("middleName")).sendKeys(mname1);
			oBrowser.findElement(By.name("lastName")).sendKeys(lname1);
			oBrowser.findElement(By.name("email")).sendKeys(mail1);
			oBrowser.findElement(By.name("username")).sendKeys(user1);
			oBrowser.findElement(By.name("password")).sendKeys(pwd1);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(rpwd1);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	@Test(priority=6,dataProvider = "modifyuser")
	private static void ModifyUser(String fname,String mname)
	{
		try
		{
		
			oBrowser.findElement(By.xpath("//span[text()='Gowda, Nikhil KC.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("firstName")).sendKeys(fname);
			oBrowser.findElement(By.name("middleName")).clear();
			oBrowser.findElement(By.name("middleName")).sendKeys(mname);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	} 
	@Test(priority=7)
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Gowda, samarth S.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			//important step
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			WebElement c=oBrowser.findElement(By.xpath("//span[text()='User List']"));
			Assert.assertTrue(c.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=8)
	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(3000);
			WebElement a=oBrowser.findElement(By.id("headerContainer"));
			Assert.assertTrue(a.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority=9)
	private static void close()
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
    
	@DataProvider(name="UserLogin")
	public Object[][] getuserdata()
	{
		return new Object[][] {{"Nikhil","KC","Gowda","nikhigowdakc1999@gmail.com","Nikki","Nikhil@95","Nikhil@95"}};
	}
    @DataProvider(name="modifyuser")
    public Object[][] getmodifydata()
    {
    	return new Object[][] {{"samarth","S"}};
    }
}

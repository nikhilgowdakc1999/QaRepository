package com.sgtesting.TestNGScenarioAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assignment3Actime {

	public static WebDriver oBrowser=null;
	@Test(priority=1)
	private static void launchBrowser()

	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\ExampleAutomation\\Automation\\Web-Automation1\\Library\\drivers\\chromedriver.exe");
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
	@Test(priority = 3,dataProvider = "login")
	public static void Login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 4)
	public static void minimizeFlyOutwindow()
	{
		String expected;
		try
		{
			expected="Getting Started Shortcuts";
			WebElement oEle=oBrowser.findElement(By.xpath("//div[text()='Getting Started Shortcuts']"));
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String actual=oEle.getText();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5,dataProvider = "user1")
	public static void User1(String First,String m,String last,String Em,String usnm,String pwd,String pwdc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys(First);
			oBrowser.findElement(By.name("middleName")).sendKeys(m);
			oBrowser.findElement(By.name("lastName")).sendKeys(last);
			oBrowser.findElement(By.name("email")).sendKeys(Em);
			oBrowser.findElement(By.name("username")).sendKeys(usnm);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdc);
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}	@Test(priority = 6,dataProvider = "user2")
	public static void User2(String First,String m,String last,String Em,String usnm,String pwd,String pwdc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys(First);
			oBrowser.findElement(By.name("middleName")).sendKeys(m);
			oBrowser.findElement(By.name("lastName")).sendKeys(last);
			oBrowser.findElement(By.name("email")).sendKeys(Em);
			oBrowser.findElement(By.name("username")).sendKeys(usnm);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdc);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 7,dataProvider = "user3")
	public static void User3(String First,String m,String last,String Em,String usnm,String pwd,String pwdc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys(First);
			oBrowser.findElement(By.name("middleName")).sendKeys(m);
			oBrowser.findElement(By.name("lastName")).sendKeys(last);
			oBrowser.findElement(By.name("email")).sendKeys(Em);
			oBrowser.findElement(By.name("username")).sendKeys(usnm);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdc);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
	public static void Logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 9,dataProvider = "user1login")
	public static void LoginUser1(String name,String pwd)
	{
		try
		{
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys(name);

			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 10)
	public static void Logoutuser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 11,dataProvider = "user2login")
	public static void LoginUser2(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("123321");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 12)
	public static void Logoutuser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 13,dataProvider = "user3login")
	public static void LoginUser3(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 14)
	public static void Logoutuser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 15,dataProvider = "user1login")
	public static void SecontimeLoginUser1(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 16,dataProvider = "Moduser1")
	public static void Modifyuser1(String pwd,String pwdc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='vin, demo v.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdc);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 17)
	public static void SecondtimeLogoutuser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 18,dataProvider = "user2login")
	public static void SecondtimeLoginUser2(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 19,dataProvider = "Moduser2")
	public static void Modifyuser2(String pwd,String pwdc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='sam, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdc);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 20)
	public static void SecondtimeLogoutuser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 21,dataProvider = "user3login")
	public static void SecondtimeLoginUser3(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 22,dataProvider = "Moduser3")
	public static void Modifyuser3(String pwd,String pwdc)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='niki, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(pwdc);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 23)
	public static void SecondtimeLogoutuser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 24,dataProvider = "2ndModuser1")
	public static void ModifiedLoginUser1(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 25)
	public static void LogoutModifieduser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 26,dataProvider = "2ndModuser2")
	public static void ModifiedLoginUser2(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 27)
	public static void LogoutModifieduser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 28,dataProvider = "2ndModuser3")
	public static void ModifiedLoginUser3(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 29)
	public static void LogoutModifieduser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 30,dataProvider = "login")
	public static void SecondtimeadminLogin(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 31,dataProvider = "AdminModiusers")
	public static void AdminModifyuser1(String us1,String us2,String us3)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='vin, demo v.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(us1);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(us1);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='sam, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(us2);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(us2);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='niki, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys(us3);
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(us3);
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 32)
	public static void SecondtimeAdminlogout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 33,dataProvider = "3rdModuser1")
	public static void ThirdtimeLoginUser1(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 34)
	public static void Thirdtimeuser1logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 35,dataProvider = "3rdModuser2")
	public static void ThirdtimeLoginUser2(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 36)
	public static void Thirdtimeuser2logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 37,dataProvider = "3rdModuser3")
	public static void ThirdtimeLoginUser3(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());


		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 38)
	public static void Thirdtimeuser3logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 39,dataProvider = "login")
	public static void thirdtimeadminLogin(String name,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(name);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			WebElement oLink=oBrowser.findElement(By.xpath("//*[text()='System, Administrator']"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 40)
	public static void DeleteUesers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='vin, demo v.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='sam, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			oAlert.accept();
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='niki, demo s.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			oAlert.accept();
			WebElement oLink=oBrowser.findElement(By.xpath("//*[@id='pageBody']/tbody/tr[1]/td[1]/div/span"));
			Assert.assertTrue(oLink.isDisplayed());

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 41)
	public static void ThirdtimeAdminlogout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	@Test(priority = 42)
	public static void CloseBrowser()
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
	@DataProvider(name="login")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
	@DataProvider(name="user1")
	public Object[][] getuser1data()
	{
		return new Object[][] {{"demo","v","vin","demo@gmail.com","Demouser1","12345a","12345a"}};
	}
	@DataProvider(name="user2")
	public Object[][] getuser2data()
	{
		return new Object[][] {{"demo","s","sam","sam@gmail.com","Demouser2","123321","123321"}};
	}
	@DataProvider(name="user3")
	public Object[][] getuser3data()
	{
		return new Object[][] {{"demo","s","niki","niki@gmail.com","Demouser3","121212","121212"}};
	}
	@DataProvider(name="user1login")
	public Object[][] getuser1logindata()
	{
		return new Object[][] {{"Demouser1","12345a"}};
	}
	@DataProvider(name="user2login")
	public Object[][] getuser2logindata()
	{
		return new Object[][] {{"Demouser2","123321"}};
	}
	@DataProvider(name="user3login")
	public Object[][] getuser3logindata()
	{
		return new Object[][] {{"Demouser3","121212"}};
	}
	@DataProvider(name="Moduser1")
	public Object[][] getModuser1data()
	{
		return new Object[][] {{"vini","vini"}};
	}
	@DataProvider(name="Moduser2")
	public Object[][] getModuser2data()
	{
		return new Object[][] {{"sam","sam"}};
	}
	@DataProvider(name="Moduser3")
	public Object[][] getModuser3data()
	{
		return new Object[][] {{"niki","niki"}};
	}
	@DataProvider(name="2ndModuser1")
	public Object[][] get2ndModuser1data()
	{
		return new Object[][] {{"Demouser1","vini"}};
	}
	@DataProvider(name="2ndModuser2")
	public Object[][] get2ndModuser2data()
	{
		return new Object[][] {{"Demouser2","sam"}};
	}
	@DataProvider(name="2ndModuser3")
	public Object[][] get2ndModuser3data()
	{
		return new Object[][] {{"Demouser3","niki"}};
	}
	@DataProvider(name="AdminModiusers")
	public Object[][] getAdminModiusersdata()
	{
		return new Object[][] {{"vinayak","sami","nikki"}};
	}
	@DataProvider(name="3rdModuser1")
	public Object[][] get3rdModuser1data()
	{
		return new Object[][] {{"Demouser1","vinayak"}};
	}
	@DataProvider(name="3rdModuser2")
	public Object[][] get3rdModuser2data()
	{
		return new Object[][] {{"Demouser2","sami"}};
	}
	@DataProvider(name="3rdModuser3")
	public Object[][] get3rdModuser3data()
	{
		return new Object[][] {{"Demouser3","nikki"}};
	}

}

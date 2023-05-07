package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Actime3User {
	public static WebDriver oBrowser=null;
	public static ActiPageDEMO oPage=null;
	public static void main(String[] args) {

		launchBrowser();
		Navigate();
		Adminlogin1();
		minimize();
		UsersCreation1();
		Adminlogout1();
		UsersloginAndLogout1();
//		UsersModifyPasswordAndLogout();
//		UsersNewPasswordloginAndLogout();
//		Adminlogin2();
//		ModifyUser123passwordByAdmin();
//		Adminlogout2();
//		UsersNewpasswordLoginAndLogout();
//		Adminlogin3();
//		AdminDeleteUser123();
//		Adminlogout3();
//		close();
	}
	private static void launchBrowser()

	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
			oPage=new ActiPageDEMO(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Adminlogin1()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			oPage.getPassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void minimize()
	{
		try
		{
			oPage.getFlyOutWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void UsersCreation1()
	{
		try
		{
			oPage.UserClick().click();
			Thread.sleep(2000);
			oPage.UserAdd().click();
			Thread.sleep(2000);
	        oPage.FName().sendKeys("Nikhil1");
			oPage.MName().sendKeys("KC1");
			oPage.LName().sendKeys("Gowda1");
			oPage.mail().sendKeys("nikhigowdakc19991@gamil.com");
			oPage.Username().sendKeys("Nikki1");
			oPage.Password().sendKeys("Nikhil@951");
			oPage.Repassword().sendKeys("Nikhil@951");
			Thread.sleep(1000);
			oPage.CreateUserButton().click();
			Thread.sleep(2000);

			oPage.UserClick().click();
			Thread.sleep(2000);
			oPage.UserAdd().click();
			Thread.sleep(2000);
	        oPage.FName().sendKeys("Nikhil2");
			oPage.MName().sendKeys("KC2");
			oPage.LName().sendKeys("Gowda2");
			oPage.mail().sendKeys("nikhigowdakc19992@gamil.com");
			oPage.Username().sendKeys("Nikki2");
			oPage.Password().sendKeys("Nikhil@952");
			oPage.Repassword().sendKeys("Nikhil@952");
			Thread.sleep(1000);
			oPage.CreateUserButton().click();
			Thread.sleep(2000);


			oPage.UserClick().click();
			Thread.sleep(2000);
			oPage.UserAdd().click();
			Thread.sleep(2000);
	        oPage.FName().sendKeys("Nikhil3");
			oPage.MName().sendKeys("KC3");
			oPage.LName().sendKeys("Gowda3");
			oPage.mail().sendKeys("nikhigowdakc19993@gamil.com");
			oPage.Username().sendKeys("Nikki3");
			oPage.Password().sendKeys("Nikhil@953");
			oPage.Repassword().sendKeys("Nikhil@953");
			Thread.sleep(1000);
			oPage.CreateUserButton().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Adminlogout1()
	{
		try
		{
			oPage.getLogout().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void UsersloginAndLogout1()
	{
		try
		{
			oPage.getUserName().sendKeys("Nikki1");
            oPage.getPassword().sendKeys("Nikhil@951");
			oPage.getLogin().click();			
			oPage.SkipExploreWindow().click();
			Thread.sleep(2000);

			oPage.getLogout().click();
			Thread.sleep(2000);

			oPage.getUserName().sendKeys("Nikki2");
            oPage.getPassword().sendKeys("Nikhil@952");
			oPage.getLogin().click();			
			oPage.SkipExploreWindow().click();
			Thread.sleep(2000);

			oPage.getLogout().click();
			Thread.sleep(2000);

			oPage.getUserName().sendKeys("Nikki3");
            oPage.getPassword().sendKeys("Nikhil@953");
			oPage.getLogin().click();			
			oPage.SkipExploreWindow().click();
			Thread.sleep(2000);

			oPage.getLogout().click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void UsersModifyPasswordAndLogout()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@951");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);

			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda1, Nikhil1 KC1.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345aa");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345aa");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.id("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@952");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);

			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda2, Nikhil2 KC2.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345bb");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345bb");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.id("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@953");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);

			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda3, Nikhil3 KC3.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345cc");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345cc");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void UsersNewPasswordloginAndLogout()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345aa");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.id("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345bb");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.id("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345cc");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Adminlogin2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void ModifyUser123passwordByAdmin()
	{
		try
		{
			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda1, Nikhil1 KC1.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345aaa");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345aaa");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//span[text()='Gowda2, Nikhil2 KC2.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345bbb");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345bbb");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//span[text()='Gowda3, Nikhil3 KC3.']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_passwordField")).sendKeys("12345ccc");
			oBrowser.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("12345ccc");
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Adminlogout2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void UsersNewpasswordLoginAndLogout()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345aaa");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.id("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345bbb");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.id("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("pwd")).sendKeys("12345ccc");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();			
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Adminlogin3()
	{
		try
		{

			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void AdminDeleteUser123()
	{
		try
		{
			oBrowser.findElement(By.linkText("USERS")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Gowda1, Nikhil1 KC1.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert1=oBrowser.switchTo().alert();
			oAlert1.accept();
			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda2, Nikhil2 KC2.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert2=oBrowser.switchTo().alert();
			oAlert2.accept();
			oBrowser.findElement(By.linkText("USERS")).click();
			oBrowser.findElement(By.xpath("//span[text()='Gowda3, Nikhil3 KC3.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert3=oBrowser.switchTo().alert();
			oAlert3.accept();
			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void Adminlogout3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void close()
	{
		try
		{
			
			oBrowser.close();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

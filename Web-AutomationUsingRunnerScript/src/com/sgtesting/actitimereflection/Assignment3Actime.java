package com.sgtesting.actitimereflection;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3Actime {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {

		launchBrowser();
		Navigate();
		Adminlogin1();
		minimize();
		UsersCreation1();
		Adminlogout1();
		UsersloginAndLogout1();
		UsersModifyPasswordAndLogout();
		UsersNewPasswordloginAndLogout();
		Adminlogin2();
		ModifyUser123passwordByAdmin();
		Adminlogout2();
		UsersNewpasswordLoginAndLogout();
		Adminlogin3();
		AdminDeleteUser123();
		Adminlogout3();
		close();
	}
	public static void launchBrowser()

	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\Driver\\chromedriver.exe");
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			oBrowser=new ChromeDriver(options);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void Navigate()
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
	public static void Adminlogin1()
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
	public static void minimize()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void UsersCreation1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Nikhil1");
			oBrowser.findElement(By.name("middleName")).sendKeys("KC1");
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda1");
			oBrowser.findElement(By.name("email")).sendKeys("nikhigowdakc19991@gamil.com");
			oBrowser.findElement(By.name("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("password")).sendKeys("Nikhil@951");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Nikhil@951");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Nikhil2");
			oBrowser.findElement(By.name("middleName")).sendKeys("KC2");
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda2");
			oBrowser.findElement(By.name("email")).sendKeys("nikhigowdakc19992@gamil.com");
			oBrowser.findElement(By.name("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("password")).sendKeys("Nikhil@952");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Nikhil@952");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Nikhil3");
			oBrowser.findElement(By.name("middleName")).sendKeys("KC3");
			oBrowser.findElement(By.name("lastName")).sendKeys("Gowda3");
			oBrowser.findElement(By.name("email")).sendKeys("nikhigowdakc19993@gamil.com");
			oBrowser.findElement(By.name("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("password")).sendKeys("Nikhil@953");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Nikhil@953");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void Adminlogout1()
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
	public static void UsersloginAndLogout1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Nikki1");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@951");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();	
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.id("username")).sendKeys("Nikki2");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@952");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.id("username")).sendKeys("Nikki3");
			oBrowser.findElement(By.name("pwd")).sendKeys("Nikhil@953");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
			Thread.sleep(2000);

			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(2000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void UsersModifyPasswordAndLogout()
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

	public static void UsersNewPasswordloginAndLogout()
	{
		try
		{
			Thread.sleep(2000);
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
	public static void Adminlogin2()
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

	public static void ModifyUser123passwordByAdmin()
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
	public static void Adminlogout2()
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

	public static void UsersNewpasswordLoginAndLogout()
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

	public static void Adminlogin3()
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
	public static void AdminDeleteUser123()
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

	public static void Adminlogout3()
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

	public static void close()
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

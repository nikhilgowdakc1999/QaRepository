package com.sgtesting.actitime.stepdefinitions;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {
	public static WebDriver oBrowser=null;
	/**
	 * I launch the chrome Browser
	 */
	@Given("I launch the chrome Browser")
	public void I_launch_the_chrome_Browser()
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
	
	/**
	 * I navigate the application url
	 */
	@And("^I navigate the application url$")
	public void I_navigate_the_application_url()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  I enter username in username text field
	 */
	@When("^I enter \"(.*)\" in username text field$")
	public void I_enter_username_in_username_text_field(String username)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(username);
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  I enter password in password text field
	 */
	@When("^I enter \"(.*)\" in password text field$")
	public void I_enter_password_in_password_text_field(String password)
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys(password);
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	

	/**
	 *  I click on Login button
	 */
	@And("^I click on Login button$")
	public void I_click_on_Login_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  I find the home page1
	 */
	@Then("^I find the home page1$")
	public void I_find_the_home_page1()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  I minimize the flyout window
	 */
	@And("^I minimize the flyout window$")
	public void I_minimize_the_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  I find the home page2
	 */
	@Given("^I find the home page2$")
	public void I_find_the_home_page2()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='User List']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I click on users
	 */
	@When("^I click on users$")
	public void When_I_click_on_users()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I click on Add user
	 */
	@When("^I click on Add user$")
	public void I_click_on_Add_user()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I enter FirstName text field
	 */
	@And("^I enter \"(.*)\" in FirstName text field$")
	public void I_enter_FirstName_text_field(String Fname)
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys(Fname);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I enter MiddleName text field
	 */
	@And("^I enter \"(.*)\" in MiddleName text field$")
	public void I_enter_MiddleName_text_field(String Mname)
	{
		try
		{
			oBrowser.findElement(By.name("middleName")).sendKeys(Mname);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *   I enter LastName text field
	 */
	@And("^I enter \"(.*)\" in LastName text field$")
	public void I_enter_LastName_text_field(String Lname)
	{
		try
		{
			oBrowser.findElement(By.name("lastName")).sendKeys(Lname);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I enter email text field
	 */
	@And("^I enter \"(.*)\" in email text field$")
	public void I_enter_email_text_field(String mail)
	{
		try
		{
			oBrowser.findElement(By.name("email")).sendKeys(mail);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I enter Username text field
	 */
	@And("^I enter \"(.*)\" in Username text field$")
	public void I_enter_Username_text_field(String Uname)
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys(Uname);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I enter Password text field
	 */
	@And("^I enter \"(.*)\" in Password text field$")
	public void I_enter_Password_text_field(String pwd)
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys(pwd);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I enter Re-Password text field
	 */
	@And("^I enter \"(.*)\" in Re-Password text field$")
	public void I_enter_Re_Password_text_field(String rpwd)
	{
		try
		{
			oBrowser.findElement(By.name("passwordCopy")).sendKeys(rpwd);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I click on create user
	 */
	@And("^I click on create user$")
	public void I_click_on_create_user()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I click on user created
	 */
	@When("^I click on user created$")
	public void I_click_on_user_created()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Gowda, Nikhil KC.']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I enter in Firstname text field
	 */
	@And("^I enter \"(.*)\" in Firstname text field$")
	public void I_enter_in_Firstname_text_field(String Fname)
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).clear();
			oBrowser.findElement(By.name("firstName")).sendKeys(Fname);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on save changes  
	 */
	@And("^I click on save changes$")
	public void Iclickonsavechanges()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}/**
	 *  I click on Tasks  
	 */
	@When("^I click on Tasks$")
	public void IclickonTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}/**
	 *  I click on Add New  
	 */
	@And("^I click on Add New$")
	public void IclickonAddNew()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add New']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on New Customer  
	 */
	@And("^I click on New Customer$")
	public void IclickonNewCustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='+ New Customer']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I enter in Customer name text field  
	 */
	@And("^I enter \"(.*)\" in Customer name text field$")
	public void Iclickonsavechanges(String Cname)
	{
		try
		{
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys(Cname);
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Create customer  
	 */
	@And("^I click on Create customer$")
	public void IclickonCreatecustomer()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Created Customer Bar  
	 */
	@And("^I click on Created Customer Bar$")
	public void IclickonCreatedCustomerBar()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click On Actions  
	 */
	@And("^I click On Actions$")
	public void IclickOnActions()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on delete  
	 */
	@And("^I click on delete$")
	public void Iclickondelete()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on delete permanently  
	 */
	@And("^I click on delete permanently$")
	public void Iclickondeletepermanently()
	{
		try
		{
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Customer Created bar 
	 */
	@When("^I click on Customer Created bar$")
	public void IclickonCustomerCreatedbar()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Active  
	 */
	@And("^I click on Active$")
	public void IclickonActive()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(1000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Archieved
	 */
	@And("^I click on Archieved$")
	public void IclickonArchieved()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on New project
	 */
	@And("^I click on New project$")
	public void IclickonNewproject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='+ New Project']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  I enter in Project name text field
	 */
	@And("^I enter \"(.*)\" in Project name text field$")
	public void IclickonArchieved(String Pname)
	{
		try
		{
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys(Pname);
			Thread.sleep(1000);		
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  I click on Create Project
	 */
	@And("^I click on Create Project$")
	public void IclickonCreateProject()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Create Project']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Created project bar
	 */
	@And("^I click on Created project bar$")
	public void IclickonCreatedprojectbar()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Project Actions
	 */
	@And("^I click on Project Actions$")
	public void IclickonProjectActions()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Project delete
	 */
	@And("^I click on Project delete$")
	public void IclickonProjectdelete()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on project delete permanently
	 */
	@And("^I click on project delete permanently$")
	public void Iclickonprojectdeletepermanently()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='projectPanel_deleteConfirm_submitTitle']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Project Active
	 */
	@And("^I click on Project Active$")
	public void IclickonProjectActive()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Project Archieved
	 */
	@And("^I click on Project Archieved$")
	public void IclickonProjectArchieved()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Add new Task
	 */
	@When("^I click on Add new Task$")
	public void IclickonAddnewTask()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * I click on Create new Tasks
	 */
	@And("^I click on Create new Tasks$")
	public void IclickonCreatenewTasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Create new tasks']")).click();
			Thread.sleep(1000);	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I enter "<Tname>" in task name text field
	 */
	@And("^I enter \"(.*)\" in task name text field$")
	public void Ienterintasknametextfield(String Tname)
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='createTasksPopup_createTasksTableContainer']/table/tbody/tr[2]/td[1]/input")).sendKeys(Tname);
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on create tasks
	 */
	@And("^I click on create tasks$")
	public void Iclickoncreatetasks()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Create Tasks']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on task delete permanently
	 */
	@And("^I click on task delete permanently$")
	public void Iclickontaskdeletepermanently()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='deleteTaskPopup_deleteConfirm_submitBtn']/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on Created task box
	 */
	@When("^I click on Created task box$")
	public void IclickonCreatedtaskbox()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[1]/div/div")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *  I click on task delete
	 */
	@And("^I click on task delete$")
	public void Iclickontaskdelete()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[1]/div[3]/div/div/div[4]")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	/**
	 *  I find the home page3
	 */
	@Given("^I find the home page3$")
	public void I_find_the_home_page3()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='User List']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I click on Created user
	 */
	@And("^I click on Created user$")
	public void I_click_on_Created_user()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='1, UserDemo M.']")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I click on delete user
	 */
	@And("^I click on delete user$")
	public void I_click_on_delete_user()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			//important step
			Alert oAlert=oBrowser.switchTo().alert();
			oAlert.accept();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 *   I find the home page4
	 */
	@Given("^I find the home page4$")
	public void I_find_the_home_page4()
	{
		try
		{
			WebElement oEle=oBrowser.findElement(By.xpath("//span[text()='User List']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  I click on Logout link
	 */
	@When("^I click on Logout link$")
	public void I_click_on_Logout_link()
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
	
	/**
	 *  I find the login page
	 */
	@Then("^I find the login page$")
	public void I_find_the_login_page()
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 *  I close the application
	 */
	@And("^I close the application$")
	public void I_close_the_application()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

package com.sgtesting.robotclass;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotclassDemoTrial {

	public static void main(String[] args) throws InterruptedException, AWTException {
		String path=System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver",path+"\\Library\\drivers\\geckodriver.exe");
		
		WebDriver oBrowser=new FirefoxDriver();
		
		oBrowser.get("http://localhost/login.do");
		Thread.sleep(2000);
		oBrowser.findElement(By.id("username")).sendKeys("admin");
		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		WebElement min=oBrowser.findElement(By.id("gettingStartedShortcutsPanelId"));
		Actions oMouse=new Actions(oBrowser);
		oMouse.moveToElement(min).click().perform();
		
		oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Add New Task']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.xpath("//div[text()='Import tasks from CSV']")).click();
		Thread.sleep(2000);
		oBrowser.findElement(By.id("dropzoneClickableArea")).click();
		Thread.sleep(2000);
		
		//copying file name
		StringSelection stringSelection=new StringSelection("D:\\New folder\\GitRepository\\CurrentWorkSpace\\Sample.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		Thread.sleep(2000);
		
		Robot robot1=new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		Toolkit t=Toolkit.getDefaultToolkit();
		System.out.println("ScreenRes: "+t.getScreenResolution());
		Dimension d=t.getScreenSize();
		System.out.println("Screenwidth: "+d.width);
		System.out.println("ScreenHeight: "+d.height);
		
	}

}

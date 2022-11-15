package com.sgtesting.objectmap;

import org.openqa.selenium.By;

public class LoginLogoutDemo {

	public static void main(String[] args) {
		
		try
		{
			String filename=".\\ObjectMap\\objectmap.properties";
			ObjectMap om=new ObjectMap(filename);
	
			By by=om.getLocator("homepageflyoutwin");
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}

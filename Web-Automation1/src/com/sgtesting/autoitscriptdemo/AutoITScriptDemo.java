package com.sgtesting.autoitscriptdemo;

public class AutoITScriptDemo {

	public static void main(String[] args) {
		
		executeDemo();
	}
private static void executeDemo()
{
	try
	{
		Runtime.getRuntime().exec("E:\\GitRepository\\CurrentWorkSpace\\AutoItCase2.exe");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

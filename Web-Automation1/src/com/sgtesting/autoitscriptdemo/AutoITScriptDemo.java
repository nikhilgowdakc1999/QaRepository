package com.sgtesting.autoitscriptdemo;

public class AutoITScriptDemo {

	public static void main(String[] args) {
		
		executeDemo();
	}
private static void executeDemo()
{
	try
	{
		Runtime.getRuntime().exec("D:\\New folder\\GitRepository\\CurrentWorkSpace\\AutoItCase1.exe");
	}catch(Exception e)
	{
		e.printStackTrace();
	}
}
}

package com.sgtesting.retryanalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RerunAutomation implements IRetryAnalyzer {
private int retrycount=0;
	@Override
	public boolean retry(ITestResult result) {
		if(retrycount<3)
		{
			return true;
		}
		else {
			return false;
		}
		
	}

}

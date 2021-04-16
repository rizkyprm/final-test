package com.assignment.final_test;

import java.io.IOException;

import org.testng.ITestResult;

public interface iDriver {
	public void befTest();
	public void afterTest(ITestResult result) throws IOException;
}

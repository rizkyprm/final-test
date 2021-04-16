package com.assignment.baseui;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.assignment.final_test.iDriver;
import com.assignment.utility.BrowsAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTesting implements iDriver{
		public	WebDriver driver;
		public	WebDriverWait waits;
		
		@BeforeMethod
		public void befTest() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			waits = new WebDriverWait(driver, Duration.ofSeconds(180));
			driver.manage().window().maximize();
			driver.get("https://staging.engineer.ai/home");
			
			BrowsAction.setDriver(driver);
			BrowsAction.setWait(waits);
		}
		
		@AfterMethod (alwaysRun = true)
		public void afterTest(ITestResult result) throws IOException {
			if (result.getStatus() == ITestResult.FAILURE) {
				File getSS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(getSS, new File(System.getProperty("user.dir")+File.separator+result.getName()+".png"));
			}
			
//			driver.quit();
		
		}
		
	}


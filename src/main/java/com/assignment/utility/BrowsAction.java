package com.assignment.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowsAction {
	private static WebDriver driver;
	private static WebDriverWait waits;
	
		public static void setDriver(WebDriver driver) {
			BrowsAction.driver = driver;
		}
		public static void setWait(WebDriverWait waits) {
			BrowsAction.waits = waits;
		}
		
		public static void clickElementByCss(String elementCss) {
			WebElement clickByCss = waits.until
					(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector(elementCss))));
			clickByCss.click();
		}
		
		public static void clickElementByXpath(String elementXpath) {
			WebElement clickByXpath = waits.until
					(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(elementXpath))));
			clickByXpath.click();
		}
		public static void submitElementByXpath(String elementXpath) {
			WebElement submitByXpath = waits.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(elementXpath))));
			submitByXpath.submit();
		}
		
		public static void sendElementByXpath(String elementXpath, String key) {
			WebElement sendByXpath = waits.until
					(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elementXpath))));
			sendByXpath.sendKeys(key);
		}
		public static void sendElementByCss(String elementCss, String key) {
			WebElement sendByCss = waits.until
					(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(elementCss))));
			sendByCss.sendKeys(key);
		}
		
//		public void scrollDownToElement(WebElement locator) {
//			Point el = locator.getLocation();
//			int x = el.getX();
//			int y = el.getY();
//			JavascriptExecutor js = (JavascriptExecutor) driver.get();
//			js.executeScript("window.scrollTo(" + x + "," + y + ")");
//
//		}
		
//		public void scrollToElement(By locator) {
//
//			waitForElementToBecomeVisible(locator, waits);
//			WebElement el = driver.get().findElement(locator);
//			JavascriptExecutor js = (JavascriptExecutor) driver.get();
//			js.executeScript("arguments[0].scrollIntoView();", el);
//
//		}
		
		
//		public static String getTextByXpath( String elementXpath) {
//			WebElement getNameByXpath = waits.until
//					(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(elementXpath))));
//			return getNameByXpath.getText();
//		
//		}
}
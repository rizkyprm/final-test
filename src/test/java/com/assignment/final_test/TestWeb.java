package com.assignment.final_test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.assignment.baseui.BaseTesting;
import com.assignment.page_object.BeforeLoginPages;
import com.assignment.page_object.FirstPages;
import com.assignment.page_object.HomePages;
import com.assignment.page_object.LandingPages;
import com.assignment.page_object.SignInPages;
import com.assignment.utility.BrowsAction;



public class TestWeb extends BaseTesting{
	
	@Test
	public void LoginTest() throws InterruptedException {
		String email = "jogidemo321@gmail.com";
		String pass = "builder123";
		String nameProject = "automation12312";
//		String price = "₹3,68,851.00";
	
		BrowsAction.clickElementByXpath(BeforeLoginPages.buildNowXpath);
		
		BrowsAction.clickElementByCss(FirstPages.signInButtonByCss);
//		BrowsAction.clickElementByXpath(FirstPages.popupSignInByXpath);
		BrowsAction.sendElementByXpath(SignInPages.emailByXpath, email);
		Thread.sleep(3000);
		BrowsAction.sendElementByXpath(SignInPages.passByXpath, pass);
		Thread.sleep(3000);
		BrowsAction.clickElementByXpath(SignInPages.logButtonXpath);
		
		Thread.sleep(5000);
		BrowsAction.clickElementByXpath(HomePages.mobileAppsXpath);
		Thread.sleep(5000);
		BrowsAction.clickElementByXpath(HomePages.uberByXpats);
		BrowsAction.clickElementByXpath(HomePages.getStartedXpath);
		BrowsAction.clickElementByXpath(HomePages.skipXpath);
		BrowsAction.clickElementByXpath(HomePages.planDeliveryXpath);
		BrowsAction.clickElementByXpath(HomePages.doneButtonXpath);
		
		BrowsAction.sendElementByXpath(HomePages.fieldNameProjectXpath, nameProject);
		BrowsAction.clickElementByCss(HomePages.saveNameProjectCss);
		BrowsAction.clickElementByCss(HomePages.beforeDashboardCss);
		BrowsAction.clickElementByCss(HomePages.myDashboardCss);
		BrowsAction.clickElementByXpath(HomePages.optionXpath);
		BrowsAction.clickElementByXpath(HomePages.deleteMenuXpath);
		BrowsAction.clickElementByCss(HomePages.deleteButtonCss);
		
		
//		String actualPrice = BrowsAction.getTextByXpath(LandingPages.priceXpath);
//		Assert.assertEquals(actualPrice, price);
		
	}
}

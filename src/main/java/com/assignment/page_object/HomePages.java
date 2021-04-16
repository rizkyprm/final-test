package com.assignment.page_object;

public class HomePages {
	public static String mobileAppsXpath = "//div[@class='productTypeRow']//h3[contains(text(),'Mobile Apps')]";
	public static String mobileAppsXpats = "//h3[contains(text(),'Mobile Apps')]";
	public static String mobileAppsCss = "body app[class='eiApp'] div[id='app-component'] div[class='wrapper'] div[class='middlePart'] main home div[class='newHomeSection'] div[id='home-container'] div[class='displaySection'] app-product-type div[class='productTypeSection'] div[class='productTypeRow'] drag-scroll div[class='drag-scroll-content'] div:nth-child(1)";
	public static String mobileAPPXPATH = "//div[@id='home-container']/div/app-product-type/div/div[2]/drag-scroll/div/div";
	
	
	public static String uberByXpath = "//div[@class='tickBox']//parent::div[@class='appListBox']//preceding-sibling::h3[text()='Uber']";
	public static String uberByXpats = "//h3[contains(text(),'Uber')]";
	public static String uberByXpatss =	"//div[@class='appListBox active']//div[@class='tickBox']";
	public static String uberByCss = "div[class='appListBox active'] div[class='tickBox']";
	
	public static String getStartedXpath= "//div[contains(text(),'Get Started')]";
	
	public static String skipXpath = "//div[@class='totorialBox step6 active']//div[@class='totorialClose']";
	public static String skipXpats = "//div[contains(text(),'tutorialClose')]";
	public static String skipXpatss= "//div[@class='totorialClose']";
	
	public static String skipCss = "div[class='totorialBox step6 active'] div[class='totorialClose']";

	
	public static String planDeliveryXpath = "//button[normalize-space()='Plan Delivery']";
	public static String doneButtonXpath = "//button[normalize-space()='Done']";
	public static String fieldNameProjectXpath = "//input[@placeholder='eg. Booking.com']";
	public static String saveNameProjectCss = "div[class='popHolder buildcardname'] button[type='button']";
	public static String beforeDashboardCss = "div[class='userPanel ng-star-inserted'] h3 strong";
	public static String myDashboardCss = "li[class='mydashBoard ng-star-inserted'] span";
	public static String optionXpath = "//body[1]/app[1]/div[1]/div[1]/div[2]/main[1]/app-dashboard[1]/div[1]/div[2]/div[1]/app-dashboard-main[1]/div[1]/div[1]/div[3]/app-completed-cards[1]/div[2]/div[1]/div[1]/div[2]/div[1]/em[1]";
	public static String deleteMenuXpath = "//body//app[@class='eiApp']//div[@class='ng-star-inserted']//div[@class='ng-star-inserted']//div[1]//div[1]//div[2]//div[1]//div[1]//ul[1]//li[5]";
	public static String deleteButtonCss = "div[class='popHolder confirmPopup'] button[class='doneButton']";
}

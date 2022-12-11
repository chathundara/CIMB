package com.cimb.base;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.cimb.pageclasses.*;
import com.cimb.utilities.Constants;

public class BaseTest {
	public WebDriver driver;
	protected String baseURL;
	public String browser;

	protected DealsPage deals;
	protected TravelAndLifestylePage tavelAndLifestyle;
	protected TgvPage tgv;
	protected HomePage home;
	protected ToolsPage tools;
	protected MainMenuPage menu;
	protected EduCalStandardPage eduCalStandard;

	private static final Logger log = LogManager.getLogger(BaseTest.class.getName());

	@BeforeClass(alwaysRun = true)
 
    public void commonSetUp() {
    	browser=Constants.DEFAULT_BROWSER;
        driver = WebDriverFactory.getInstance().getDriver(browser);
        
//        baseURL = Constants.BASE_URL;
//        driver.get(baseURL);
//        log.info("Opened URL: " + baseURL);
//        
// 
//     home = new HomePage(driver);
        
        
        
        
        
    }

	@BeforeMethod(alwaysRun = true)
	public void methodSetUp() {
		CheckPoint.clearHashMap();

	}

	@AfterClass(alwaysRun = true)
	public void commonTearDown() {
		WebDriverFactory.getInstance().quitDriver();

	}
}
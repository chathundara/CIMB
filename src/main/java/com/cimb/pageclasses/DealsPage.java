package com.cimb.pageclasses;

import org.openqa.selenium.WebDriver;

import com.cimb.base.BasePage;

public class DealsPage extends BasePage {

	public DealsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;

	private String TRAVEL_AND_LIFESTYLE_LINK = "xpath=>//p[text()='TRAVEL & LIFESTYLE']";

	private String TRAVEL_AND_LIFESTYLE_VIEW_ALL_LINK = "xpath=>(//div[contains(text(),'View All')])[3]";
	private String SELECT_COUNTRY_MALAYSIA = "xpath=>//p[text()='Malaysia']";

	public void selectCountryMalaysia() {

		elementClick(waitForElementToBeClickable(SELECT_COUNTRY_MALAYSIA, 5), "Malaysia");

	}

	public void clickOnTravelAndLifestyleLink() {

		elementClick(TRAVEL_AND_LIFESTYLE_LINK, "Travel and lifestyle");

	}

	public TravelAndLifestylePage clickOnTravelAndLifestyViewAllleLink() {

		elementClick(waitForElementToBeClickable(TRAVEL_AND_LIFESTYLE_VIEW_ALL_LINK, 5),
				"Travel and lifestyle View all");

		return new TravelAndLifestylePage(driver);

	}

}

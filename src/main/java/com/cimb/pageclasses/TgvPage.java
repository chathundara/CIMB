package com.cimb.pageclasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cimb.base.BasePage;
import com.cimb.utilities.Util;

public class TgvPage extends BasePage {

	public TgvPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;

	private String HIGHLIGHTS_LABEL = "xpath=>//a[contains(text(),'Highlights')]";
	private String LOCATIONS_LABEL = "xpath=>//a[contains(text(),'Locations')]";
	private String TERMS_AND_CONDITIONS_LABEL = "xpath=>//a[contains(text(),' Terms & conditions')]";
	private String SIMILAR_DEALS_LABEL = "xpath=>//p[contains(text(),'Similar Deals')]";
	private String SIMILAR_DEALS_LIST = "xpath=>//deal-item";

	public boolean checkHighlights() {

		return isDisplayed(waitForElement(HIGHLIGHTS_LABEL, 5), "Highlights label");

	}

	public boolean checkLocations() {
		return isDisplayed(LOCATIONS_LABEL, "Locations label");

	}

	public boolean checkTermsAndConditions() {
		return isDisplayed(TERMS_AND_CONDITIONS_LABEL, "Terms and conditions label");

	}

	public boolean checkSimilarDealsLabel() {
		return isDisplayed(SIMILAR_DEALS_LABEL, "Similar deals label");

	}

	public boolean checkSimilarDealsCount() {

		List<WebElement> list = getElementList(SIMILAR_DEALS_LIST, "Similar deals count");
		// System.out.println(list.size());
		return Util.verifyListNotEmpty(list);

	}

}

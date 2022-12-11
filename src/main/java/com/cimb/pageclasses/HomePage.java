package com.cimb.pageclasses;


import org.openqa.selenium.WebDriver;

import com.cimb.base.BasePage;
import com.cimb.utilities.Util;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;
	private String POPUP_CLOSE_BUTTON = "xpath=>//dialog//*[local-name()='svg']";
	private String CIMB_DEALS_LINK = "xpath=>//a[text()='CIMB Deals' and @target='_blank']";

	private String MENU_BUTTON = "xpath=>//div//*[local-name()='svg'][2]";

	public void popupClose() {
		Util.sleep(2000);
		if (isDisplayed(POPUP_CLOSE_BUTTON, "Popup close")) {
			elementClick(POPUP_CLOSE_BUTTON, "Popup close");

		}

	}

	public DealsPage clckOnCimbDealsLink() {

		waitForElementToBeClickable(CIMB_DEALS_LINK, 5);
		elementClickNewWindow(CIMB_DEALS_LINK, 5, "Deals link");

		return new DealsPage(driver);

	}

	public MainMenuPage clckOnMenuButton() {

		waitForElementToBeClickable(MENU_BUTTON, 5);
		elementJsClick(MENU_BUTTON, "Menu button", 5);

		return new MainMenuPage(driver);

	}

}

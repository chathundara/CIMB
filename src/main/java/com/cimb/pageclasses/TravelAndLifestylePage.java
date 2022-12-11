package com.cimb.pageclasses;

import org.openqa.selenium.WebDriver;

import com.cimb.base.BasePage;

public class TravelAndLifestylePage extends BasePage {

	public TravelAndLifestylePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;

	private String TGV_CINEMA_LINK = "xpath=>//p[contains(text(),'TGV')]";

	public TgvPage clickOnTgvCinema() {

		elementJsClick(TGV_CINEMA_LINK, TGV_CINEMA_LINK, 5);
		return new TgvPage(driver);
	}

}

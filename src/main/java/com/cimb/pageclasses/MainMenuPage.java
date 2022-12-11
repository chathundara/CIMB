package com.cimb.pageclasses;

import org.openqa.selenium.WebDriver;

import com.cimb.base.BasePage;

public class MainMenuPage extends BasePage {
	

	public MainMenuPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	
	public WebDriver driver;
	
	private String TOOLS_LINK = "xpath=>//a[contains(text(),'Tools')]";
	
	public ToolsPage clickOnTools() {
		
		elementJsClick(TOOLS_LINK, "tools link", 2);
		
		return new ToolsPage(driver);
	}
	
	
}

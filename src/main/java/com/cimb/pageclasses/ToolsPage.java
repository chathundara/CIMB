package com.cimb.pageclasses;

import org.openqa.selenium.WebDriver;

import com.cimb.base.BasePage;

public class ToolsPage extends BasePage {

	public ToolsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;

	private String EDU_LOAN_CAL_STAND_REP_BUTTON = "xpath=>//h3[contains(text(),'EDUCATION LOAN CALCULATOR (STANDARD REPAYMENT)')]";

	public EduCalStandardPage selectEduLoanCalStanderd() {

		elementClickNewWindow(EDU_LOAN_CAL_STAND_REP_BUTTON, 5, "Standard Repayment");
		return new EduCalStandardPage(driver);
	}

}

package com.cimb.testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cimb.base.BaseTest;
import com.cimb.base.CheckPoint;
import com.cimb.pageclasses.HomePage;
import com.cimb.utilities.Constants;
import com.cimb.utilities.Util;

public class TgvTests extends BaseTest {

	@BeforeClass(dependsOnMethods = { "commonSetUp" })
	public void setUp() {

		baseURL = Constants.MY_BASE_URL;
		driver.get(baseURL);
		home = new HomePage(driver);
		home.popupClose();
		deals = home.clckOnCimbDealsLink();
		deals.selectCountryMalaysia();
		deals.clickOnTravelAndLifestyleLink();
		tavelAndLifestyle = deals.clickOnTravelAndLifestyViewAllleLink();
		tgv = tavelAndLifestyle.clickOnTgvCinema();

	}

	@Test(enabled = true, priority = 0, groups = {
			"regression" }, description = "TC01: Verify that user can view the details on the TGV Cinema deal and beneath it other similar deals list")
	public void verifyTgvDeals() {

		boolean result1 = tgv.checkHighlights();
		boolean result2 = tgv.checkLocations();
		boolean result3 = tgv.checkTermsAndConditions();
		boolean result4 = tgv.checkSimilarDealsLabel();
		boolean result5 = tgv.checkSimilarDealsCount();

		CheckPoint.mark("TC01.1", result1, "Highlights label");
		CheckPoint.mark("TC01.2", result2, "Locations label");
		CheckPoint.mark("TC01.3", result3, "Terms and conditions label");
		CheckPoint.mark("TC01.4", result4, "Similar deals label");
		CheckPoint.markFinal("TC01.5", result5, "Similar deals count");

	}

}

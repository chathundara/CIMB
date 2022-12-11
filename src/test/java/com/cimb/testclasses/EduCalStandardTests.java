package com.cimb.testclasses;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.cimb.base.BaseTest;
import com.cimb.base.CheckPoint;
import com.cimb.pageclasses.HomePage;
import com.cimb.utilities.Constants;

public class EduCalStandardTests extends BaseTest {

	@BeforeClass(dependsOnMethods = { "commonSetUp" })
	public void setUp() {

		baseURL = Constants.SG_BASE_URL;
		driver.get(baseURL);
		home = new HomePage(driver);
		home.popupClose();
		menu = home.clckOnMenuButton();
		tools = menu.clickOnTools();
		eduCalStandard = tools.selectEduLoanCalStanderd();

	}

	@Test(enabled = true, priority = 1, groups = {
			"regression" }, description = "TC02: Verify whether user can navigate to the standard education loan calculator and data entered are generate correct output")
	public void verifyStandardEducationLoanCalculator() {

		eduCalStandard.enterLoanAmount("5000");
		eduCalStandard.enterLoanTenure("5");

		boolean result1 = eduCalStandard.getMonthlyInstallment("94");
		boolean result2 = eduCalStandard.getInterestRate("4.78");
		boolean result3 = eduCalStandard.getTotalInterestCharged("631");
		boolean result4 = eduCalStandard.getTotalPaymentAmount("5,631");
		boolean result5 = eduCalStandard.tableIsThere();

		CheckPoint.mark("TC02.1", result1, "Installment");
		CheckPoint.mark("TC02.2", result2, "Interest rate");
		CheckPoint.mark("TC02.3", result3, "Total interest");
		CheckPoint.markFinal("TC02.4", result4, "Payment amount total");
		CheckPoint.markFinal("TC01.5", result5, "Payment table");

	}

}

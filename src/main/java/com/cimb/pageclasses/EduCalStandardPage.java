package com.cimb.pageclasses;

import org.openqa.selenium.WebDriver;

import com.cimb.base.BasePage;
import com.cimb.utilities.Util;

public class EduCalStandardPage extends BasePage {

	public EduCalStandardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public WebDriver driver;

	private String LOAN_AMOUNT_INPUT = "xpath=>(//input)[1]";
	private String LOAN_TENURE_INPUT = "xpath=>(//input)[2]";

	private String INSTALLMENT_VALUE = "xpath=>//span[text()='Monthly Instalment']/following-sibling::h3/span[2]";
	private String INTEREST_RATE = "xpath=>//span[text()='Interest Rate']/following-sibling::h3/span[1]";
	private String INTEREST_CHARGED = "xpath=>//span[text()='Total Interest Charged']/following-sibling::h3/span[2]";
	private String TOTAL_PAYMENT = "xpath=>//span[text()='Total Payment Amount']/following-sibling::h3/span[2]";
	private String REPAYMENT_TABLE = "xpath=>//div[@data-component='table']";

	public void enterLoanAmount(String amount) {

		sendData(LOAN_AMOUNT_INPUT, amount, "Loan amount");

	}

	public void enterLoanTenure(String tenure) {
		sendData(LOAN_TENURE_INPUT, tenure, "Loan tenure");

		Util.sleep(5000);
	}

	public boolean getMonthlyInstallment(String val) {

		return Util.verifyTextMatch(getText(INSTALLMENT_VALUE, "Installment"), val);

	}

	public boolean getInterestRate(String val) {
		return Util.verifyTextMatch(getText(INTEREST_RATE, "Interest rate"), val);

	}

	public boolean getTotalInterestCharged(String val) {
		return Util.verifyTextMatch(getText(INTEREST_CHARGED, "total interest"), val);

	}

	public boolean getTotalPaymentAmount(String val) {
		return Util.verifyTextMatch(getText(TOTAL_PAYMENT, "Payment amount total"), val);

	}

	public boolean tableIsThere() {

		return isDisplayed(REPAYMENT_TABLE, "Payment table");

	}

}

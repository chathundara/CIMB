package com.cimb.utilities;

public class Constants {
							/*---Base Setup--- */
   
	public static final String MY_BASE_URL = "https://www.cimb.com.my/en/personal/home.html";
	public static final String SG_BASE_URL = "https://www.cimb.com.sg/en/personal/home.html";
	public static final String DEFAULT_BROWSER = "chrome";
    public static final String USER_DIRECTORY = System.getProperty("user.dir");
    public static final String OS_NAME = System.getProperty("os.name");
    public static final String DRIVERS_DIRECTORY = "//drivers//";
     
    
    						/*---Chrome Browser & Drivers--- */
    
    public static final String CHROME = "chrome";
    public static final String CHROME_DRIVER_VALUE = "chromedriver";
    public static final String CHROME_DRIVER_KEY = "webdriver.chrome.driver";
				
    						/*---Excel & Reports--- */
    public static final String EXCEL_FILE = USER_DIRECTORY + "//testdata//TestData.xlsx";
    public static final String REPORTS_DIRECTORY = USER_DIRECTORY + "//reports//";
    
    						/*---Other Browsers & Drivers--- */
    public static final String FIREFOX = "firefox";
    public static final String IE = "ie";
    public static final String EDGE = "edge";
    public static final String GECKO_DRIVER_KEY = "webdriver.gecko.driver";  
    public static final String IE_DRIVER_KEY = "webdriver.ie.driver";
    public static final String GECKO_DRIVER_VALUE = "geckodriver";   
    public static final String IE_DRIVER_VALUE = "IEDriverServer";
}

package com.cimb.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



import java.io.File;

public class ExtentManager {
	
    private static final Logger log = LogManager.getLogger(ExtentManager.class.getName());
    private static ExtentReports extent;
 

    public static ExtentReports getInstance() {
        if (extent == null) {
            createInstance();
        }
        return extent;
    }

    public static synchronized ExtentReports createInstance() {
        String fileName = Util.getReportName();
        String reportsDirectory = Constants.REPORTS_DIRECTORY;
        new File(reportsDirectory).mkdirs();
        String path = reportsDirectory + fileName;
        log.info("*********** Report Path ***********");
        log.info(path);
        log.info("*********** Report Path ***********");
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(path);
        htmlReporter.config().setTheme(Theme.DARK);
        htmlReporter.config().setDocumentTitle("Automation Run");
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);
        //added to run through jenkins
        htmlReporter.config().setAutoCreateRelativePathMedia(true);

        extent = new ExtentReports();
        extent.setSystemInfo("Organization", "CIMB");
        extent.setSystemInfo("Author", "dhanushka.c@aeturnum.com");
        String os = Constants.OS_NAME.toLowerCase();
        extent.setSystemInfo("OS", os);
        extent.setSystemInfo("Browser", "Chrome");
        extent.attachReporter(htmlReporter);

        return extent;
    }
    


}


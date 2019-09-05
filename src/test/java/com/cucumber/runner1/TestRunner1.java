package com.cucumber.runner1;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.listener.Reporter;
import com.selenium.baseclass.BaseClass;
import com.selenium.helper.FileDataManager;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.junit.Cucumber;
import org.openqa.selenium.TakesScreenshot;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\selenium\\reports\\ExtentReports", "pretty", 
		"json:src\\test\\resource\\com\\selenium\\CucumberReports\\report.json",
		"junit:src\\test\\resource\\com\\selenium\\CucumberReports\\report.xml",
		"html:src\\test\\resource\\com\\selenium\\CucumberReports\\"},
		features =  "src\\test\\java\\com\\cucumber\\feature1", glue="com.cucumber.stepdefinition1",
		tags= {"@APEndtoEnd"}, dryRun= false, strict=true, monochrome=true)


public class TestRunner1 extends BaseClass {
	public static WebDriver driver;
	@BeforeClass
	public static void SetupIntialisation() throws Throwable {
		String browsername = FileDataManager.fdm.getconfigReader().getBrowserName();
		driver=BaseClass.BrowserLaunch(browsername);	
	}
	
	@AfterClass
	public static void Teardown(Scenario scenario) throws Exception {
		
		if (scenario.isFailed()) {
			File screenshot=screenShotontheWebpage(scenario.getName());
		}
		driverQuit();
		Reporter.loadXMLConfig(new File(System.getProperty("user.dir")+"\\src\\test\\resource\\com\\selenium\\properties\\extent-config.xml"));
	}
	
}

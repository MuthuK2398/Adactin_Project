package com.adactin.runner;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import febMaven.febMavenn.BaseClass;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\K MUTHU KUMAR\\eclipse-workspace\\febMavenn\\features\\Adactin.feature", 
					glue ="com.stepdefinition",monochrome = true,
					plugin = {"html:Report",
							"json:adactinreport/cucumber.json",
							"com.cucumber.listener.ExtentCucumberFormatter:adactincumreport/extentreport.html"})

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void Set_Up() {
		driver = BaseClass.browserLaunch("chrome");
	}
	@AfterClass
	public static void tear_Down() {
		driver.close();
	}
}

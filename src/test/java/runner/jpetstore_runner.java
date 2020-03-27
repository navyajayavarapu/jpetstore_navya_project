package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
features = "src\\main\\resources\\feature\\testcase.feature",
plugin = {"pretty", "html:reports/cucumber-html-report","json:reports/cucumber-html-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html"},
tags = {"@tc01_register,@tc02_Login,@tc03_Search,@tc04_addtocart,@tc05_printtable"},
glue = {"stepdefinition"},
monochrome = true
)
public class jpetstore_runner {
	
	@AfterClass
	 public static void extendReport() {
	
	     Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
	     Reporter.setSystemInfo("user", System.getProperty("user.name"));
	     Reporter.setSystemInfo("os", "Windows");
	     Reporter.setTestRunnerOutput("Sample test runner output message");
	}
}



	 




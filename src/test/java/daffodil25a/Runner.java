package daffodil25a;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//feature kaha hai
//stepdefinitions 
@CucumberOptions(features = "src/test/resources", glue = "com.skillio", plugin = {
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" }
	,dryRun = false
)
public class Runner extends AbstractTestNGCucumberTests {

	@DataProvider(parallel = false)
	@Override
	public Object[][] scenarios() {
		// TODO Auto-generated method stub
		return super.scenarios();
	}

}
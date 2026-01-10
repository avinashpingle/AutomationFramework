package daffodil25a;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.skillio.base.DriverManager;
import com.skillio.base.Keyword;
import com.skillio.repo.Locator;
import com.skillio.utils.PropHandler;
import com.skillio.utils.WaitFor;


public class MyTestCases {
	
	WebDriverWait waitFor;
	Keyword keyword = new Keyword();
	@BeforeMethod
	public void setUp() throws Exception {
		
		keyword.openBrowser("Chrome");
		
		DriverManager.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WaitFor.presenceOfElement(By.xpath("//input[@name=\"username\"]"));
		keyword.enterText(Locator.userName, "Admin");
		
		keyword.enterText(Locator.password, "admin123");
		keyword.clickOn(Locator.submitBtn);
		
	}
	@Test
	public void verifyEmployeeNameAppearsWhileCreatingAnUser() throws InterruptedException, IOException {
		Thread.sleep(3000);
		keyword.clickOn(Locator.viewPIMMenu);
		PropHandler prop = new PropHandler();
		String baseDir = System.getProperty("user.dir");
		keyword.clickOn(prop.get("addBtn", baseDir+"/src/main/resources/OR.properties"));
		//keyword.clickOn(Locator.addBtn);
		keyword.enterText(Locator.firstName, "Rushi");
		keyword.enterText(Locator.lastName, "Kapoor");
		keyword.clickOn(Locator.saveBtn);
		keyword.clickOn(Locator.adminMenu);
		keyword.clickOn(Locator.adminAddBtn);
		keyword.enterText(Locator.typeForHints, "Rushi");
		String empName = keyword.getText(Locator.adminTypeOption);
		Assert.assertEquals("Rushi Kapoor", empName);

	}

}
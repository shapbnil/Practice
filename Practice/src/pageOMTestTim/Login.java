package pageOMTestTim;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageOMTim.DashboardPage;
import pageOMTim.LoginPage;

public class Login {

	
	@Test
	public void loginTestPOM() {
		
	
		  //1. Initialize driver
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
	driver.manage().window().maximize();


	
	
	//2. Enter login information (Login Page)
	LoginPage loginPage = new LoginPage(driver);
	loginPage.setUserName("tim@testemail.com");
	loginPage.setPassword("trpass");
	loginPage.clickLogin();
	
	
	//3. Get Confirmation (Dashboard Page)
	DashboardPage dashboardPage = new DashboardPage(driver);
	String conf = dashboardPage.confirmationMessage();
	String title = dashboardPage.title();
	
	//Assertions
	Assert.assertTrue(conf.contains("success"));
	Assert.assertTrue(title.contains("Account"));
	
	//5. Close the Driver
	driver.quit();
	
	
	
	}
}

package pageOMTestTim;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import pageOMTim.LoginPageFactory;

@Test
public class LoginFactory {

	String username = "tim@testemail.com";
	String password = "trpass";
	
	
	public void loginTestPageFactory() {
		  
		//1. Initialize driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://sdettraining.com/trguitransactions/AccountManagement.aspx");
		driver.manage().window().maximize();
		
		
		//2. Enter login
		LoginPageFactory loginPage = new LoginPageFactory(driver);
		loginPage.loging(username, password);
		
		
		
		//Close Browser
		
	
			driver.close();
		
		
	}
	
}

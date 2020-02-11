package pageOMTim;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	
	//Define web elements at class level
	WebDriver driver;

	@FindBy(id="MainContent_txtUserName")
	WebElement usernameBox;
	
	@FindBy(id="MainContent_txtPassword")
	WebElement passwordBox;
	
	@FindBy(id="MainContent_btnLogin")
	WebElement LoginButton;
	
	
	//Steps
	public void setUserName(String username) {
		usernameBox.sendKeys(username);
	}
	
	public void setPassword(String password) {
		passwordBox.sendKeys(password);
	}
	
	
	public void clickLogin() {
		LoginButton.click();
		
	}
	
	//Actions 
	public void loging(String username, String password) {
		setUserName(username);
		setPassword(password);
		clickLogin();
		
	}
	
	// Constructor initializes the state of the driver
	public LoginPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

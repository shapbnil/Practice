package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
	
		// open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shapbnil\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

		// Give the count of link on this page
		System.out.println(driver.findElements(By.tagName("a")).size());

		//count of footer link on the page
		WebElement footerdriver=driver.findElement(By.className("fbar"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		Thread.sleep(2000);
		driver.close();
	}

}

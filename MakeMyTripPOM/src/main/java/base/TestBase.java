package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	WebDriver driver;
	String username;
	String password;
	String url= "https://www.amazon.in/";


	void loginAdmin()
	{
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.id("ap_email")).sendKeys("test@test.com");
	// login code
	}
	void loginReadOnlyUser()
	{
	driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.id("ap_email")).sendKeys("test@test.com");
	// login code
	}

	void logout() {
	driver.close();
	// logout code
	}

	void launchUrl()
	{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);

	}
	}
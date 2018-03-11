package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver ;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//------------Elements Locators----------------
	By userID =By.xpath("//input[@id='txt_userName']");
	By password =By.xpath("//input[@id='txt_password']");
	By login =By.xpath("//input[@id='btn_Login']");
	
	//------------Methods Performing operations on Elements----------------
	public LoginPage() {
		// TODO Auto-generated constructor stub
	
	}
	public void userEmail(String user_id)
	{	
		driver.findElement(By.id("userID")).sendKeys(user_id);
	}
	public void userPassword(String userPass)
	{
		driver.findElement(this.password).sendKeys(userPass);
	}
	public void loginButton()
	{
		driver.findElement(this.login).click();
	}
	
}

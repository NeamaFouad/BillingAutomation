package src.Pages;

/*Design & Naming classes:
 *- As discussed, we will follow the POM design pattern which states that,
 *The page logic is separated from the implementation (For Every Page).
 *- For the simplicity of future changes, we will name the Logic class as 
 *pagename_Logic & the implementation (tests) class as pagename_Test Ex:
 *for the Login Page we will have 2 classes (Login_Logic & Login_Tests) or 
 *(LoginPage_Logic & LoginPage_Tests) but we need to select one naming convention 
 *and follow it along side the rest of the project to work in a standard method
 */
/* Methods & Locators:
 *- Locators are created at the start of the Logic class.
 *- We don't need to add method for every element,
 * but rather locate all the elements at the start of the class
 * then us them inside the methods whenever needed
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver ;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//------------Elements Locators----------------
	
	/*We need to decide whether we will use "By" or 
	*"WebElement" as this will affect the way we are using them later
	*Check the below change on the userID as a webelement
	*personally, I prefer to use the web element method as it removes the biggest
	*chatty (el ra3'y :)) part at a separate area away from the methods logic 
	*/
	By userID =By.xpath("//input[@id='txt_userName']");
	WebElement userIDEle = driver.findElement(By.xpath("//input[@id='txt_userName']"));
	By password =By.xpath("//input[@id='txt_password']");
	By login =By.xpath("//input[@id='btn_Login']");
	
	//------------Methods Performing operations on Elements----------------
	public LoginPage() {
		/*we need to remove this constructor method as 
		 * we already added one before the locators
		 */
		// TODO Auto-generated constructor stub	
	}
	public void userEmail(String user_id)
	{	
				driver.findElement(By.id("userID")).sendKeys(user_id);
		/*The previous line is not right as the By is defined before
		 * it needs to be rewritten as 
		 */
		 driver.findElement(userID).sendKeys(user_id);
		 
		 /*And if we used the "WebElement", it will be 
		  */
		  userIDEle.sendKeys(user_id);
		 
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

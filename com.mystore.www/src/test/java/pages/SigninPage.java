package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage
{
	WebDriver driver;
	
	public SigninPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); //this ==> SigninPage.class
		
	}
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement Emailid;
	
	@FindBy(id = "passwd")
	WebElement Password;
	
	@FindBy(xpath = "//span[text()[normalize-space()='Sign in']]")
	WebElement signInbtn;
		
	
	public void signinemail(String Email)
	{
		Emailid.sendKeys(Email);
	}
	
	public void signinpass(String Pass)
	{
		Password.sendKeys(Pass);
	}
	
	public void signinButton()
	{
		signInbtn.click();
	}
	
	public void Verify_PageTitle()
	{
		System.out.println("Page Title is : " + driver.getTitle());
	}
}

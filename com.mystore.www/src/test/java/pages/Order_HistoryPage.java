package pages;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_HistoryPage
{
	WebDriver driver;
	
	
	public Order_HistoryPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); 	
	}
	
	@FindBy(xpath = "//img[@alt='My Store']")
	WebElement Homepage;
	
	@FindBy(xpath = "//a[@title='View my customer account']//span[1]")
	WebElement Account;
	
	@FindBy(xpath = "//a[@title='Orders']")
	WebElement Orders;
	
	@FindBy(xpath = "//table[@id='order-list']")
	WebElement Order_Table;
		
	
	public void Homepage_Navigation(WebDriver wd)
	{
		Homepage.click();
	}
	
	public void User_Account()
	{
		Account.click();
	}
	
	public void ClickOn_Order_Details()
	{
		Orders.click();
	}
	
	public void Order_History()
	{
		
	}
}

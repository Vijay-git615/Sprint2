package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage
{
	WebDriver driver;

	public WishlistPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); 	
	}
	
	@FindBy(xpath = "//img[@alt='My Store']")
	WebElement Homepage;
	
	@FindBy(xpath = "//span[text()='More']")
	WebElement Product;
	
	@FindBy(id = "wishlist_button")
	WebElement Wishlist;
	
	@FindBy(xpath = "//p[text()='Added to your wishlist.']")
	WebElement Wishlist_message;
		
	
	public void Homepage_Navigation(WebDriver wd)
	{
		Homepage.click();
	}
	
	public void Choose_product()
	{
		Product.click();
	}
	
	public void AddTo_Wishlist()
	{
		Wishlist.click();
	}
	
	public void Success_Message()
	{
		String Wishlist_msg = Wishlist_message.getText();
		System.out.println(" Message after adding item to wishlist : " + Wishlist_msg);
	}
}

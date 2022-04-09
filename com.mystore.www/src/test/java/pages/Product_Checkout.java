package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Checkout
{
	WebDriver driver;
	Product_Checkout pc;
	
	public Product_Checkout(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); //this ==> Product_Checkout.class		
	}
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	WebElement tshirts;
	
	@FindBy(xpath = "//input[@id='layered_id_attribute_group_2']")
	WebElement selectsize; 
	
	@FindBy(xpath = "//img[@itemprop='image']")
	WebElement hover;
	
	@FindBy(xpath = "//a[@title = 'Add to cart']")
	WebElement addcart;
	
	@FindBy(xpath = "//a[@title = 'Proceed to checkout']")
	WebElement checkout;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	WebElement proceedcheckout;
	
	@FindBy(xpath = "//button[@name = 'processAddress']")
	WebElement processaddress;
	
	@FindBy(xpath ="//input[@id='cgv']")
	WebElement termsbutton;
	
	@FindBy(xpath = "//button[@name = 'processCarrier']")
	WebElement processcarrier;
	
	@FindBy(xpath = "//a[@title = 'Pay by bank wire']")
	WebElement paybybankwire;
	
	@FindBy(xpath = "//button[@class = 'button btn btn-default button-medium']")
	WebElement confirmorder;
	
	
	public void clickTshirts(WebDriver wd)
	{
		tshirts.click();
	}
	
	public void selectSize()
	{
		selectsize.click();
	}
	
	public void hoveronItem()
	{
		Actions action = new Actions(driver);
		action.moveToElement(hover).perform();
	}
	
	public void addToCart()
	{
		addcart.click();
	}
	
	public void checkout()
	{
		checkout.click();
	}
	
	public void proceedCheckout()
	{
		proceedcheckout.click();
	}
	
	public void processAddress()
	{
		processaddress.click();
	}
	
	public void terms_checkbox()
	{
		termsbutton.click();
	}
	
	public void process_Carrier()
	{
		processcarrier.click();
	}
	
	public void payment_method()
	{
		paybybankwire.click();
	}
	
	public void confirm_Order()
	{
		confirmorder.click();
	}
}

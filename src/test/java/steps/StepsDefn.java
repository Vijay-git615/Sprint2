package steps;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Order_HistoryPage;
import pages.Product_Checkout;
import pages.SigninPage;
import pages.WishlistPage;

public class StepsDefn
{
	WebDriver driver;
	SigninPage sp;
	Product_Checkout pc;
	Order_HistoryPage ohp;
	WishlistPage wp;
		
	
	
	@Given("User launch the chrome browser")
	public void launch_chrome_browser()
	{		
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    sp = new SigninPage(driver);
	    pc = new Product_Checkout(driver);
	    ohp = new Order_HistoryPage(driver);
	    wp = new WishlistPage(driver);
	}

	@When("User navigates to the URL {string}")
	public void Navigate_To_URL(String url)
	{
	   driver.get(url);
	}

	@When("User Enters EmailAddress as {string} and Password as {string}")
	public void Enter_Credentials(String email, String pass)
	{
	    sp.signinemail(email);
	    sp.signinpass(pass);
	}

	@When("Click on Signin button")
	public void click_on_Signin_button()
	{
	   sp.signinButton();
	}
	
	@Then("Page title should be {string}")
	public void Verify_Title(String ExpectedTitle)
	{		
		String actualvalue = driver.getTitle();
		System.out.println("***************************************************");
			   
		System.out.println("Page Title as : " +  ExpectedTitle );
	}
	
	@Given("Click on Tshirts Category")
	public void click_on_Tshirts_Category()
	{
		   pc.clickTshirts(driver);
		   pc.selectSize();
	}

	@Given("Click on Add to Cart button")
	public void click_on_Add_to_Cart_button()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		/*Actions action = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("//img[@itemprop='image']"));
		action.moveToElement(hover).perform(); 
		//Thread.sleep(10000);  */
		pc.hoveronItem();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    pc.addToCart();
	}
		

	@When("Click on Proceed to Checkout button")
	public void click_on_Proceed_to_Checkout_button() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	    pc.checkout();	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    pc.proceedCheckout();	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    pc.processAddress();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	    pc.terms_checkbox();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    pc.process_Carrier();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    pc.payment_method();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    pc.confirm_Order();
	}
	
	@Given("Navigate to HomePage")
	public void navigate_to_HomePage()
	{
		ohp.Homepage_Navigation(driver);
	}

	@Given("Click on User_Account")
	public void click_on_User_Account()
	{
	    ohp.User_Account();
	}

	@Given("Click on Order History and Details")
	public void click_on_Order_History_and_Details()
	{
	    ohp.ClickOn_Order_Details();
	}

	@Given("Click on any Product")
	public void click_on_any_Product()
	{
		pc.hoveronItem();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		wp.Choose_product();
	}

	@Given("Click on Add to wishlist button")
	public void click_on_Add_to_wishlist_button()
	{
	    wp.AddTo_Wishlist();
	}
	
	@Then("Success message will display as {string}")
	public void success_message_will_display_as(String string)
	{
	   wp.Success_Message();
	}
}

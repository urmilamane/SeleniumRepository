package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	WebDriver driver;
 
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a/svg/path")
	WebElement lbl_cart;
	
	public void isCartDisplayed()
	{
		lbl_cart.isDisplayed();
	}
	public HomePageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}

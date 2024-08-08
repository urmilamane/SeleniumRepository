package BackgroundStepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundStepDefinition {
	 WebDriver driver;
	@Given("User is accessing saucedemo login page")
	public void user_is_accessing_saucedemo_login_page() {
		driver= new ChromeDriver();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	driver.get("https://www.saucedemo.com/v1/");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
	   
	}

	@Then("User should be able to navigate to home page")
	public void user_should_be_able_to_navigate_to_home_page() {
	   
	}

	@When("click on breadcrumb icon")
	public void click_on_breadcrumb_icon() {
	   
	}

	@Then("User should be able to see the menu items")
	public void user_should_be_able_to_see_the_menu_items() {
	  
	}

	@When("Clicks on Add to button")
	public void clicks_on_add_to_button() {
	  
	}

	@Then("Item should be added to the cart")
	public void item_should_be_added_to_the_cart() {
	   
	}

}

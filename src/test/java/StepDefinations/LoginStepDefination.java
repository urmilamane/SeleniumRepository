package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

//public class LoginStepDefination {
//    WebDriver driver;
//	LoginPage loginPage; 
//	@Given("User is on login page")
//    public void user_is_on_loginpage() {
//    	driver= new ChromeDriver();
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//    	driver.get("https://www.saucedemo.com/v1/");
//    }
//		
//	@When("User enters valid {string} and {string}")
//	public void user_enters_valid_usernameandpassword(String username, String password) {
//		loginPage=new LoginPage(driver);
//		loginPage.enterUserName(username);
//		loginPage.enterPassword(password);
//		
//	}
//	
//	@And("Clicks on Login button")
//	public void clicks_on_loginbutton() {
//		loginPage.clickLogin();
//	}
//	
//	@Then("User is navigated to home page")
//	public void user_is_navigated_to_homepage() {
//		//Assert.assertTrue(driver.findElements(By.xpath("//div[contains(text(),'Products')]")).size()>0);
//		loginPage.logoDisplayed();
//	}
//	
//	@And("Close the browser")
//	public void close_browser() {
//		driver.close();
//	}
//	
//}

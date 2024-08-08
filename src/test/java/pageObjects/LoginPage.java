package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
By txt_user=By.id("user-name");
By txt_password= By.id("password");
By btn_login= By.id("login-button");
By label_logo=By.xpath("//div[@class='app_logo']");

public LoginPage(WebDriver driver){
	this.driver=driver;
}

public void enterUserName(String username) {
	driver.findElement(txt_user).sendKeys(username);
}
public void enterPassword(String password) {
	driver.findElement(txt_password).sendKeys(password);
}
public void clickLogin() {
	driver.findElement(btn_login).click();
}

//public void loginwithValiduser(String username, String password) {
//	driver.findElement(txt_user).sendKeys(username);
//	driver.findElement(txt_password).sendKeys(password);
//	driver.findElement(btn_login).click();
//
//}

public void logoDisplayed() {
	driver.findElement(label_logo).isDisplayed();
}

}

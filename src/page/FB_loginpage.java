package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FB_loginpage {
	 @FindBy(xpath = "//input[@id='email']")
	 public static WebElement username;
	 @FindBy(xpath = "//input[@id='pass']")
	 public static WebElement Password;
	 @FindBy (xpath = "//button[@name='login']")
	 public static WebElement login;

}

 package execution;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.Setup;
import page.FB_loginpage;

public class Test_execution extends Setup { 
	@BeforeTest
//	 public void browser1() {
//		 System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe"); 
//	 driver=new ChromeDriver();
//	 Reporter.log("url launched successfully");
//	}
	 @Parameters("browser")
	 public void crossbrowser(String browser) {
	 if (browser.equals("chrome")) {
			 
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Qtree_Selenium\\ChromeDriver\\chromedriver-win64\\chromedriver.exe"); 
			 driver=new ChromeDriver();
			 Reporter.log("url launched successfully");
		}
		 else if (browser.equals("Edge")) {
			 System.setProperty("webdriver.chrome.driver","C:\\Qtree_Selenium\\EdgeDriver\\edgedriver_win64 (1)\\msedgedriver.exe");
			 driver=new EdgeDriver();
			 Reporter.log("url launched in edgedriver");
	}
		 
	}
	//@Test(invocationCount = 3)
	 @Test(groups = {"smoke"})
	  public void fblogin() {
		  PageFactory.initElements(driver, FB_loginpage.class);
		  FB_loginpage.username.sendKeys("123456789");
		  FB_loginpage.Password.sendKeys("123456");
		  FB_loginpage.login.click();
		  Reporter.log("login successfully");
		  
	  }

}

package browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class Setup {
	 String url="https://www.facebook.com/";
  public RemoteWebDriver driver=null;
	
  @BeforeClass
  public void beforeClass() {
	  driver.manage().window().maximize();
	  driver.navigate().to(url);
  }

  @AfterClass
  public void afterClass() {
	   driver.close();
  }

}

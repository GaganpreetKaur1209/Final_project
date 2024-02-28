package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class basePage {
	
	public static WebDriver driver;
	
	public basePage(WebDriver driver){
		basePage.driver=driver;
		PageFactory.initElements(driver, this);
	}

}

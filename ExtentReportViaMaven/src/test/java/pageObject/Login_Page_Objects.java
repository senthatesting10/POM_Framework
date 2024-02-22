package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page_Objects {
	
	@FindBy(id="email")
	public static WebElement UserName;
	
	@FindBy(id="password")
	public static WebElement Password;
	
	@FindBy(xpath="//*[@id=\"submitBTN\"]")
	public static WebElement LoginButton;
	

	
	

}

package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRole_Page_Objects {
	
	@FindBy(xpath="//*[@id=\"fadein\"]/div[3]/div/div/div[2]/ul/li[3]/a")
	public static WebElement MyProfile;
	
	@FindBy(id="First Name")
	public static WebElement checkFirstName;

	

}

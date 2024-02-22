package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import junit.framework.Assert;
import pageObject.Login_Page_Objects;
import pageObject.UserRole_Page_Objects;

public class Test_User_Role extends CommonFunctions{
	
	String actualmessage=null;
		public void login(){
		PageFactory.initElements(driver, Login_Page_Objects.class);
		Login_Page_Objects.UserName.sendKeys(properties.getProperty("username"));
		Login_Page_Objects.Password.sendKeys(properties.getProperty("password"));
		Login_Page_Objects.LoginButton.click();
		}
		
		public void getFirstName(){
		PageFactory.initElements(driver,UserRole_Page_Objects.class);
		UserRole_Page_Objects.MyProfile.click();
		actualmessage = UserRole_Page_Objects.checkFirstName.getText();
		}
		
		@Test
		public void verifyMyProfile(){
			login();
			getFirstName();
			Assert.assertEquals(actualmessage, "First Name");
			
		}
}
package commonFunctions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonFunctions {

	public static WebDriver driver = null;
	public static Properties properties = null;


	public Properties loadPropertyFile() throws IOException {

		FileInputStream fileInputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileInputstream);
		return properties;
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");
		String driverLocation = properties.getProperty("driverLocation");

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",driverLocation);
			driver = new ChromeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",driverLocation);
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@AfterSuite
	public void closeBrowser() {
		//driver.quit();
	}
}
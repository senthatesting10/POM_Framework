package amazon.pratice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Home {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\sentha\\Desktop\\softwares\\SeleniumStartAgain_2023\\chromedriver-win64\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sentha\\Desktop\\softwares\\SeleniumStartAgain_2023\\chromeDriver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]")).click();
		
		Thread.sleep(4);
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a/div")).click();
		//*[@id="hmenu-content"]/ul[1]/li[8]/a/div
		Thread.sleep(4);
		driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[2]/li[6]/a")).click();
		
		/*
		 * clickmenu("//*[@id=\"hmenu-content\"]/ul[1]/li[8]/a/div"); cl
		 * clickmenu1("//*[@id=\"hmenu-content\"]/ul[2]/li[6]/a");
		 */
		
		//*[@id="hmenu-content"]/ul[1]/li[7]/a/div
	}
	
	public static void clickmenu(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		System.out.println("1");
		
	}

	public static void clickmenu1(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
		System.out.println("2");
	}
}

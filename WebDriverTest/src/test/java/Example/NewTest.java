package Example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		driver.get("http://demo.guru99.com/selenium/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\Spandana\\SPANDU\\Software backup\\chromedriver.exe");
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}}

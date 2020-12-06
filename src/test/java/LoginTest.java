import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	public static WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin() throws InterruptedException
	{
		System.out.println("Executing Login Test");
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("9970814338");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Amol@1988");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(10000);
	}
	
	@AfterTest
	public void QuitBroser()
	{
		if(driver!=null)
		driver.close();
	}
}
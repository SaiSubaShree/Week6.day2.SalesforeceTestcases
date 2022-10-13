package week6.day2.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForceBaseClass {
	public ChromeDriver driver;
	@Parameters({"url", "username", "password"})
	@BeforeMethod
	public  void base(String url,String username,String password) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//ChromeDriver driver= new ChromeDriver();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(3000);
	}
	
	

}

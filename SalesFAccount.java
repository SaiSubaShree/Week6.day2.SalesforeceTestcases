package week6.day2.salesforce.sales;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.salesforce.SalesForceBaseClass;

public class SalesFAccount extends SalesForceBaseClass{
@Test
	public  void Sales() throws InterruptedException {
				// click on app launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(3000);
		//click on sales
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(8000);
		
		//Click on Accounts
		WebElement acc = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click()", acc);
		Thread.sleep(3000);
		
		//Click on new button
		driver.findElement(By.xpath("//div[text()='New']")).click();
		Thread.sleep(3000);
		
		//Enter the account name
		
		WebElement name = driver.findElement(By.xpath("//label[text()='Account Name']/following-sibling::div/input"));
		name.sendKeys("saisuba");
		Thread.sleep(3000);
		
		//enter the ownership
		WebElement owner = driver.findElement(By.xpath("//label[text()='Ownership']/following-sibling::div//div//button"));
		driver.executeScript("arguments[0].click()", owner);
		Thread.sleep(2000);
		WebElement pub = driver.findElement(By.xpath("//span[text()='Public']"));
		driver.executeScript("arguments[0].click()", pub);
		Thread.sleep(2000);
		
		//click on save
		
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
	driver.executeScript("arguments[0].click()", save);
	
	
	
	
	}

}

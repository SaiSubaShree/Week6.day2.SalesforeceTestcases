package week6.day2.salesforce.LegalEntities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.salesforce.SalesForceBaseClass;

public class WithoutMandatoryFeild extends SalesForceBaseClass{
@Test
	public void field() throws InterruptedException {
		
		// click on app launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(7000);
		//click on legal entities
		WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		driver.executeScript("arguments[0].click()",legal);
		Thread.sleep(4000);
		
		//click t he new button
		WebElement newb = driver.findElement(By.xpath("//div[text()='New']"));
		driver.executeScript("arguments[0].click()",newb);
		Thread.sleep(3000);
		
		//enter the details
		//enter the company name
		WebElement Cname = driver.findElement(By.xpath("(//label[@class='label inputLabel uiLabel-left form-element__label uiLabel']/following-sibling::input)[2]"));
		Cname.sendKeys("Testleaf");
		Thread.sleep(1000);
		
			
		//enter the description
		WebElement desc = driver.findElement(By.xpath("(//label[@class='label inputLabel uiLabel-left form-element__label uiLabel'])[3]/following-sibling::textarea"));
		desc.sendKeys("Salesforce");
		Thread.sleep(1000);
		
		//Enter the state
		WebElement state = driver.findElement(By.xpath("//a[text()='--None--']"));
		driver.executeScript("arguments[0].click()",state);
		Thread.sleep(1000);
		
		//enter as active
		WebElement act = driver.findElement(By.xpath("//a[@title='Active']"));
		driver.executeScript("arguments[0].click()",act);
		Thread.sleep(1000);
		
		// click save
		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		driver.executeScript("arguments[0].click()",save);
		Thread.sleep(3000);
		
		
		// get the error msg
		String msg = driver.findElement(By.xpath("//ul[@class='errorsList']")).getText();
		System.out.println("The error msg Displayed is: "+msg);
		

	}

}

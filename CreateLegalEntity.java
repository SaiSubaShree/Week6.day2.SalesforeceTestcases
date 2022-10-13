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

public class CreateLegalEntity extends SalesForceBaseClass {
@Test
	public void CreateLegal() throws InterruptedException {
				// click on app launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(7000);
		//click on legal entities
		WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		driver.executeScript("arguments[0].click()",legal);
		Thread.sleep(6000);
		
		
		// click on the dropdown
		WebElement drop = driver.findElement(By.xpath("(//a[@class='slds-context-bar__label-action dndItem'])[17]/following-sibling::one-app-nav-bar-item-dropdown/div//a"));
		driver.executeScript("arguments[0].click()",drop);
		Thread.sleep(3000);
		
		//Click on new Leagl Entity
		WebElement newL = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
		driver.executeScript("arguments[0].click()",newL);
		Thread.sleep(3000);
		
		// enter the name as Salesforce Automation 
		WebElement name = driver.findElement(By.xpath("//label[@class='label inputLabel uiLabel-left form-element__label uiLabel']/following-sibling::input"));
		name.sendKeys("Salesforce Automation");
		name.sendKeys(Keys.TAB);
		Thread.sleep(8000);
		
		// Click the save
		
		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		driver.executeScript("arguments[0].click()",save);
		
		
		
		
		
		
	}

}

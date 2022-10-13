package week6.day2.salesforce.Dashboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.salesforce.SalesForceBaseClass;

public class CreateNewDashboard extends SalesForceBaseClass {
@Test
	public void  dashboaed() throws InterruptedException {
				// click on app launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(6000);
		
		//click on Dashboards
		WebElement Dash = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		driver.executeScript("arguments[0].click()",Dash);
		Thread.sleep(4000);
		
		
		// click on the new dashboard
		WebElement NDash = driver.findElement(By.xpath("//div[@title='New Dashboard']"));
		driver.executeScript("arguments[0].click()",NDash);
		Thread.sleep(7000);
		
		//'Salesforce Automation
		
		WebElement frame = driver.findElement(By.xpath("//div[@class='dashboardContainer']/iframe"));
		driver.switchTo().frame(frame);
		WebElement name = driver.findElement(By.xpath("//div[@class='slds-form-element__control']/input"));
		Thread.sleep(2000);
		name.sendKeys("Salesforce Automation");
		Thread.sleep(4000);
		
		
		// click save
		WebElement save = driver.findElement(By.xpath("//button[text()='Create']"));
		driver.executeScript("arguments[0].click()",save);
		driver.switchTo().defaultContent();
		
		
	
		
		
		
		
		
	
	
	}

}

package week6.day2.salesforce.Dashboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.salesforce.SalesForceBaseClass;

public class SubscribeDashBoard extends SalesForceBaseClass {
	@Test
	public  void subscribe() throws InterruptedException {
		
		// click on app launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(6000);
		
		//click on Dashboards
		WebElement Dash = driver.findElement(By.xpath("//p[text()='Dashboards']"));
		driver.executeScript("arguments[0].click()",Dash);
		Thread.sleep(4000);
		
		// search in the dashboard
		WebElement dashS = driver.findElement(By.xpath("//lightning-icon[@class='slds-icon-utility-search slds-icon slds-input__icon slds-input__icon_left slds-icon-text-default slds-icon_container']/following-sibling::input"));
		dashS.sendKeys("SalesForce Automation");
		Thread.sleep(4000);
		
		//click on drop down to select delete
		WebElement sel = driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']"));
		driver.executeScript("arguments[0].click()",sel);
		Thread.sleep(4000);
		
		//Click on subscribe
		WebElement del = driver.findElement(By.xpath("//span[text()='Subscribe']"));
		driver.executeScript("arguments[0].click()",del);
		Thread.sleep(2000);
		
		//click on daily
		WebElement daily = driver.findElement(By.xpath("//span[text()='Daily']"));
		driver.executeScript("arguments[0].click()",daily);
		Thread.sleep(2000);
		
		//click on save
		WebElement save = driver.findElement(By.xpath("//span[text()='Save']"));
		driver.executeScript("arguments[0].click()",save);
		Thread.sleep(2000);
		
}
}

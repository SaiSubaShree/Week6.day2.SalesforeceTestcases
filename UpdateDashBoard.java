package week6.day2.salesforce.Dashboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.salesforce.SalesForceBaseClass;

public class UpdateDashBoard extends SalesForceBaseClass{

	@Test
	public void update() throws InterruptedException {
		
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
		
		//click on drop down to select edit
		WebElement sel = driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small']"));
		driver.executeScript("arguments[0].click()",sel);
		Thread.sleep(4000);
		
		//select edit
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(5000);
		
		//click on edit dashboard prop
		WebElement frm = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(frm);
		WebElement dashE = driver.findElement(By.xpath("//button[@title='Edit Dashboard Properties']"));
		driver.executeScript("arguments[0].click()",dashE);
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		
		// enter dashboard description
		WebElement frame = driver.findElement(By.xpath("//iframe[@title='dashboard']"));
		driver.switchTo().frame(frame);
		
		driver.findElement(By.xpath("//input[@id='dashboardNameInput']")).sendKeys("salesforce");
		WebElement dashD = driver.findElement(By.xpath("//input[@id='dashboardDescriptionInput']"));
		dashD.sendKeys("salesforce");
		
		Thread.sleep(2000);
		
		//click on save
		
		WebElement save = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));
		driver.executeScript("arguments[0].click()",save);
		driver.switchTo().defaultContent();
		
	
	
	
	
	
	}
}

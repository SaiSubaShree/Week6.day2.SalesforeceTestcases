package week6.day2.salesforce.Dashboard;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.salesforce.SalesForceBaseClass;

public class SortDashboard extends SalesForceBaseClass{
@Test
	public void sort() throws InterruptedException {
		
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
		
		//get the fisrt text in table
		WebElement Bsort = driver.findElement(By.xpath("//span[text()='Salesforce Automation']"));
		String text = Bsort.getText();
		
		// click on sort
		WebElement sort = driver.findElement(By.xpath("//span[text()='Dashboard Name']"));
		driver.executeScript("arguments[0].click()",sort);
		Thread.sleep(4000);
		
		//verify
		WebElement Asort = driver.findElement(By.xpath("//span[text()='Salesforce Automation']"));
		String text1 = Asort.getText();
		if(text.equals(text1))
		{
			System.out.println("Dashboard  sorted");
		}
		else
		{
			System.out.println("Dashboard not sorted");
		}
			 
		

	}

}

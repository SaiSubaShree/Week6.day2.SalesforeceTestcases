package week6.day2.salesforce.LegalEntities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.salesforce.SalesForceBaseClass;

public class SortLeaglEntity extends SalesForceBaseClass{
@Test
	public void sort() throws InterruptedException {
		
		// click on app launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(7000);
		//click on legal entities
		WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		driver.executeScript("arguments[0].click()",legal);
		Thread.sleep(4000);
		
		//get the first displayed value
		String bsort = driver.findElement(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']/a")).getText();
		System.out.println("Before sort:" +bsort);
		
		//click the sort
		WebElement Sort = driver.findElement(By.xpath("//Span[@title='Last Modified By']"));
		driver.executeScript("arguments[0].click()",Sort);
		Thread.sleep(4000);
		
		// get the first displayed value after sort
		String asort = driver.findElement(By.xpath("//span[@class='slds-grid slds-grid--align-spread forceInlineEditCell']/a")).getText();
		System.out.println("Before sort:" +asort);
		
		if(asort.equals(bsort))
		{
			System.out.println("Date Modified not sorted");
			
		}
		else
		{
			System.out.println("Date Modified  sorted");
		}
		
		
		
}
}

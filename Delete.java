package week6.day2.salesforce.LegalEntities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.salesforce.SalesForceBaseClass;

public class Delete extends SalesForceBaseClass{
@Test
	public void del() throws InterruptedException {
				// click on app launcher
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		Thread.sleep(7000);
		//click on legal entities
		WebElement legal = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		driver.executeScript("arguments[0].click()",legal);
		Thread.sleep(4000);
		
		//enter in the search tab as " salesforce automation
		WebElement search = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
		search.sendKeys("Salesforce Automation");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(2000);

		//to take rowcount

		//WebElement rowcount = driver.findElement(By.xpath("//table[@class='slds-table forceRecordLayout slds-table--header-fixed slds-table--edit slds-table--bordered resizable-cols slds-table--resizable-cols uiVirtualDataTable']/tbody/tr"));

		List<WebElement> Browcount = driver.findElements(By.xpath("//table[@class='slds-table forceRecordLayout slds-table--header-fixed slds-table--edit slds-table--bordered resizable-cols slds-table--resizable-cols uiVirtualDataTable']/tbody/tr"));
		int BrowSize = Browcount.size();
			
		System.out.println("The before rowcount :"+ BrowSize);
		
		//click on the drop down
		WebElement drop = driver.findElement(By.xpath("//div[@class='forceVirtualActionMarker forceVirtualAction']/a"));
		driver.executeScript("arguments[0].click()",drop);
		Thread.sleep(2000);
		
		//click on the delete from dropdown
		driver.findElement(By.xpath("//a[@title='Delete']")).click();
		
		
	// click on delete
		WebElement delete = driver.findElement(By.xpath("//span[text()='Delete']"));
		driver.executeScript("arguments[0].click()",delete);
		Thread.sleep(2000);
		
		
		
		//to take rowcount
		
		//WebElement rowcount = driver.findElement(By.xpath("//table[@class='slds-table forceRecordLayout slds-table--header-fixed slds-table--edit slds-table--bordered resizable-cols slds-table--resizable-cols uiVirtualDataTable']/tbody/tr"));

		List<WebElement> Arowcount = driver.findElements(By.xpath("//table[@class='slds-table forceRecordLayout slds-table--header-fixed slds-table--edit slds-table--bordered resizable-cols slds-table--resizable-cols uiVirtualDataTable']/tbody/tr"));
	int ArowSize = Arowcount.size();
	
System.out.println("The before rowcount :"+ ArowSize);

if(BrowSize==ArowSize)
{
	System.out.println(" The Legal entity is not deleted");
}
else
{
	System.out.println(" The Legal entity is  deleted");
}
	
	}

}

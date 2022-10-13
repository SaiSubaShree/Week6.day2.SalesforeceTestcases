package week6.day2.salesforce.sales;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import week6.day2.salesforce.SalesForceBaseClass;

public class EditSalesFAccount extends SalesForceBaseClass {
@Test
	public void EditSales() throws InterruptedException {
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
		
		//enter accoutn name in the search
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search this list...']"));
		Thread.sleep(1000);
		search.sendKeys("saisuba");
		Thread.sleep(1000);
		search.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		// click the drop down for edit
		WebElement clk = driver.findElement(By.xpath("//span[text()='Show Actions']"));
		driver.executeScript("arguments[0].click();", clk);

		// click on edit
		Thread.sleep(1000);
		WebElement edit= driver.findElement(By.xpath("//a[@title='Edit']"));
		driver.executeScript("arguments[0].click()",edit);
		Thread.sleep(3000);

		//enter phone number

		WebElement phone = driver.findElement(By.xpath("//label[text()='Phone']/following-sibling::div/input"));
		phone.sendKeys("95353533");
		Thread.sleep(3000);
		
		//enter billing address
		WebElement billing = driver.findElement(By.xpath("//label[text()='Billing Street']/following-sibling::div/textarea"));
billing.sendKeys("3290, lauriston road");
Thread.sleep(3000);

//enter the customer priority
WebElement cust = driver.findElement(By.xpath("//label[text()='Customer Priority']/following-sibling::div//div/button"));
driver.executeScript("arguments[0].click()", cust);
Thread.sleep(2000);
WebElement  high = driver.findElement(By.xpath("//span[@title='High']"));
driver.executeScript("arguments[0].click()",high);

Thread.sleep(2000);

// click on save

WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
save.click();






	}

}

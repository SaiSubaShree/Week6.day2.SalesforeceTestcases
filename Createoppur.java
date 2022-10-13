package week6.day2.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createoppur extends SalesForceBaseClass {

	@Test		
	public void Createoppurtu() throws InterruptedException {
			// TODO Auto-generated method stub
			

			// click on app launcher
			driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
			driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
			Thread.sleep(3000);
			//click on sales
			driver.findElement(By.xpath("//p[text()='Sales']")).click();
			Thread.sleep(7000);
			WebElement opp = driver.findElement(By.xpath("//a[@title='Opportunities']"));
			driver.executeScript("arguments[0].click()",opp);

			System.out.println("The opportunities tab is clicked");
			Thread.sleep(4000);
			//enter the details in oppurtunity
			driver.findElement(By.xpath("//a[@title='New']")).click();
			
			//enter the oppur name
			WebElement oppurName = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
			Thread.sleep(2000);
			oppurName.sendKeys("Salesforce Automation");
			
			//enter the name
			Thread.sleep(3000);
			WebElement name = driver.findElement(By.xpath("//label[text()='Account Name']/following-sibling::div//div/input"));
			Thread.sleep(2000);
			name.sendKeys("sai");
			Thread.sleep(1000);
			name.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			name.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			String Accnam = name.getText();
			System.out.println("The account name is "+Accnam);
			
			// select date
			WebElement Closedate = driver.findElement(By.xpath("//input[@name='CloseDate']"));
			Closedate.click();
			Closedate.sendKeys("10/11/2022");
			Thread.sleep(3000);
			
			/*enter stage
			WebElement stage = driver.findElement(By.xpath("//label[text()='Stage']/following-sibling::div//div/button/span"));
			Thread.sleep(1000);
			stage.click();
			Thread.sleep(1000);
			WebElement needAna = driver.findElement(By.xpath("//span[@title='Needs Analysis']"));
			Thread.sleep(1000);
			needAna.click();*/
			
			//EnterStage
			driver.findElement(By.xpath("//span[text()='--None--']")).click();
			//driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input-value')]")).click();
			Thread.sleep(3000);
			System.out.println("Dialog box is clicked");
			Thread.sleep(2000);
			
			WebElement findElement2 = driver.findElement(By.xpath("//span[@title='Needs Analysis']"));
			driver.executeScript("arguments[0].click()", findElement2);
			Thread.sleep(9000);
			
			



	}

}

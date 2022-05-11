package com.crm.vtiger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.github.javafaker.Faker;
import com.vtiger.generic.TestData;

public class vtiger {
	public static void main(String args[]) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","C:\\KCSM12\\SDET-HYD-6\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		//String orgname="star02";
		//Faker fake =new Faker();
		//String name=fake.name().fullName();
		TestData td=new TestData();
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(td.getOrganisationName());
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys(td.getEmail());
		driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		Thread.sleep(1000);
		
		WebElement org =driver.findElement(By.xpath("//span[@class='dvHeaderText']"));
		String Actual=org.getText();
		System.out.println(Actual);
		if(Actual.contains(td.getOrganisationName()))
		{
			System.out.println("organisation saved ,pass");
		}
		else
		{
			System.out.println("organisation is not saved,Fail ");
		}
	WebElement adm = driver.findElement(By.xpath("(//img[@src='themes/softed/images/user.PNG'])[1]"));
	Actions ac=new Actions(driver);
	ac.moveToElement(adm).perform();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	driver.close();
	
	

		
		
		
		
		
		
			
	}

}

package com.crm.vtiger.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrganisationTC16 {

	public static void main(String[] args) throws Throwable {
		
		
			System.setProperty("webdriver.chrome.driver","C:\\KCSM12\\SDET-HYD-6\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost:8888");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys("start1iiii");
			//WebElement cb =driver.findElement(By.xpath("//input[@onclick='return copyAddressRight(EditView)']"));
			//if(cb.isEnabled())
			Thread.sleep(2000);
			WebElement cs=driver.findElement(By.xpath("//input[@onclick='return copyAddressLeft(EditView)']"));
			cs.click();
			Thread.sleep(1000);
			
			if(cs.isSelected())
			{
				System.out.println(" it is selected");
			}
			else 
			{
				System.out.println("is not selected");
			}Thread.sleep(1000);
			
			if(cs.isEnabled())
			
			{
				System.out.println("is enabled");
			}
			else
			{
				System.out.println("not enabled");
			}
			Thread.sleep(1000);
			
			driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
			Thread.sleep(1000);
			driver.close();

		
	
	}
}


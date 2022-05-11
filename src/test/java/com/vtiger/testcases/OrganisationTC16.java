package com.vtiger.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class OrganisationTC16 {

	public static void main(String[] args) throws Throwable {
		
		
			System.setProperty("webdriver.chrome.driver","C:\\KCSM12\\SDET-HYD-6\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://localhost:8888");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
			Faker faker =new Faker();
			driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys(faker.name().fullName());
			//WebElement cb =driver.findElement(By.xpath("//input[@onclick='return copyAddressRight(EditView)']"));
			//if(cb.isEnabled())
			WebElement cs=driver.findElement(By.xpath("//input[@onclick='return copyAddressLeft(EditView"));
			if(cs.isEnabled())
			
			{
				System.out.println("is enabled");
			}
			else
			{
				System.out.println("not enabled");
			}
			
			driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
			Thread.sleep(1000);

		
	
	}
}


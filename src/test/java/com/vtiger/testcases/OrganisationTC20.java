package com.vtiger.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrganisationTC20 {

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
		driver.findElement(By.xpath("(//input[@class='detailedViewTextBox'])[1]")).sendKeys("swsa;;r5");
		//driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
		//Thread.sleep(1000);
		
		
		
	driver.findElement(By.name("ship_street")).sendKeys("yduyiuyugujdgujdeid8474");
	driver.findElement(By.xpath("(//input[@name='button'])[1]")).click();
			Thread.sleep(1000);
			

	}

}

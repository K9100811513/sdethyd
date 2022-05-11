package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class futuredate {
	 public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			driver.get("https://www.makemytrip.com/");

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

			Thread.sleep(2000);

			driver.findElement(By.xpath("//span[@class='langCardClose']")).click();

			driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();

			driver.findElement(By.id("fromCity")).sendKeys(from);

			driver.findElement(By.xpath("//div[.='"+from+"']")).click();

			driver.findElement(By.id("toCity")).sendKeys(to);

			driver.findElement(By.xpath("//div[.='"+to+"']")).click();

		//	driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();

		


			driver.findElement(By.xpath("//li[@data-cy=\"account\"]")).click();

			driver.findElement(By.id("fromCity")).sendKeys("BOM");

			driver.findElement(By.xpath("//div[.='BOM']")).click();


			driver.findElement(By.id("toCity")).sendKeys("HYD");

			driver.findElement(By.xpath("//div[.='HYD']")).click();

			driver.findElement(By.xpath("//span[.='DEPARTURE']")).click();

			Thread.sleep(1000);

			WebElement nextmonth = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));

			for (int i = 0; i < 12; i++)
			//for (int i = 0; i < 36; i++)
			{
				try {
					driver.findElement(By.xpath("//div[@aria-label=\"Sun Sep 04 2022\"]")).click();
					driver.findElement(By.xpath("//div[@aria-label=\"Sun Sep 04 2025\"]")).click();
					break;
				} catch (Exception e) {
					nextmonth.click();
				}
			}
		}
	}


}

		
			
		
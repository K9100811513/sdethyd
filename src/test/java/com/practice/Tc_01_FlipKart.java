package com.practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tc_01_FlipKart {
@Test

public void FlipKartprice() throws Throwable
{
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.FlipKart.com");
	Thread.sleep(1000);
	//driver.findElement(By.xpath("//input[@class='_3704LK']")).sendkeys("phones");
	//Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[.='✕']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("phones");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
	
	Thread.sleep(1000);
	Set<String> wh=driver.getWindowHandles();
	
	Iterator<String> win=wh.iterator();
	
	String w1=win.next();
	
	
	String w2=win.next();
	
	
	driver.switchTo().window(w2);
	Thread.sleep(1000);
	
	System.out.println(driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']")).getText());
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,2000);");
	
	driver.findElement(By.xpath("//button[.='+']")).click();
	
	
	
	
	
	
	
	
	
	
	//button[@type="submit"]
	
}
	
	
	

}

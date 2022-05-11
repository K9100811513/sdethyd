package com.vtiger.generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001_TestCaseNameTest {

	public static void main(String[] args) throws Throwable 
	{
		WebDriver d=new ChromeDriver();
		d.get("http://localhost:8888");
		
		ExcelUtility eu=new ExcelUtility();
		String un=eu.readStrDatafromExcel("TestData", 0, 0);
		
		double pwd=eu.readNumericDatafromExcel("TestData", 0, 1);
		
		System.out.println(un);
		System.out.println(pwd);
		
		int intval=(int) Math.round(pwd);
		System.out.println(intval);
		
		String pwd2=Integer.toString(intval);
		System.out.println(pwd2);
		
		d.findElement(By.name("user_name")).sendKeys(un);
		d.findElement(By.name("user_password")).sendKeys(pwd2);
		
		
		
		
		
		

	}

}

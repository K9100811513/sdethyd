package com.practice;

import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in");
	
	Faker Faker=new Faker();
	System.out.println(Faker.name().fullName());
	

	}

}

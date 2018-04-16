package com.google.search;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



public class Testngframeworkdemo {
	
	WebDriver driver;
	
		
	@BeforeMethod
	public void statrtup() throws Exception {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
	}
	
	
	@Test(priority=2,description="TC1-ID1")
	public void Testcase1() throws Exception {
		
		
		 
		 driver.findElement(By.id("email")).sendKeys("jeeteshgaur@ymail.com");
		 Thread.sleep(2000);
		 driver.findElement(By.id("pass")).sendKeys("mayurigaur");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("loginbutton")).submit();
		 Thread.sleep(15000);
		

			driver.switchTo().alert().dismiss();
			
			Thread.sleep(10000);
			
		 
		 
		
	}
	

	@AfterMethod
	public void Test3441() throws Exception {
		 WebElement logOut = driver.findElement(By.id("userNavigationLabel"));
		 logOut.click();
		 Thread.sleep(5000);
		 WebElement signOut = driver.findElement(By.partialLinkText("Log Out"));
		 signOut.click();
	driver.close();
		
	}


	public static void main(String[] args) {
		
	}
	
	
	
	
}

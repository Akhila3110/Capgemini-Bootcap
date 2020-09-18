package com.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLogin {
	
	WebDriver driver;
	@BeforeTest
	public void launchApp()
	{
		WebDriverManager.chromedriver().setup();
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@BeforeMethod
	public void logIn()
	{
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	@Test
	public void admin()
	{
		driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']")).click();
		 
		 Actions action = new Actions(driver);
		 
		 WebElement element =driver.findElement(By.xpath("//*[@id=\'menu_admin_Job\']"));
		 WebElement element1 =driver.findElement(By.xpath("//*[@id=\'menu_admin_jobCategory\']"));
		 action.moveToElement(element).perform();
		 action.moveToElement(element1).click().build().perform();
	}
	@AfterMethod
	public void closeApp()
	{
		System.out.println(driver.getTitle());
	}
	
   @AfterTest
   public void tearDown()
   {
	   driver.close();
   }
}

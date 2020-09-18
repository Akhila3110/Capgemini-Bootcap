package com.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseMovements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
	     WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		 driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		 driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		 driver.findElement(By.id("btnLogin")).click();
		 
		 driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']")).click();
		 
		 Actions action = new Actions(driver);
		 
		 WebElement element =driver.findElement(By.xpath("//*[@id=\'menu_admin_Job\']"));
		 WebElement element1 =driver.findElement(By.xpath("//*[@id=\'menu_admin_jobCategory\']"));
		 action.moveToElement(element).perform();
		 action.moveToElement(element1).click().build().perform();
	}
	}



package com.seleniumtest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.edgedriver().setup();
	     WebDriver driver = new EdgeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         Actions action =new Actions(driver);
		 
		 driver.navigate().to("https://www.redbus.in/");
		 
		 driver.findElement(By.id("src")).sendKeys("hyd");
		 
     	 action.sendKeys(Keys.DOWN).perform();
		 action.sendKeys(Keys.DOWN).perform();
    	 action.sendKeys(Keys.ENTER).perform();	

	}

}

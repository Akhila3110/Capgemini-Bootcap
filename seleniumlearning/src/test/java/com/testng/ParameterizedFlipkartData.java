package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizedFlipkartData {
WebDriver driver;
	
	@Test(dataProvider="Flipkartlogin")
	public void loginToflipkart(String username,String password) throws Exception {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();       
	
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	
	Assert.assertEquals("https://www.flipkart.com/",driver.getCurrentUrl());
	System.out.println(driver.getCurrentUrl());
	System.out.println("User is able to login sucessfully");
	
	}

	@DataProvider(name="Flipkartlogin")
	public Object[][] passData() {

	Object[][] data=new Object[3][2];
	 		//username
			data[0][0]="9515189083";
			//password
			data[0][1]="akhila123@";

			data[1][0]="joshi";
			data[1][1]="demo123";

			data[2][0]="Admin";
			data[2][1]="admin123";

			return data;

	}
	
	@AfterMethod
	public void tearDown() {
	driver.quit();
	}
	
}



package com.testng;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.seleniumutility.SeleniumUtilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FailedClass {
	public static void captureScreenShot(WebDriver driver2,String screenShotName) {
		try {
			TakesScreenshot ts=(TakesScreenshot)driver2;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source,new File("src/test/resources/ScreenShots/"+screenShotName+".png"));
			System.out.println("ScreenShot Taken");
			
		}catch(Exception e) {
			System.out.println("Exception during taking screenshot ");
			
		}
		
	}
	
	public class CaptureScreenShot {
		WebDriver driver1;
		@Test
		public void captureScreenShot() {
			WebDriverManager.chromedriver().setup();
			driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("https://www.facebook.com/");
			SeleniumUtilities.captureScreenShot(driver1,"Browser Started");
			driver1.findElement(By.xpath("//*[@id='email']")).sendKeys("Learning Automation");
			Assert.assertEquals("xyv", "abg");
		}
		@AfterMethod
		public void tearDown(ITestResult result) {
			if(ITestResult.FAILURE == result.getStatus()) {
			SeleniumUtilities.captureScreenShot(driver1,result.getName());
			}
			driver1.quit();
		}

	}
}
package com.seleniumtest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartWrapperMethods {

    WebDriver driver;
    
    public void insertapp(String url)
    {
    	WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(url);
    }
    
	public void enterbyxpath(String val2, String name2)
	{
	        driver.findElement(By.xpath(val2)).sendKeys(name2);	
	}        
    public void clickbyxpath(String val1) {
        driver.findElement(By.xpath(val1)).click();
    }
    public void searchbyxpath(String val,String name)
    {
    	driver.findElement(By.xpath(val)).sendKeys(name+Keys.ENTER);
    }
    public void getdetailsoffirstmobilebyxpath(String val4)
    {
    	System.out.println(driver.findElement(By.xpath(val4)).getText());
    }
//    public void closeapp() {
//        driver.close();
//    }
    
    public void takesnap(String path) throws IOException {
           TakesScreenshot ts =(TakesScreenshot)driver;
           File source = ts.getScreenshotAs(OutputType.FILE);
           FileUtils.copyFile(source,new File((path)));
    }
    
//    public void selectdropdown(String locator,String text) {
//        Select month=new Select(driver.findElement(By.id(locator)));
//        month.selectByVisibleText(text);
//    }
       
}




package org.driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class LaunchingBrowser{
	public static WebDriver driver;
	public static void ScreenShot (String name) {
		
		try {
			
		//Type Casting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//To Take Screenshot
		//Default Location
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		//Desired Location
		File TargetFile=new File("C:\\Users\\HEMAVATHI\\Pictures\\"+name+"jpeg");
		
		//copy/paste the Desired Location
		FileUtils.copyFile(SourceFile, TargetFile);
		
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
	//to configure the browser
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");

  // Rough Work
	WebDriver driver=new ChromeDriver();
	
	// Launch Browser
    driver.get("http://greenstech.in/selenium-course-content.html");
    
    // Maximize The Window
    driver.manage().window().maximize();
    
    //Object For Actions 
    Actions act=new Actions(driver);
   
    // Object For JavascripExcuter
    JavascriptExecutor js = (JavascriptExecutor) driver;
    
    WebElement jobOpenings = driver.findElement(By.id("heading2011"));
    js.executeScript("arguments[0].scrollIntoView(true)",jobOpenings);
   
    Thread.sleep(3000);
    
    ScreenShot("Job Opening");
  
    Thread.sleep(3000);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    WebElement selenium = driver.findElement(By.id("heading303")); 
//    selenium.click();
//    
//    WebElement day6 = driver.findElement(By.xpath("//a[@target='_blank']"));
//    act.contextClick(day6).perform();
//    
//    r.keyPress(KeyEvent.VK_UP);
//    r.keyRelease(KeyEvent.VK_UP);
//    
//    r.keyPress(KeyEvent.VK_ENTER);
//    r.keyRelease(KeyEvent.VK_ENTER);

    
	}
}
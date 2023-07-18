package org.driver;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuPlesis {
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

public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",    
			                    	"C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Iphone 14 Pro Max",Keys.ENTER);
		
		ScreenShot("Amazon Window");
		
		WebElement iphone14 = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro Max (128 GB) - Deep Purple']"));
		iphone14.click();
		
		Thread.sleep(4000);
		
		ScreenShot("1st Window");
		
		
		
		
		
		
		
		
		
}
}

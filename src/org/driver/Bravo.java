package org.driver;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bravo {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",    
			                    	"C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");
		
		//JavascriptExcuter
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
       
		//To Object for JavascriptExcuter
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		

}
}

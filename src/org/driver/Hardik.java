package org.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hardik {

	public static void main(String[] args) {	
			System.setProperty("webdriver.chrome.driver",    
				                    	"C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");
			
		//Double Click Action	
			
     		WebDriver driver=new ChromeDriver();
	
		    driver.get("https://www.facebook.com/");
			
			Actions act=new Actions(driver);
		
	    	WebElement userName = driver.findElement(By.id("email"));
	    	userName.sendKeys("aertyuio");
		
	    	act.doubleClick(userName).perform();
	 		
	    	WebElement pass = driver.findElement(By.id("pass"));
	    	pass.sendKeys("234567");
		
	    	act.doubleClick(pass).perform();
	    	
	    	
	    	
			
			driver.get("https://demo.automationtesting.in/Register.html");
			
			WebElement name = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
			name.sendKeys("kirthish");
			
			act.doubleClick(name).perform();
			
			
			
	}
}

package org.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//Mouse Over Action

public class Dhoni {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",    
			                    	"C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://greenstech.in/selenium-course-content.html");
		
		Actions act=new Actions(driver);
		
		WebElement courses = driver.findElement(By.xpath("//div[@data-toggle='dropdown']"));
		
		//To perform the mouse over action
		act.moveToElement(courses).perform();
		
		WebElement masterProgram = driver.findElement(By.xpath("//div[@title='Master Program']"));
		act.moveToElement(masterProgram).perform();
		
		
		
		
		
	}
}

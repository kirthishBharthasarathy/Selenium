package org.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Warner {
	
public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",    
			                    	"C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");
		
		//Drag And Drop Action
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		Actions act=new Actions(driver);
		
		WebElement drag = driver.findElement(By.id("credit2"));
	    WebElement drop = driver.findElement(By.id("bank"));
	    act.dragAndDrop(drag, drop).perform();
	    
	    WebElement drag1 = driver.findElement(By.id("fourth"));
	    WebElement drop1 = driver.findElement(By.id("amt7"));
	    act.dragAndDrop(drag1, drop1).perform();
	    
	    WebElement drag2 = driver.findElement(By.id("credit1"));
	    WebElement drop2 = driver.findElement(By.id("loan"));
	    act.dragAndDrop(drag2, drop2).perform();
	    
	    WebElement drag3 = driver.findElement(By.id("fourth"));
	    WebElement drop3 = driver.findElement(By.id("amt8"));
	    act.dragAndDrop(drag3, drop3).perform();

}
}
package org.driver;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ruturaj {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",    
			                    	"C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");
		
		//Select All Options
		
		WebDriver driver=new ChromeDriver();
		
		// Launch URl
		driver.get("https://jsbin.com/osebed/2/");
		
		//Maximize The Window
		driver.manage().window().maximize();
		
		WebElement fruits = driver.findElement(By.id("fruits"));
		
		//To Perform Select Function
		Select v = new Select (fruits);
		v.selectByIndex(2);
		v.selectByValue("banana");
		v.selectByVisibleText("Apple");
		
		//To Get All Select Options
		List<WebElement> allSelectedOptions = v.getAllSelectedOptions();
		
		 for (int i = 0; i < allSelectedOptions.size(); i++) {
			 WebElement webElement = allSelectedOptions.get(i);
			 String text = webElement.getText();
			 System.out.println(text);
		}
		
		 //To Print THe First Selected OPtions
	    WebElement firstSelectedOption = v.getFirstSelectedOption();
	   	String text = firstSelectedOption.getText();
		System.out.println(text);
		
		
		
}
}
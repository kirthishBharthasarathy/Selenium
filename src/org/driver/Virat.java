package org.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Virat {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			           "C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");
	
	//Automation Testing Details 
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demo.automationtesting.in/");
	
	WebElement signUp = driver.findElement(By.id("email"));
	signUp.sendKeys("todkirthish@gmail.com");
	
	WebElement next = driver.findElement(By.id("enterimg"));
	next.click();
	
	WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
	firstName.sendKeys("kirthish");
	
	WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastName.sendKeys("bharthasarathy");
	
	WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	address.sendKeys("perungudi,chennai-96");
	
	WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
	email.sendKeys("todkirthish@gmail.com");
	
	WebElement mobile = driver.findElement(By.xpath("//input[@type='tel']"));
	mobile.sendKeys("9344339761");
	
	WebElement gender = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
	gender.click();
	
	WebElement hobbies = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
	hobbies.click();
	
	WebElement select = driver.findElement(By.xpath("msdd"));
	Select v=new Select(select);
	
}
}

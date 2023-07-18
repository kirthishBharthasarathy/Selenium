package org.driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.cheome.driver",
      	"C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("Kirthish");
		
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("Blue@0922");
		
		WebElement loginButton = driver.findElement(By.id("login"));
		loginButton.click();
		
		Thread.sleep(4000);
		
		WebElement location = driver.findElement(By.name("location"));
		Select v=new Select(location);
		v.selectByIndex(3);
		
		WebElement hotel = driver.findElement(By.name("hotels"));
		Select v1=new Select(hotel);
		v1.selectByIndex(1);
		
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select v2=new Select(roomType);
		v2.selectByIndex(4);
		
		WebElement numberOf = driver.findElement(By.id("room_nos"));
		Select v3=new Select(numberOf);
		v3.selectByIndex(7);
		
		WebElement checkIn = driver.findElement(By.name("datepick_in"));
		checkIn.sendKeys("17/06/2023");
		
		WebElement checkOut = driver.findElement(By.name("datepick_out"));
		checkOut.sendKeys("18/06/2023");
		
		WebElement adults = driver.findElement(By.name("adult_room"));
		Select v4=new Select(adults);
		v4.selectByValue("3");
		
		WebElement childrens = driver.findElement(By.id("child_room"));
		Select v5=new Select(childrens);
		v5.selectByValue("4");
		
		WebElement search = driver.findElement(By.id("Submit"));
		search.click();
		
		WebElement select = driver.findElement(By.name("radiobutton_0"));
		select.click();
		
		WebElement continueButton = driver.findElement(By.id("continue"));
		continueButton.click();
		
		WebElement firstName = driver.findElement(By.name("first_name"));
		firstName.sendKeys("Kirthish");
		
		WebElement lastName = driver.findElement(By.name("last_name"));
		lastName.sendKeys("bharthasarathy");
		
		WebElement address = driver.findElement(By.name("address"));
		address.sendKeys("E/10, godhandan street,perungudi,chennai-96");
		
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		ccNum.sendKeys("9344339761123456");
		
		WebElement cardType = driver.findElement(By.id("cc_type"));
        Select v6=new Select(cardType);
        v6.selectByIndex(2);
        
        WebElement expDate = driver.findElement(By.id("cc_exp_month"));
        Select v7=new Select(expDate);
		v7.selectByValue("5");
		
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
        Select v8=new Select(expyear);
        v8.selectByIndex(15);
        
        WebElement cvv = driver.findElement(By.name("cc_cvv"));
        cvv.sendKeys("876");
        
        WebElement bookNow = driver.findElement(By.id("book_now"));
        bookNow.click();
        
		
	}

}

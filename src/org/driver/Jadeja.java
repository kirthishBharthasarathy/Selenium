package org.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jadeja {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",    
			                    	"C:\\Users\\HEMAVATHI\\eclipse-workspace\\JavaSeleniumProject\\Driver\\chromedriver.exe");
		
		//Frame 
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http//demo.guru99.com/test/");
		
		driver.manage().window().maximize();

		

		
		
		
		
		
}
}
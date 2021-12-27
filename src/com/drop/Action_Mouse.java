package com.drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Mouse {
	
	public static void main(String[] args) {
		
		System.setProperty("webDriver.chrome.driver", "C:\\\\Users\\\\NIVATHA\\\\eclipse-workspace\\Actions\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement Dresses = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		Actions ac = new Actions(driver);
		ac.moveToElement(Dresses).build().perform();
		WebElement Summer_Dresses= driver.findElement(By.xpath("(//a[text()='Summer Dresses'])[2]"));
		ac.click(Summer_Dresses).build().perform();
		
		
	}
	
	

}

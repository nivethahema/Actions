package com.drop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) {
		System.setProperty("webDriver.chrome.driver", "C:\\\\Users\\\\NIVATHA\\\\eclipse-workspace\\Actions\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement Start = driver.findElement(By.id("draggable"));
		WebElement End = driver.findElement(By.id("droppable"));
		Actions  a = new Actions(driver);
		a.dragAndDrop (Start, End).build().perform();
		
		
	}

}

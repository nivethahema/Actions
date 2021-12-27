package org.action;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Keyboard {
	public static void main(String[] args) throws AWTException, InterruptedException  {
		
		System.setProperty("webDriver.chrome.driver", "C:\\\\Users\\\\NIVATHA\\\\eclipse-workspace\\Actions\\\\Driver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		WebElement Mail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions ac = new Actions(driver);
		ac. contextClick(Mail).build().perform();
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
	    r.keyRelease(KeyEvent.VK_DOWN);
	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		driver.quit();
		System.out.println("finished");
		
		
		
		
	}

}

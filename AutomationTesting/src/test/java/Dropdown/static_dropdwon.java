package Dropdown;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class static_dropdwon {
    public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		   driver.get("https://www.facebook.com");
		   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		   driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("atchutarao");
		  WebElement Day = driver.findElement(By.xpath("//select[@id='day']"));
		  Select se= new Select(Day);
		   se.selectByVisibleText("12");
	}
}

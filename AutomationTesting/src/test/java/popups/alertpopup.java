package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup {
 public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver= new ChromeDriver();
	 driver.get("https://demoqa.com/alerts");
	 driver.manage().window().maximize();
	 Robot r= new Robot();
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 r.keyPress(KeyEvent.VK_PAGE_DOWN);
	 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
	 
	 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	 Alert btn3 = driver.switchTo().alert();
	 btn3.sendKeys("atchutarao");
	 
	 
	   
}
}

package WebdriverMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handling_Keybordandmouseactions {
     public static void main(String[] args) throws InterruptedException, AWTException {
		  WebDriver driver= new ChromeDriver();
		   driver.manage().window().maximize();
		    driver.get("https://www.google.com");
		    
		    //actions class
		    
		    Actions a= new Actions(driver);
		      WebElement ele = driver.findElement(By.xpath("(//a[@class='gb_W'])[1]"));
		      //move toelemenet 
		       a.moveToElement(ele).perform();
		      //contextclic()
		       a.moveToElement(ele).contextClick().perform();
		        Thread.sleep(3000);
		       //doubleclick()
		       a.moveToElement(ele).doubleClick().perform();
		       
		       Thread.sleep(2000);
		        Robot r= new Robot();
		         r.keyPress(KeyEvent.VK_PAGE_DOWN);
		         r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		         
		        r.delay(1000);
		        
		        r.keyPress(KeyEvent.VK_PAGE_DOWN);
		        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		        
		        
		        r.keyPress(KeyEvent.VK_PAGE_DOWN);
		         r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		         
		        r.delay(1000);
		        
		        r.keyPress(KeyEvent.VK_PAGE_DOWN);
		        r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		        
		        System.out.println("test pass");
		         
		         
		       
		    
		    
	}
}

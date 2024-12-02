package FramesHandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukariapplication {
     public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		   driver.get("https://www.naukri.com/registration/createAccount");
		    Thread.sleep(3000);
		     driver.findElement(By.xpath("//button[@type='button']")).click();
		      String  parent=driver.getWindowHandle();
		     Set<String> all=driver.getWindowHandles();
		     System.out.println(all.size());
		     
		     //switch to child window
		       for(String child:all) {
		    	   if(!parent.equals(all)) {
		    		    driver.switchTo().window(child);
		    	   }
		    	   
		       }
		       driver.findElement(By.xpath("")).sendKeys("Atchutarao");
	}
}

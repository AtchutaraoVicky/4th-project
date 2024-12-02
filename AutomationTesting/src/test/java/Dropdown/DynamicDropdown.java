package Dropdown;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {
  public static void main(String[] args) throws InterruptedException {
	 ChromeDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	   driver.get("https://www.google.com");
	   
	    driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("prabhas");
	    
	    Thread.sleep(3000);
	    
	    List<WebElement> opt = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
	    Thread.sleep(2000);
	     System.out.println(opt.size());
	     
	     for(int i=0;i<opt.size();i++) {
	    	 System.out.println(opt.get(i).getText());
	     }
	    
	     for(int i=0;i<opt.size();i++) {
	    	 if(opt.get(i).getText().equals("prabhas birthday date")) {
	    		 Thread.sleep(2000);
	    		 opt.get(i).click();
	    		 break;
	    	 }
	     }
	    
}
}

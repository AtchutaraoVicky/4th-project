package WebdriverMethods;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {
    public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  //get() --> it is used to navigate the webpage
		  
		   driver.get("https://www.google.com");
		   
		   //get title() ---> it is used to print the title of the webpage 
		    String title=driver.getTitle();
		    System.out.println(title);
		    
		    //getcurremnturl() --> it is used to print the current webpage url 
		    String url=driver.getCurrentUrl();
		     System.out.println( url);
		   
		     //get page source() --> it is used to print the  source code of the current webpage \
		     
		    String  pagesource=driver.getPageSource();
		    System.out.println(pagesource);
		    
		    //findelement() --> ist is used to find the address of one mathcing element 
		  WebElement   ele=driver.findElement(By.xpath("(//a[@class='gb_W'])[1]"));
		  System.out.println("findelement = "+ele);
		  
		  //find elements () --. it is used to find the all matching elements 
		  
		List<WebElement>  Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		//getwindopwhandle()-->it is returns the current window
		String Parent = driver.getWindowHandle();
		
		//getwindowhandles()--> it's returns the all windows in the webpage
		
	        Set<String> allwindows = driver.getWindowHandles();
	        
	        //switchTO()--> it is used to switch the another window ... it is mainly used in alerts and windows , frmaes
	        
	        driver.switchTo().window(Parent);
	        driver.switchTo().alert();
	        driver.switchTo().frame(0);
	        
	        
	        //manage()--> it is used to manage the webpage like maximize and minimize and timeouts
	        
	        driver.manage().window().maximize();
	         driver.manage().window().minimize();
	         
	         //navigate()--> it is used to navigate the webpage like forword and backword and refresh 
	         driver.navigate().back();
	         driver.navigate().forward();
	         driver.navigate().refresh();
	        
	         //close ()--> close it is used to close the current tab 
	         
	         driver.close();
	         
	         //quite()--> it is used to  close the all tad
	         driver.quit();
	         
	         
	
	}   
	
}

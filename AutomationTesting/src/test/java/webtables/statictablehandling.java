package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statictablehandling {
      public static void main(String[] args) throws InterruptedException {
		 WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		   driver.get("https://testautomationpractice.blogspot.com/");
		   JavascriptExecutor js= (JavascriptExecutor) driver;
		    js.executeAsyncScript("window.scrollBy(0,2000)");
		       Thread.sleep(3000);
		    //Table finding 
		       WebElement Table = driver.findElement(By.xpath("//table[@name='BookTable']"));
		       //rows finding
		      List<WebElement> Rows = Table.findElements(By.tagName("tr"));
		      System.out.println("Rows count : "+Rows.size());
		      
		      //cols finding
		      List<WebElement> Cols = Table.findElements(By.tagName("th"));
		      System.out.println("Cols count : "+ Cols.size());
		      
		      //print the columns 
		      
		       for(int i=0;i<Cols.size();i++) {
		    	   String Text=Cols.get(i).getText();
		    	   System.out.println(Text);
		       }
		       //find the  data columns 
		       
		         List<WebElement> data = Table.findElements(By.tagName("td"));
		         System.out.println(data);
		         
		         //each row column 
		          for(int i=1;i<Rows.size();i++) {
		        	  
		        	 List<WebElement> cls = Rows.get(i).findElements(By.tagName("td"));
		        	 System.out.println("Row "+i+"="+cls.size());
		          }
		          //print the each row data 
		           for(int i=1;i<Rows.size();i++) {
		        	   List<WebElement> cells = Rows.get(i).findElements(By.tagName("td"));
		        	    for(int j=0;j<cells.size();j++) {
		        	    	String tx = cells.get(j).getText();
		        	     System.out.println(tx);
		        	    }
		        	    System.out.println();
		           }
		       
		     
	}
}

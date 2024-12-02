package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable {
   public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	   driver.get("");
	   
	   //table finding
	    WebElement Table = driver.findElement(By.xpath(""));
	    
	    //find the rows 
	     List<WebElement> Rows = Table.findElements(By.tagName("tr"));
	     System.out.println(Rows.size());
	     
	     //find the cols
	     List<WebElement> cells = Table.findElements(By.tagName("th"));
	     System.out.println(cells.size());
	     
	     //find the data cols
	      
	     List<WebElement> data = Table.findElements(By.tagName("td"));
	     System.out.println(data.size());
	     
	     //rint the heaings 
	      for(int i=0;i<cells.size();i++) {
	    	  System.out.println(cells.get(i).getText());
	      }
	      //rows vise printing
	       for(int i=1;i<Rows.size();i++) {
	    	   List<WebElement> cldata = Rows.get(i).findElements(By.tagName("td"));
	    	         
	    	   System.out.println("Rows "+i+"="+cldata.size());
	       }
	     //print the data in the table
	        for(int i=1;i<Rows.size();i++) {
	        	List<WebElement> datacell = Rows.get(i).findElements(By.tagName("td"));
	        	for(int j=0;j<datacell.size();j++) {
	        		 System.out.println(cells.get(j).getText());
	        	}
	        	System.out.println();
	        }
	        
	        //perform the task in teble
	        
	        for(int i=0;i<Rows.size();i++) {
	        List<WebElement>	CL=Rows.get(i).findElements(By.tagName("td"));
	         for(int j=0;j<CL.size();j++) {
	        	 
	        	 if(i==1&&j==3) {
	        		 driver.findElement(By.xpath("")).sendKeys("");
	        	 }
	         }
	        }
}
}

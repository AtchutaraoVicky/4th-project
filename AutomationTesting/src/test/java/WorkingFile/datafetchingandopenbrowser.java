package WorkingFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class datafetchingandopenbrowser {
	 public static WebDriver driver;
   public static void main(String[] args) throws IOException {
	   FileInputStream fisp= new FileInputStream("");
	   Properties p= new Properties();
	    p.load(fisp);
	    
	   String data = p.getProperty("Browser");
	   System.out.println(data);
	   
	   String URL = p.getProperty("url");
	   System.out.println(URL);
	   
	   if(data.equalsIgnoreCase("chrome")) {
		   driver=new ChromeDriver();   
	   }
	   else if(data.equalsIgnoreCase("edge")) {
		    driver= new EdgeDriver();
	   }
	   
	   driver.get(URL);
}
}

package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class googlepagescreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
		 WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		   driver.get("https://www.google.com");
		    Thread.sleep(3000);
		    TakesScreenshot ts=  (TakesScreenshot) driver;
		   File src = ts.getScreenshotAs(OutputType.FILE);
		   File dest= new File("C:\\Users\\vicky\\OneDrive\\Desktop\\AUTOMATION_SELENIUM\\AutomationTesting\\Screenshot\\google.png");
		    Files.copy(src, dest);
		     
	}
}

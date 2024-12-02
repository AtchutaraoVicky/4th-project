package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class singlemadulescreenshot {
 public static void main(String[] args) throws IOException {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	   driver.get("https://www.google.com");
	   
	   TakesScreenshot ts = (TakesScreenshot) driver;
	   
	   WebElement  Image=driver.findElement(By.xpath("//img[@class='lnXdpd']"));
	  File src = Image.getScreenshotAs(OutputType.FILE);
	  File dest= new File("C:\\Users\\vicky\\OneDrive\\\\Desktop\\AUTOMATION_SELENIUM\\AutomationTesting\\Screenshot\\single.png");
	   Files.copy(src, dest);
}
}

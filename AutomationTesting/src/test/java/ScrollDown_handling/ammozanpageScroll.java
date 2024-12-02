package ScrollDown_handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ammozanpageScroll {
   public static void main(String[] args) {
	 WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_4b3e4wrxds_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=617721280315&hvpos=&hvnetw=g&hvrand=13330100267347555304&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062131&hvtargid=kwd-311187680635&hydadcr=5841_2362028");
	  JavascriptExecutor js=(JavascriptExecutor) driver; 
	  js.executeScript("window.scrollBy(0,3000)");
	  System.out.println(" test passed");
}
}

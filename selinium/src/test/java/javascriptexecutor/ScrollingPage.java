package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//1) scroll down up to some pixel
//		js.executeScript("window.scrollBy(0, 3000)", "");
//		System.out.println(js.executeScript("return window.pageYOffset;")); // 3000
	  
		//2) scroll up to some element
//		WebElement ele=driver.findElement(By.xpath("//a[normalize-space()='Contact us']"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		System.out.println(js.executeScript("return window.pageYOffset;")); //5075.33349609375
       
		//3) scroll to page end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;")); //5408.66650390625
       Thread.sleep(3000);
		 // go back to home page
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)"); //5408.66650390625
		
	   
		
	}

}

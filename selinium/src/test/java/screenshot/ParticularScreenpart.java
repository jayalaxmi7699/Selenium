package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParticularScreenpart {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.ebay.com/b/Collectible-Sneakers/bn_7000259435?_trkparms=pageci%3A62c8728f-5a28-11ef-adad-2aa7695d2400%7Cparentrq%3A507170971910acda33c034e1ffffa028%7Ciid%3A7%7Cvlpname%3Abrand_outlet");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		TakesScreenshot ts = (TakesScreenshot) driver;
		WebElement Shoeproduct = driver.findElement(By.xpath(
				"//div[@class='b-mmm-content-09-content']"));
		
		File sourcefile = Shoeproduct.getScreenshotAs(OutputType.FILE);

		File targetDir = new File(System.getProperty("user.dir") + "\\screenfolder\\shoes.png");
		sourcefile.renameTo(targetDir);
		
		driver.quit();
	}
}

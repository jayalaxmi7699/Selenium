package screenshot;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotCapture {

	public static void main(String[] args) throws InterruptedException, IOException {

		java.util.Date currentdate = new java.util.Date();
		System.out.println(currentdate);
		String SvrrenshotfilNam = currentdate.toString().replace(" ", "-").replace(":", "-");
		System.out.println(SvrrenshotfilNam);

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.ebay.com.au/");
//driver.manage().window().maximize();

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//screenshot//" + SvrrenshotfilNam + ".png"));

	}
}

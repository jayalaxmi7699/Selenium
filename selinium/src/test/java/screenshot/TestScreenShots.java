package screenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestScreenShots {
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File storefile = new File("./screenshot/img1.png");
		FileUtils.copyFile(screenshot, storefile);
		System.out.println("successfull");
		driver.quit();

		byte[] bytear = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

		File destin = new File("./screenshot/byteimg.png");
		FileOutputStream fos = new FileOutputStream(destin);
		fos.write(bytear);
		fos.close();
		System.out.println("saved");
	}
}

package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShotsTestSetup {

	public static WebDriver driver;
	public static String screnSubfolder;

	@BeforeTest
	public void setUp() {

		WebDriverManager.chromedriver().setup();
		driver = new EdgeDriver();
		driver.manage().window().maximize();

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

	public void captureScreenshot(String fileName) {
		if (screnSubfolder == null) {
			LocalDateTime date = LocalDateTime.now();
			DateTimeFormatter form = DateTimeFormatter.ofPattern("ddMMyyyyHHmmss");
			screnSubfolder = date.format(form);
		}
		File sourcefile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destifile = new File("./screenshots/" + screnSubfolder + "/" + fileName);
		try {
			FileUtils.copyFile(sourcefile, destifile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("successfull");
	}

}

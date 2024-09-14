package screenshot;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FullPageScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-salesforce-starter/?d=jumbo1-btn-ft");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Taking screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);

		// Defining the target file path
		String targetDir = System.getProperty("user.dir") + "\\screenfolder\\";
		File dir = new File(targetDir);

		// Create directory if it doesn't exist
		if (!dir.exists()) {
			dir.mkdirs();
		}

		// Define the target file
		File targetfile = new File(targetDir + "fullpage.png");

		// Copy the screenshot to the target file
		Files.copy(sourcefile.toPath(), targetfile.toPath(), StandardCopyOption.REPLACE_EXISTING);

		System.out.println("Screenshot saved at: " + targetfile.getAbsolutePath());

		driver.quit();
	}
}

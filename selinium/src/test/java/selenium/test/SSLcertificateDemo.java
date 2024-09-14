package selenium.test;

import java.io.File;
import java.io.IOException;
import java.sql.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SSLcertificateDemo {

	public static void main(String[] args) throws InterruptedException, IOException {


		WebDriverManager.edgedriver().setup();
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setAcceptInsecureCerts(true);
		
		ChromeOptions co = new ChromeOptions();
		co.merge(dc);
		WebDriver driver = new EdgeDriver();

		driver.get("https://expired.badss1.com");

	}
}

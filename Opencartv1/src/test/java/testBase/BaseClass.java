package testBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {

	public static WebDriver driver;
	public Logger logger;
	public Properties p;

	@BeforeClass(groups = {"Sanity", "Regression", "Master"})
	@Parameters({ "os", "browser" })
	public void setup(String os, String br) throws IOException {

		// Loading config.properties file
		ClassLoader classLoader = getClass().getClassLoader();
		FileReader file = new FileReader(classLoader.getResource("config.properties").getFile());
		p = new Properties();
		p.load(file);
		logger = LogManager.getLogger(BaseClass.class);
		
		switch (br.toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("Invalid browser name..");
			return;
		}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appURL"));
		driver.manage().window().maximize();
	}

	public String randomString() {
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}

	public String randomNumber() {
		String generatedNumber = RandomStringUtils.randomNumeric(10);
		return generatedNumber;
	}

	public String randomAlphaNumeric() {
		String generatedNumber = RandomStringUtils.randomNumeric(3);
		String generatedString = RandomStringUtils.randomAlphabetic(3);
		return (generatedString + "#" + generatedNumber);
	}
	
	public String captureScreen(String tname) throws IOException{
		String timestamp= new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
		File sourceFile=takesScreenshot.getScreenshotAs(OutputType.FILE);
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\"+tname+"_"+timestamp+".png";
		File targetFile=new File(targetFilePath);
		sourceFile.renameTo(targetFile);
		return targetFilePath;
		
	}

	@AfterClass(groups = {"Sanity", "Regression", "Master"})
	public void tearDown() {
		driver.quit();
	}
}
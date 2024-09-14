package screenshot;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestScreenShots2 extends ScreenShotsTestSetup{
	public static void main(String[] args) throws IOException {

		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
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

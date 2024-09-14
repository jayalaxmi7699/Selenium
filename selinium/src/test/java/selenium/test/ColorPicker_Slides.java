package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ColorPicker_Slides {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();

		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(frame1);
		WebElement slider = driver.findElement(By.xpath("//*[@id=\"green\"]/span"));

		Actions action1 = new Actions(driver);
		/*
		 * This might give error bcz the parameters are wrong & can provide negative
		 * parameters also to move backward
		 */
		action1.dragAndDropBy(slider, 106, 125).perform();

		System.out.println("successfull");
	}
}
package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		try {
			driver.get("https://www.singaporeair.com/en_UK/in/home#/book/bookflight");
			driver.manage().window().maximize();
			WebElement radio = driver.findElement(By.id("redeemFlights"));
			radio.click();
			System.out.println(radio.isSelected());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("error");
		} finally {
			System.out.println("successfull");
		}

	}
}

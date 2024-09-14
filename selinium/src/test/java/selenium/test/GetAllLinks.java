package selenium.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.manage().window().maximize();

		List<WebElement> allTags = driver.findElements(By.tagName("a"));
		System.out.println("Total Tags are: "+allTags.size());

		System.out.println(allTags.size());

		for (int i = 0; allTags.size() > i; i++) {
			System.out.println("Attribute name: " + allTags.get(i).getAttribute("href"));
			System.out.println("Text Name: " + allTags.get(i).getText());
		}

		System.out.println("successfull");
		

	}
}

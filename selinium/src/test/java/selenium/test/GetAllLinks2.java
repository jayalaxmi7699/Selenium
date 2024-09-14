package selenium.test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.salesforce.com/in/form/demo/starter-overview-demo/?d=jumbo2-btn-demo");
//		driver.manage().window().maximize();

		List<WebElement> allTags = driver.findElements(By.name("UserTitle"));
		System.out.println("Total Tags are: "+allTags.size());

		System.out.println(allTags.size());

		for (int i = 0; allTags.size() > i; i++) {
			System.out.println("Attribute name: " + allTags.get(i).getAttribute("value"));
			System.out.println("Values are: " + allTags.get(i).getText());
		}

		System.out.println("successfull");

	}
}

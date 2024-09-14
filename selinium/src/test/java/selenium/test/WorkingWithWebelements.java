package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WorkingWithWebelements {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.sugarcrm.com/au/request-demo/");
		driver.findElement(By.name("email")).sendKeys("Testing@gmail.com");
		driver.findElement(By.name("email")).clear();
		System.out.println(driver.findElement(By.name("email")).getAttribute("class"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getCssValue("text-transform"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getSize());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).getTagName());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).isDisplayed());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).isEnabled());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"field0\"]/div/input")).isSelected());
		System.out.println("successfull");
		driver.quit();
		
	}
}

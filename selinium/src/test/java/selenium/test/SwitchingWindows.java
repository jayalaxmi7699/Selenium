package selenium.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.salesforce.com/in/?ir=1");
		driver.manage().window().maximize();
		driver.findElement(By
				.xpath("//*[@id=\"1682325589592_4ma\"]/div[1]/article/div[2]/div/pbc-button[1]/a"))
				.click();
		Thread.sleep(2000);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);

		Iterator<String> handles = windows.iterator();
		String ParentWindow = handles.next();
		String Childwindow = handles.next();
		driver.switchTo().window(Childwindow);
		driver.findElement(By.name("UserFirstName")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("Password");

		System.out.println("successfull");
		
	}
}
package selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementLocators {
	public static void main(String[] args) {

		WebDriver dri = new EdgeDriver();
		dri.get("https://www.selenium.dev/documentation/webdriver/drivers/");
//		dri.findElement(By.className("td-sidebar-nav-active-item")).click();
//		dri.findElement(By.id("Driver Sessions")).click();
//		dri.findElement(By.linkText("Drivers")).click();
		dri.findElement(By.partialLinkText("Driver")).click();
		

	}
}

package selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Webdriver_Interface {
	public static void main(String[] args) {

		WebDriver dri = new EdgeDriver();		
		dri.get("https://www.saucedemo.com/");
		dri.manage().window().maximize();

		String currentUrl = dri.getCurrentUrl();
		System.out.println(currentUrl);

		String title = dri.getTitle();
		System.out.println(title);

		String pageSource = dri.getPageSource();
		System.out.println(pageSource);

		dri.navigate().to("http://www.google.com/");
		dri.close();

	}
}

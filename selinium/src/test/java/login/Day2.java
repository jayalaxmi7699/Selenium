package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Day2 {
	public static void main(String[] args) {

		WebDriver dri = new EdgeDriver();
		dri.get("https://demo.opencart.com/");
//		dri.get("http://www.google.com");
		dri.manage().window().maximize();

		boolean logoDisplayststus = dri.findElement(By.id("logo")).isDisplayed();
		System.out.println(logoDisplayststus);

	}
}

package selenium.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuterDemo {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
		driver.manage().window().maximize();
		
		JavascriptExecutor jexe = (JavascriptExecutor)driver;
		String script = "return document.title;";
		String title = (String) jexe.executeScript(script);
		System.out.println(title);
		
		driver.switchTo().frame("iframeResult");
		jexe.executeScript(script, args);

		System.out.println("successfull");

	}
}

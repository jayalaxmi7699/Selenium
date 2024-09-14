package selenium.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAuthentication {
	  public static String username ="admin";
      public static String password="admin";

	public static void main(String[] args) throws InterruptedException, IOException {

       	WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();
       // in this url add user and passowrd
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
	}
}

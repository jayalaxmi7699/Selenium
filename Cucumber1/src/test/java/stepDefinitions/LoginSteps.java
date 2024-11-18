package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageobjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver;
	LoginPage page;

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		page = new LoginPage(driver);
	}

	@When("the user enters a valid Testmanual@gmail.com and Test@{int}")
	public void the_user_enters_a_valid_testmanual_gmail_com_and_test(Integer int1) {
		 page.enterUsername("Testmanual@gmail.com");
	        page.enterPassword("Test@123");  
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
		page.clickLogin();
	}

	@Then("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() {
		
	}
}

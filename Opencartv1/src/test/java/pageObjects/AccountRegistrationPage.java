package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement txtfirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement txtlastName;

	@FindBy(xpath = "	//input[@id='input-email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement txtTelephone;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement txtConfirmPasswd;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement chkPolicy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;

	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

	public void setFirstName(String fname) {
		txtfirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		txtlastName.sendKeys(lname);
	}

	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	public void setTelephone(String telephone) {
		txtTelephone.sendKeys(telephone);
	}

	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}

	public void setConfirmPwd(String confirmpwd) {
		txtConfirmPasswd.sendKeys(confirmpwd);
	}

	public void setPrivacyPolicy() {
		chkPolicy.click();
		;
	}

	public void clickContinue() {
		btnContinue.click();
//		btnContinue.submit();

		// step 2
//		Actions act = new Actions(driver);
//		act.moveToElement(btnContinue).click().perform();
	}

	public String getConfirmationmsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return e.getMessage();
		}

	}

}

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class LoginPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@value, 'Log In')]")
	WebElement button_Login;

	@FindBy(xpath = "//*[text() = 'Forgotten Password']")
	WebElement ForgottenPasswordLink;

	@FindBy(xpath = "//*[contains(@id,'ButtonResetPassword')]")
	WebElement ForgottenPasswordSubmitBtn;

	@FindBy(xpath = "//input[contains(@id,'User_email')]")
	WebElement ForgottenPasswordEmailField;

	@FindBy(xpath = "//*[@value = 'Create account']")
	//@FindBy(xpath = "//*[text() =\"Don't have an account?\"]")
	WebElement RegisterLink;

	@FindBy(xpath = "//input[contains(@id, 'UserNameInput')]")
	WebElement input_Email;

	@FindBy(xpath = "//input[contains(@id, 'UserNameInput')]//following-sibling::span[text()='Required field']")
	WebElement RequiredFieldOninput_Email;

	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]//following-sibling::span[text()='Required field']")
	WebElement RequiredFieldOninput_Password;

	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]")
	WebElement input_Password;

	@FindBy(xpath = "//input[contains(@id, 'UserNameInput')]")
	WebElement input_EmailAdmin;
	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]")
	WebElement input_PasswordAdmin;

	// ================================================== Initializing the Page Objects ==================================================
	public LoginPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void clickForgottenPasswordLink()throws Exception{
		CommonFunctions.clickElement(ForgottenPasswordLink);
	}

	public RegistrationPage clickForgottenRegisterLink()throws Exception{
		CommonFunctions.clickElement(RegisterLink);
		return new RegistrationPage();
	}

	public void clickForgottenPasswordSubmitBtn()throws Exception{
		CommonFunctions.clickElement(ForgottenPasswordSubmitBtn);
	}

	public void setForgottenPasswordEmailField(String VerifyEmail)throws Exception{
		CommonFunctions.clearThenEnterElementValue(ForgottenPasswordEmailField, VerifyEmail);
	}

	public void displayedForgottenPasswordUserEmail()throws Exception{
		CommonFunctions.elementDisplayed(ForgottenPasswordEmailField);
	}

	public void displayedForgottenPasswordSubmitBtn()throws Exception{
		CommonFunctions.elementDisplayed(ForgottenPasswordSubmitBtn);
	}

	public void containsValueEmailInput(String expectedValue)throws Exception{
		CommonFunctions.elementAttributeContains(input_Email, "value", expectedValue);
	}

	public void PasswordValueNull()throws Exception{
		String expectedValue = "";
		CommonFunctions.elementAttributeContains(input_Email, "value", expectedValue);
	}

	public void displayedRequiredFieldOninput_Email()throws Exception{
		CommonFunctions.elementDisplayed(RequiredFieldOninput_Email);
	}

	public void displayedRequiredFieldOninput_Password()throws Exception{
		CommonFunctions.elementDisplayed(RequiredFieldOninput_Password);
	}

	public void displayedForgottenPasswordLink()throws Exception{
		CommonFunctions.elementDisplayed(ForgottenPasswordLink);
	}

	public void displayedRegisterLink()throws Exception{
		CommonFunctions.elementDisplayed(RegisterLink);
	}

	public void displayedPassInput()throws Exception{
		CommonFunctions.elementDisplayed(input_Password);
	}

	public void displayedButtonLogIn()throws Exception{
		CommonFunctions.elementDisplayed(button_Login);
	}

	public void displayedEmailInput()throws Exception{
		CommonFunctions.elementDisplayed(input_Email);
	}

	public void setEmailInput(String email)throws Exception{
		CommonFunctions.clearThenEnterElementValue(input_Email, email);
	}

	public void setPasswordInput(String password)throws Exception{
		CommonFunctions.clearThenEnterElementValue(input_Password, password);
	}

	public HomePage clickLoginButton()throws Exception{
		CommonFunctions.clickElement(button_Login);

		return new HomePage();
	}

	public AddOnsPage clickLoginButton2()throws Exception{
		CommonFunctions.clickElement(button_Login);

		return new AddOnsPage();
	}

	public BeneficiariesPage clickLoginButton1()throws Exception{
		CommonFunctions.clickElement(button_Login);

		return new BeneficiariesPage();
	}

	public DashboardPage clickLoginDashboard()throws Exception{
		CommonFunctions.clickElement(button_Login);
		return new DashboardPage();
	}

	public void setEmailInputAdmin(String password)throws Exception{
		CommonFunctions.clearThenEnterElementValue(input_EmailAdmin, password);
	}

	public IDdocsPage clickIDLogin()throws Exception{
		CommonFunctions.clickElement(button_Login);

		return new IDdocsPage();
	}

}
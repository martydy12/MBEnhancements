package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class RegistrationPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'FirstNameField')]")
	WebElement FirstNameField;
	@FindBy(xpath = "//input[contains(@id,'FamilyNameField')]")
	WebElement FamilyNameField;
	@FindBy(xpath = "//input[contains(@id,'EmailField')]")
	WebElement EmailField;
	@FindBy(xpath = "//input[contains(@id,'PasswordField')]")
	WebElement PasswordField;
	@FindBy(xpath = "//input[contains(@id,'ConfirmPasswordField')]")
	WebElement ConfirmPasswordField;
	@FindBy(xpath = "//input[contains(@id,'CBPrivacy1')]")
	WebElement PrivacyCheckbox;
	@FindBy(xpath = "//input[contains(@id,'CBPrivacy2')]")
	WebElement PrivacyCheckbox1;
	@FindBy(xpath = "//select[contains(@id,'StateDropdown')]")
	WebElement StateDropdown;
	@FindBy(xpath = "//select[contains(@id,'SourceDropdown')]")
	WebElement SourceDropdown;
	@FindBy(xpath = "//span[text()='Privacy Policy']")
	WebElement PrivacyPolicyLink;
	@FindBy(xpath = "//input[@value='Create Account']")
	WebElement CreateAccountButton;
	@FindBy(xpath = "//input[contains(@id,'DescriptionField')]")
	WebElement DescriptionField;
	@FindBy(xpath = "//span[text()='Back to Login']")
	WebElement BacktoLogin;
	@FindBy(xpath = "//span[@class='fa fa-fw fa-info-circle']")
	WebElement PasswordPolicyToolTip;

	// RequiredFields ===========================================================
	@FindBy(xpath = "//input[contains(@id, 'FirstNameField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredFirstNameField;
	@FindBy(xpath = "//input[contains(@id, 'FamilyNameField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredFamilyNameField;
	@FindBy(xpath = "//input[contains(@id, 'EmailField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredEmailField;
	@FindBy(xpath = "//input[contains(@id, 'EmailField')]//following-sibling::span[text()='Looks like this email is not valid. Please try again.']")
	WebElement InvalidEmailField;
	@FindBy(xpath = "//input[contains(@id, 'EmailField')]//following-sibling::span[text()='Email address already registered.  Try another']")
	WebElement RegisteredEmailField;
	@FindBy(xpath = "//input[contains(@id, 'PasswordField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredPasswordField;
	//@FindBy(xpath = "//input[contains(@id, 'PasswordField')]//following-sibling::span[text()='Password entered does not meet our password policy. Please try again.']")
	@FindBy(xpath = "(//input[contains(@name, 'PasswordField')])[1]//following-sibling::div[text()='Password must be at least 8 characters and contain 3 of the following:']")
	WebElement InvalidPasswordField;

	@FindBy(xpath = "//input[contains(@id, 'ConfirmPasswordField')]//following-sibling::span[text()='Passwords do not match, please try again.']")
	WebElement InvalidConfirmPasswordField;

	@FindBy(xpath = "//input[contains(@id, 'ConfirmPasswordField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredConfirmPasswordField;
	@FindBy(xpath = "//select[contains(@id,'StateDropdown')]//following-sibling::span[text()='Required field']")
	WebElement RequiredStateDropdown;
	@FindBy(xpath = "//select[contains(@id,'SourceDropdown')]//following-sibling::span[text()='Required field']")
	WebElement RequiredSourceDropdown;
	@FindBy(xpath = "//input[contains(@id, 'DescriptionField')]//following-sibling::span[text()='Required field']")
	WebElement RequiredDescriptionField;
	// @FindBy(xpath = "//input[contains(@id,'CBPrivacy')]//following-sibling::span[contains(text(),'You must agree to the ')]")
	// WebElement RequiredPrivacyCheckbox;

	// ---
	@FindBy(xpath = "//span[contains(@id,'tooltip_block')]")
	WebElement ToolTipContent1;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include an uppercase character')]")
	WebElement ToolTipContent2;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include an lowercase character')]")
	WebElement ToolTipContent3;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include a number')]")
	WebElement ToolTipContent4;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include a special character')]")
	WebElement ToolTipContent5;

	// Privacy Requirements
	@FindBy(xpath = "//span[text()='You must agree to the MyLife WillsTM Terms & Conditions to complete registration.']")
	WebElement required_TermsCondition;
	@FindBy(xpath = "//span[text()='You must agree to the Collection Statement and Privacy Policy to complete registration.']")
	WebElement required_CollectionPolicy;

	// Checkbox
	@FindBy(xpath = "//input[contains(@id,'CBPrivacy2')]")
	WebElement RequiredPrivacyCheckbox2;

	// Links
	@FindBy(xpath = "//*[contains(text(),'Terms and Conditions')]")
	WebElement Link_TermsConditions;
	@FindBy(xpath = "//*[contains(text(),'Collection Statement')]")
	WebElement Link_CollectionStatement;
	@FindBy(xpath = "//*[contains(text(),'Privacy Policy')]")
	WebElement Link_PrivacyPolicy;
	@FindBy(xpath = "//span[text()='Thank you for registering']")
	WebElement text_Thankyou;

	// ================================================== Initializing the Page Objects ==================================================
	public RegistrationPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void CheckToolTipContent1()throws Exception{
		CommonFunctions.clickElement(ToolTipContent1);
	}

	public void CheckToolTipContent2()throws Exception{
		CommonFunctions.elementDisplayed(ToolTipContent2);
	}

	public void CheckToolTipContent3()throws Exception{
		CommonFunctions.elementDisplayed(ToolTipContent3);
	}

	public void CheckToolTipContent4()throws Exception{
		CommonFunctions.elementDisplayed(ToolTipContent4);
	}

	public void CheckToolTipContent5()throws Exception{
		CommonFunctions.elementDisplayed(ToolTipContent5);
	}

	public void clickPrivacyCheckbox()throws Exception{
		CommonFunctions.clickElement(PrivacyCheckbox);
	}
	
	public void clickPrivacyCheckbox1()throws Exception{
		CommonFunctions.clickElement(PrivacyCheckbox1);
	}

	public void clickCreateAccountButton()throws Exception{
		CommonFunctions.clickElement(CreateAccountButton);
	}

	public void clickPrivacyLink()throws Exception{
		CommonFunctions.clickElement(PrivacyPolicyLink);
	}

	public void displayedFirstNameField()throws Exception{
		CommonFunctions.elementDisplayed(FirstNameField);
	}

	public void displayedFamilyNameField()throws Exception{
		CommonFunctions.elementDisplayed(FamilyNameField);
	}

	public void displayedEmailField()throws Exception{
		CommonFunctions.elementDisplayed(EmailField);
	}

	public void displayedPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(PasswordField);
	}

	public void displayedConfirmPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(ConfirmPasswordField);
	}

	public void displayedPrivacyCheckbox()throws Exception{
		CommonFunctions.elementDisplayed(PrivacyCheckbox);
	}

	public void displayedStateDropdown()throws Exception{
		CommonFunctions.elementDisplayed(StateDropdown);
	}

	public void displayedSourceDropdown()throws Exception{
		CommonFunctions.elementDisplayed(SourceDropdown);
	}

	public void displayedPrivacyPolicyLink()throws Exception{
		CommonFunctions.elementDisplayed(PrivacyPolicyLink);
	}

	public void displayedBacktoLoginLink()throws Exception{
		CommonFunctions.elementDisplayed(BacktoLogin);
	}

	public void SelectValueOnSourceDropdown(String SelectedValue)throws Exception{
		CommonFunctions.selectValueFromDropdown(SourceDropdown, SelectedValue);
	}

	public void SelectValueOnStateDropdown(String SelectedValue) throws Exception{
		CommonFunctions.selectValueFromDropdown(StateDropdown, SelectedValue);
	}

	public void displayedCreateAccountButton()throws Exception{
		CommonFunctions.elementDisplayed(CreateAccountButton);
	}

	public void displayedDescriptionField()throws Exception{
		CommonFunctions.elementDisplayed(DescriptionField);
	}

	// RequiredFields ==========================================================
	public void displayedRequiredFirstNameField()throws Exception{
		CommonFunctions.elementDisplayed(RequiredFirstNameField);
	}

	public void displayedRequiredFamilyNameField()throws Exception{
		CommonFunctions.elementDisplayed(RequiredFamilyNameField);
	}

	public void displayedRequiredEmailField()throws Exception{
		CommonFunctions.elementDisplayed(RequiredEmailField);
	}

	public void displayedInvalidEmailField()throws Exception{
		CommonFunctions.elementDisplayed(InvalidEmailField);
	}

	public void displayedInvalidRegisteredEmailField()throws Exception{
		CommonFunctions.elementDisplayed(RegisteredEmailField);
	}

	public void displayedInvalidPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(InvalidPasswordField);
	}

	public void displayedInvalidConfirmPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(InvalidConfirmPasswordField);
	}

	public void displayedRequiredPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(RequiredPasswordField);
	}

	public void displayedRequiredConfirmPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(RequiredConfirmPasswordField);
	}

	public void displayedRequiredStateDropdown()throws Exception{
		CommonFunctions.elementDisplayed(RequiredStateDropdown);
	}

	public void displayedRequiredSourceDropdown()throws Exception{
		CommonFunctions.elementDisplayed(RequiredSourceDropdown);
	}

	public void displayedRequiredDescriptionField()throws Exception{
		CommonFunctions.elementDisplayed(RequiredDescriptionField);
	}

	public void displayedRequiredPrivacyCheckbox()throws Exception{
		CommonFunctions.elementDisplayed(required_CollectionPolicy);
	}

	public void setFirstNameField(String Value) throws Exception{
		CommonFunctions.clearThenEnterElementValue(FirstNameField, Value);
	}

	public void setFamilyNameField(String Value) throws Exception{
		CommonFunctions.clearThenEnterElementValue(FamilyNameField, Value);
	}

	public String setEmailField(String Value)throws Exception{
		CommonFunctions.clearThenEnterElementValue(EmailField, Value);
		return Value;
	}

	public void setPasswordField(String Value)throws Exception{
		CommonFunctions.clearThenEnterElementValue(PasswordField, Value);
	}

	public void setConfirmPasswordField(String Value)throws Exception{
		CommonFunctions.clearThenEnterElementValue(ConfirmPasswordField, Value);
	}

	public void HoverOnPasswordToolTip()throws Exception{
		CommonFunctions.hoverElement(PasswordPolicyToolTip);
	}

	public void clickRequiredCheckbox2()throws Exception{
		CommonFunctions.clickElement(RequiredPrivacyCheckbox2);
	}

	public void displayedRequiredTermsCondition()throws Exception{
		CommonFunctions.elementDisplayed(required_TermsCondition);

	}

	public void clickTermsCondition()throws Exception{
		CommonFunctions.clickElement(Link_TermsConditions);
	}

	public void clickCollectionStatement()throws Exception{
		CommonFunctions.clickElement(Link_CollectionStatement);
	}

	public void clickPrivacyPolicy()throws Exception{
		CommonFunctions.clickElement(Link_PrivacyPolicy);
	}
	public void displayedThankYou()throws Exception{
		CommonFunctions.elementDisplayed(text_Thankyou);

	}

}
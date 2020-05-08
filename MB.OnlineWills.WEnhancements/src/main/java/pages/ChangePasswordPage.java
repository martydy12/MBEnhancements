package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ChangePasswordPage extends Base {
	// ========================================================= Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'NewPasswordField')]")
	WebElement NewPassword;
	@FindBy(xpath = "//input[contains(@id,'ConfirmPasswordField')]")
	WebElement ConfirmPassword;
	@FindBy(xpath = "//input[@value='Update Password']")
	WebElement SubmitButton;
	@FindBy(xpath = "//span[@class='fa fa-fw fa-info-circle']")
	WebElement PasswordPolicyToolTip;
	@FindBy(xpath = "//div[@class = 'balloon-content' and contains(., 'Be a minimum password length: 8 Characters') and contains(., 'Contain characters from three of the following four categories:') and contains(., 'English uppercase characters (A through Z)') and contains(., 'English lowercase characters (a through z)') and contains(., 'Base 10 digits (0 through 9)')and contains(., 'Non-alphabetic characters (for example, !, $, #, %)')]")
	WebElement ToolTipContent1;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include an uppercase character')]")
	WebElement ToolTipContent2;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include an lowercase character')]")
	WebElement ToolTipContent3;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include a number')]")
	WebElement ToolTipContent4;
	@FindBy(xpath = "//div[@class = 'tool-tex' and contains(., 'Must include a special character')]")
	WebElement ToolTipContent5;
	@FindBy(xpath = "//input[contains(@id,'NewPasswordField')]//following-sibling::span[text()='Required field']")
	WebElement NewPasswordRequiredField;
	@FindBy(xpath = "//input[contains(@id,'ConfirmPasswordField')]//following-sibling::span[text()='Required field']")
	WebElement ConfirmPasswordRequiredField;

	// ================================================== Initializing the Page Objects ==================================================
	public void CheckToolTipContent1()throws Exception{
		CommonFunctions.elementDisplayed(ToolTipContent1);
	}

	public void setPasswordField(String Value)throws Exception{
		CommonFunctions.clearThenEnterElementValue(NewPassword, Value);
	}

	public void setConfirmPasswordField(String Value)throws Exception{
		CommonFunctions.clearThenEnterElementValue(ConfirmPassword, Value);
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

	public ChangePasswordPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void DisplayedNewPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(NewPassword);
	}

	public void DisplayedReqNewPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(NewPasswordRequiredField);
	}

	public void DisplayedConfirmPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(ConfirmPassword);
	}

	public void DisplayedConfirmReqPasswordField()throws Exception{
		CommonFunctions.elementDisplayed(ConfirmPasswordRequiredField);
	}

	public void DisplayedSubmitButton()throws Exception{
		CommonFunctions.elementDisplayed(SubmitButton);
	}

	public void HoverOnPasswordToolTip()throws Exception{
		CommonFunctions.clickElement(PasswordPolicyToolTip);
	}

	public void clickOnSubmitButton()throws Exception{
		CommonFunctions.clickElement(SubmitButton);
	}

}
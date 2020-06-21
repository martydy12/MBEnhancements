package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class CodePage extends Base {
	// ========================================================= Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id, 'PasswordInput')]")
	WebElement input_Password;
	@FindBy(xpath = "//table[contains(@id,'UserAccountTable')]//tr//td[text()='test@7890.com']//parent::tr//a[contains(@id,'30')]")
	//@FindBy(xpath = "(//td[@class='TableRecords_EvenLine']//following::a)[1]")
	WebElement CodeResetPasswordLink;
	
	@FindBy(xpath = "//a[@class='ListNavigation_Next']")
		WebElement NextPage;

	// ================================================== Initializing the Page Objects ==================================================
	public CodePage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public ChangePasswordPage clickResetPasswordLink()throws Exception{
		CommonFunctions.clickElement(CodeResetPasswordLink);
		return new ChangePasswordPage();
	}
	public void ClickNextPage()throws Exception{
		CommonFunctions.clickElement(NextPage);
	}

	public ChangePasswordPage xxxx()throws Exception{
		CommonFunctions.clickElement(driver.findElement(By.xpath("")));
		return new ChangePasswordPage();
	}

	public LoginPage clickActivationLink(String RegisteredEmail)throws Exception{
		CommonFunctions.clickElement(driver.findElement(By.xpath("(//table[contains(@id, 'UserAccountTable')]//tbody//tr//td[contains(text(), '" + RegisteredEmail + "')]//following-sibling::td)[1]//a")));
		return new LoginPage();
	}
}
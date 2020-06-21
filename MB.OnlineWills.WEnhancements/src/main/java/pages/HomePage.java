package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class HomePage extends Base {
	// ========================================================== Page Objects
	// ===========================================================
	/* CSS Property */
	@FindBy(xpath = "//div[contains (@class, 'menu-item  background-red OSInline')]")
	WebElement css_Red;

	@FindBy(xpath = "//input[@value = 'Yes, logout']")
	WebElement button_LogoutPopup_Yes;
	@FindBy(xpath = "//select[contains(@id,'StatePopUp')]")
	WebElement select_StateResidence;
	@FindBy(xpath = "//input[contains(@id,'StatePopUp')]")
	WebElement input_StateResidence;
	@FindBy(xpath = "//select[contains(@id,'StatePopUp')]")
	WebElement OKBtnPopUpState;
	
	
	
	
	

	@FindBy(xpath = "//*[text() = 'Are you sure you want to log out?']")
	WebElement LogoutPopup;

	@FindBy(xpath = "//input[@value = 'Cancel']")
	WebElement button_LogoutPopup_Cancel;

	@FindBy(xpath = "//span[contains(@username, 'UserNameInfo')]")
	WebElement label_UserFullName;

	@FindBy(xpath = "//a[contains(text(),'Logout')]")
	WebElement link_UserFullNameAccordion_Logout;

	// @FindBy(xpath = "//span[text() = 'Single']")
	@FindBy(xpath = "//input[@value = '2']")
	WebElement SinglesProduct;
	@FindBy(xpath = "//span[text() = 'Couple']")
	WebElement CouplesProduct;
	@FindBy(xpath = "//input[contains(@id,'StandardCoupleGetStarted')]")
	// @FindBy(xpath = "//input[@value='Get Started'][1]")
	WebElement CouplesProductStandardWillBtn;

	@FindBy(xpath = "(//input[@value='Confirm'])[4]")
	WebElement ConfirmFeedbackChangeToStandardCouple;
	@FindBy(xpath = "//input[contains(@id,'StandardSingleGetStarted')]")
	// @FindBy(xpath = "//input[@value='Get Started']")
	WebElement SinglesProductStandardWillBtn;
	@FindBy(xpath = "//input[contains(@id,'PersonalDetailsPopup_block')]")
	WebElement OKBtnPopUp;
	@FindBy(xpath = "//input[contains(@id,'StandardSingleGetStarted')]")
	WebElement SinglesProductStandardWillVicBtn;
	@FindBy(xpath = "//input[contains(@id,'MyLifeSingleGetStarted')]")
	WebElement SinglesProductMyLifeWillBtn;
	@FindBy(xpath = "//input[contains(@id,'MyLifeCoupleGetStarted')]")
	WebElement CouplesProductMyLifeWillBtn;
	@FindBy(xpath = "//input[@value='New Order']")
	WebElement NewOrderPopUp;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement ContinueOrderPopUp;
	@FindBy(xpath = "//div[contains(@id,'VoucherUnion_block_wtTitle')]")
	WebElement PopupHeader;
	@FindBy(xpath = "//a[contains(text(),'Union members click here')]")
	WebElement FreeStandardWill;
	@FindBy(xpath = "//input[contains(@id,'MemberNumberId')]")
	WebElement YourMemberNumber;
	@FindBy(xpath = "//label[contains(text(),'Your member number will be verified on our system')]")
	WebElement MemberNumberFootnote;
	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	WebElement CancelBtn;
	@FindBy(xpath = "//input[contains(@value,'Confirm')]")
	WebElement ConfirmBtn;
	@FindBy(xpath = "//span[contains(@id,'AffiliationUnions_Current_Id')]")
	WebElement ValidationMessage1;
	@FindBy(xpath = "//span[contains(@id,'MemberNumberId')]")
	WebElement ValidationMessage2;
	@FindBy(xpath = "//select[contains(@id,'AffiliationUnions_Current_Id')]")
	WebElement AffiliatedUnionsDropdown;
	@FindBy(xpath = "//span[contains(text(),'$0')]")
	WebElement Cost;
	@FindBy(xpath = "//span[text() = '$0.00']")
	WebElement TotalCost;
	@FindBy(xpath = "//span[text() = '$440.00']")
	WebElement TotalCostWithPOA;
	@FindBy(xpath = "//span[text() = '$839.00']")
	WebElement TotalStandardWillCostWithPOA;

	/* View Text */
	@FindBy(xpath = "//span[contains(text(),'Standard Single Will')]")
	WebElement StandardSingleWill;
	@FindBy(xpath = "//span[contains(text(),'It takes only 30 mins to provide us with all the information we need to draft your Will. ')]")
	WebElement SingleWillBodyText;
	@FindBy(xpath = "//span[contains(text(),'Standard Couple Will')]")
	WebElement StandardCoupleWill;
	@FindBy(xpath = "//span[contains(text(),'It takes only 30 mins to provide us with all the information we need to draft a Will for you and your spouse/partner. ')]")
	WebElement CoupleWillBodyText;
	@FindBy(xpath = "(//span[contains(text(),'A Will for you')])[1]")
	WebElement CoupleWillTypeText1;
	@FindBy(xpath = "//span[contains(text(),'A Will for your spouse/partner')]")
	WebElement CoupleWillTypeText2;

	/* Footer */

	//@FindBy(xpath = "//div[contains(text(),'Â© Copyright 2019 Maurice Blackburn. All Rights Reserved.')]")
	@FindBy(xpath = "//div[contains(text(),'© Copyright 2019 Maurice Blackburn. All Rights Reserved.')]")
	WebElement Footer_MB;
	@FindBy(xpath = "(//span[@class='fa fa-fw fa-ellipsis-v'])[1]")
	WebElement ellipsis_BackOfficeEmailChange;
	@FindBy(xpath = "//a[@class='ListNavigation_Next']")
	WebElement NextPage_BackOfficeEmailChange;
	@FindBy(xpath = "//input[contains(@id,'Partner_Email')]")
	WebElement spouse_NewEmail;
	@FindBy(xpath = "//input[@value='Update']")
	WebElement spouse_NewEmailUpdateButton;
	@FindBy(xpath = "//div[text()='Email Log']")
	WebElement link_EmailLog;
	@FindBy(xpath = "//a[text()='More Options']")
	WebElement moreOption_EmailLog;
	@FindBy(xpath = "//select[contains(@id,'InputUser')]")
	WebElement dropdown_OrdersInputUSer;
	@FindBy(xpath = "//input[contains(@id,'DeleteAll')]")
	WebElement button_OrdersDeleteAll;
	@FindBy(xpath = "(//span[@class='fa fa-fw fa-trash-o fa-2x'])[1]")
	WebElement button_OrdersDelete;

	// ================================================== Initializing the Page
	// Objects ==================================================

	public HomePage() throws Exception {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions
	// =============================================================

	public void selectEmailOnOrders(String newEmail) throws Exception {
		CommonFunctions.selectValueFromDropdown(dropdown_OrdersInputUSer, newEmail);
	}

	public void clickDeleteAllButtonORders() throws Exception {
		CommonFunctions.clickElement(button_OrdersDeleteAll);
	}

	public void clickDeleteButtonORders() throws Exception {
		CommonFunctions.clickElement(button_OrdersDelete);
	}

	public void setSpouseNewEmail(String newEmail) throws Exception {
		CommonFunctions.clearThenEnterElementValue(spouse_NewEmail, newEmail);
	}

	public void ClickOnBackOfficeEmailChangeEmailLogMoreOption() throws Exception {
		CommonFunctions.clickElement(moreOption_EmailLog);
	}

	public void ClickOnBackOfficeEmailChangeUpdateSpouseEmailButton() throws Exception {
		CommonFunctions.clickElement(spouse_NewEmailUpdateButton);
	}

	public void ClickOnBackOfficeEmailChangeEmailLog() throws Exception {
		CommonFunctions.clickElement(link_EmailLog);
	}

	public void checkCouplesProductRadioButtonIsToggled() throws Exception {
		CommonFunctions.elementAttributeContains(CouplesProduct.findElement(By.xpath(".//parent::label//input")),
				"checked", "true");
	}

	public void HoverOnBackOfficeEmailChangeEllipsis() throws Exception {
		CommonFunctions.hoverElement(ellipsis_BackOfficeEmailChange);
	}

	public void ClickOnBackOfficeEmailChangeEllipsis() throws Exception {
		CommonFunctions.clickElement(ellipsis_BackOfficeEmailChange);
	}

	public void ClickOnBackOfficeEmailChangeNexPage() throws Exception {
		CommonFunctions.clickElement(NextPage_BackOfficeEmailChange);
	}

	public void clickNewOrderOnPopUp() throws Exception {
		CommonFunctions.switchFrameByXPath("//div[text()='DEBUG You have an incomplete Order']");
		CommonFunctions.clickElement(NewOrderPopUp);

	}

	public void containsValueUserFullNameLabel(String expectedValue) throws Exception {
		CommonFunctions.elementContainsText(label_UserFullName, expectedValue);
	}

	public void displayedCouplesProductMyLifeWillBtn() throws Exception {
		CommonFunctions.elementDisplayed(CouplesProductMyLifeWillBtn);
	}

	public void displayedCouplesProductStandardWillBtn() throws Exception {
		CommonFunctions.elementDisplayed(CouplesProductStandardWillBtn);
	}

	public void displayedCouplesProduct() throws Exception {
		CommonFunctions.elementDisplayed(CouplesProduct.findElement(By.xpath(".//parent::label")));
	}

	public void displayedSinglesProduct() throws Exception {
		CommonFunctions.elementDisplayed(SinglesProduct.findElement(By.xpath(".//parent::label")));
	}

	public void displayedbutton_LogoutPopup_Yes() throws Exception {
		CommonFunctions.elementDisplayed(button_LogoutPopup_Yes);
	}

	public void displayedLogoutPopup() throws Exception {
		CommonFunctions.elementDisplayed(LogoutPopup);
	}

	public void NotdisplayedLogoutPopup() throws Exception {
		CommonFunctions.elementInvisible(LogoutPopup);
	}

	public void displayedbutton_LogoutPopup_Cancel() throws Exception {
		CommonFunctions.elementDisplayed(button_LogoutPopup_Cancel);
	}

	public void clickUserFullNameAccordionLogoutLink() throws Exception {
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(link_UserFullNameAccordion_Logout);
	}

	public void clickUserFullName(String expectedValue) throws Exception {
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(driver.findElement(By.xpath("//*[contains(text(), '" + expectedValue + "')]")));
	}

	public void clickLogoutPopupCancelButton() throws Exception {
		CommonFunctions.clickElement(button_LogoutPopup_Cancel);
	}

	public void clickSinglesProduct() throws Exception {
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.pause(1500, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_UP));
		CommonFunctions.clickElement(SinglesProduct.findElement(By.xpath(".//parent::label")));
	}

	public void clickCouplesProduct() throws Exception {
		CommonFunctions.clickElement(CouplesProduct.findElement(By.xpath(".//parent::label")));
	}

	public void clickMyLifeProduct() throws Exception {
		CommonFunctions.clickElement(CouplesProduct.findElement(By.xpath(".//parent::label")));
	}

	public LoginPage clickLogoutPopupYesButton() throws Exception {
		CommonFunctions.clickElement(button_LogoutPopup_Yes);
	//	CommonFunctions.selectValueFromDropdown(select_StateResidence, "VIC");
	//	CommonFunctions.clickElement(input_StateResidence);

		return new LoginPage();
	}

	public PersonalPage clickCouplesProductStandardWillBtn() throws Exception {
		CommonFunctions.clickElement(CouplesProductStandardWillBtn);
		CommonFunctions.pause(5000, false);
		return new PersonalPage();
	}

	public PersonalPage clickConfirmButtonToChangeToStandardCouple() throws Exception {
		CommonFunctions.clickElement(ConfirmFeedbackChangeToStandardCouple);
		CommonFunctions.pause(5000, false);
		return new PersonalPage();
	}

	public PersonalPage clickSinglesProductStandardWillBtn() throws Exception {
		CommonFunctions.elementDisplayed(SinglesProductStandardWillBtn);
		CommonFunctions.clickElement(SinglesProductStandardWillBtn);

		return new PersonalPage();
	}

	public PersonalPage clickOKBtnPopUp() throws Exception {
		CommonFunctions.elementDisplayed(OKBtnPopUp);
		CommonFunctions.clickElement(OKBtnPopUp);

		return new PersonalPage();
	}

	public PersonalPage clickSinglesProductStandardWillVicBtn() throws Exception {
		CommonFunctions.clickElement(SinglesProductStandardWillVicBtn);

		return new PersonalPage();
	}

	public PersonalPage clickMyLifeProductStandardSingleWillBtn() throws Exception {
		CommonFunctions.clickElement(SinglesProductMyLifeWillBtn);

		return new PersonalPage();
	}

	public PersonalPage clickMyLifeProductStandardCoupleWillBtn() throws Exception {
		CommonFunctions.clickElement(CouplesProductMyLifeWillBtn);

		return new PersonalPage();
	}

	public void ClickFreeStandardWill() throws Exception {
		CommonFunctions.clickElement(FreeStandardWill);
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.pause(3000, false);
	}

	public void DisplayedPopupHeader() throws Exception {
		CommonFunctions.elementDisplayed(PopupHeader);
	}

	public void DisplayedSelectAffliatedUnions() throws Exception {
		CommonFunctions.elementDisplayed(AffiliatedUnionsDropdown);

	}

	public void DisplayedYourMemberNumber() throws Exception {
		CommonFunctions.elementDisplayed(YourMemberNumber);

	}

	public void DisplayedMemberNumberFootnote() throws Exception {
		CommonFunctions.elementDisplayed(MemberNumberFootnote);
	}

	public void DisplayedCancelBtn() throws Exception {
		CommonFunctions.elementDisplayed(CancelBtn);

	}

	public void DisplayedConfirmBtn() throws Exception {
		CommonFunctions.clickElement(ConfirmBtn);

	}

	public void ClickCancelBtn() throws Exception {
		CommonFunctions.clickElement(CancelBtn);

	}

	public void DisplayedValidationMessage1() throws Exception {
		CommonFunctions.elementDisplayed(ValidationMessage1);

	}

	public void DisplayedValidationMessage2() throws Exception {
		CommonFunctions.elementDisplayed(ValidationMessage2);

	}

	public void SelectAffiliatedUnion(String value) throws Exception {
		CommonFunctions.selectValueFromDropdown(AffiliatedUnionsDropdown, value);

	}

	public void SetMemberNumber(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(YourMemberNumber, value);

	}

	public void DisplayedCost() throws Exception {
		CommonFunctions.elementDisplayed(Cost);

	}

	public void DisplayedTotalCost() throws Exception {
		CommonFunctions.elementDisplayed(TotalCost);

	}

	public void DisplayedTotalCostWithPOA() throws Exception {
		CommonFunctions.elementDisplayed(TotalCostWithPOA);

	}

	public PaymentsPage ClickContiueButtonPopUp() throws Exception {
		CommonFunctions.clickElement(ContinueOrderPopUp);
		return new PaymentsPage();

	}

	public void checkCSSColor() throws Exception {
		CommonFunctions.elementCssValueContains(css_Red, "background-color", "rgba(201, 42, 42, 1)");
		// CommonFunctions.elementCssValueContains(css_Red, "font-size", "20px");
	}

	public void checkStandardSingleWillText() throws Exception {
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(StandardSingleWill);
	}

	public void checkSingleWillBodyText() throws Exception {
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(SingleWillBodyText);
	}

	public void checkStandardCoupleWillText() throws Exception {
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(StandardCoupleWill);
	}

	public void checkCoupleWillBodyText1() throws Exception {
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(CoupleWillBodyText);
	}

	public void checkCoupleWillBodyText2() throws Exception {
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(CoupleWillTypeText1);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(CoupleWillTypeText2);
	}

	public void checkFooterIfDisplayed() throws Exception {
		CommonFunctions.scrollToBottom();
		CommonFunctions.pause(2500, false);
		CommonFunctions.elementDisplayed(Footer_MB);
	}

}
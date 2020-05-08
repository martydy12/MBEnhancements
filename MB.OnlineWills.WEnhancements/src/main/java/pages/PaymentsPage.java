package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class PaymentsPage extends Base {
	// ========================================================== Page Objects
	// ===========================================================
	@FindBy(xpath = "//input[contains(@id,'AddPOAButtonSingle')]")
	WebElement AddPOAButton;
	@FindBy(xpath = "//input[contains(@value,'Next')]")
	WebElement btn_Next;
	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement btn_back;
	@FindBy(xpath = "//input[contains(@value,'Pay Now')]")
	WebElement btn_paynow;
	@FindBy(xpath = "//input[contains(@value,'Proceed')]")
	WebElement btn_proceed;
	@FindBy(xpath = "//div[contains(text(),'$440.00')]//parent::div//parent::div[contains(@class,'all')]")
	WebElement txt_Addons;
	@FindBy(xpath = "//input[contains(@value,'Download Costs Disclosure and T&Cs')]")
	WebElement btn_DownloadCostDisclosure;

	@FindBy(xpath = "//div[contains(text(),'$0.00')]")
	WebElement dsplay_amount;
	@FindBy(xpath = "//span[contains(text(),'$0.00')]")
	WebElement dsplay_total;
	@FindBy(xpath = "//span[contains(text(),'$440.00')]")
	WebElement dsplay_totalWithPOA;
	@FindBy(xpath = "//span[text() = '$839.00']")
	WebElement TotalStandardWillCostWithPOA;
	@FindBy(xpath = "//span[text() = '$1039.00']")
	WebElement TotalCoupleWillCostWithPOA;
	@FindBy(xpath = "//select[contains(@id,'MainContent')]")
	WebElement dropdown_UnionMemebership;
	@FindBy(xpath = "//input[contains(@id,'MemberNumberId')]")
	WebElement input_UnionMemebership;
	@FindBy(xpath = "//input[@value='Apply']")
	WebElement button_UnionMemebershipApply;



	// ================================================== Initializing the Page
	// Objects ==================================================
	public PaymentsPage() throws Exception {
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions
	// =============================================================

	public void clickAddPOAButton() throws Exception {
		CommonFunctions.clickElement(AddPOAButton);
	}
	public void clickApplyUnionButton() throws Exception {
		CommonFunctions.clickElement(button_UnionMemebershipApply);
	}

	public void selectValueFromUnionDropdown(String value) throws Exception {

		CommonFunctions.selectValueFromDropdown(dropdown_UnionMemebership, value);
	}
	public void setValueForUnion(String value) throws Exception {

		CommonFunctions.clearThenEnterElementValue(input_UnionMemebership, value);
	}

	public FinancialDecisionsPage clickNextWithPOA() throws Exception {
		CommonFunctions.clickElement(btn_Next);
		return new FinancialDecisionsPage();
	}

	public ReviewConfirmPage clickBack() throws Exception {
		CommonFunctions.clickElement(btn_back);
		return new ReviewConfirmPage();
	}

	public CheckOutPage clickPayNow() throws Exception {
		CommonFunctions.clickElement(btn_paynow);
		return new CheckOutPage();
	}

	public void checkAddonsDisplayed() throws Exception {
		CommonFunctions.elementDisplayed(txt_Addons);
		CommonFunctions.pause(3000, false);

	}

	public void clickProceedPayment() throws Exception {
		CommonFunctions.clickElement(btn_proceed);
		CommonFunctions.pause(3000, false);
	}

	public void displaySWLDAmount() throws Exception {
		CommonFunctions.elementDisplayed(dsplay_amount);
	}

	public void displaySWLDTotal() throws Exception {
		CommonFunctions.elementDisplayed(dsplay_total);
		CommonFunctions.pause(3000, false);
	}

	public void displaySWLDTotalWithPOA() throws Exception {
		CommonFunctions.elementDisplayed(dsplay_totalWithPOA);
		CommonFunctions.pause(3000, false);
	}

	public CheckOutPage ClickProceed() throws Exception {
		CommonFunctions.clickElement(btn_proceed);
		return new CheckOutPage();
	}

	public void DisplayedTotalStandardWillCostWithPOA() throws Exception {
		CommonFunctions.elementDisplayed(TotalStandardWillCostWithPOA);

	}

	public void DisplayedTotalCoupleWillCostWithPOA() throws Exception {
		CommonFunctions.elementDisplayed(TotalCoupleWillCostWithPOA);

	}

	public void clickCostDisclosure() throws Exception {
		CommonFunctions.clickElement(btn_DownloadCostDisclosure);
		CommonFunctions.pause(3000, false);
	}

}
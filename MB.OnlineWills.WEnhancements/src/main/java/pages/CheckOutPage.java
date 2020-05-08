package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class CheckOutPage extends Base {
	// ========================================================== Page Objects ===========================================================
	//Billing information
	
	@FindBy(xpath = "//input[contains(@id,'bill_to_forename')]")
	WebElement Field_FName;
	@FindBy(xpath = "//input[contains(@id,'bill_to_surname')]")
	WebElement Field_SNAme;
	@FindBy(xpath = "//input[contains(@id,'bill_to_address_line1')]")
	WebElement Field_Address1;
	@FindBy(xpath = "//input[contains(@id,'bill_to_address_line2')]")
	WebElement Field_Address2;
	@FindBy(xpath = "//input[contains(@id,'bill_to_address_city')]")
	WebElement Field_City;
	@FindBy(xpath = "//select[contains(@id,'bill_to_address_country')]")
	WebElement Selection_Country;
	@FindBy(xpath = "//input[contains(@id,'bill_to_address_state')]")
	WebElement Field_State;
	@FindBy(xpath = "//input[contains(@id,'bill_to_address_postal_code')]")
	WebElement Field_Postal;
	@FindBy(xpath = "//input[contains(@id,'bill_to_phone')]")
	WebElement Field_PhoneNo;
	@FindBy(xpath = "//input[contains(@id,'bill_to_email')]")
	WebElement Field_Email;
	
	
	
	//Payment Details
	@FindBy(xpath = "//ol[contains(@id,'card_type_selection')]")
	WebElement Selection_CardType;
	@FindBy(xpath = "//input[contains(@id,'card_type_001')]")
	WebElement Visa_CardType;
	@FindBy(xpath = "//input[contains(@id,'card_type_002')]")
	WebElement Master_CardType;
	@FindBy(xpath = "//input[contains(@id,'card_type_003')]")
	WebElement Amex_CardType;
	@FindBy(xpath = "//div[@id = 'card_type_error']")
	WebElement CardTypeError;
	@FindBy(xpath = "//div[@id = 'card_number_error']")
	WebElement CardNumberError;
	@FindBy(xpath = "//div[@id = 'card_expiry_date_error']")
	WebElement CardExpError;
	@FindBy(xpath = "//input[@id='card_number']")
	WebElement Field_CardNumber;
	@FindBy(xpath = "//select[contains(@id,'card_expiry_month')]")
	WebElement Select_ExpMonth;
	@FindBy(xpath = "//select[contains(@id,'card_expiry_year')]")
	WebElement Select_ExpYear;
	@FindBy(xpath = "//input[@id = 'card_cvn']")
	WebElement Field_CVN;
	@FindBy(xpath = "//input[@value='Pay']")
	WebElement Btn_Pay;
	@FindBy(xpath = "//input[@value='Cancel']")
	WebElement Btn_Cancel;
	@FindBy(xpath = "//span[text()='Yes']//parent::button")
	WebElement Btn_Yes;
	@FindBy(xpath = "//span[text()='No']//parent::button")
	WebElement Btn_No;
	@FindBy(xpath = "//*[text()='Cancel Order']")
	WebElement PopupCancelOrder;
	@FindBy(xpath = "//a[text() = ' Return to Website']")
	WebElement Btn_Return;
	@FindBy(xpath = "//option[@value='01']")
	WebElement SelectMonth;
	@FindBy(xpath = "//option[@value='2025']")
	WebElement SelectYear;

	// ================================================== Initializing the Page Objects ==================================================
	public CheckOutPage()throws Exception{
		PageFactory.initElements(driver, this);

	}

	// ============================================================= Actions =============================================================

	// Error message
	public void displayCardTypeErrorMessage()throws Exception{
		CommonFunctions.elementDisplayed(CardTypeError);
		CommonFunctions.pause(5000, false);
	}

	public void displayCardNumberErrorMessage()throws Exception{
		CommonFunctions.elementDisplayed(CardNumberError);
		CommonFunctions.pause(5000, false);
	}

	public void displayCardExpirationErrorMessage()throws Exception{
		CommonFunctions.elementDisplayed(CardExpError);
		CommonFunctions.pause(5000, false);
	}

	// Field Display
	public void displayCardType()throws Exception{
		CommonFunctions.elementDisplayed(Selection_CardType);
		CommonFunctions.pause(5000, false);
	}

	public void displayVisaCardType()throws Exception{
		CommonFunctions.elementDisplayed(Visa_CardType);
	}

	public void displayMasterCardType()throws Exception{
		CommonFunctions.elementDisplayed(Master_CardType);
	}

	public void displayAmexCardType()throws Exception{
		CommonFunctions.elementDisplayed(Amex_CardType);
	}

	public void displayCardNumber()throws Exception{
		CommonFunctions.elementDisplayed(Field_CardNumber);
		CommonFunctions.pause(5000, false);
	}

	public void displayExpMonth()throws Exception{
		CommonFunctions.elementDisplayed(Select_ExpMonth);
	}

	public void displayYearMonth()throws Exception{
		CommonFunctions.elementDisplayed(Select_ExpYear);
	}

	public void displayCVN()throws Exception{
		CommonFunctions.elementDisplayed(Field_CVN);
	}
	
	public void displayBillingInformation()throws Exception{
		CommonFunctions.elementDisplayed(Field_FName);
		CommonFunctions.elementDisplayed(Field_SNAme);
		CommonFunctions.elementDisplayed(Field_Address1);
		CommonFunctions.elementDisplayed(Field_Address2);
		CommonFunctions.elementDisplayed(Field_City);
		CommonFunctions.elementDisplayed(Selection_Country);
		CommonFunctions.elementDisplayed(Field_State);
		CommonFunctions.elementDisplayed(Field_Postal);
		CommonFunctions.elementDisplayed(Field_PhoneNo);
		CommonFunctions.elementDisplayed(Field_Email);
	}
	

	// Payment Details
	public void fillUpPaymentDetails()throws Exception{
		CommonFunctions.clickElement(Visa_CardType);
		CommonFunctions.pause(3000, false);
		CommonFunctions.clearThenEnterElementValue(Field_CardNumber, "4111111111111111");
		CommonFunctions.pause(3000, false);
		CommonFunctions.clearThenEnterElementValue(Field_CVN, "132");
		CommonFunctions.pause(3000, false);
	}

	public void selectMonth()throws Exception{
		CommonFunctions.clickElement(SelectMonth);
		CommonFunctions.pause(5000, false);
	}

	public void selectYear()throws Exception{
		CommonFunctions.clickElement(SelectYear);
		CommonFunctions.pause(5000, false);
	}

	// Buttons
	public void ClickPayButton()throws Exception{
		CommonFunctions.clickElement(Btn_Pay);
		CommonFunctions.pause(5000, false);
	}

	public PaymentsPage ClickCancelButton()throws Exception{
		CommonFunctions.clickElement(Btn_Cancel);
		return new PaymentsPage();
	}

	public HomePage ClickReturn()throws Exception{
		CommonFunctions.clickElement(Btn_Return);
		return new HomePage();
	}

	// Pop-up

	public void displayCancelOrderPopup()throws Exception{
		CommonFunctions.elementDisplayed(PopupCancelOrder);
	}

	public void clickYesCancelOrder()throws Exception{
		CommonFunctions.switchFrameByXPath("//*[text()='Cancel Order']");
		CommonFunctions.clickElement(Btn_Yes);

	}

	public void clickNoCancelOrder()throws Exception{
		CommonFunctions.switchFrameByXPath("//*[text()='Cancel Order']");
		CommonFunctions.clickElement(Btn_No);

	}

}
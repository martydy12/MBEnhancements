package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class FinancialDecisionsPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'AddPOA')]")
	WebElement btn_AddPOA;
	@FindBy(xpath = "//input[contains(@value,'Save and Continue')]")
	WebElement btn_Next;
	@FindBy(xpath = "//span[text()='Both financial and personal matters']//preceding-sibling::input")
	WebElement BothFinancialAndPersonalMatters;
	@FindBy(xpath = "//span[text()='Only financial matters']//preceding-sibling::input")
	WebElement OnlyFinancialMatters;
	@FindBy(xpath = "//span[text()='Only personal matters']//preceding-sibling::input")
	WebElement OnlyPersonalMatters;
	@FindBy(xpath = "//span[text()='Only personal matters']//following::span[text()='Required Field']")
	WebElement EnduringPOAReq;
	@FindBy(xpath = "//select[contains(@id,'AttorneyWhenToActComboBox')]")
	WebElement AttorneyWhenToActDropdown;
	@FindBy(xpath = "//select[contains(@id,'AttorneyWhenToActComboBox')]//following::a//following::span//following::span[text()='Required field']")
	WebElement AttorneyWhenToActDropdownReq;
	@FindBy(xpath = "//textarea[contains(@id,'LimitationsInput')]")
	WebElement LimitationsInput;
	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement btn_Back;
	@FindBy(xpath = "//input[contains(@id,'PersonalDecisionMakerRadioYes')]")
	WebElement PersonalDecisionMakerRadioYes;
	@FindBy(xpath = "//input[contains(@id,'PersonalDecisionMakerRadioNo')]")
	WebElement PersonalDecisionMakerRadioNo;
	@FindBy(xpath = "//input[contains(@id,'PersonalDecisionMakerRadioNo')]//following::div[text()='Required field']")
	WebElement PersonalDecisionMakerRadioReq;
	@FindBy(xpath = "//div[text()='At least 1 Primary Financial Decision Maker is required.']")
	WebElement FinancialDecisionMakerReq;
	@FindBy(xpath = "//div[text()='At least 1 Primary Personal Decision Maker is required.']")
	WebElement PersonalDecisionMakerReq;
	@FindBy(xpath = "//a[contains(@id,'AddFinancialDecisionMakerID')]")
	WebElement AddFinancialDecisionMakerID;
	@FindBy(xpath = "//a[contains(@id,'AddPersonalDecisionMakerId')]")
	WebElement AddPersonalDecisionMakerID;
	@FindBy(xpath = "//select[contains(@id,'POATitle')]")
	WebElement POATitle;
	@FindBy(xpath = "(//select[contains(@id,'POATitle')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POATitleReq;
	@FindBy(xpath = "//input[contains(@id,'POAFirstName')]")
	WebElement POAFirstName;
	@FindBy(xpath = "(//input[contains(@id,'POAFirstName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAFirstNameReq;
	@FindBy(xpath = "//input[contains(@id,'POAMiddleName')]")
	WebElement POAMiddleName;
	@FindBy(xpath = "//input[contains(@id,'POALastName')]")
	WebElement POALastName;
	@FindBy(xpath = "(//input[contains(@id,'POALastName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POALastNameReq;
	@FindBy(xpath = "//input[contains(@id,'POADateOfBirth')]")
	WebElement POADOB;
	@FindBy(xpath = "(//input[contains(@id,'POADateOfBirth')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POADOBReq;
	@FindBy(xpath = "//input[contains(@id,'POAPhone')]")
	WebElement POAPhone;
	@FindBy(xpath = "(//input[contains(@id,'POAPhone')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAPhoneReq;
	@FindBy(xpath = "//select[contains(@id,'POARelationship')]")
	WebElement POARel;
	@FindBy(xpath = "(//select[contains(@id,'POARelationship')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POARelReq;
	@FindBy(xpath = "//select[contains(@id,'POACountry')]")
	WebElement POACountry;
	@FindBy(xpath = "//input[contains(@id,'POAAddressLine1')]")
	WebElement POAAddressLine1;
	@FindBy(xpath = "(//input[contains(@id,'POAAddressLine1')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAAddressLine1Req;
	@FindBy(xpath = "//input[contains(@id,'POAAddressLine2')]")
	WebElement POAAddressLine2;
	@FindBy(xpath = "//input[contains(@id,'POASuburb')]")
	WebElement POASuburb;
	@FindBy(xpath = "(//input[contains(@id,'POASuburb')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POASuburbReq;

	@FindBy(xpath = "//select[contains(@id,'POAState')]")
	WebElement POAState;
	@FindBy(xpath = "(//select[contains(@id,'POAState')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAStateReq;
	@FindBy(xpath = "//input[contains(@id,'POAPostCode')]")
	WebElement POAPostCode;
	@FindBy(xpath = "(//input[contains(@id,'POAPostCode')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement POAPostCodeReq;
	@FindBy(xpath = "//input[contains(@id,'FirstOption')]")
	WebElement POAPDMYes;
	@FindBy(xpath = "//input[contains(@id,'Backup')]")
	WebElement POAPDMNo;
	@FindBy(xpath = "(//input[contains(@id,'Backup')]//following::div[text()='Required field'])[1]")
	WebElement POAPDMReq;

	@FindBy(xpath = "//div[contains(@id,'EnduringPOA_Tooltip2')]")
	WebElement EnduringPOA_Tooltip2;
	@FindBy(xpath = "//div[contains(@id,'WhenToAct_Tooltip')]")
	WebElement WhenToAct_Tooltip;
	@FindBy(xpath = "//span[@class='fa fa-fw fa-info-circle']//parent::div[contains(@id,'EnduringPOA_Tooltip3')]")
	WebElement PowerOfAttorney_Tooltip3;

	// ================================================== Initializing the Page Objects ==================================================
	public FinancialDecisionsPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void AddFinancialDecisionMakerID()throws Exception{
		CommonFunctions.clickElement(AddFinancialDecisionMakerID);
	}

	public void AddFinancialDecisionMakerIDHidden()throws Exception{
		CommonFunctions.elementNotExistingByXPath("//a[contains(@id,'AddFinancialDecisionMakerID')]");
	}

	public void AddPersonalDecisionMakerID()throws Exception{
		CommonFunctions.clickElement(AddPersonalDecisionMakerID);
	}

	public void AddPersonalDecisionMakerIDHidden()throws Exception{
		CommonFunctions.elementNotExistingByXPath("//a[contains(@id,'AddPersonalDecisionMakerID')]");
	}

	public void clickAddPOA()throws Exception{
		CommonFunctions.clickElement(btn_AddPOA);
	}

	public void clickPersonalDecisionMakerRadioYes()throws Exception{
		CommonFunctions.clickElement(PersonalDecisionMakerRadioYes);
	}

	public void clickPersonalDecisionMakerRadioNo()throws Exception{
		CommonFunctions.clickElement(PersonalDecisionMakerRadioNo);
	}

	public void SetLimitationsInput(String value)throws Exception{
		CommonFunctions.enterElementValue(LimitationsInput, value);
	}

	public void clickOnlyFinancialMatters()throws Exception{
		CommonFunctions.clickElement(OnlyFinancialMatters);
	}

	public void clickOnlyPersonalMatters()throws Exception{
		CommonFunctions.clickElement(OnlyPersonalMatters);
	}

	public void SelectValueOnAttorneyWhenToActDropdown(String arg1)throws Exception{
		CommonFunctions.selectValueFromDropdown(AttorneyWhenToActDropdown, arg1);
		CommonFunctions.pause(3000, false);
	}

	public void clickBothFinancialAndPersonalMatters()throws Exception{
		CommonFunctions.clickElement(BothFinancialAndPersonalMatters);
	}

	public void FinancialDecisionsMandatoryFieldsBoth()throws Exception{
		CommonFunctions.elementDisplayed(FinancialDecisionMakerReq);
		CommonFunctions.elementDisplayed(PersonalDecisionMakerRadioReq);
		CommonFunctions.elementDisplayed(AttorneyWhenToActDropdownReq);
	}

	public void FinancialDecisionsMandatoryFieldsBothWithPersonal()throws Exception{
		CommonFunctions.elementDisplayed(FinancialDecisionMakerReq);
		CommonFunctions.elementDisplayed(PersonalDecisionMakerReq);
		CommonFunctions.elementDisplayed(AttorneyWhenToActDropdownReq);
	}

	public void FinancialDecisionsMandatoryFieldsOnAddingFinancial()throws Exception{
		CommonFunctions.elementDisplayed(POATitleReq);
		CommonFunctions.elementDisplayed(POAFirstNameReq);
		CommonFunctions.elementDisplayed(POALastNameReq);
		CommonFunctions.elementDisplayed(POADOBReq);
		CommonFunctions.elementDisplayed(POAPhoneReq);
		CommonFunctions.elementDisplayed(POARelReq);
		CommonFunctions.elementDisplayed(POAAddressLine1Req);
		CommonFunctions.elementDisplayed(POASuburbReq);
		CommonFunctions.elementDisplayed(POAStateReq);
		CommonFunctions.elementDisplayed(POAPostCodeReq);
		CommonFunctions.elementDisplayed(POAPDMReq);
		CommonFunctions.pause(5000, false);
	}

	public void SetFinancialDecisionsMandatoryFieldsOnAddingFinancialPDMYes()throws Exception{
		CommonFunctions.selectValueFromDropdown(POATitle, "Dr");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAFirstName, "Demeth");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAMiddleName, "Rey");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POALastName, "Camuin");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAPhone, "4770344");
		CommonFunctions.pause(1500, false);
		CommonFunctions.selectValueFromDropdown(POARel, "Son");
		CommonFunctions.pause(1500, false);
		CommonFunctions.selectValueFromDropdown(POACountry, "AUSTRALIA");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAAddressLine1, "Australia");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAAddressLine2, "Australia");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POASuburb, "Australia");
		CommonFunctions.pause(1500, false);
		CommonFunctions.selectValueFromDropdown(POAState, "VIC");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAPostCode, "1234");
		CommonFunctions.pause(1500, false);
		CommonFunctions.clickElement(POAPDMYes);
		CommonFunctions.enterElementValue(POADOB, "05/09/1990");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}

	public void SetFinancialDecisionsMandatoryFieldsOnAddingFinancialPDMNo()throws Exception{
		CommonFunctions.selectValueFromDropdown(POATitle, "Dr");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAFirstName, "Demeth");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAMiddleName, "Rey");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POALastName, "Camuin");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAPhone, "4770344");
		CommonFunctions.pause(1500, false);
		CommonFunctions.selectValueFromDropdown(POARel, "Son");
		CommonFunctions.pause(1500, false);
		CommonFunctions.selectValueFromDropdown(POACountry, "AUSTRALIA");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAAddressLine1, "Australia");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAAddressLine2, "Australia");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POASuburb, "Australia");
		CommonFunctions.pause(1500, false);
		CommonFunctions.selectValueFromDropdown(POAState, "VIC");
		CommonFunctions.pause(1500, false);
		CommonFunctions.enterElementValue(POAPostCode, "1234");
		CommonFunctions.pause(1500, false);
		CommonFunctions.clickElement(POAPDMNo);
		CommonFunctions.enterElementValue(POADOB, "05/09/1990");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}

	public void FinancialDecisionsMandatoryFieldsFinancial()throws Exception{
		CommonFunctions.elementDisplayed(FinancialDecisionMakerReq);
		CommonFunctions.elementDisplayed(AttorneyWhenToActDropdownReq);
	}

	public void FinancialDecisionsMandatoryFieldsPersonal()throws Exception{
		CommonFunctions.elementDisplayed(PersonalDecisionMakerReq);
		CommonFunctions.elementDisplayed(AttorneyWhenToActDropdownReq);
	}

	public void FinancialDecisionsMandatoryFields()throws Exception{
		CommonFunctions.elementDisplayed(EnduringPOAReq);
		CommonFunctions.elementDisplayed(AttorneyWhenToActDropdownReq);
	}

	public void clickNextWithPOA()throws Exception{
		CommonFunctions.clickElement(btn_Next);
	}

	public MedicalDecisionsPage ClickNextButton()throws Exception{
		CommonFunctions.clickElement(btn_Next);
		return new MedicalDecisionsPage();
	}

	public void ClickEnduringPOA_Tooltip2()throws Exception{
		CommonFunctions.clickElement(EnduringPOA_Tooltip2);
	}

	public void DisplayEnduringPOA_Tooltip2()throws Exception{
		CommonFunctions.elementDisplayed(EnduringPOA_Tooltip2);
	}

	public void ClickWhenToAct_Tooltip()throws Exception{
		CommonFunctions.clickElement(WhenToAct_Tooltip);
	}

	public void DisplayWhenToAct_Tooltip()throws Exception{
		CommonFunctions.elementDisplayed(WhenToAct_Tooltip);
	}
	public void clickPowerOfAttorney_Tooltip3()throws Exception{
		CommonFunctions.clickElement(PowerOfAttorney_Tooltip3);
	}
	
	public void DisplayPowerOfAttorney_Tooltip3()throws Exception{
		CommonFunctions.elementDisplayed(PowerOfAttorney_Tooltip3);
	}

}
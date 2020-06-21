package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class PersonalPage extends Base {
	// ========================================================== Page Objects ===========================================================
	@FindBy(xpath = "//select[contains(@id,'PersonalTitle_ComboBox')]")
	WebElement TitleDropdown;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfoFirstname_Input')]")
	WebElement FirstName;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Middlename_Input')]")
	WebElement MiddleName;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Familyname_Input')]")
	WebElement FamilyName;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_DateOfBirth_Input')]")
	WebElement DateOfBirth;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Phone_Input')]")
	WebElement PhoneNumber;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Occupation_Input')]")
	WebElement Occupation;
	@FindBy(xpath = "//span[text()='Please ensure you are the one filling in this form.']")
	WebElement SectionTitle;
	@FindBy(xpath = "//span[contains(text(),'Hi bam!')]")
	WebElement WelcomeMessage;

	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Line1ResAddress_Input')]")
	WebElement ResidentialAddressLine1;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Line2ResAddress_Input')]")
	WebElement ResidentialAddressLine2;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_SubsurfRes_Input')]")
	WebElement ResidentialSuburb;
	@FindBy(xpath = "//select[contains(@id,'PersonalInfo_StateId_Input')]")
	WebElement ResidentialState;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_PostcodePost_Input')]")
	WebElement ResidentialPostCode;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_IsPostAddDetails_CheckBox')]")
	WebElement ResidentialAddressSameAsResidential;
	
	@FindBy(xpath = "//input[contains(@id,'PersonalDetailsPopup_block')]")
	WebElement OKBtnPopUp;

	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Line1PostAddress_Input')]")
	WebElement PostalAddressLine1;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_Line2PostAddress_Input')]")
	WebElement PostalAddressLine2;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_SubsurfPost_Input')]")
	WebElement PostalSuburb;
	@FindBy(xpath = "//select[contains(@id,'PersonalInfo_StateIdPost_ComboBox')]")
	WebElement PostalState;
	@FindBy(xpath = "//input[contains(@id,'PersonalInfo_PostcodeRes_Input')]")
	WebElement PostalPostCode;

	@FindBy(xpath = "//label[text()='Are you currently in hospital?']")
	WebElement AdditionalQuestion1;
	@FindBy(xpath = "//input[contains(@id,'Hospital_Yes')]")
	WebElement YesQuestion1;
	@FindBy(xpath = "//input[contains(@id,'Hospital_No')]")
	WebElement NoQuestion1;
	@FindBy(xpath = "//label[text()='Have you been diagnosed with any physical, cognitive or mental impairments or disorders that may impact your ability to draft or sign your Will?']")
	WebElement AdditionalQuestion2;
	@FindBy(xpath = "//input[contains(@id,'Diagnosed_Yes')]")
	WebElement YesQuestion2;
	@FindBy(xpath = "//input[contains(@id,'Diagnosed_No')]")
	WebElement NoQuestion2;
	@FindBy(xpath = "//input[@value='Save and Continue']")
	WebElement NextButton;
	@FindBy(xpath = "//input[@value='Back']")
	WebElement BackButton;
	@FindBy(xpath = "//input[contains(@value, 'Cancel')]")
	WebElement CancelButton;

	@FindBy(xpath = "//button[text()='Today']")
	WebElement Today;

	@FindBy(xpath = "//div[contains(@id,'PostalAddress_Container')]")
	WebElement PostalContainer;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='About You']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAbout;
	@FindBy(xpath = "//div[text()='Assets']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAssets;
	@FindBy(xpath = "//div[text()='Beneficiaries']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressBeneficiaries;
	@FindBy(xpath = "//div[text()='Executors']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressExecutors;
	@FindBy(xpath = "//div[text()='ID Docs']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressIDDocs;
	@FindBy(xpath = "//div[text()='Review & Confirm']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressReviewConfirm;
	@FindBy(xpath = "//div[text()='Add-ons']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAddOns;

	// ================================================== Initializing the Page Objects =================================================
	public PersonalPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ================================================== Initializing the Page Objects ==================================================
	public void MaxlengthPhoneNumber()throws Exception{
		CommonFunctions.elementAttributeContains(PhoneNumber, "maxlength", "10");
	}

	public void MaxlengthResPostcode()throws Exception{
		CommonFunctions.elementAttributeContains(ResidentialPostCode, "maxlength", "4");
	}

	public void MaxlengthPostalPostcode()throws Exception{
		CommonFunctions.elementAttributeContains(PostalPostCode, "maxlength", "4");
	}

	public void MaxlengthFirstName()throws Exception{
		CommonFunctions.elementAttributeContains(FirstName, "maxlength", "50");
	}

	public void MaxlengthOccupation()throws Exception{
		CommonFunctions.elementAttributeContains(Occupation, "maxlength", "50");
	}

	public void MaxlengthResSuburb()throws Exception{
		CommonFunctions.elementAttributeContains(ResidentialSuburb, "maxlength", "50");
	}

	public void MaxlengthPostalSuburb()throws Exception{
		CommonFunctions.elementAttributeContains(PostalSuburb, "maxlength", "50");
	}

	public void MaxlengthResidentialAddressLine1()throws Exception{
		CommonFunctions.elementAttributeContains(ResidentialAddressLine1, "maxlength", "50");
	}

	public void MaxlengthResidentialAddressLine2()throws Exception{
		CommonFunctions.elementAttributeContains(ResidentialAddressLine2, "maxlength", "50");
	}

	public void MaxlengthPostalAddressLine2()throws Exception{
		CommonFunctions.elementAttributeContains(PostalAddressLine2, "maxlength", "50");
	}

	public void MaxlengthPostalAddressLine1()throws Exception{
		CommonFunctions.elementAttributeContains(PostalAddressLine1, "maxlength", "50");
	}

	public void CheckDOBPlaceholder()throws Exception{
		CommonFunctions.elementAttributeContains(DateOfBirth, "placeholder", "DD/MM/YYYY");
	}

	public void MaxlengthMiddleName()throws Exception{
		CommonFunctions.elementAttributeContains(MiddleName, "maxlength", "50");
	}

	public void MaxlengthFamilyName()throws Exception{
		CommonFunctions.elementAttributeContains(FamilyName, "maxlength", "50");
	}

	public void SetInvalidDOB()throws Exception{
		String InvalidDate = "19900905";
		CommonFunctions.clearThenEnterElementValue(DateOfBirth, InvalidDate);
	}

	public void ClearFirstName()throws Exception{
		String blank = "";
		CommonFunctions.clearThenEnterElementValue(FirstName, blank);
	}

	public void ClearFamilyName()throws Exception{
		String blank = "";
		CommonFunctions.clearThenEnterElementValue(FamilyName, blank);
	}

	public AboutPage ClickNextButton()throws Exception{
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.pause(2000, false);
		CommonFunctions.clickElement(NextButton);

		return new AboutPage();
	}
	public HomePage ClickBackButton()throws Exception{
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.pause(2000, false);
		CommonFunctions.clickElement(BackButton);

		return new HomePage();
	}

	public HomePage ClickCancelButton()throws Exception{
		CommonFunctions.clickElement(CancelButton);

		return new HomePage();
	}
	


	public ReviewConfirmPage clickNextToReviewConfirm()throws Exception{
		CommonFunctions.clickElement(NextButton);

		return new ReviewConfirmPage();
	}

	public void HiddenPostalDetailFields()throws Exception{
		CommonFunctions.elementCssValueContains(PostalContainer, "display", "none");
		// CommonFunctions.elementAttributeContains(PostalContainer, "style", "display:none");
		// CommonFunctions.elementHidden(PostalAddressLine1);
		// CommonFunctions.elementHidden(PostalAddressLine2);
		// CommonFunctions.elementHidden(PostalSuburb);
		// CommonFunctions.elementHidden(PostalState);
		// CommonFunctions.elementHidden(PostalPostCode);

	}

	public void DisplayedPostalDetailFields()throws Exception{
		CommonFunctions.elementDisplayed(PostalAddressLine1);
		CommonFunctions.elementDisplayed(PostalAddressLine2);
		CommonFunctions.elementDisplayed(PostalSuburb);
		CommonFunctions.elementDisplayed(PostalState);
		CommonFunctions.elementDisplayed(PostalPostCode);

	}
	public void DisplayedWelcomeMessage()throws Exception{
		CommonFunctions.elementDisplayed(WelcomeMessage);

	}
	
	public void DisplayedSectionTitle()throws Exception{
		CommonFunctions.elementDisplayed(SectionTitle);

	}
	

	public void ClickNoFirstQuestion()throws Exception{
		CommonFunctions.clickElement(NoQuestion1);
		CommonFunctions.pause(2000, false);
	}

	public void ClickYesFirstQuestion()throws Exception{
		CommonFunctions.clickElement(YesQuestion1);

	}

	public void ClickNoSecondQuestion()throws Exception{
		CommonFunctions.clickElement(NoQuestion2);
		CommonFunctions.pause(2000, false);
	}

	public void ClickYesSecondQuestion()throws Exception{
		CommonFunctions.clickElement(YesQuestion2);
	}

	public void ClickPostalAddressSameAsResidential()throws Exception{
		CommonFunctions.pause(5000, false);
		// CommonFunctions.scrollToElement(ResidentialAddressSameAsResidential);
		// CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ResidentialAddressSameAsResidential);
	}

	public void CheckAdditionalQuestion1()throws Exception{
		CommonFunctions.elementDisplayed(AdditionalQuestion1);
	}

	public void SelectTitlePersonalPage(String value)throws Exception{
		CommonFunctions.selectValueFromDropdown(TitleDropdown, value);
	}

	public void SelectResStatePersonalPage(String value)throws Exception{
		CommonFunctions.selectValueFromDropdown(ResidentialState, value);
	}

	public void CheckNextButton()throws Exception{
		CommonFunctions.elementDisplayed(NextButton);
	}

	public void CheckCancelButton()throws Exception{
		CommonFunctions.elementDisplayed(CancelButton);
	}

	public void CheckYesQuestion1()throws Exception{
		CommonFunctions.elementDisplayed(YesQuestion1);
	}

	public void CheckNoQuestion1()throws Exception{
		CommonFunctions.elementDisplayed(NoQuestion1);
	}

	public void CheckAdditionalQuestion2()throws Exception{
		CommonFunctions.elementDisplayed(AdditionalQuestion2);
	}

	public void CheckYesQuestion2()throws Exception{
		CommonFunctions.elementDisplayed(YesQuestion2);
	}

	public void CheckNoQuestion2()throws Exception{
		CommonFunctions.elementDisplayed(NoQuestion2);
	}

	public void CheckTitleDropdown()throws Exception{
		CommonFunctions.elementDisplayed(TitleDropdown);
	}

	public void CheckResidentialAddressSameAsResidential()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialAddressSameAsResidential);
	}

	public void CheckResidentialPostCode()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialPostCode);
	}

	public void CheckResidentialSuburb()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialSuburb);
	}

	public void CheckResidentialState()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialState);
	}

	public void CheckResidentialAddressLine1()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialAddressLine1);
	}

	public void CheckResidentialAddressLine2()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialAddressLine2);
	}

	public void CheckOccupation()throws Exception{
		CommonFunctions.elementDisplayed(Occupation);
	}

	public void CheckPhoneNumber()throws Exception{
		CommonFunctions.elementDisplayed(PhoneNumber);
	}

	public void CheckDateOfBirth()throws Exception{
		CommonFunctions.elementDisplayed(DateOfBirth);
	}

	public void CheckFirstName()throws Exception{
		CommonFunctions.elementDisplayed(FirstName);
	}

	public void CheckMiddleName()throws Exception{
		CommonFunctions.elementDisplayed(MiddleName);
	}

	public void CheckFamilyName()throws Exception{
		CommonFunctions.elementDisplayed(FamilyName);
	}

	public void CheckTitleDropdownValues(String[] expectedValues)throws Exception{
		CommonFunctions.checkDropdownOptionsAvailable(TitleDropdown, expectedValues);
	}

	public void CheckResStateDropdownValues(String[] expectedValues)throws Exception{
		CommonFunctions.checkDropdownOptionsAvailable(ResidentialState, expectedValues);
	}

	public void CheckPostalStateDropdownValues(String[] expectedValues)throws Exception{
		CommonFunctions.checkDropdownOptionsAvailable(PostalState, expectedValues);
	}

	public void CheckTitleDefaultValue(String expectedValue) throws Exception{
		CommonFunctions.checkSingleSelectDropdownSelectedOption(TitleDropdown, expectedValue);
	}

	public void CheckResStateDefaultValue(String expectedValue) throws Exception{
		CommonFunctions.checkSingleSelectDropdownSelectedOption(ResidentialState, expectedValue);
	}

	public void CheckPostalStateDefaultValue(String expectedValue) throws Exception{
		CommonFunctions.checkSingleSelectDropdownSelectedOption(PostalState, expectedValue);
	}

	public void CheckFirstNameMandatory()throws Exception{
		CommonFunctions.elementDisplayed(FirstName.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckOccupationMandatory()throws Exception{
		CommonFunctions.elementDisplayed(Occupation.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void SelectDateToday()throws Exception{
		CommonFunctions.clickElement(DateOfBirth);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.switchFrameByXPath("//button[text()='Today']");
		CommonFunctions.clickElement(Today);
	}

	public void SetDateOfBirth(String value)throws Exception{
		CommonFunctions.clearThenEnterElementValue(DateOfBirth, value);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);

	}

	public void FillUpDateOfBirth(String birth)throws Exception{
		CommonFunctions.clickElement(DateOfBirth);
		CommonFunctions.pause(2500, false);
		CommonFunctions.enterElementValue(DateOfBirth, birth);
	}

	public void CheckResSuburbMandatory()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialSuburb.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void SetPhoneNumber(String value)throws Exception{
		CommonFunctions.clearThenEnterElementValue(PhoneNumber, value);;
	}

	public void SetOccupation(String value)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Occupation, value);;
	}

	public void SelectResPostcodePersonalPage(String value) throws Exception{
		CommonFunctions.clearThenEnterElementValue(ResidentialPostCode, value);;
	}

	public void SetResAddressline1(String value)throws Exception{
		CommonFunctions.clearThenEnterElementValue(ResidentialAddressLine1, value);;
	}

	public void SetResSuburb(String value) throws Exception{
		CommonFunctions.clearThenEnterElementValue(ResidentialSuburb, value);;
	}

	public void CheckPostalSuburbMandatory()throws Exception{
		CommonFunctions.elementDisplayed(PostalSuburb.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPhoneNumberMandatory()throws Exception{
		CommonFunctions.elementDisplayed(PhoneNumber.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckResPostcodeMandatory()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialPostCode.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPostalPostcodeMandatory()throws Exception{
		CommonFunctions.elementDisplayed(PostalPostCode.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckFirstQuestionMandatory()throws Exception{
		CommonFunctions.elementDisplayed(NoQuestion1.findElement(By.xpath(".//following::label//following::div[text()='Required field']")));
	}

	public void CheckSecondQuestionMandatory()throws Exception{
		CommonFunctions.elementDisplayed(NoQuestion2.findElement(By.xpath(".//following::label//following::div[text()='Required field']")));
	}

	public void CheckResidentialAddressLine1Mandatory()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialAddressLine1.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPostalAddressLine1Mandatory()throws Exception{
		CommonFunctions.elementDisplayed(PostalAddressLine1.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPostalAddressLine2Mandatory()throws Exception{
		CommonFunctions.elementDisplayed(PostalAddressLine2.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckResidentialAddressLine2NotMandatory()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialAddressLine1.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckDOBMandatory()throws Exception{
		CommonFunctions.elementDisplayed(DateOfBirth.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckInvalidDOBValidation()throws Exception{
		CommonFunctions.elementDisplayed(DateOfBirth.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void CheckMiddleNameNotMandatory()throws Exception{
		CommonFunctions.elementInvisible(MiddleName.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckFamilyNameMandatory()throws Exception{
		CommonFunctions.elementDisplayed(FamilyName.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckTitleDropdownMandatory()throws Exception{
		CommonFunctions.elementDisplayed(TitleDropdown.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckResStateDropdownMandatory()throws Exception{
		CommonFunctions.elementDisplayed(ResidentialState.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void CheckPostalStateDropdownMandatory()throws Exception{
		CommonFunctions.elementDisplayed(PostalState.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public AboutPage ProgressChangeAbout()throws Exception{
		CommonFunctions.clickElement(ProgressAbout);

		return new AboutPage();
	}

	public AssetsPage ProgressChangeAssets()throws Exception{
		CommonFunctions.clickElement(ProgressAssets);

		return new AssetsPage();
	}

	public BeneficiariesPage ProgressChangeBeneficiaries()throws Exception{
		CommonFunctions.clickElement(ProgressBeneficiaries);

		return new BeneficiariesPage();
	}

	public ExecutorsPage ProgressChangeExecutors()throws Exception{
		CommonFunctions.clickElement(ProgressExecutors);

		return new ExecutorsPage();
	}

	public IDdocsPage ProgressChangeIDdocs()throws Exception{
		CommonFunctions.clickElement(ProgressIDDocs);

		return new IDdocsPage();
	}

	public ReviewConfirmPage ProgressChangeReviewConfirm()throws Exception{
		CommonFunctions.clickElement(ProgressReviewConfirm);

		return new ReviewConfirmPage();
	}

	public AddOnsPage ProgressChangeAddOns()throws Exception{
		CommonFunctions.clickElement(ProgressAddOns);

		return new AddOnsPage();
	}
	public void clickOKBtnPopUp2()throws Exception{
		CommonFunctions.elementDisplayed(OKBtnPopUp);
		CommonFunctions.clickElement(OKBtnPopUp);
	}

	public void CheckProgressAbout()throws Exception{
		CommonFunctions.elementDisplayed(ProgressAbout.findElement(By.xpath(".//following-sibling::a[contains(text(),'Change')]")));
	}

	public void CheckProgressAsset()throws Exception{
		CommonFunctions.elementDisplayed(ProgressAbout.findElement(By.xpath(".//following-sibling::a[contains(text(),'Change')]")));
	}

}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class AboutPage extends Base {
	// ========================================================== Page Objects
	// ==========================================================
	@FindBy(xpath = "//select[contains(@id,'Select_PartnerRelationshipId')]")
	WebElement RelationshipStatus;
	@FindBy(xpath = "//input[contains(@value,'Save and Continue')]")
	WebElement NextButton;
	@FindBy(xpath = "//input[contains(@id,'Cancel_Input')]")
	WebElement CancelButton;
	@FindBy(xpath = "//input[contains(@id,'PropertySettlementRadioNo')]")
	WebElement LawNoButton;
	@FindBy(xpath = "//input[contains(@id,'SpouseExistingOrderButton2')]")
	WebElement OkButtonPopUp;
	@FindBy(xpath = "//input[contains(@id,'SpouseInviteOkButton')]")
	WebElement OkButtonPopUp2;

	@FindBy(xpath = "//input[contains(@id,'PropertySettlementRadioYes')]")
	WebElement LawYesButton;
	@FindBy(xpath = "//input[contains(@id,'PropertySettlementRadioNA')]")
	WebElement LawNAButton;
	@FindBy(xpath = "(//input[contains(@id,'PropertySettlementRadioNA')]//following::div[text()='Required field'])[1]")
	WebElement LawNAButtonRequired;
	@FindBy(xpath = "//span[text()='select a file']")
	WebElement SelectFile;

	@FindBy(xpath = "//select[contains(@id,'Partner_TitleId')]")
	WebElement Question1;
	@FindBy(xpath = "//input[contains(@id,'Partner_FirstName')]")
	WebElement Question2;
	@FindBy(xpath = "//input[contains(@id,'Partner_MiddleName')]")
	WebElement Question3;
	@FindBy(xpath = "//input[contains(@id,'Partner_LastName')]")
	WebElement Question4;
	@FindBy(xpath = "//input[contains(@id,'LengthOfRelationship')]")
	WebElement Question5;
	// @FindBy(xpath = "//label[text()='Do you plan to marry or re-marry?']")
	@FindBy(xpath = "//label[text()='Do you plan to get married?']")
	WebElement Question6;
	@FindBy(xpath = "//input[contains(@id,'WillMarryRadioYes')]")
	WebElement WillMarryYes;
	@FindBy(xpath = "//input[contains(@id,'WillMarryRadioNo')]")
	WebElement WillMarryNo;
	@FindBy(xpath = "//span[text()='If you are planning to marry, we will draft your Will so it is not revoked when you marry.']")
	WebElement WillMarryNote;
	@FindBy(xpath = "//label[text()='Do you want to do your Will together with your spouse/partner']")
	WebElement Question7;
	@FindBy(xpath = "//input[contains(@id,'WillTogetherRadioYes')]")
	WebElement WillTogetherRadioYes;
	@FindBy(xpath = "//input[contains(@id,'WillTogetherRadioNo')]")
	WebElement WillTogetherRadioNo;
	@FindBy(xpath = "//input[contains(@id,'Partner_Email')]")
	WebElement Question8;
	@FindBy(xpath = "//label[text()='Have you had a family law property settlement?']")
	WebElement Question10;
	@FindBy(xpath = "//input[contains(@id,'YearSettlement')]")
	WebElement Question11;
	@FindBy(xpath = "//label[text()='What year did you separate/divorce? (Optional)']//following-sibling::input")
	WebElement Question12;

	@FindBy(xpath = "//input[contains(@id,'ChildrenRadioYes')]")
	WebElement ChildrenYes;
	@FindBy(xpath = "//input[contains(@id,'ChildrenRadioNo')]")
	WebElement ChildrenNo;
	@FindBy(xpath = "(//input[contains(@id,'ChildrenRadioNo')]//following::div[text()='Required field'])[1]")
	WebElement ChildrenNoRequired;

	@FindBy(xpath = "//input[contains(@id,'OtherDependentRadioYes')]")
	WebElement DependentsYes;
	@FindBy(xpath = "//input[contains(@id,'OtherDependentNo')]")
	WebElement DependentsNo;
	@FindBy(xpath = "//*[text()='Add Guardian (Optional)']")
	WebElement AddGuardian;
	@FindBy(xpath = "(//div[text()='Primary Guardian']//parent::div//parent::div//following::a[text()='Edit'])[1]")
	WebElement EditPrimaryGuardian;
	@FindBy(xpath = "//div[text()='Secondary Guardian']//parent::div//parent::div//following::a[text()='Edit']")
	WebElement EditSecondaryGuardian;
	@FindBy(xpath = "(//a[text()='Delete'])[3]")
	WebElement DeleteSecondaryGuardian;
	@FindBy(xpath = "//*[text()='Add Child']")
	WebElement AddChild;
	@FindBy(xpath = "//select[contains(@id,'ChildTitle')]")
	WebElement AddChildQuestion4;
	@FindBy(xpath = "//input[contains(@id,'ChildFirstName')]")
	WebElement AddChildQuestion5;
	@FindBy(xpath = "//input[contains(@id,'ChildMiddleName')]")
	WebElement AddChildQuestion6;
	@FindBy(xpath = "//input[contains(@id,'ChildLastName')]")
	WebElement AddChildQuestion7;
	@FindBy(xpath = "//input[contains(@id,'DobInput')]")
	WebElement AddChildQuestion8;
	@FindBy(xpath = "//label[text()='Does your child have any significant circumstance that we should be aware of?']")
	WebElement AddChildQuestion9;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonYes')]")
	WebElement AddChildQuestion9Yes;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonNo')]")
	WebElement AddChildQuestion9No;
	@FindBy(xpath = "//input[contains(@id,'IsStepChild')]")
	WebElement AddChildQuestion10;
	@FindBy(xpath = "//input[contains(@id,'IsFromFormerRelationship')]")
	WebElement AddChildQuestion11;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonYes')]")
	WebElement AddChildQuestion11Yes;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonNo')]")
	WebElement AddChildQuestion11No;

	@FindBy(xpath = "//input[contains(@id,'GuardianRadioYes')]")
	WebElement GuardianYes;
	@FindBy(xpath = "//input[contains(@id,'GuardianPopup')]")
	WebElement GuardianOKPopUp;
	@FindBy(xpath = "//input[contains(@id,'GuardianRadioNo')]")
	WebElement GuardianNo;

	@FindBy(xpath = "//select[contains(@id,'ParentTitle')]")
	WebElement AddChildQuestion12;
	@FindBy(xpath = "//input[contains(@id,'ParentFirstName')]")
	WebElement AddChildQuestion13;
	@FindBy(xpath = "//input[contains(@id,'ParentMiddleName')]")
	WebElement AddChildQuestion14;
	@FindBy(xpath = "//input[contains(@id,'ParentFamilyName')]")
	WebElement AddChildQuestion15;
	@FindBy(xpath = "//input[contains(@id,'ParentLastName')]")
	WebElement AddChildQuestion15a;

	@FindBy(xpath = "//input[contains(@id,'ChildSaveButton')]")
	WebElement AddChildSave;
	@FindBy(xpath = "//input[contains(@id,'ChildCancelButton')]")
	WebElement AddChildCancel;

	@FindBy(xpath = "(// select[contains(@id,'ChildTitle')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion4Req;
	@FindBy(xpath = "(//input[contains(@id,'ChildFirstName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion5Req;
	@FindBy(xpath = "(//input[contains(@id,'ChildLastName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion7Req;
	@FindBy(xpath = "(//input[contains(@id,'DobInput')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion8Req;
	@FindBy(xpath = "//input[contains(@id,'SpecialConditionRadioButtonNo')]//following::span//following::div[text()='Required field']")
	WebElement AddChildQuestion9Req;

	@FindBy(xpath = "(//select[contains(@id,'ParentTitle')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion12Req;
	@FindBy(xpath = "(//input[contains(@id,'ParentFirstName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion13Req;
	@FindBy(xpath = "(//input[contains(@id,'ParentLastName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement AddChildQuestion14Req;
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement RemoveChild;
	@FindBy(xpath = "//a[text()='Edit']")
	WebElement EditChild;
	@FindBy(xpath = "(//a[text()='Edit'])[1]")
	WebElement EditFirstChild;
	@FindBy(xpath = "(//a[text()='Delete'])[2]")
	WebElement RemoveSecondChild;

	@FindBy(xpath = "//select[contains(@id,'GuardianTitle')]")
	WebElement GuardianTitle;
	@FindBy(xpath = "(//select[contains(@id,'GuardianTitle')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianTitleReq;
	@FindBy(xpath = "//input[contains(@id,'GuardianFirstName')]")
	WebElement GuardianFirstName;
	@FindBy(xpath = "(//input[contains(@id,'GuardianFirstName')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianFirstNameReq;
	@FindBy(xpath = "//input[contains(@id,'GuardianMiddleName')]")
	WebElement GuardianMiddleName;
	@FindBy(xpath = "//input[contains(@id,'GuardianLastName')]")
	WebElement GuardianLastName;
	@FindBy(xpath = "(//input[contains(@id,'GuardianLastName')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianLastNameReq;
	@FindBy(xpath = "//select[contains(@id,'GuardianInfo_Relationship')]")
	WebElement GuardianRelationship;
	@FindBy(xpath = "//span[contains(@id,'GuardianInfo_Relationship') and text()='Required field']")
	WebElement GuardianRelationshipReq;
	@FindBy(xpath = "//select[contains(@id,'GuardianInfo_Country')]")
	WebElement GuardianCountry;
	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_Line1ResAddress_Input')]")
	WebElement GuardianAddress1;
	@FindBy(xpath = "(//input[contains(@id,'GuardianInfo_Line1ResAddress_Input')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianAddress1req;
	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_Line2ResAddress_Input')]")
	WebElement GuardianAddress2;
	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_SubsurfRes_Input')]")
	WebElement GuardianSuburb;
	@FindBy(xpath = "(//input[contains(@id,'GuardianInfo_SubsurfRes_Input')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianSuburbReq;
	@FindBy(xpath = "//select[contains(@id,'GuardianInfo_StateId_Input')]")
	WebElement GuardianState;
	@FindBy(xpath = "(//select[contains(@id,'GuardianInfo_StateId_Input')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianStateReq;
	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_PostcodePost_Input')]")
	WebElement GuardianPostCode;
	@FindBy(xpath = "(//input[contains(@id,'GuardianInfo_PostcodePost_Input')]//following::a//following::span/following::span[text()='Required field'])[1]")
	WebElement GuardianPostCodeReq;
	@FindBy(xpath = "//input[contains(@id,'GuardianCancelButton')]")
	WebElement GuardianCancel;
	@FindBy(xpath = "//input[contains(@id,'GuardianSaveButton')]")
	WebElement GuardianSave;
	@FindBy(xpath = "//input[contains(@id,'OtherDependentSaveButton')]")
	WebElement DependentSave;
	@FindBy(xpath = "(//a[text()='Change'])[1]")
	WebElement ChangePersonalButton;
	@FindBy(xpath = "//input[contains(@id,'OtherDependentCancelButton')]")
	WebElement DependentCancel;
	@FindBy(xpath = "//*[text()='Add Dependent']")
	WebElement AddDependent;

	@FindBy(xpath = "(//*[text()='Edit'])[2]")
	WebElement EditfirstDependent;
	@FindBy(xpath = "(//*[text()='Delete'])[2]")
	WebElement DeletefirstDependent;

	@FindBy(xpath = "//select[contains(@id,'OtherDependentTitle')]")
	WebElement DependentTitle;
	@FindBy(xpath = "(//select[contains(@id,'OtherDependentTitle')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentTitleReq;

	@FindBy(xpath = "//input[contains(@id,'OtherDependentFirstName')]")
	WebElement DependentFName;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependentFirstName')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentFNameReq;

	@FindBy(xpath = "//input[contains(@id,'OtherDependentMiddleName')]")
	WebElement DependentMName;

	@FindBy(xpath = "//input[contains(@id,'OtherDependentLastName')]")
	WebElement DependentLName;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependentLastName')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentLNameReq;

	@FindBy(xpath = "//select[contains(@id,'OtherDependent_Relationship')]")
	WebElement DependentRel;
	@FindBy(xpath = "(//select[contains(@id,'OtherDependent_Relationship')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentRelReq;
	@FindBy(xpath = "//select[contains(@id,'OtherDependent_Country')]")
	WebElement DependentCountry;

	@FindBy(xpath = "//input[contains(@id,'OtherDependent_Line1ResAddress_Input')]")
	WebElement DependentAddress1;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependent_Line1ResAddress_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentAddress1Req;

	@FindBy(xpath = "//input[contains(@id,'OtherDependent_Line2ResAddress_Input')]")
	WebElement DependentAddress2;

	@FindBy(xpath = "//input[contains(@id,'OtherDependent_SubsurfRes_Input')]")
	WebElement DependentSuburb;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependent_SubsurfRes_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentSuburbReq;

	@FindBy(xpath = "//select[contains(@id,'GuardianInfo_StateId_Input')]")
	WebElement DependentStateDropdown;
	@FindBy(xpath = "(//select[contains(@id,'GuardianInfo_StateId_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentStateDropdownReq;

	@FindBy(xpath = "//input[contains(@id,'GuardianInfo_StateText_Input')]")
	WebElement DependentState;
	@FindBy(xpath = "(//input[contains(@id,'GuardianInfo_StateText_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentStateReq;

	@FindBy(xpath = "//input[contains(@id,'OtherDependent_PostcodePost_Input')]")
	WebElement DependentPostCode;
	@FindBy(xpath = "(//input[contains(@id,'OtherDependent_PostcodePost_Input')]//following::span//following::span[text()='Required field'])[1]")
	WebElement DependentPostCodeReq;
	@FindBy(xpath = "//a[text()='Remove']")
	WebElement RemoveAttachment;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='Personal Details']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressPersonal;
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

	@FindBy(xpath = "//div[contains(@id,'SpousePartner_Tooltip')]")
	WebElement SpousePartner_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Significant_Tooltip')]")
	WebElement Significant_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Dependents_Tooltip')]")
	WebElement Dependents_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'UploadWill_Tooltip')]")
	WebElement UploadWill_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Guardian_Tooltip')]")
	WebElement Guardian_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Guardian_TooltipVideo')]")
	WebElement Guardian_TooltipVideo;

	@FindBy(xpath = "//input[contains(@id,'Partner_Email')]")
	WebElement Field_SpouseEmail;

	@FindBy(xpath = "//span[text()='Please input your spouse/partner’s email so we can send them an invitation to complete their online form. By providing the contact email address, you confirm that you have consent from the relevant person to pass on such details to Maurice Blackburn in connection with the service.']")
	WebElement email_Consent;

	// ================================================== Initializing the Page
	// Objects ==================================================
	public AboutPage() throws Exception {
		PageFactory.initElements(driver, this);

	}

	// ============================================================= Actions
	// =============================================================
	public void ClickAddDependent() throws Exception {
		CommonFunctions.clickElement(AddDependent);
	}

	public void ClickEditFirstDependent() throws Exception {
		CommonFunctions.clickElement(EditfirstDependent);
	}

	public void ClickDeleteFirstDependent() throws Exception {
		CommonFunctions.clickElement(DeletefirstDependent);
	}

	public void DisplayMandatoryFieldDependent() throws Exception {
		CommonFunctions.elementDisplayed(DependentTitleReq);
		CommonFunctions.elementDisplayed(DependentFNameReq);
		CommonFunctions.elementDisplayed(DependentLNameReq);
		CommonFunctions.elementDisplayed(DependentRelReq);
		CommonFunctions.elementDisplayed(DependentAddress1Req);
		CommonFunctions.elementDisplayed(DependentSuburbReq);
		CommonFunctions.elementDisplayed(DependentStateDropdownReq);
		CommonFunctions.elementDisplayed(DependentPostCodeReq);
		CommonFunctions.selectValueFromDropdown(DependentCountry, "BAHRAIN");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentSave);
		CommonFunctions.elementDisplayed(DependentStateReq);
	}

	public void AddAUDependent() throws Exception {
		CommonFunctions.selectValueFromDropdown(DependentTitle, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentFName, "AUDependent First Name");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentMName, "AUDependent Middle Name");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentLName, "AUDependent Last Name");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentRel, "Mother");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentCountry, "AUSTRALIA");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentAddress1, "AUDependent Address line 1");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentAddress2, "AUDependent Address line 2");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentSuburb, "AUDependent Suburb");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentStateDropdown, "VIC");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentPostCode, "6666");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentSave);
		CommonFunctions.pause(5000, false);
	}

	public void AddNonAUDependent() throws Exception {
		CommonFunctions.selectValueFromDropdown(DependentTitle, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentFName, "Dependent First Name");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentMName, "Dependent Middle Name");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentLName, "Dependent Last Name");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentRel, "Mother");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(DependentCountry, "PHILIPPINES");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentAddress1, "Dependent Address line 1");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentAddress2, "Dependent Address line 2");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentSuburb, "Dependent Suburb");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentState, "INTRAMUROS, MANILA");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DependentPostCode, "1002");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentSave);
		CommonFunctions.pause(5000, false);
	}

	public void ClickSaveAddDependent() throws Exception {
		CommonFunctions.clickElement(DependentSave);
	}

	public PersonalPage ClickChangeButtonPersonal() throws Exception {
		CommonFunctions.clickElement(ChangePersonalButton);

		return new PersonalPage();
	}

	public void ClickEditFirstChild() throws Exception {
		CommonFunctions.clickElement(EditFirstChild);
	}

	public void ClickGuardianSave() throws Exception {
		CommonFunctions.clickElement(GuardianSave);
	}

	public void ClickGuardianCancel() throws Exception {
		CommonFunctions.clickElement(GuardianCancel);
	}

	public void AddGuardian() throws Exception {
		String country = "AUSTRALIA";
		CommonFunctions.checkSingleSelectDropdownSelectedOption(GuardianCountry, country);

		CommonFunctions.selectValueFromDropdown(GuardianTitle, "Reverend");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianFirstName, "Guardian");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianMiddleName, "Arch");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianLastName, "Angel");
		CommonFunctions.pause(5000, false);

		CommonFunctions.selectValueFromDropdown(GuardianRelationship, "Friend");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianAddress1, "Heaven");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianAddress2, "Above");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianSuburb, "City");
		CommonFunctions.pause(5000, false);

		CommonFunctions.selectValueFromDropdown(GuardianState, "VIC");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianPostCode, "123");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(GuardianSave);
		CommonFunctions.pause(5000, false);
	}

	public void AddGuardian2() throws Exception {
		String country = "AUSTRALIA";
		CommonFunctions.checkSingleSelectDropdownSelectedOption(GuardianCountry, country);

		CommonFunctions.selectValueFromDropdown(GuardianTitle, "Reverend");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianFirstName, "2Guardian");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianMiddleName, "2Arch");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianLastName, "2Angel");
		CommonFunctions.pause(5000, false);

		CommonFunctions.selectValueFromDropdown(GuardianRelationship, "Friend");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianAddress1, "2Heaven");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianAddress2, "2Above");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianSuburb, "2City");
		CommonFunctions.pause(5000, false);

		CommonFunctions.selectValueFromDropdown(GuardianState, "VIC");
		CommonFunctions.pause(5000, false);

		CommonFunctions.enterElementValue(GuardianPostCode, "1234");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(GuardianSave);
		CommonFunctions.pause(5000, false);
	}

	public void DisplayMandatoryFieldsOnGuardian() throws Exception {
		CommonFunctions.elementDisplayed(GuardianTitleReq);
		CommonFunctions.elementDisplayed(GuardianFirstNameReq);
		CommonFunctions.elementDisplayed(GuardianLastNameReq);
		CommonFunctions.elementDisplayed(GuardianRelationshipReq);
		CommonFunctions.elementDisplayed(GuardianAddress1req);
		CommonFunctions.elementDisplayed(GuardianSuburbReq);
		CommonFunctions.elementDisplayed(GuardianStateReq);
		CommonFunctions.elementDisplayed(GuardianPostCodeReq);

	}

	public void ClickDeleteSecondChild() throws Exception {
		CommonFunctions.clickElement(RemoveSecondChild);
	}

	public void ClickGuardianYes() throws Exception {
		CommonFunctions.clickElement(GuardianYes);
	}

	public void ClickGuardianOKGuardianPopUp() throws Exception {
		CommonFunctions.clickElement(GuardianOKPopUp);
	}

	public void GuardianRequiredDisplayed() throws Exception {
		CommonFunctions.elementDisplayed(
				GuardianNo.findElement(By.xpath(".//following::label//following::div[text()='Required field']")));
	}

	public void AddChildrenFromPrevious() throws Exception {
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/1990");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11Yes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11);
		CommonFunctions.pause(5000, false);

		CommonFunctions.selectValueFromDropdown(AddChildQuestion12, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion13, "Demeth");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion15a, "Camuin");
		CommonFunctions.pause(5000, false);

		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.pause(5000, false);

	}

	public void AddChildrenToggleOffOn() throws Exception {
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.pause(5000, false);
	}

	public void AddChildrenClickAddChild() throws Exception {
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.pause(5000, false);
	}

	public void AddGauardianClickAddGuardian() throws Exception {
		CommonFunctions.clickElement(AddGuardian);
		CommonFunctions.pause(5000, false);
	}

	public void EditSecondaryGuardian() throws Exception {
		CommonFunctions.clickElement(EditSecondaryGuardian);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(GuardianAddress1, "THIS ADDRESS IS EDITED");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(GuardianSave);
		CommonFunctions.pause(5000, false);

	}

	public void DeleteSecondaryGuardian() throws Exception {
		CommonFunctions.clickElement(DeleteSecondaryGuardian);
		CommonFunctions.pause(5000, false);

	}

	public void AddChildrenLegitimate() throws Exception {

		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/2010");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11No);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.pause(5000, false);
	}

	public void CheckAddChildrenRequired() throws Exception {
		CommonFunctions.elementDisplayed(AddChildQuestion4Req);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(AddChildQuestion5Req);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(AddChildQuestion7Req);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(AddChildQuestion8Req);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(AddChildQuestion9Req);
		CommonFunctions.pause(5000, false);
		/*
		 * CommonFunctions.elementDisplayed(AddChildQuestion12Req);
		 * CommonFunctions.pause(5000, false);
		 * CommonFunctions.elementDisplayed(AddChildQuestion13Req);
		 * CommonFunctions.pause(5000, false);
		 * CommonFunctions.elementDisplayed(AddChildQuestion14Req);
		 * CommonFunctions.pause(5000, false);
		 */
		CommonFunctions.clickElement(AddChildCancel);

	}

	public void CheckAddChildrenRequiredPreReq() throws Exception {
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.clickElement(AddChildQuestion11);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.pause(5000, false);

	}

	public void AddChildrenStepChild() throws Exception {
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/1990");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11Yes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildQuestion10);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void CheckContentAddChildren() throws Exception {
		CommonFunctions.elementDisplayed(AddChild);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(AddChildQuestion4);
		CommonFunctions.elementDisplayed(AddChildQuestion5);
		CommonFunctions.elementDisplayed(AddChildQuestion6);
		CommonFunctions.elementDisplayed(AddChildQuestion7);
		CommonFunctions.elementDisplayed(AddChildQuestion8);
		CommonFunctions.elementDisplayed(AddChildQuestion9);
		CommonFunctions.elementDisplayed(AddChildQuestion10);
		CommonFunctions.elementDisplayed(AddChildQuestion11);
		// CommonFunctions.clickElement(AddChild);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(AddChildSave);
		CommonFunctions.elementDisplayed(AddChildCancel);
	}

	public void YesChildren() throws Exception {
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.pause(5000, false);
	}

	public void AddChildrenLinkDisplayed() throws Exception {
		CommonFunctions.elementDisplayed(AddChild);
	}

	public void AdditionalQuestionsForSingleSinglesPackage() throws Exception {
		// Only 2 question will be additional
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
		CommonFunctions.clickElement(LawNAButton);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
		// Other questions is hidden
		// CommonFunctions.elementInvisible(Question1);
		CommonFunctions.elementNotExistingByXPath("//select[contains(@id,'Partner_TitleId')]");

		// CommonFunctions.elementInvisible(Question2);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_FirstName')]");

		// CommonFunctions.elementInvisible(Question3);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_MiddleName')]");

		// CommonFunctions.elementInvisible(Question4);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_LastName')]");

		// CommonFunctions.elementInvisible(Question5);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'LengthOfRelationship')]");

		// CommonFunctions.elementInvisible(Question6);
		CommonFunctions.elementNotExistingByXPath("//label[text()='Do you plan to get married?']");

		// CommonFunctions.elementInvisible(Question7);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='Do you want to do your Will together with your spouse/partner']");

		// CommonFunctions.elementInvisible(Question8);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_Email')]");
		// CommonFunctions.elementInvisible(Question12);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='What year did you separate/divorce?']//following-sibling::input");
	}

	public void RequiredValidationOnAboutPage() throws Exception {
		CommonFunctions.elementDisplayed(RelationshipStatus
				.findElement(By.xpath(".//following::span//following::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions
				.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void RequiredValidationOnAboutPageWidowed() throws Exception {
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions
				.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void RequiredValidationOnAboutPageSingle() throws Exception {
		CommonFunctions.elementDisplayed(LawNAButtonRequired);

		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions
				.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));

	}

	public void RequiredValidationOnAboutPageMarried() throws Exception {
		CommonFunctions.elementDisplayed(Question1
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question2
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question4
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question5
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(WillTogetherRadioNo.findElement(By.xpath(
				".//parent::div[contains(@id, 'InputsAndLabels')]//label[text() = 'No']//parent::div//following-sibling::div")));

		CommonFunctions.elementDisplayed(LawNAButtonRequired);
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions
				.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void RequiredValidationOnAboutPageSeparated() throws Exception {
		CommonFunctions.elementDisplayed(Question1
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question2
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question4
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));

		CommonFunctions.elementDisplayed(LawNAButtonRequired);
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions
				.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void RequiredValidationOnAboutPageDefacto() throws Exception {
		CommonFunctions.elementDisplayed(Question1
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question2
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question4
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question5
				.findElement(By.xpath(".//following-sibling::span//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(WillMarryNo.findElement(By.xpath(
				".//parent::div[contains(@id, 'InputsAndLabels')]//label[text() = 'No']//parent::div//following-sibling::div")));
		CommonFunctions.elementDisplayed(WillTogetherRadioNo.findElement(By.xpath(
				".//parent::div[contains(@id, 'InputsAndLabels')]//label[text() = 'No']//parent::div//following-sibling::div")));

		CommonFunctions.elementDisplayed(LawNAButtonRequired);
		CommonFunctions.elementDisplayed(ChildrenNoRequired);
		CommonFunctions
				.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));
	}

	public void AdditionalQuestionsForSingleCouplesPackage() throws Exception {
		// Only 2 question will be additional
		// CommonFunctions.elementDisplayed(Question8);
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
		CommonFunctions.clickElement(LawNAButton);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
		// Other questions is hidden
		// CommonFunctions.elementInvisible(Question1);
		CommonFunctions.elementNotExistingByXPath("//select[contains(@id,'Partner_TitleId')]");

		// CommonFunctions.elementInvisible(Question2);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_FirstName')]");

		// CommonFunctions.elementInvisible(Question3);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_MiddleName')]");

		// CommonFunctions.elementInvisible(Question4);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_LastName')]");

		// CommonFunctions.elementInvisible(Question5);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'LengthOfRelationship')]");

		// CommonFunctions.elementInvisible(Question6);
		CommonFunctions.elementNotExistingByXPath("//label[text()='Do you plan to get married?']");

		// CommonFunctions.elementInvisible(Question7);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='Do you want to do your Will together with your spouse/partner']");

		// CommonFunctions.elementInvisible(Question12);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='What year did you separate/divorce?']//following-sibling::input");
	}

	public void AdditionalQuestionsForWidowedCouple() throws Exception {
		// All Questions are hidden
		// CommonFunctions.elementInvisible(Question1);
		CommonFunctions.elementNotExistingByXPath("//select[contains(@id,'Partner_TitleId')]");

		// CommonFunctions.elementInvisible(Question2);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_FirstName')]");

		// CommonFunctions.elementInvisible(Question3);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_MiddleName')]");

		// CommonFunctions.elementInvisible(Question4);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_LastName')]");

		// CommonFunctions.elementInvisible(Question5);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'LengthOfRelationship')]");

		// CommonFunctions.elementInvisible(Question6);
		CommonFunctions.elementNotExistingByXPath("//label[text()='Do you plan to get married?']");

		// CommonFunctions.elementInvisible(Question7);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='Do you want to do your Will together with your spouse/partner']");

		// CommonFunctions.elementInvisible(Question8);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_Email')]");

		// CommonFunctions.elementInvisible(Question10);
		CommonFunctions.elementNotExistingByXPath("//label[text()='Have you had a family law property settlement?']");

		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");

		// CommonFunctions.elementInvisible(Question12);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='What year did you separate/divorce?']//following-sibling::input");
	}

	public void AdditionalQuestionsForWidowedSingle() throws Exception {
		// All Questions are hidden
		// CommonFunctions.elementInvisible(Question1);
		CommonFunctions.elementNotExistingByXPath("//select[contains(@id,'Partner_TitleId')]");

		// CommonFunctions.elementInvisible(Question2);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_FirstName')]");

		// CommonFunctions.elementInvisible(Question3);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_MiddleName')]");

		// CommonFunctions.elementInvisible(Question4);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_LastName')]");

		// CommonFunctions.elementInvisible(Question5);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'LengthOfRelationship')]");

		// CommonFunctions.elementInvisible(Question6);
		CommonFunctions.elementNotExistingByXPath("//label[text()='Do you plan to get married?']");

		// CommonFunctions.elementInvisible(Question7);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='Do you want to do your Will together with your spouse/partner']");

		// CommonFunctions.elementInvisible(Question8);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_Email')]");

		// CommonFunctions.elementInvisible(Question10);
		CommonFunctions.elementNotExistingByXPath("//label[text()='Have you had a family law property settlement?']");

		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");

		// CommonFunctions.elementInvisible(Question12);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='What year did you separate/divorce?']//following-sibling::input");
	}

	public void AdditionalQuestionsForMarried() throws Exception {
		// Questions that are hidden
		// CommonFunctions.elementInvisible(Question6);
		CommonFunctions.elementNotExistingByXPath("//label[text()='Do you plan to get married?']");
		// CommonFunctions.elementInvisible(Question12);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='What year did you separate/divorce?']//following-sibling::input");

		// Questions displayed
		CommonFunctions.elementDisplayed(Question1);
		CommonFunctions.elementDisplayed(Question2);
		CommonFunctions.elementDisplayed(Question3);
		CommonFunctions.elementDisplayed(Question4);
		CommonFunctions.elementDisplayed(Question5);
		// Check if yes and no
		// CommonFunctions.elementDisplayed(Question7);
		// CommonFunctions.clickElement(WillTogetherRadioYes);
		// CommonFunctions.elementDisplayed(Question8);
		// CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question8);
		// CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_Email')]");
		// Check if yes and no
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
		CommonFunctions.clickElement(LawNAButton);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
	}

	public void AdditionalQuestionsForDefactoAndEngaged() throws Exception {
		// Questions that are hidden
		// CommonFunctions.elementInvisible(Question12);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='What year did you separated or get divorced?']//following-sibling::input");
		// Questions displayed
		CommonFunctions.elementDisplayed(Question1);
		CommonFunctions.elementDisplayed(Question2);
		CommonFunctions.elementDisplayed(Question3);
		CommonFunctions.elementDisplayed(Question4);
		CommonFunctions.elementDisplayed(Question5);
		// Check if yes and no
		CommonFunctions.elementDisplayed(Question6);
		CommonFunctions.clickElement(WillMarryYes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(WillMarryNote);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(WillMarryNote);
		CommonFunctions.elementNotExistingByXPath(
				"//span[text()='If you are planning to marry, we will draft your Will so it is not revoked when you marry.']");

		// Check if yes and no
		// CommonFunctions.elementDisplayed(Question7);
		// CommonFunctions.clickElement(WillTogetherRadioYes);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementDisplayed(Question8);
		// CommonFunctions.clickElement(WillTogetherRadioNo);
		// CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question8);
		// CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_Email')]");
		// Check if yes and no
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
		CommonFunctions.clickElement(LawNAButton);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
	}

	public void AdditionalQuestionsForSeparatedAndDivorced() throws Exception {
		// Questions that are hidden
		// CommonFunctions.elementInvisible(Question5);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'LengthOfRelationship')]");
		// CommonFunctions.elementInvisible(Question6);
		CommonFunctions.elementNotExistingByXPath("//label[text()='Do you plan to get married?']");
		// CommonFunctions.elementInvisible(Question7);
		CommonFunctions.elementNotExistingByXPath(
				"//label[text()='Do you want to do your Will together with your spouse/partner']");
		// CommonFunctions.elementInvisible(Question8);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'Partner_Email')]");
		// Questions displayed
		CommonFunctions.elementDisplayed(Question1);
		CommonFunctions.elementDisplayed(Question2);
		CommonFunctions.elementDisplayed(Question3);
		CommonFunctions.elementDisplayed(Question4);
		// Check if yes and no
		CommonFunctions.elementDisplayed(Question10);
		CommonFunctions.clickElement(LawYesButton);
		CommonFunctions.elementDisplayed(Question11);
		CommonFunctions.clickElement(LawNoButton);
		// CommonFunctions.elementInvisible(Question11);
		// CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
		CommonFunctions.elementDisplayed(Question12);
	}

	public void DisplayedRelationshipStatus() throws Exception {
		CommonFunctions.elementDisplayed(RelationshipStatus);
	}

	public void HiddenYearSettlement() throws Exception {
		// CommonFunctions.elementInvisible(Question11);
		CommonFunctions.elementNotExistingByXPath("//input[contains(@id,'YearSettlement')]");
	}

	public void FillUpMandatoryFieldsSingle() throws Exception {
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMandatoryFieldsSingleWithChild() throws Exception {
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/1990");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11No);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMandatoryFieldsSingleWithMinorChild() throws Exception {
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/2015");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11No);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void DisplayMandatoryFieldsDependent() throws Exception {
		CommonFunctions
				.elementDisplayed(DependentsNo.findElement(By.xpath(".//following::div[text()='Required field']")));

	}

	public void FillUpMandatoryFieldsWidowed() throws Exception {
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void ClickDependentsNo() throws Exception {
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void ClickDependentsYes() throws Exception {
		CommonFunctions.clickElement(DependentsYes);
		CommonFunctions.pause(5000, false);
	}
	public void ClickOkSpousePopup() throws Exception {
		CommonFunctions.clickElement(OkButtonPopUp);
	}
	public void ClickOkInviteSpousePopup() throws Exception {
		CommonFunctions.clickElement(OkButtonPopUp2);
	}

	
	
	public void FillUpMandatoryFieldsDefacto() throws Exception {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMandatoryFieldsEngaged() throws Exception {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMandatoryFieldsMarried() throws Exception {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question8, "Spouse@email.com");
		// CommonFunctions.clickElement(WillMarryNo);
		// CommonFunctions.pause(5000, false);
		//CommonFunctions.clickElement(WillTogetherRadioNo);
		//CommonFunctions.pause(5000, false);
		//CommonFunctions.clickElement(OkButtonPopUp);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMandatoryFieldsMarriedWithChildren() throws Exception {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.pause(5000, false);
		// CommonFunctions.clickElement(WillMarryNo);
		// CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(OkButtonPopUp);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.selectValueFromDropdown(AddChildQuestion4, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion5, "Little Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion7, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(AddChildQuestion8, "05/09/1990");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildQuestion11No);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(AddChildSave);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMandatoryFieldsSeparated() throws Exception {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMandatoryFieldsDivorced() throws Exception {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillMarryNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMandatoryFieldsMarriedWithSpouse() throws Exception {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioYes);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Field_SpouseEmail, "spousesample@gmail.com");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMandatoryFieldsMarriedWithOutSpouseEmail() throws Exception {
		CommonFunctions.selectValueFromDropdown(Question1, "Dr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question2, "Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question4, "Camuin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question5, "5");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(WillTogetherRadioNo);
		CommonFunctions.pause(5000, false);
		// CommonFunctions.clearThenEnterElementValue(Field_SpouseEmail,"spousesample@gmail.com");
		// CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(LawNoButton);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(ChildrenNo);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DependentsNo);
		CommonFunctions.pause(5000, false);
	}

	public void DisplayedYearSettlement() throws Exception {
		CommonFunctions.elementDisplayed(Question11);
	}

	public void clickNoBtnLaw() throws Exception {
		CommonFunctions.clickElement(LawNoButton);
	}

	public void clickYesBtnLaw() throws Exception {
		CommonFunctions.clickElement(LawYesButton);
	}

	public void clickNABtnLaw() throws Exception {
		CommonFunctions.clickElement(LawNAButton);
	}

	public void DisplayedNextBtn() throws Exception {
		CommonFunctions.elementDisplayed(NextButton);
	}

	public void DisplayedCancelBtn() throws Exception {
		CommonFunctions.elementDisplayed(CancelButton);
	}

	public void SelectRelationshipStatusPersonalPage(String value) throws Exception {
		CommonFunctions.selectValueFromDropdown(RelationshipStatus, value);
	}

	public void CheckRelationshipStatusDropdownValues(String[] expectedValues) throws Exception {
		CommonFunctions.checkDropdownOptionsAvailable(RelationshipStatus, expectedValues);
	}

	public void CheckRelStatusDefaultValue(String expectedValue) throws Exception {
		CommonFunctions.checkSingleSelectDropdownSelectedOption(RelationshipStatus, expectedValue);
	}

	public void CheckGuardianCountryDefaultValue() throws Exception {
		String country = "AUSTRALIA";
		CommonFunctions.checkSingleSelectDropdownSelectedOption(GuardianCountry, country);
	}

	public AssetsPage ClickNextButton() throws Exception {
		CommonFunctions.clickElement(NextButton);

		return new AssetsPage();
	}
	public AssetsPage ClickOkInviteSpousePopup2() throws Exception {
		CommonFunctions.clickElement(OkButtonPopUp2);
		return new AssetsPage();
	}
	public void ClickNextButton2() throws Exception {
		CommonFunctions.clickElement(NextButton);
	}
	public PersonalPage ClickBackButton() throws Exception {
		CommonFunctions.clickElement(CancelButton);

		return new PersonalPage();
	}

	public void CheckRelationshipStatusDropdownMandatory() throws Exception {
		CommonFunctions.elementDisplayed(
				RelationshipStatus.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void clickWillTogetherRadioYesRadioButton() throws Exception {
		CommonFunctions.clickElement(WillTogetherRadioYes);
	}

	public void clickWillTogetherRadioNoRadioButton() throws Exception {
		CommonFunctions.clickElement(WillTogetherRadioNo);
	}

	public void setQuestion8Input(String value) throws Exception {
		CommonFunctions.clearThenEnterElementValue(Question8, value);
	}

	public void UploadWill10MBPLUS() throws Exception {
		// CommonFunctions.assembleFilePathsToUpload(GoodPath,
		// "C:/Users/CLOUD-Demeth/Desktop/Maurice Blackburn/For Upload/12.84MB.jpg");
		// CommonFunctions.attachToUploadElement(driver.findElement(By.xpath(".//input[@id='Upload_file']")),
		// GoodPath);

		driver.findElement(By.xpath(".//input[@id='Upload_file']"))
				.sendKeys("C:/Users/DemethCamuin/Desktop/Maurice Blackburn/For Upload/Uploads/12.84MB.jpg");

	}

	public void UploadValidWill() throws Exception {
		driver.findElement(By.xpath(".//input[@id='Upload_file']"))
				.sendKeys("C:/Users/DemethCamuin/Desktop/Maurice Blackburn/For Upload/Uploads/WillInstructions1.pdf");

	}

	public void UploadMoreWills() throws Exception {
		driver.findElement(By.xpath(".//input[@id='Upload_file']"))
				.sendKeys("C:/Users/DemethCamuin/Desktop/Maurice Blackburn/For Upload/Uploads/WillInstructions1.pdf");
		CommonFunctions.pause(5000, false);
		driver.findElement(By.xpath(".//input[@id='Upload_file']"))
				.sendKeys("C:/Users/DemethCamuin/Desktop/Maurice Blackburn/For Upload/Uploads/WillInstructions2.pdf");
		CommonFunctions.pause(5000, false);
	}

	public void UploadWillInvalidFileFormat() throws Exception {
		driver.findElement(By.xpath(".//input[@id='Upload_file']")).sendKeys(
				"C:/Users/DemethCamuin/Desktop/Maurice Blackburn/For Upload/Uploads/Proposed MB Online Will Form V1.4.xlsx");
		CommonFunctions.pause(5000, false);
	}

	public void ClickRemoveAttachment() throws Exception {
		CommonFunctions.clickElement(RemoveAttachment);
	}

	public PersonalPage ProgressChangePersonal() throws Exception {
		CommonFunctions.clickElement(ProgressPersonal);

		return new PersonalPage();
	}

	public AssetsPage ProgressChangeAssets() throws Exception {
		CommonFunctions.clickElement(ProgressAssets);

		return new AssetsPage();
	}

	public BeneficiariesPage ProgressChangeBeneficiaries() throws Exception {
		CommonFunctions.clickElement(ProgressBeneficiaries);

		return new BeneficiariesPage();
	}

	public ExecutorsPage ProgressChangeExecutors() throws Exception {
		CommonFunctions.clickElement(ProgressExecutors);

		return new ExecutorsPage();
	}

	public IDdocsPage ProgressChangeIDdocs() throws Exception {
		CommonFunctions.clickElement(ProgressIDDocs);

		return new IDdocsPage();
	}

	public ReviewConfirmPage ProgressChangeReviewConfirm() throws Exception {
		CommonFunctions.clickElement(ProgressReviewConfirm);

		return new ReviewConfirmPage();
	}

	public AddOnsPage ProgressChangeAddOns() throws Exception {
		CommonFunctions.clickElement(ProgressAddOns);

		return new AddOnsPage();
	}

	public void DisplayTooltipForSpouse() throws Exception {
		CommonFunctions.elementDisplayed(SpousePartner_Tooltip);
	}

	public void DisplayTooltipSignificant() throws Exception {
		CommonFunctions.elementDisplayed(Significant_Tooltip);
	}

	public void DisplayTooltipDependents() throws Exception {
		CommonFunctions.elementDisplayed(Dependents_Tooltip);
	}

	public void DisplayTooltipUploadWill() throws Exception {
		CommonFunctions.elementDisplayed(UploadWill_Tooltip);
	}

	public void ClickTooltipUploadWill() throws Exception {
		CommonFunctions.clickElement(UploadWill_Tooltip);
	}

	public void ClickTooltipForSpouse() throws Exception {
		CommonFunctions.clickElement(SpousePartner_Tooltip);
	}

	public void ClickTooltipSignificant() throws Exception {
		CommonFunctions.clickElement(Significant_Tooltip);
	}

	public void ClickTooltipDependents() throws Exception {
		CommonFunctions.clickElement(Dependents_Tooltip);
	}

	public void ClickChildrenYes() throws Exception {
		CommonFunctions.clickElement(ChildrenYes);
		CommonFunctions.pause(5000, false);
	}

	public void ClickAddChild() throws Exception {
		CommonFunctions.clickElement(AddChild);
		CommonFunctions.pause(5000, false);
	}

	public void DisplayTooltipGuardian() throws Exception {
		CommonFunctions.elementDisplayed(Guardian_Tooltip);
	}

	public void DisplayTooltipGuardianVideo() throws Exception {
		CommonFunctions.elementDisplayed(Guardian_TooltipVideo);
	}

	public void ClickTooltipGuardian() throws Exception {
		CommonFunctions.clickElement(Guardian_Tooltip);
	}

	public void displayEmailConsent() throws Exception {
		// CommonFunctions.scrollToElement(email_Consent);
		CommonFunctions.elementDisplayed(email_Consent);
		CommonFunctions.pause(2500, false);
	}
}
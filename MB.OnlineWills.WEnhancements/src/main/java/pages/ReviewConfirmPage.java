package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ReviewConfirmPage extends Base {
	// ========================================================== Page Objects ===========================================================

	// Element - Checkbox

	@FindBy(xpath = "//input[contains(@type,'checkbox')]")
	WebElement Question1;

	@FindBy(xpath = "//input[contains(@id,'CB_Confirm')]")
	WebElement chk_Confirm;

	// Element - Button

	@FindBy(xpath = "//input[contains(@value,'Save and Continue')]")
	WebElement btn_Next;

	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement btn_Back;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[1]")
	WebElement btn_EditPersonal;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[2]")
	WebElement btn_EditAbout;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[3]")
	WebElement btn_EditAssets;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[4]")
	WebElement btn_EditBeneficiaries;

	@FindBy(xpath = "(//input[contains(@value,'Edit')])[5]")
	WebElement btn_EditExecutors;

	// Element - Dropdown

	@FindBy(xpath = "(//select[contains(@id,'IdentificationTypeInput')])[1]")
	WebElement Question2A;
	@FindBy(xpath = "(//span[text()='Are you currently in hospital?']//following::div[text()='No'])[1]")
	WebElement PersonalInfoHospitalQuestionWithNo;
	@FindBy(xpath = "(//span[text()='Are you currently in hospital?']//following::div[text()='Yes'])[1]")
	WebElement PersonalInfoHospitalQuestionWithYes;
	@FindBy(xpath = "(//span[contains(text(),'Have you been diagnosed with any conditions that affect your cognition or your physical ability to read and sign your Will?')]//following::div[text()='Yes'])[1]")
	WebElement PersonalInfoDiagnosedQuestionWithYes;
	@FindBy(xpath = "(//span[contains(text(),'Have you been diagnosed with any conditions that affect your cognition or your physical ability to read and sign your Will?')]//following::div[text()='No'])[1]")
	WebElement PersonalInfoDiagnosedQuestionWithNo;
	@FindBy(xpath = "//td[text()='Have you had a family law property settlement?']//following::td[text()='No']")
	WebElement FamilyLawPropertyNo;

	@FindBy(xpath = "//td[text()='Have you had a family law property settlement?']//following::td[text()='Yes']")
	WebElement FamilyLawPropertyYes;

	@FindBy(xpath = "(//select[contains(@id,'IdentificationTypeInput')])[2]")
	WebElement Question2B;

	@FindBy(xpath = "//select[contains(@id,'LicenseStateDropdown')]")
	WebElement Question4;

	@FindBy(xpath = "//select[contains(@id,'MedicareCardColour')]")
	WebElement Question10;

	@FindBy(xpath = "//select[contains(@id,'ForeignPassportCountryOfIssue')]")
	WebElement Question21;

	/* Not Mandatory */
	@FindBy(xpath = "//select[contains(@id,'AusPassportGender')]")
	WebElement AusPassportGender;

	// Element - Input

	/* Drivers License */
	@FindBy(xpath = "//input[contains(@id,'LicenseNo')]")
	WebElement Question3;

	@FindBy(xpath = "//input[contains(@id,'LicenseFname')]")
	WebElement Question5;

	@FindBy(xpath = "//input[contains(@id,'LicenseMname')]")
	WebElement Question6;

	@FindBy(xpath = "//input[contains(@id,'LicenseSurName')]")
	WebElement Question7;

	@FindBy(xpath = "//input[contains(@id,'LicenseDOBInput')]")
	WebElement Question8;

	/* Medicare */
	@FindBy(xpath = "//input[contains(@id,'MedicareGivenName')]")
	WebElement Question9;

	@FindBy(xpath = "//input[contains(@id,'MedicareNo')]")
	WebElement Question11;

	@FindBy(xpath = "//input[contains(@id,'MedicareIndividualReferenceNumber')]")
	WebElement Question12;

	@FindBy(xpath = "//input[contains(@id,'MedicareExpiryDateInput')]")
	WebElement Question13;

	@FindBy(xpath = "//input[contains(@id,'MedicareDOBInput')]")
	WebElement Question14;

	/* Australian Passport */
	@FindBy(xpath = "//input[contains(@id,'AusPassportNo')]")
	WebElement Question15;

	@FindBy(xpath = "//input[contains(@id,'AusPassportFname')]")
	WebElement Question16;

	@FindBy(xpath = "//input[contains(@id,'AusPassportMname')]")
	WebElement Question17;

	@FindBy(xpath = "//input[contains(@id,'AusPassportSurName')]")
	WebElement Question18;

	@FindBy(xpath = "//input[contains(@id,'PassportDOBInput')]")
	WebElement Question19;

	@FindBy(xpath = "//input[contains(@id,'AusPassportNo')]")
	WebElement Question20;

	/* Foreign Passport */
	@FindBy(xpath = "//input[contains(@id,'ForeignPassportFname')]")
	WebElement Question22;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportMname')]")
	WebElement Question23;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportSurname')]")
	WebElement Question24;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportDOBInput')]")
	WebElement Question25;
	@FindBy(xpath = "(//*[text()='Do you have any children?']//following::div[text()='Yes'])[1]")
	WebElement HaveChildrenYes;
	@FindBy(xpath = "(//*[text()='Do you have any children?']//following::div[text()='No'])[1]")
	WebElement HaveChildrenNo;

	@FindBy(xpath = "(//span[contains(text(),'Do you have any other dependents?')]//following::div[text()='Yes'])[1]")
	WebElement HaveDependentsYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any other dependents?')]//following::div[text()='No'])[1]")
	WebElement HaveDependentsNo;

	@FindBy(xpath = "(//span[contains(text(),'Do you already have a Will?')]//following::div[text()='None'])[1]")
	WebElement HaveWillNone;

	@FindBy(xpath = "(//span[contains(text(),'Do you have any assets?')]//following::div[text()='Yes'])[1]")
	WebElement HaveAssetsYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any assets?')]//following::div[text()='No'])[1]")
	WebElement HaveAssetsNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any debts?')]//following::div[text()='Yes'])[1]")
	WebElement HaveDebtsYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any debts?')]//following::div[text()='No'])[1]")
	WebElement HaveDebtsNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any superannuation?')]//following::div[text()='Yes'])[1]")
	WebElement HaveSuperYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have any superannuation?')]//following::div[text()='No'])[1]")
	WebElement HaveSuperNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you have life insurance separate from your superannuation?')]//following::div[text()='Yes'])[1]")
	WebElement HaveLifeInsuranceSuperYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you have life insurance separate from your superannuation?')]//following::div[text()='No'])[1]")
	WebElement HaveLifeInsuranceSuperNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you control a trust?')]//following::div[text()='Yes'])[1]")
	WebElement HaveTrustYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you control a trust?')]//following::div[text()='No'])[1]")
	WebElement HaveTrustNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you control a self-managed superannuation fund?')]//following::div[text()='Yes'])[1]")
	WebElement HaveSuperFundYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you control a self-managed superannuation fund?')]//following::div[text()='No'])[1]")
	WebElement HaveSuperFundNo;
	@FindBy(xpath = "(//span[contains(text(),'Do you own your own business, or are you a partner in a partnership?')]//following::div[text()='Yes'])[1]")
	WebElement HaveBusinessYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you own your own business, or are you a partner in a partnership?')]//following::div[text()='No'])[1]")
	WebElement HaveBusinessNo;

	@FindBy(xpath = "(//span[contains(text(),'Do you want to give the whole of your estate equally to any children you have in the future?')]//following::div[text()='Yes'])[1]")
	WebElement BenefFutureChildrenQuestionYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you want to give the whole of your estate equally to any children you have in the future?')]//following::div[text()='No'])[1]")
	WebElement BenefFutureChildrenQuestionNo;

	@FindBy(xpath = "(//span[contains(text(),'If any of your children predecease you')]//following::div[text()='Yes'])[1]")
	WebElement BenefDisasterQuestionYes;
	@FindBy(xpath = "(//span[contains(text(),'If any of your children predecease you')]//following::div[text()='No'])[1]")
	WebElement BenefDisasterQuestionNo;
	@FindBy(xpath = "(//div[contains(@id,'Content')])[120]")
	WebElement BenefDisasterQuestionField;

	@FindBy(xpath = "(//span[contains(text(),'Do you wish to leave any gifts?')]//following::div[text()='Yes'])[1]")
	WebElement HaveGiftYes;
	@FindBy(xpath = "(//span[contains(text(),'Do you wish to leave any gifts?')]//following::div[text()='No'])[1]")
	WebElement HaveGiftNo;

	@FindBy(xpath = "(//span[contains(text(),'Would you like Maurice Blackburn to assist with Managing your estate?')]//following::div[text()='Yes'])[1]")
	WebElement MBAssistManageEstateYes;
	@FindBy(xpath = "(//span[contains(text(),'Would you like Maurice Blackburn to assist with Managing your estate?')]//following::div[text()='No'])[1]")
	WebElement MBAssistManageEstateNo;

	@FindBy(xpath = "//input[contains(@id,'CB_Confirm')]")
	WebElement ConfirmAcknowledgement;
	@FindBy(xpath = "(//input[@value='Edit'])[1]")
	WebElement EditEnduringPowerofAttorney;
	@FindBy(xpath = "(//input[@value='Edit'])[2]")
	WebElement EditMedicalPowerofAttorney;
	@FindBy(xpath = "(//input[@value='Edit'])[1]")
	WebElement EditPersonalInfoSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[2]")
	WebElement EditAboutYouSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[3]")
	WebElement EditAssetsSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[4]")
	WebElement EditBeneficiariesSummary;
	@FindBy(xpath = "(//input[@value='Edit'])[5]")
	WebElement EditExecutorsSummary;

	@FindBy(xpath = "//span[text()='I do not want to appoint a Medical Decision Maker']//following::div[text()='Yes']")
	WebElement YesIDoNotWantToAppointAMedicalDecisionMaker;
	@FindBy(xpath = "//span[text()='I do not want to appoint a Medical Decision Maker']//following::div[text()='No']")
	WebElement NoIDoNotWantToAppointAMedicalDecisionMaker;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='Personal Details']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressPersonal;
	@FindBy(xpath = "//div[text()='About You']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAbout;
	@FindBy(xpath = "//div[text()='Assets']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAssets;
	@FindBy(xpath = "//div[text()='Executors']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressExecutors;
	@FindBy(xpath = "//div[text()='Beneficiaries']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressBeneficiaries;
	@FindBy(xpath = "//div[text()='ID Docs']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressIDDocs;
	@FindBy(xpath = "//div[text()='Add-ons']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAddOns;

	// Element Labels
	// Personal Details
	@FindBy(xpath = "//div[contains(@id,'Title') and . /text()='Personal Details']")
	WebElement Label_PersonalDetails;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Title:')]")
	WebElement Label_PersonalDetails_Title;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'First Name:')]")
	WebElement Label_PersonalDetails_Fname;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Middle Name:')]")
	WebElement Label_PersonalDetails_Mname;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Family Name:')]")
	WebElement Label_PersonalDetails_Sname;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Residential Address:')]")
	WebElement Label_PersonalDetails_RAddess;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Postal Address:')]")
	WebElement Label_PersonalDetails_PAddess;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Date of Birth:')]")
	WebElement Label_PersonalDetails_Birth;
	@FindBy(xpath = "(//div[contains(@id,'Column2')]//td[contains(text(),'Email:')])[1]")
	WebElement Label_PersonalDetails_Email;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Phone Number:')]")
	WebElement Label_PersonalDetails_PhoneNo;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Occupation:')]")
	WebElement Label_PersonalDetails_Occupation;
	// About You
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Current Marital Status:')]")
	WebElement Label_About_You_Status;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Length of relationship (years):')]")
	WebElement Label_About_You_Years;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//td[contains(text(),'Do you want to do your Will together with your spouse/partner?')]")
	WebElement Label_About_You_Will_With_Partner;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Title:')]")
	WebElement Label_About_You_Title;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'First Name:')]")
	WebElement Label_About_You_Fname;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Middle Name(s):')]")
	WebElement Label_About_You_Mname;
	@FindBy(xpath = "//div[contains(@id,'Column2')]//td[contains(text(),'Family Name:')]")
	WebElement Label_About_You_Sname;

	// Executors
	@FindBy(xpath = "(//div[@class='card Display']//span[contains(text(),'Name:')])[1]")
	WebElement Label_Executors_Name;
	@FindBy(xpath = "(//div[@class='card Display']//span[contains(text(),'Relationship:')])[1]")
	WebElement Label_Executors_Relationship;
	@FindBy(xpath = "//div[contains(@id,'Column1')]//span[contains(text(),'When I pass away, I wish to be:')]")
	WebElement Label_Executors_Wish;

	// ================================================== Initializing the Page Objects ==================================================
	public ReviewConfirmPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public PaymentsPage clickNextPaymentButton()throws Exception{
		CommonFunctions.clickElement(btn_Next);

		return new PaymentsPage();
	}

	public AddOnsPage clickNextAddOnsButton()throws Exception{
		CommonFunctions.clickElement(btn_Next);

		return new AddOnsPage();
	}

	public ThankYouPage clickNextThankYou()throws Exception{
		CommonFunctions.clickElement(btn_Next);

		return new ThankYouPage();
	}

	public void clickNextButton()throws Exception{
		CommonFunctions.clickElement(btn_Next);
	}

	public void clickQuestion1()throws Exception{
		CommonFunctions.clickElement(chk_Confirm);
	}

	public ExecutorsPage ClickEditExecutorsSummary()throws Exception{
		CommonFunctions.clickElement(EditExecutorsSummary);
		return new ExecutorsPage();
	}

	public BeneficiariesPage ClickEditBeneficiariesSummary()throws Exception{
		CommonFunctions.clickElement(EditBeneficiariesSummary);
		return new BeneficiariesPage();
	}

	public AssetsPage ClickEditAssetsSummary()throws Exception{
		CommonFunctions.clickElement(EditAssetsSummary);
		return new AssetsPage();
	}

	public AboutPage ClickEditAboutYouSummary()throws Exception{
		CommonFunctions.clickElement(EditAboutYouSummary);
		return new AboutPage();
	}

	public PersonalPage ClickEditPersonalInfoSummary()throws Exception{
		CommonFunctions.clickElement(EditPersonalInfoSummary);
		return new PersonalPage();
	}

	public void ClickConfirmAcknowledgement()throws Exception{
		CommonFunctions.clickElement(ConfirmAcknowledgement);
	}

	public void BenefDisasterQuestionYes()throws Exception{
		CommonFunctions.elementDisplayed(BenefDisasterQuestionYes);
	}

	public void BenefDisasterQuestionNo()throws Exception{
		CommonFunctions.elementDisplayed(BenefDisasterQuestionNo);
	}

	public void HaveGiftYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveGiftYes);
	}

	public void HaveGiftNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveGiftNo);
	}

	public void BenefDisasterQuestionField()throws Exception{
		CommonFunctions.elementDisplayed(BenefDisasterQuestionField);
	}

	public void BenefFutureChildrenQuestionYes()throws Exception{
		CommonFunctions.elementDisplayed(BenefFutureChildrenQuestionYes);
	}

	public void BenefFutureChildrenQuestionNo()throws Exception{
		CommonFunctions.elementDisplayed(BenefFutureChildrenQuestionNo);
	}

	public void HaveBusinessYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveBusinessYes);
	}

	public void HaveBusinessNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveBusinessNo);
	}

	public void HaveSuperFundYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveTrustYes);
	}

	public void HaveSuperFundNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveTrustNo);
	}

	public void HaveTrustYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveTrustYes);
	}

	public void HaveTrustNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveTrustNo);
	}

	public void HaveLifeInsuranceSuperNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveLifeInsuranceSuperNo);
	}

	public void HaveLifeInsuranceSuperYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveLifeInsuranceSuperYes);
	}

	public void validatesFields()throws Exception{
		CommonFunctions.textVisibleInPage("Personal Details");
		CommonFunctions.textVisibleInPage("About You");
		CommonFunctions.textVisibleInPage("Assets");
		CommonFunctions.textVisibleInPage("Beneficiaries");
		CommonFunctions.textVisibleInPage("ID Docs");
	}

	public void validatePersonalDetailsMyLifeWill()throws Exception{
		CommonFunctions.scrollToBottom();
		CommonFunctions.pause(2500, false);
		CommonFunctions.textVisibleInPage("Personal Details");
		CommonFunctions.textVisibleInPage("Title");
		CommonFunctions.textVisibleInPage("First Name");
		CommonFunctions.textVisibleInPage("Middle Name");
		CommonFunctions.textVisibleInPage("Family Name");
		CommonFunctions.textVisibleInPage("Residential Address");
		CommonFunctions.textVisibleInPage("Postal Address");
		CommonFunctions.textVisibleInPage("Date of Birth");
		CommonFunctions.textVisibleInPage("Email");
		CommonFunctions.textVisibleInPage("Phone Number");
		CommonFunctions.textVisibleInPage("Occupation");
	}

	public void validatePersonalDetails()throws Exception{
		CommonFunctions.scrollToBottom();
		CommonFunctions.pause(2500, false);
		CommonFunctions.textVisibleInPage("Personal Details");
		CommonFunctions.textVisibleInPage("Title");
		CommonFunctions.textVisibleInPage("First Name");
		CommonFunctions.textVisibleInPage("Middle Name");
		CommonFunctions.textVisibleInPage("Family Name");
		CommonFunctions.textVisibleInPage("Residential Address");
		CommonFunctions.textVisibleInPage("Postal Address");
		CommonFunctions.textVisibleInPage("Date of Birth");
		CommonFunctions.textVisibleInPage("Email");
		CommonFunctions.textVisibleInPage("Phone Number");
		CommonFunctions.textVisibleInPage("Occupation");
		CommonFunctions.textVisibleInPage("Personal Details");
		CommonFunctions.textVisibleInPage("Title:");
		CommonFunctions.textVisibleInPage("First Name:");
		CommonFunctions.textVisibleInPage("Middle Name:");
		CommonFunctions.textVisibleInPage("Family Name:");
		CommonFunctions.textVisibleInPage("Residential Address:");
		CommonFunctions.textVisibleInPage("Postal Address:");
		CommonFunctions.textVisibleInPage("Date of Birth:");
		CommonFunctions.textVisibleInPage("Email:");
		CommonFunctions.textVisibleInPage("Phone Number:");
		CommonFunctions.textVisibleInPage("Occupation:");
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.textVisibleInPage("Current Marital Status:");
		CommonFunctions.textVisibleInPage("Do you want to do your Will together with your spouse/partner?");
		CommonFunctions.textVisibleInPage("Title:");
		CommonFunctions.textVisibleInPage("First Name:");
		CommonFunctions.textVisibleInPage("Middle Name(s):");
		CommonFunctions.textVisibleInPage("Family Name:");
		CommonFunctions.textVisibleInPage("Email:");
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.textVisibleInPage("Name:");
		CommonFunctions.textVisibleInPage("Relationship:");

	}

	public void validateVicPersonalDetails()throws Exception{
		CommonFunctions.clickKeys(Keys.chord(Keys.PAGE_DOWN));
		CommonFunctions.pause(2500, false);
		CommonFunctions.textVisibleInPage("Personal Details");
		CommonFunctions.textVisibleInPage("Title");
		CommonFunctions.textVisibleInPage("First Name");
		CommonFunctions.textVisibleInPage("Middle Name");
		CommonFunctions.textVisibleInPage("Family Name");
		CommonFunctions.textVisibleInPage("Residential Address");
		CommonFunctions.textVisibleInPage("Postal Address");
		CommonFunctions.textVisibleInPage("Date of Birth");
		CommonFunctions.textVisibleInPage("Email");
		CommonFunctions.textVisibleInPage("Phone Number");
		CommonFunctions.textVisibleInPage("Occupation");
	}

	public void FamilyLawPropertyNo()throws Exception{
		CommonFunctions.elementDisplayed(FamilyLawPropertyNo);
	}

	public void HaveWillNone()throws Exception{
		CommonFunctions.elementDisplayed(HaveWillNone);
	}

	public void HaveSuperNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveSuperNo);
	}

	public void HaveSuperYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveSuperYes);
	}

	public void HaveDebtsNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveDebtsNo);
	}

	public void HaveDebtsYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveDebtsYes);
	}

	public void HaveAssetsNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveAssetsNo);
	}

	public void HaveAssetsYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveAssetsYes);
	}

	public void HaveDependentsNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveDependentsNo);
	}

	public void HaveDependentsYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveDependentsYes);
	}

	public void HaveChildrenNo()throws Exception{
		CommonFunctions.elementDisplayed(HaveChildrenNo);
	}

	public void HaveChildrenYes()throws Exception{
		CommonFunctions.elementDisplayed(HaveChildrenYes);
	}

	public void FamilyLawPropertyYes()throws Exception{
		CommonFunctions.elementDisplayed(FamilyLawPropertyYes);
	}

	public void HospitalNoSummary()throws Exception{
		CommonFunctions.elementDisplayed(PersonalInfoHospitalQuestionWithNo);
	}

	public void HospitalYesSummary()throws Exception{
		CommonFunctions.elementDisplayed(PersonalInfoHospitalQuestionWithYes);
	}

	public void DiagnosedYesSummary()throws Exception{
		CommonFunctions.elementDisplayed(PersonalInfoDiagnosedQuestionWithYes);
	}

	public void DiagnosedNoSummary()throws Exception{
		CommonFunctions.elementDisplayed(PersonalInfoDiagnosedQuestionWithNo);
	}

	public AddOnsPage ClickNextButton()throws Exception{
		CommonFunctions.clickElement(btn_Next);

		return new AddOnsPage();
	}

	public MedicalDecisionsPage ClickBackButtonMedical()throws Exception{
		CommonFunctions.clickElement(btn_Back);

		return new MedicalDecisionsPage();
	}

	public PaymentsPage ClickNextButtonPayment()throws Exception{
		CommonFunctions.clickElement(btn_Next);

		return new PaymentsPage();
	}

	public FinancialDecisionsPage clickEditEnduringPowerofAttorney()throws Exception{
		CommonFunctions.clickElement(EditEnduringPowerofAttorney);

		return new FinancialDecisionsPage();
	}

	public MedicalDecisionsPage clickEditMedicalPowerofAttorney()throws Exception{
		CommonFunctions.clickElement(EditMedicalPowerofAttorney);

		return new MedicalDecisionsPage();
	}

	public void DisplayYesIDoNotWantToAppointAMedicalDecisionMaker()throws Exception{
		CommonFunctions.clickElement(YesIDoNotWantToAppointAMedicalDecisionMaker);
	}

	public PersonalPage ProgressChangePersonal()throws Exception{
		CommonFunctions.clickElement(ProgressPersonal);

		return new PersonalPage();
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

	public AboutPage ProgressChangeReviewConfirm()throws Exception{
		CommonFunctions.clickElement(ProgressAbout);

		return new AboutPage();
	}

	public AddOnsPage ProgressChangeAddOns()throws Exception{
		CommonFunctions.clickElement(ProgressAddOns);

		return new AddOnsPage();
	}

	public void ValidateLabels()throws Exception{
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Email);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Birth);
		CommonFunctions.elementDisplayed(Label_PersonalDetails);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Fname);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Mname);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Occupation);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_PAddess);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_PhoneNo);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_RAddess);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Sname);
		CommonFunctions.elementDisplayed(Label_PersonalDetails_Title);
		CommonFunctions.elementDisplayed(Label_About_You_Fname);
		CommonFunctions.elementDisplayed(Label_About_You_Mname);
		CommonFunctions.elementDisplayed(Label_About_You_Sname);
		CommonFunctions.elementDisplayed(Label_About_You_Status);
		CommonFunctions.elementDisplayed(Label_About_You_Title);
		CommonFunctions.elementDisplayed(Label_About_You_Years);
		CommonFunctions.elementDisplayed(Label_About_You_Will_With_Partner);
		CommonFunctions.elementDisplayed(Label_Executors_Name);
		CommonFunctions.elementDisplayed(Label_Executors_Relationship);
		CommonFunctions.elementDisplayed(Label_Executors_Wish);

	}
	public PendingSpousePage ClickNextButtonPendingSpouse()throws Exception{
		CommonFunctions.clickElement(btn_Next);

		return new PendingSpousePage();
	}

}
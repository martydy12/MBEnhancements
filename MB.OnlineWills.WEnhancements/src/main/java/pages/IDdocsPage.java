package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class IDdocsPage extends Base {
	// ========================================================== Page Objects ===========================================================

	// Element - Checkbox

	@FindBy(xpath = "//input[contains(@type,'checkbox')]")
	WebElement Question1;

	// Element - Button

	@FindBy(xpath = "//input[contains(@value,'Save and Continue')]")
	WebElement btn_Next;

	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement btn_Back;

	// Element - Dropdown

	@FindBy(xpath = "(//select[contains(@id,'IdentificationTypeInput')])[1]")
	WebElement Question2A;
	
	@FindBy(xpath = "//a[text()='Add Identification Document']")
	WebElement AddDocumentLink;
	
	@FindBy(xpath = "//input[@value='Add']")
	WebElement AddValueButton;
	@FindBy(xpath = "(//input[@value='Cancel'])[2]")
	WebElement CancelValueButton;

	// @FindBy(xpath = "(//select[contains(@id,'IdentificationTypeInput')])[2]")
	// WebElement Question2B;

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

	/* Foreign Passport */
	@FindBy(xpath = "//input[contains(@id,'ForeignPassportNo')]")
	WebElement Question20;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportFname')]")
	WebElement Question22;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportMname')]")
	WebElement Question23;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportSurname')]")
	WebElement Question24;

	@FindBy(xpath = "//input[contains(@id,'ForeignPassportDOBInput')]")
	WebElement Question25;

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
	@FindBy(xpath = "//div[text()='Review & Confirm']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressReviewConfirm;
	@FindBy(xpath = "//div[text()='Add-ons']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAddOns;
	
	//Alert Messages
	//Foreign Passport
	@FindBy(xpath = "//span[contains(@id,'ForeignPassportNo')]")
	WebElement FPPNo;
	@FindBy(xpath = "//span[contains(@id,'ForeignPassportDOBInput')]")
	WebElement FPDOB;
	@FindBy(xpath = "//span[contains(@id,'ForeignPassportCountryOfIssue')]")
	WebElement FPCI;
	@FindBy(xpath = "//span[contains(@id,'ForeignPassportFname')]")
	WebElement FPFName;
	@FindBy(xpath = "//span[contains(@id,'ForeignPassportSurname')]")
	WebElement FPSurName;
	//Australian Passport
	@FindBy(xpath = "//span[contains(@id,'AusPassportNo')]")
	WebElement APPNo;
	@FindBy(xpath = "(//span[contains(@id,'PassportDOBInput')])[1]")
	WebElement APDOB;
	@FindBy(xpath = "//span[contains(@id,'AusPassportGender')]")
	WebElement APGender;
	@FindBy(xpath = "//span[contains(@id,'AusPassportFname')]")
	WebElement APFName;
	@FindBy(xpath = "//span[contains(@id,'AusPassportSurName')]")
	WebElement APSurName;
	//Drivers License
	@FindBy(xpath = "//span[contains(@id,'LicenseNo')]")
	WebElement DLNo;
	@FindBy(xpath = "//span[contains(@id,'LicenseDOBInput')]")
	WebElement DLDOB;
	@FindBy(xpath = "//span[contains(@id,'LicenseStateDropdown')]")
	WebElement DLSOI;
	@FindBy(xpath = "//span[contains(@id,'LicenseFname')]")
	WebElement DLFName;
	@FindBy(xpath = "//span[contains(@id,'LicenseSurName')]")
	WebElement DLSurName;
	//Medicare
	@FindBy(xpath = "//span[contains(@id,'MedicareNo')]")
	WebElement MNo;
	@FindBy(xpath = "//span[contains(@id,'MedicareDOBInput')]")
	WebElement MDOB;
	@FindBy(xpath = "//span[contains(@id,'MedicareExpiryDateInput')]")
	WebElement MExpDate;
	@FindBy(xpath = "//span[contains(@id,'MedicareGivenName')]")
	WebElement MFName;
	@FindBy(xpath = "//span[contains(@id,'MedicareIndividualReferenceNumber')]")
	WebElement MRefNo;
	@FindBy(xpath = "//span[contains(@id,'MedicareCardColour')]")
	WebElement MCardColor;
	
	// Add Identification Document
	// @FindBy(xpath = "//a[contains(@id,'AddIdentityDocs')]")
	@FindBy(xpath = "//a[contains(text(),'Add Identification Document')]")
	// @FindBy(xpath = "//span[@class='fa fa-fw fa-plus']//parent::a")
	WebElement AddIdentification;
	@FindBy(xpath = "//input[contains(@value,'Add')]")
	WebElement id_Save;
	@FindBy(xpath = "//input[contains(@value,'Cancel')]")
	WebElement id_Cancel;

	// ================================================== Initializing the Page Objects ==================================================
	public IDdocsPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void displayQuestion1()throws Exception{
		CommonFunctions.elementDisplayed(Question1);
	}

	public void ClickQuestion1()throws Exception{
		CommonFunctions.clickElement(Question1);
	}

	/* Drivers License 

	public void displayMandatoryDriversLicense()throws Exception{
		CommonFunctions.elementDisplayed(Question3.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question5.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question7.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question8.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));

	}*/
	
	public void displayMandatoryDLValidation()throws Exception{
		CommonFunctions.elementDisplayed(DLNo);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(DLDOB);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(DLSOI);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(DLFName);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(DLSurName);
		CommonFunctions.pause(1500, false);
	}

	public void displayQuestion3()throws Exception{
		CommonFunctions.elementDisplayed(Question3.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion4()throws Exception{
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayQuestion6()throws Exception{
		CommonFunctions.elementDisplayed(Question5.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion7()throws Exception{
		CommonFunctions.elementDisplayed(Question7.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion8()throws Exception{
		CommonFunctions.elementDisplayed(Question8.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	/* Medicare 

	public void displayMandatoryMedicare()throws Exception{
		CommonFunctions.elementDisplayed(Question9.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question10.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question11.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question12.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question13.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
		CommonFunctions.elementDisplayed(Question14.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));

	}*/
	
	public void displayMandatoryMedicareValidation()throws Exception{
		CommonFunctions.elementDisplayed(MNo);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(MDOB);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(MExpDate);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(MFName);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(MRefNo);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(MCardColor);
		CommonFunctions.pause(1500, false);
	}

	public void displayQuestion9()throws Exception{
		CommonFunctions.elementDisplayed(Question9.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion10()throws Exception{
		CommonFunctions.elementDisplayed(Question10.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion11()throws Exception{
		CommonFunctions.elementDisplayed(Question11.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion12()throws Exception{
		CommonFunctions.elementDisplayed(Question12.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion13()throws Exception{
		CommonFunctions.elementDisplayed(Question13.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayQuestion14()throws Exception{
		CommonFunctions.elementDisplayed(Question14.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	/* Australian Passport 
	public void displayMandatoryAUPassport()throws Exception{
		CommonFunctions.elementDisplayed(Question15.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question16.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question18.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question19.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
		CommonFunctions.elementDisplayed(AusPassportGender.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}*/
	public void displayMandatoryAPValidation()throws Exception{
		CommonFunctions.elementDisplayed(APPNo);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(APDOB);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(APGender);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(APFName);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(APSurName);
		CommonFunctions.pause(1500, false);
	}

	public void displayQuestion15()throws Exception{
		CommonFunctions.elementDisplayed(Question15.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion16()throws Exception{
		CommonFunctions.elementDisplayed(Question16.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayQuestion17()throws Exception{
		CommonFunctions.elementDisplayed(Question17.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion18()throws Exception{
		CommonFunctions.elementDisplayed(Question18.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion19()throws Exception{
		CommonFunctions.elementDisplayed(Question19.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayAusPassportGender()throws Exception{
		CommonFunctions.elementDisplayed(AusPassportGender.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	/* ForeignPassport 

	public void displayMandatoryForeignPassport()throws Exception{
		CommonFunctions.elementDisplayed(Question20.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question21.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question22.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question24.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(Question25.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}*/
	
	public void displayMandatoryFPValidation()throws Exception{
		CommonFunctions.elementDisplayed(FPPNo);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(FPDOB);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(FPCI);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(FPFName);
		CommonFunctions.pause(1500, false);
		CommonFunctions.elementDisplayed(FPSurName);
		CommonFunctions.pause(1500, false);
	}

	public void displayQuestion20()throws Exception{
		CommonFunctions.elementDisplayed(Question20.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion21()throws Exception{
		CommonFunctions.elementDisplayed(Question21.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void displayQuestion22()throws Exception{
		CommonFunctions.elementDisplayed(Question22.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion23()throws Exception{
		CommonFunctions.elementDisplayed(Question23.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion24()throws Exception{
		CommonFunctions.elementDisplayed(Question24.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion25()throws Exception{
		CommonFunctions.elementDisplayed(Question25.findElement(By.xpath(".//following-sibling::span[text()='Invalid Date!']")));
	}

	public void SelectForeignPassportFirstID()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question2A, "Foreign Passport");
	}
	public void ClickAddIdentificationDocument()throws Exception{
		CommonFunctions.clickElement(AddDocumentLink);
	}
	public void ClickAddButton()throws Exception{
		CommonFunctions.clickElement(AddValueButton);
	}
	public void ClickCancelButton()throws Exception{
		CommonFunctions.clickElement(CancelValueButton);
	}
	public void SelectForeignPassportSecondID()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question2A, "Foreign Passport");
	}

	public void SelectAustralianPassportFirstID()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question2A, "Australian Passport");
	}

	public void SelectAustralianPassportSecondID()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question2A, "Australian Passport");
	}

	public void SelectDriverLicenseFirstID()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question2A, "Driver's Licence");
	}

	public void SelectDriverLicenseSecondID()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question2A, "Driver's Licence");
	}

	public void SelectMedicareFirstID()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question2A, "Medicare");
	}

	public void SelectMedicareSecondID()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question2A, "Medicare");
	}

	public void FillUpDriversLicense()throws Exception{

		// CommonFunctions.selectValueFromDropdown(Question2B, "Driver's License");
		// CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question3, "First");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question4, "ACT");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question5, "Option");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question7, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question8, "05/09/1990");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}

	public void FillUpMedicare()throws Exception{

		// CommonFunctions.selectValueFromDropdown(Question2B, "Medicare");
		// CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question9, "First");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question10, "Green");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question11, "1111111111");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question12, "0123456789");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "01/01/2025");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question14, "05/09/1990");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}

	public void FillUpAustralianPassport()throws Exception{

		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question15, "N0995852");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question16, "Dim");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question17, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question18, "User");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(AusPassportGender, "Male");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question19, "05/09/1990");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}

	public void FillUpForeignPassport()throws Exception{

		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question20, "DEF2222");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question21, "ANGOLA");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question22, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question24, "User");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question25, "05/09/1990");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(5000, false);
	}

	public ReviewConfirmPage ClickNextButton()throws Exception{
		CommonFunctions.clickElement(btn_Next);

		return new ReviewConfirmPage();
	}

	public ExecutorsPage ClickBackButton()throws Exception{
		CommonFunctions.clickElement(btn_Back);

		return new ExecutorsPage();
	}

	public BeneficiariesPage ClickBackIDDocs()throws Exception{
		CommonFunctions.clickElement(btn_Back);

		return new BeneficiariesPage();
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

	public PersonalPage ProgressPersonal()throws Exception{
		CommonFunctions.clickElement(ProgressPersonal);

		return new PersonalPage();
	}

	public ReviewConfirmPage ProgressChangeReviewConfirm()throws Exception{
		CommonFunctions.clickElement(ProgressReviewConfirm);

		return new ReviewConfirmPage();
	}

	public AddOnsPage ProgressChangeAddOns()throws Exception{
		CommonFunctions.clickElement(ProgressAddOns);

		return new AddOnsPage();
	}

	public void clickAddFirstIdentification()throws Exception{
		CommonFunctions.clickElement(AddIdentification);
		CommonFunctions.pause(3000, false);
	}

	public void clickAddSecondIdentification()throws Exception{
		CommonFunctions.clickElement(AddIdentification);
		CommonFunctions.pause(3000, false);
	}

	public void clickAddID()throws Exception{
		CommonFunctions.clickElement(id_Save);
		CommonFunctions.pause(2500, false);
	}

	public void clickCancelID()throws Exception{
		CommonFunctions.clickElement(id_Cancel);
		CommonFunctions.pause(2500, false);
	}
}
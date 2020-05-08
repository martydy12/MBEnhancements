package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class AssetsPage extends Base {
	// ========================================================= Page Objects ===========================================================
	@FindBy(xpath = "//input[contains(@id,'RadioButton_AssetYes')]")
	WebElement YesQuestion1;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_AssetNo')]")
	WebElement NoQuestion1;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_DebtYes')]")
	WebElement YesQuestion2;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_DebtNo')]")
	WebElement NoQuestion2;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperYes')]")
	WebElement YesQuestion3;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperNo')]")
	WebElement NoQuestion3;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_InsuranceNo')]")
	WebElement YesQuestion4;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_InsuranceNo')]")
	WebElement NoQuestion4;
	@FindBy(xpath = "// div[contains(@id,'InputsAndLabels')]//following::div//following::div[text()='Required field']")
	WebElement FuneralWishesReq;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_TrustYes')]")
	WebElement YesQuestion5;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_TrustNo')]")
	WebElement NoQuestion5;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_SelfYes')]")
	WebElement YesQuestion6;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_SelfNo')]")
	WebElement NoQuestion6;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_OwnBusinessYes')]")
	WebElement YesQuestion7;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_OwnBusinessNo')]")
	WebElement NoQuestion7;

	@FindBy(xpath = "(//input[contains(@id,'RadioButton_AssetNo')]//following::label//following::div[text()='Required field'])[1]")
	WebElement NoQuestion1Required;
	@FindBy(xpath = "//a[contains(@id,'AssetAddAsset')]")
	WebElement AddAsset;
	@FindBy(xpath = "//a[text()='Edit']")
	WebElement EditAsset;
	@FindBy(xpath = "//a[text()='Delete']")
	WebElement DeleteAsset;
	@FindBy(xpath = "//select[contains(@id,'DropDown_Asset')]")
	WebElement SelectAssetDropdown;
	@FindBy(xpath = "(//select[contains(@id,'DropDown_Asset')]//following::a//following::span//following::span)[1]")
	WebElement SelectAssetDropdownRequired;
	@FindBy(xpath = "//input[contains(@id,'Button_AssetListCancel')]")
	WebElement CancelAddAsset;
	@FindBy(xpath = "//input[contains(@id,'Button_AssetListSave')]")
	WebElement SaveAddAsset;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_RightsYes')]")
	WebElement RightsYes;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_RightsNo')]")
	WebElement RightsNo;
	@FindBy(xpath = "//*[text()='Add Superannuation Account']")
	WebElement AddSuper;
	@FindBy(xpath = "//input[contains(@id,'Button_SuperAdd')]")
	WebElement SuperSave;
	@FindBy(xpath = "//input[contains(@id,'Button_SuperCancel')]")
	WebElement SuperCancel;

	@FindBy(xpath = "//*[text()='Add Nominated Beneficiary']")
	WebElement AddSuperBenef;
	@FindBy(xpath = "(//*[text()='Edit'])[3]")
	WebElement EditSuperBenef;
	@FindBy(xpath = "(//*[text()='Delete'])[3]")
	WebElement DeleteSuperBenef;
	@FindBy(xpath = "//input[contains(@id,'SuperBenefAdd')]")
	WebElement AddSuperBenefSave;
	@FindBy(xpath = "//input[contains(@id,'SuperBenefCancel')]")
	WebElement AddSuperBenefCancel;

	// Property
	@FindBy(xpath = "//select[contains(@id,'DropDown_Ownership')]")
	WebElement PropertyOwnership;
	@FindBy(xpath = "(//select[contains(@id,'DropDown_Ownership')]//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertyOwnershipReq;
	@FindBy(xpath = "//input[contains(@id,'Input_Value')]")
	WebElement PropertyApproxValue;
	@FindBy(xpath = "//select[contains(@id,'DropDown_Country')]")
	WebElement PropertyCountry;
	@FindBy(xpath = "//input[contains(@id,'Input_Address1')]")
	WebElement PropertyAddress1;
	@FindBy(xpath = "//input[contains(@id,'Input_Address2')]")
	WebElement PropertyAddress2;
	@FindBy(xpath = "(//input[contains(@id,'Input_Address1')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertyAddress1Req;
	@FindBy(xpath = "//input[contains(@id,'Input_Suburb')]")
	WebElement PropertySuburb;
	@FindBy(xpath = "(//input[contains(@id,'Input_Suburb')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertySuburbReq;
	@FindBy(xpath = "//select[contains(@id,'DropDown_State')]")
	WebElement PropertyState;
	@FindBy(xpath = "(//select[contains(@id,'DropDown_State')]//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertyStateReq;
	@FindBy(xpath = "//input[contains(@id,'Input_PostCode')]")
	WebElement PropertyPostCode;
	@FindBy(xpath = "(//input[contains(@id,'Input_PostCode')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement PropertyPostCodeReq;
	@FindBy(xpath = "//input[contains(@id,'Input_AssetDetails')]")
	WebElement BankAccountFinancialInstitution;
	@FindBy(xpath = "(//input[contains(@id,'Input_AssetDetails')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BankAccountFinancialInstitutionReq;

	// Asset - Debt
	@FindBy(xpath = "//input[contains(@id,'DebtOwedTo')]//following::span[text()='Required field']")
	WebElement NoQuestion2Required;
	@FindBy(xpath = "//div[contains(@id,'SectionTitle')]//span[text()='Please add debt']")
	WebElement NoQuestion2AddDebt;
	@FindBy(xpath = "//a[contains(@id,'AssetAddDebt')]")
	WebElement AddDebt;
	@FindBy(xpath = "//input[contains(@id,'DebtOwedTo')]")
	WebElement DebtOwedTo;
	@FindBy(xpath = "//input[contains(@id,'DebtApproxValue')]")
	WebElement DebtApproxValue;
	@FindBy(xpath = "(//a[contains(@id,'DebtDelete')])[1]")
	WebElement DebtDelete1;
	@FindBy(xpath = "(//a[contains(@id,'DebtDelete')])[2]")
	WebElement DebtDelete2;
	@FindBy(xpath = "//a[contains(@id,'DebtEdit')]")
	WebElement DebtEdit;
	@FindBy(xpath = "//input[contains(@value,'Save')]")
	WebElement DebtSave;
	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	WebElement DebtCancel;

	// buttons
	@FindBy(xpath = "//input[contains(@value,'Save and Continue')]")
	WebElement NextButton;
	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement BackButton;
	@FindBy(xpath = "//input[contains(@id,'SuperFundName')]")
	WebElement SuperFundName;
	@FindBy(xpath = "//input[contains(@id,'SuperBindingYes')]")
	WebElement BindingYes;
	@FindBy(xpath = "//input[contains(@id,'SuperBindingNo')]")
	WebElement BindingNo;
	@FindBy(xpath = "//input[contains(@id,'SuperBindingUnsure')]")
	WebElement BindingUnsure;

	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperDeathBenefUnsure')]")
	WebElement SuperDeathBenefUnsure;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperDeathBenefNo')]")
	WebElement SuperDeathBenefNo;
	@FindBy(xpath = "//input[contains(@id,'RadioButton_SuperDeathBenefYes')]")
	WebElement SuperDeathBenefYes;

	@FindBy(xpath = "//select[contains(@id,'BenefTitle')]")
	WebElement BenefTitle;
	@FindBy(xpath = "(//select[contains(@id,'BenefTitle')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefTitleReq;
	@FindBy(xpath = "//input[contains(@id,'BenefFirstName')]")
	WebElement BenefFName;
	@FindBy(xpath = "(//input[contains(@id,'BenefFirstName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefFNameReq;
	@FindBy(xpath = "//input[contains(@id,'BenefMiddleName')]")
	WebElement BenefMName;
	@FindBy(xpath = "//input[contains(@id,'BenefLastName')]")
	WebElement BenefLName;
	@FindBy(xpath = "(//input[contains(@id,'BenefLastName')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefLNameReq;
	@FindBy(xpath = "//select[contains(@id,'BenefRelationship')]")
	WebElement BenefRelationship;
	@FindBy(xpath = "(//select[contains(@id,'BenefRelationship')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefRelationshipReq;
	@FindBy(xpath = "//input[contains(@id,'NominatedPortion')]")
	WebElement BenefNominatedPortion;
	@FindBy(xpath = "(//input[contains(@id,'NominatedPortion')]//following::a//following::span//following::span[text()='Required field'])[1]")
	WebElement BenefNominatedPortionReq;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='Personal Details']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressPersonal;
	@FindBy(xpath = "//div[text()='About You']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAbout;
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

	@FindBy(xpath = "// div[contains(@id,'DeathBenef_Tooltip')]")
	WebElement DeathBenef_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Binding_Tooltip')]")
	WebElement Binding_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Assets_Tooltip')]")
	WebElement Assets_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Trust_Tooltip')]")
	WebElement Trust_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Trust_TooltipVideo')]")
	WebElement Trust_TooltipVideo;
	@FindBy(xpath = "// div[contains(@id,'Superannuation_Tooltip')]")
	WebElement Super_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Superannuation_TooltipVideo')]")
	WebElement Super_TooltipVideo;
	@FindBy(xpath = "// div[contains(@id,'Interests_Tooltip')]")
	WebElement Interest_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Ownership_Tooltip')]")
	WebElement Ownership_Tooltip;
	@FindBy(xpath = "// div[contains(@id,'Ownership_TooltipVideo')]")
	WebElement Ownership_TooltipVideo;
	@FindBy(xpath = "(//a[text()='Change'])[1]")
	WebElement ChangePersonalButton;

	// ================================================== Initializing the Page Objects ==================================================
	public AssetsPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public PersonalPage ClickChangeButtonPersonal()throws Exception{
		CommonFunctions.clickElement(ChangePersonalButton);

		return new PersonalPage();
	}
	
	public void ClickBindingYes()throws Exception{
		CommonFunctions.clickElement(BindingYes);
	}

	public void ClickRightsNo()throws Exception{
		CommonFunctions.clickElement(RightsNo);
	}

	public void ClickRightsYes()throws Exception{
		CommonFunctions.clickElement(RightsYes);
	}

	public void DisplayedFuneralRequired()throws Exception{
		CommonFunctions.elementDisplayed(FuneralWishesReq);
	}

	public void DisplayValidationOnMandatoryFieldsForNominatedDeathBenef()throws Exception{
		CommonFunctions.elementDisplayed(BenefTitleReq);
		CommonFunctions.elementDisplayed(BenefFNameReq);
		CommonFunctions.elementDisplayed(BenefLNameReq);
		CommonFunctions.elementDisplayed(BenefRelationshipReq);
		CommonFunctions.elementDisplayed(BenefNominatedPortionReq);
	}

	public void NominateBeneficiary()throws Exception{
		CommonFunctions.selectValueFromDropdown(BenefTitle, "Miss");
		CommonFunctions.pause(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefFName, "Nominate Beneficiary FirstName");
		CommonFunctions.pause(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefMName, "Nominate Beneficiary MiddleName");
		CommonFunctions.pause(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefLName, "Nominate Beneficiary LastName");
		CommonFunctions.pause(2000, false);
		CommonFunctions.selectValueFromDropdown(BenefRelationship, "Aunt");
		CommonFunctions.pause(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefNominatedPortion, "Nominate Portion");
	}

	public void EditNominateBeneficiary()throws Exception{
		CommonFunctions.selectValueFromDropdown(BenefTitle, "Dr");
		CommonFunctions.pause(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefFName, "Nominate Beneficiary FirstName Edit");
		CommonFunctions.pause(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefMName, "Nominate Beneficiary MiddleName Edit");
		CommonFunctions.pause(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefLName, "Nominate Beneficiary LastName Edit");
		CommonFunctions.pause(2000, false);
		CommonFunctions.selectValueFromDropdown(BenefRelationship, "Sister");
		CommonFunctions.pause(2000, false);
		CommonFunctions.clearThenEnterElementValue(BenefNominatedPortion, "Nominate Portion Edit");
	}

	public void ClickBindingUnsure()throws Exception{
		CommonFunctions.clickElement(BindingUnsure);
	}

	public void ClickBindingNo()throws Exception{
		CommonFunctions.clickElement(BindingNo);
	}

	public void SuperDeathBenefSave()throws Exception{
		CommonFunctions.clickElement(AddSuperBenefSave);
	}

	public void ClickAddSuper()throws Exception{
		CommonFunctions.clickElement(AddSuper);
	}

	public void ClickAddSuperBenef()throws Exception{
		CommonFunctions.clickElement(AddSuperBenef);
	}

	public void ClickEditSuperBenef()throws Exception{
		CommonFunctions.clickElement(EditSuperBenef);
	}

	public void ClickDeleteSuperBenef()throws Exception{
		CommonFunctions.clickElement(DeleteSuperBenef);
	}

	public void ClickDeathBenefYes()throws Exception{
		CommonFunctions.clickElement(SuperDeathBenefYes);
	}

	public void ClickDeathBenefNo()throws Exception{
		CommonFunctions.clickElement(SuperDeathBenefNo);
	}

	public void ClickDeathBenefUnsure()throws Exception{
		CommonFunctions.clickElement(SuperDeathBenefUnsure);
	}

	public void AddSuperWithDeathBenefUnsure()throws Exception{
		CommonFunctions.clearThenEnterElementValue(SuperFundName, "Super Unsure");
		CommonFunctions.clickElement(SuperDeathBenefUnsure);
		CommonFunctions.clickElement(SuperSave);
	}

	public void AddSuperWithDeathBenefNo()throws Exception{
		CommonFunctions.clearThenEnterElementValue(SuperFundName, "Super No");
		CommonFunctions.clickElement(SuperDeathBenefNo);
		CommonFunctions.clickElement(SuperSave);
	}

	public void AddSuperWithDeathBenefYes()throws Exception{
		CommonFunctions.clearThenEnterElementValue(SuperFundName, "Super Yes");
		CommonFunctions.clickElement(SuperDeathBenefYes);
	}

	public void MandatoryfieldsAddSuper()throws Exception{
		CommonFunctions.elementDisplayed(SuperFundName.findElement(By.xpath(".//following::span//following::span[text()='Required field']")));
		CommonFunctions.elementDisplayed(SuperDeathBenefUnsure.findElement(By.xpath(".//following::span//following::div[text()='Required field']")));
	}

	public void ClickAddSuperSave()throws Exception{
		CommonFunctions.clickElement(SuperSave);
		CommonFunctions.pause(3000, false);
	}

	public void ClickAddSuperCancel()throws Exception{
		CommonFunctions.clickElement(SuperCancel);
		CommonFunctions.pause(3000, false);
	}

	public void ClickYesQuestion1()throws Exception{
		CommonFunctions.clickElement(YesQuestion1);
	}

	public void ClickNoQuestion2()throws Exception{
		CommonFunctions.clickElement(NoQuestion2);
	}

	public void ClickYesQuestion2()throws Exception{
		CommonFunctions.clickElement(YesQuestion2);
	}

	public void ClickNoQuestion3()throws Exception{
		CommonFunctions.clickElement(NoQuestion3);
	}

	public void ClickYesQuestion3()throws Exception{
		CommonFunctions.clickElement(YesQuestion3);
	}

	public void ClickNoQuestion4()throws Exception{
		CommonFunctions.clickElement(NoQuestion4);
	}

	public void ClickYesQuestion4()throws Exception{
		CommonFunctions.clickElement(YesQuestion4);
	}

	public void ClickNoQuestion5()throws Exception{
		CommonFunctions.clickElement(NoQuestion5);
	}

	public void ClickYesQuestion5()throws Exception{
		CommonFunctions.clickElement(YesQuestion5);
	}

	public void ClickNoQuestion6()throws Exception{
		CommonFunctions.clickElement(NoQuestion6);
	}

	public void ClickYesQuestion6()throws Exception{
		CommonFunctions.clickElement(YesQuestion6);
	}

	public void ClickNoQuestion7()throws Exception{
		CommonFunctions.clickElement(NoQuestion7);
	}

	public void ClickYesQuestion7()throws Exception{
		CommonFunctions.clickElement(YesQuestion7);
	}

	public void ClickNoQuestion1()throws Exception{
		CommonFunctions.clickElement(NoQuestion1);
	}

	public void DisplayedNoQuestion1Required()throws Exception{
		CommonFunctions.elementDisplayed(NoQuestion1Required);
	}

	public void CheckSelectAssetDropdownValues()throws Exception{
		String[] Values = { "Select one", "Property", "Bank Account", "Vehicle", "Shares", "Other" };
		CommonFunctions.checkDropdownOptionsAvailable(SelectAssetDropdown, Values);
	}

	public void CheckSelectAssetDropdownDefaultValue()throws Exception{
		CommonFunctions.checkSingleSelectDropdownSelectedOption(SelectAssetDropdown, "Select one");
	}

	public void ClickSaveAsset()throws Exception{
		CommonFunctions.clickElement(SaveAddAsset);
	}

	public void ClickCancelAsset()throws Exception{
		CommonFunctions.clickElement(CancelAddAsset);
	}

	public void ClickAddAsset()throws Exception{
		CommonFunctions.clickElement(AddAsset);
	}

	public void ClickEditAsset()throws Exception{
		CommonFunctions.clickElement(EditAsset);
	}

	public void ClickDeleteAsset()throws Exception{
		CommonFunctions.clickElement(DeleteAsset);
	}

	public void ClickDeleteDebt1()throws Exception{
		CommonFunctions.clickElement(DebtDelete1);
		CommonFunctions.clickElement(DebtDelete1);
		CommonFunctions.pause(3000, false);
		CommonFunctions.clickElement(DebtDelete1);
		CommonFunctions.pause(3000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.pause(1500, false);
	}

	public void ClickDeleteDebt2()throws Exception{
		CommonFunctions.clickElement(DebtDelete2);
		CommonFunctions.clickElement(DebtDelete2);
		CommonFunctions.pause(3000, false);
		CommonFunctions.clickElement(DebtDelete2);
		CommonFunctions.pause(3000, false);
		CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
		CommonFunctions.pause(1500, false);
	}

	public void ClickCancelDebt()throws Exception{
		CommonFunctions.clickElement(DebtCancel);
	}

	public void DisplayedAddAsset()throws Exception{
		CommonFunctions.elementDisplayed(AddAsset);
	}

	public void DisplayedSelectAssetDropdownRequired()throws Exception{
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.elementDisplayed(SelectAssetDropdownRequired);
	}

	public void clickAddDebt()throws Exception{
		CommonFunctions.clickElement(AddDebt);
		CommonFunctions.pause(1500, false);
	}

	public void DisplayedAddDebt()throws Exception{
		CommonFunctions.elementDisplayed(AddDebt);
	}

	public void CheckRequiredPropertyFields()throws Exception{
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(PropertyOwnershipReq);
		CommonFunctions.elementDisplayed(PropertyAddress1Req);
		CommonFunctions.elementDisplayed(PropertySuburbReq);
		CommonFunctions.elementDisplayed(PropertyStateReq);
		CommonFunctions.elementDisplayed(PropertyPostCodeReq);
	}

	public void CheckRequiredBankAccountFields()throws Exception{
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(PropertyOwnershipReq);
		CommonFunctions.elementDisplayed(BankAccountFinancialInstitutionReq);
	}

	public void CheckRequiredVehicleFields()throws Exception{
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(PropertyOwnershipReq);
		CommonFunctions.elementDisplayed(BankAccountFinancialInstitutionReq);
	}

	public void CheckRequiredSharesFields()throws Exception{
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(PropertyOwnershipReq);
		CommonFunctions.elementDisplayed(BankAccountFinancialInstitutionReq);
	}

	public void CheckRequiredOtherFields()throws Exception{
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(BankAccountFinancialInstitutionReq);
	}

	public void CheckRequiredDebtFields()throws Exception{
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(NoQuestion2Required);
		CommonFunctions.pause(5000, false);
	}

	public void CheckRequiredDebtOwedTo()throws Exception{
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpAllBankAccountFields()throws Exception{
		CommonFunctions.selectValueFromDropdown(PropertyOwnership, "Sole");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(PropertyApproxValue, "1111");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, "This is a test Financial Institution");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpAllVehicleFields()throws Exception{
		CommonFunctions.selectValueFromDropdown(PropertyOwnership, "Sole");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(PropertyApproxValue, "1111");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, "This is a test Vehicle Year, make and model");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpAllSharesFields()throws Exception{
		CommonFunctions.selectValueFromDropdown(PropertyOwnership, "Sole");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(PropertyApproxValue, "1111");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, "This is a test Shares");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpAllOtherFields()throws Exception{
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, "This is a test Other Asset input");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
	}

	public void EditFillUpAllOtherFields()throws Exception{
		CommonFunctions.enterElementValue(BankAccountFinancialInstitution, " (EDITED)");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpAllPropertyFields()throws Exception{
		CommonFunctions.selectValueFromDropdown(PropertyOwnership, "Sole");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(PropertyApproxValue, "1111");
		CommonFunctions.pause(5000, false);
		CommonFunctions.checkSingleSelectDropdownSelectedOption(PropertyCountry, "AUSTRALIA");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(PropertyCountry, "AUSTRALIA");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(PropertyAddress1, "Heaven");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(PropertyAddress2, "City");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(PropertySuburb, "Suburb");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(PropertyState, "VIC");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(PropertyPostCode, "6666");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(SaveAddAsset);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpDebtFields()throws Exception{
		CommonFunctions.enterElementValue(DebtOwedTo, "Sample");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(DebtApproxValue, "100");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpDebtFields2()throws Exception{
		CommonFunctions.enterElementValue(DebtOwedTo, "User");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(DebtApproxValue, "50");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.pause(5000, false);
	}

	public void UpdateDebtFields()throws Exception{
		CommonFunctions.clickElement(DebtEdit);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DebtOwedTo, "Update");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(DebtApproxValue, "150");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.pause(5000, false);
	}

	public void UpdateDebtFields2()throws Exception{
		CommonFunctions.clickElement(DebtEdit);
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(DebtOwedTo, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(DebtApproxValue, "200");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(DebtSave);
		CommonFunctions.pause(5000, false);
	}

	public void SelectAssetonDropdown(String value)throws Exception{
		CommonFunctions.selectValueFromDropdown(SelectAssetDropdown, value);
	}

	public BeneficiariesPage ClickNextButton()throws Exception{
		CommonFunctions.clickElement(NextButton);

		return new BeneficiariesPage();
	}

	public AboutPage ClickBackButton()throws Exception{
		CommonFunctions.clickElement(BackButton);
		return new AboutPage();
	}

	public AboutPage ProgressChangeAbout()throws Exception{
		CommonFunctions.clickElement(NextButton);

		return new AboutPage();
	}

	public PersonalPage ProgressChangePersonal()throws Exception{
		CommonFunctions.clickElement(NextButton);

		return new PersonalPage();
	}

	public BeneficiariesPage ProgressChangeBeneficiaries()throws Exception{
		CommonFunctions.clickElement(NextButton);

		return new BeneficiariesPage();
	}

	public ExecutorsPage ProgressChangeExecutors()throws Exception{
		CommonFunctions.clickElement(NextButton);

		return new ExecutorsPage();
	}

	public IDdocsPage ProgressChangeIDdocs()throws Exception{
		CommonFunctions.clickElement(NextButton);

		return new IDdocsPage();
	}

	public ReviewConfirmPage ProgressChangeReviewConfirm()throws Exception{
		CommonFunctions.clickElement(NextButton);

		return new ReviewConfirmPage();
	}

	public AddOnsPage ProgressChangeAddOns()throws Exception{
		CommonFunctions.clickElement(NextButton);

		return new AddOnsPage();
	}

	public void DisplayTooltipDeathBenef()throws Exception{
		CommonFunctions.elementDisplayed(DeathBenef_Tooltip);
	}

	public void DisplayTooltipBinding()throws Exception{
		CommonFunctions.elementDisplayed(Binding_Tooltip);
	}

	public void ClickTooltipDeathBenef()throws Exception{
		CommonFunctions.clickElement(DeathBenef_Tooltip);
	}

	public void ClickSuperDeathBenefYes()throws Exception{
		CommonFunctions.clickElement(SuperDeathBenefYes);

	}

	public void ClickTooltipBinding()throws Exception{
		CommonFunctions.clickElement(Binding_Tooltip);
	}

	public void ClickTooltipAssets()throws Exception{
		CommonFunctions.clickElement(Assets_Tooltip);
	}

	public void DisplayTooltipAssets()throws Exception{
		CommonFunctions.elementDisplayed(Assets_Tooltip);
	}

	public void ClickTooltipTrusts()throws Exception{
		CommonFunctions.clickElement(Trust_Tooltip);
	}

	public void ClickTooltipSuper()throws Exception{
		CommonFunctions.clickElement(Super_Tooltip);
	}

	public void DisplayTooltipTrusts()throws Exception{
		CommonFunctions.elementDisplayed(Trust_Tooltip);
	}

	public void DisplayTooltipSuper()throws Exception{
		CommonFunctions.elementDisplayed(Super_Tooltip);
	}

	public void DisplayTooltipSuperVideo()throws Exception{
		CommonFunctions.elementDisplayed(Super_TooltipVideo);
	}

	public void DisplayTooltipTrustsVideo()throws Exception{
		CommonFunctions.elementDisplayed(Trust_TooltipVideo);
	}

	public void DisplayTooltipInterests()throws Exception{
		CommonFunctions.elementDisplayed(Interest_Tooltip);
	}

	public void ClickTooltipInterests()throws Exception{
		CommonFunctions.clickElement(Interest_Tooltip);
	}

	public void DisplayTooltipOwnershipVideo()throws Exception{
		CommonFunctions.elementDisplayed(Ownership_TooltipVideo);
	}

	public void DisplayTooltipOwnership()throws Exception{
		CommonFunctions.elementDisplayed(Ownership_Tooltip);
	}

	public void ClickTooltipOwnership()throws Exception{
		CommonFunctions.clickElement(Ownership_Tooltip);
	}

}
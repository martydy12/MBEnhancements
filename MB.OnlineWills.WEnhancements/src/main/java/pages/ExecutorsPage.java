package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class ExecutorsPage extends Base {
	// ========================================================== Page Objects ===========================================================

	// Element - Display

	@FindBy(xpath = "//span[text()='Who do you want to manage your estate?']")
	WebElement Question1;

	// Element - Link

	// @FindBy(xpath = "//*[contains(@id,'lnkAddExecutor')]//parent::div")
	//@FindBy(xpath = "//span[@class='fa fa-fw fa-plus']")
	@FindBy(xpath = "//a[text()='Add Executor']")
	WebElement Question2;

	// Element - PopUp
	// Are you sure you want to remove this entry from the list?

	// Element - Button

	@FindBy(xpath = "//input[contains(@value,'Add')]")
	WebElement btn_Add;
	@FindBy(xpath = "(//input[contains(@value,'Add')])[3]")
	WebElement btn_add3;
	@FindBy(xpath = "(//input[contains(@value,'Cancel')])[2]")
	WebElement btn_Cancel;

	@FindBy(xpath = "(//a[contains(text(),'Delete')])[1]")
	WebElement btn_Delete;

	@FindBy(xpath = "(//a[contains(text(),'Edit')])[1]")
	WebElement btn_Edit;

	@FindBy(xpath = "//input[contains(@value,'Save and Continue')]")
	WebElement btn_Next;

	@FindBy(xpath = "//input[contains(@value,'Back')]")
	WebElement btn_Back;

	// Element - Radio Button
	/* FirstOption & Backup */
	@FindBy(xpath = "//input[contains(@id,'FirstOption')]")
	WebElement Question14A;

	@FindBy(xpath = "//input[contains(@id,'InputsAndLabels_wtBackup')]")
	WebElement Question14B;

	/* Would you like Maurice Blackburn to help your Executor(s) manage your estate? */
	@FindBy(xpath = "//input[contains(@id,'Probate_Yes')]")
	WebElement Question16A;

	@FindBy(xpath = "//input[contains(@id,'Probate_No')]")
	WebElement Question16B;

	/* Funeral Wishes */
	@FindBy(xpath = "//input[contains(@id,'FuneralWish_Buried')]")
	WebElement Question17A;

	@FindBy(xpath = "//input[contains(@id,'FuneralWish_Cremated')]")
	WebElement Question17B;

	@FindBy(xpath = "//input[contains(@id,'FuneralWish_Other')]")
	WebElement Question17C;

	@FindBy(xpath = "//input[contains(@id,'FuneralWish_NoWish')]")
	WebElement Question17D;

	// Element - Dropdown
	@FindBy(xpath = "//select[contains(@id,'ExecutorTitle')]")
	WebElement Question3;

	@FindBy(xpath = "//select[contains(@id,'ExecutorRelationship')]")
	WebElement Question7;

	@FindBy(xpath = "//select[contains(@id,'ExecutorCountry')]")
	WebElement Question8;

	@FindBy(xpath = "//select[contains(@id,'ExecutorStateCombo')]")
	WebElement Question12A;

	// Element - Input

	@FindBy(xpath = "//input[contains(@id,'ExecutorFirstName')]")
	WebElement Question4;

	@FindBy(xpath = "//input[contains(@id,'ExecutorMiddleName')]")
	WebElement Question5;

	@FindBy(xpath = "//input[contains(@id,'ExecutorLastName')]")
	WebElement Question6;

	@FindBy(xpath = "//input[contains(@id,'ExecutorAddressLine1')]")
	WebElement Question9;

	@FindBy(xpath = "//input[contains(@id,'ExecutorAddressLine2')]")
	WebElement Question10;

	@FindBy(xpath = "//input[contains(@id,'ExecutorSuburb')]")
	WebElement Question11;

	@FindBy(xpath = "//input[contains(@id,'Executor_StateText_Input')]")
	WebElement Question12B;

	@FindBy(xpath = "//input[contains(@id,'ExecutorPostCode')]")
	WebElement Question13;

	/* I want body buried at: */
	@FindBy(xpath = "//input[contains(@id,'WishDetail_Input')]")
	WebElement Question18;

	/* I wish for my ashes to be: */
	@FindBy(xpath = "//input[contains(@id,'WishDetail_Input')]")
	WebElement Question19;

	/* I want... */
	@FindBy(xpath = "//input[contains(@id,'WishDetail_Input')]")
	WebElement Question20;

	/* Progess Bar */
	@FindBy(xpath = "//div[text()='Personal Details']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressPersonal;
	@FindBy(xpath = "//div[text()='About You']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAbout;
	@FindBy(xpath = "//div[text()='Assets']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAssets;
	@FindBy(xpath = "//div[text()='Add-ons']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressAddOns;
	@FindBy(xpath = "//div[text()='Beneficiaries']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressBeneficiaries;
	@FindBy(xpath = "//div[text()='ID Docs']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressIDDocs;
	@FindBy(xpath = "//div[text()='Review & Confirm']//following-sibling::a[contains(text(),'Change')]")
	WebElement ProgressReviewConfirm;

	@FindBy(xpath = "//div[contains(@id,'Executors_Tooltip')]")
	WebElement Executors_tooltip;

	@FindBy(xpath = "//div[contains(@id,'LawyersOfEstate_Tooltip')]")
	WebElement LawyersOfEstate_Tooltip;

	@FindBy(xpath = "//label[contains(@id,'WishDetail')]")
	WebElement BuriedWishDetails;

	// ================================================== Initializing the Page Objects ==================================================
	public ExecutorsPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void displayQuestion1()throws Exception{
		CommonFunctions.elementDisplayed(Question1);
	}

	public void displayQuestion2()throws Exception{
		CommonFunctions.elementDisplayed(Question2);
	}

	public void displayQuestion3()throws Exception{
		CommonFunctions.elementDisplayed(Question3.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion4()throws Exception{
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion6()throws Exception{
		CommonFunctions.elementDisplayed(Question6.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion7()throws Exception{
		CommonFunctions.elementDisplayed(Question7.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion9()throws Exception{
		CommonFunctions.elementDisplayed(Question9.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion11()throws Exception{
		CommonFunctions.elementDisplayed(Question11.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public IDdocsPage ClickNextButton()throws Exception{
		CommonFunctions.clickElement(btn_Next);

		return new IDdocsPage();
	}

	public void displayQuestion12A()throws Exception{
		CommonFunctions.elementDisplayed(Question12A.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion12B()throws Exception{
		CommonFunctions.elementDisplayed(Question12B.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void displayQuestion13()throws Exception{
		CommonFunctions.elementDisplayed(Question13.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
	}

	public void clickEditExecutor()throws Exception{
		CommonFunctions.clickElement(btn_Edit);

	}

	public void clickAddExecutorButton()throws Exception{

		CommonFunctions.clickElement(btn_Add);

	}

	public void clickDeleteExecutor()throws Exception{
		CommonFunctions.clickElement(btn_Delete);
		CommonFunctions.pause(2500, false);
		// CommonFunctions.clickKeys(Keys.chord(Keys.ENTER));
	}

	public void UpdateFromBackUpToFirstOption()throws Exception{

	}

	/* Add Executor */
	public void clickQuestion2()throws Exception{
		CommonFunctions.clickElement(Question2);
	}

	/* FirstOption & Backup */
	public void clickQuestion14A()throws Exception{
		CommonFunctions.clickElement(Question14A);
	}

	public void clickBTNAdd3()throws Exception{
		CommonFunctions.clickElement(btn_add3);
	}

	public void clickQuestion14B()throws Exception{
		CommonFunctions.clickElement(Question14B);
	}

	/* Would you like Maurice Blackburn to help your Executor(s) manage your estate? */
	public void clickQuestion16A()throws Exception{
		CommonFunctions.clickElement(Question16A);
	}

	public void clickQuestion16B()throws Exception{
		CommonFunctions.clickElement(Question16B);
	}

	/* Funeral Wishes */
	public void clickQuestion17A()throws Exception{
		CommonFunctions.clickElement(Question17A);
	}

	public void clickQuestion17B()throws Exception{
		CommonFunctions.clickElement(Question17B);
	}

	public void clickQuestion17C()throws Exception{
		CommonFunctions.clickElement(Question17C);
	}

	public void clickQuestion17D()throws Exception{
		CommonFunctions.clickElement(Question17D);
	}

	public void setQuestion4(String firstname)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question4, firstname);
	}

	public void setQuestion5(String middlename)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question5, middlename);
	}

	public void setQuestion6(String lastname)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question6, lastname);
	}

	public void setQuestion9(String address1)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question9, address1);
	}

	public void setQuestion10(String address2)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question10, address2);
	}

	public void setQuestion11(String suburb)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question11, suburb);
	}

	public void setQuestion12B(String statetext)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question12B, statetext);
	}

	public void setQuestion13(String postcode)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question13, postcode);
	}

	public void setQuestion18(String buried)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question18, buried);
	}

	public void setQuestion19(String ashes)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question19, ashes);
	}

	public void setQuestion20(String want)throws Exception{
		CommonFunctions.clearThenEnterElementValue(Question20, want);
	}

	public void DisplayQuestion20()throws Exception{
		CommonFunctions.elementDisplayed(Question20);
	}

	public void selectQuestion3(String titleDropdown)throws Exception{
		CommonFunctions.pause(2500, false);
		CommonFunctions.selectValueFromDropdown(Question3, titleDropdown);
		// CommonFunctions.clickElement(Question3.findElement(By.xpath(".//option[text()='" + titleDropdown + "']")));
		CommonFunctions.pause(2500, false);
	}

	public void selectQuestion7(String relationshipDropdown)throws Exception{
		CommonFunctions.pause(2500, false);
		CommonFunctions.selectValueFromDropdown(Question7, relationshipDropdown);
		// CommonFunctions.clickElement(Question3.findElement(By.xpath(".//option[text()='" + titleDropdown + "']")));
		CommonFunctions.pause(2500, false);
	}

	public void selectQuestion8(String countryDropdown)throws Exception{
		CommonFunctions.pause(2500, false);
		CommonFunctions.selectValueFromDropdown(Question8, countryDropdown);
		// CommonFunctions.clickElement(Question3.findElement(By.xpath(".//option[text()='" + titleDropdown + "']")));
		CommonFunctions.pause(2500, false);
	}

	public void selectQuestion12A(String stateDropdown)throws Exception{
		CommonFunctions.pause(2500, false);
		CommonFunctions.selectValueFromDropdown(Question12A, stateDropdown);
		// CommonFunctions.clickElement(Question3.findElement(By.xpath(".//option[text()='" + titleDropdown + "']")));
		CommonFunctions.pause(2500, false);
	}

	public void FillUpExecutorFirstOption()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "First");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void UpdateExecutorFirstOption()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "First");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question13, "1234");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpExecutorFirstBackup()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "First");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void UpdateExecutorBackup()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Backup");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Upback");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_add3);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpWhenBuried()throws Exception{
		CommonFunctions.clickElement(Question17A);
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question18, "Buried Here");
		CommonFunctions.pause(5000, false);
	}

	public void FillUpWhenCremated()throws Exception{
		CommonFunctions.clickElement(Question17B);
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question19, "Cremated Here");
		CommonFunctions.pause(5000, false);
	}

	public void FillUpWhenOther()throws Exception{
		CommonFunctions.clickElement(Question17C);
		CommonFunctions.pause(5000, false);
		CommonFunctions.enterElementValue(Question20, "Other Here");
		CommonFunctions.pause(5000, false);
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

	public PersonalPage ProgressChangePersonal()throws Exception{
		CommonFunctions.clickElement(ProgressPersonal);

		return new PersonalPage();
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

	public void DisplayExecutors_Tooltip()throws Exception{
		CommonFunctions.elementDisplayed(Executors_tooltip);
	}

	public void ClickExecutors_Tooltip()throws Exception{
		CommonFunctions.clickElement(Executors_tooltip);
	}

	public void DisplayLawyersOfEstate_Tooltip()throws Exception{
		CommonFunctions.elementDisplayed(LawyersOfEstate_Tooltip);
	}

	public void ClickLawyersOfEstate_Tooltip()throws Exception{
		CommonFunctions.clickElement(LawyersOfEstate_Tooltip);
	}

	public void displayBuriedWishDetails()throws Exception{
		CommonFunctions.elementDisplayed(BuriedWishDetails);
	}

	public void checkMandatoryFields()throws Exception{
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(Question3.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(Question4.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(Question6.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(Question7.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(Question9.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(Question11.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(Question12A.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(Question13.findElement(By.xpath(".//following-sibling::span[text()='Required field']")));
		CommonFunctions.pause(3000, false);

	}

	public void FillUpExecutorSecondOption()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Second");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpExecutorThirdOption()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Third");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpExecutorFourthOption()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Fourth");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpExecutorFifthOption()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Mr");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Fifth");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Option");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Father");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question12A, "QLD");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "1234");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpExecutorSecondBackup()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Second");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpExecutorThirdBackup()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Third");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpExecutorFourthBackup()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Fourth");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

	public void FillUpExecutorFifthBackup()throws Exception{
		CommonFunctions.selectValueFromDropdown(Question3, "Ms");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question4, "Fifth");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question5, "Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question6, "Backup");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question7, "Cousin");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(Question14B);
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(Question8, "GREECE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question9, "Address1Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question10, "Address2Test");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question11, "SubTest");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question12B, "GRE");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(Question13, "4321");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(btn_Add);
		CommonFunctions.pause(5000, false);
	}

}
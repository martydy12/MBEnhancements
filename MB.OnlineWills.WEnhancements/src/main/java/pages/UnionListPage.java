package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;


public class UnionListPage extends Base {
	// ========================================================= Page Objects ===========================================================
	//Button
	@FindBy(xpath="//input[@value='Add Union']")
	WebElement btn_AddUnion;
	@FindBy(xpath = "//div[contains( @id,'Column1')]//following::input[@value='Cancel']")
	WebElement btn_Cancel;
	@FindBy(xpath = "//div[contains( @id,'Column1')]//following::input[@value='Save']")
	WebElement btn_Save;
	@FindBy(xpath = "//table[contains(@id, 'UnionTable')]//tr//td[text() = 'AlphaNumeric1']//parent::tr//span[contains(@class, 'edit')]//parent::a")
	WebElement btn_Edit;
	@FindBy(xpath = "//table[contains(@id, 'UnionTable')]//tr//td[text() = 'AlphaNumeric01']//parent::tr//span[contains(@class, 'edit')]//parent::a")
	WebElement btn_Edit_1;
	@FindBy(xpath = "//table[contains(@id, 'UnionTable')]//tr//td[text() = 'AlphaNumeric1']//parent::tr//span[contains(@class, 'trash')]//parent::a")
	WebElement btn_Delete;
	
	
	
	
	
	//Field
	@FindBy(xpath="//input[contains(@id,'Union_Name')]")
	WebElement field_UnionName;
	@FindBy(xpath = "//input[contains(@id,'Union_MinLength')]")
	WebElement field_UnionMinLength;
	@FindBy(xpath = "//input[contains(@id,'Union_MaxLength')]")
	WebElement field_UnionMaxLength;
	@FindBy(xpath = "//input[contains(@id,'Union_AlphaLength')]")
	WebElement field_AlphaLength;

	// Select
	@FindBy(xpath = "//select[contains(@id,'Union_Stateid')]")
	WebElement select_UnionState;
	@FindBy(xpath = "//select[contains(@id,'Union_StringType')]")
	WebElement select_UnionStringType;
	@FindBy(xpath = "//select[contains(@id,'Union_AlphaLocation')]")
	WebElement select_AlphaLocation;

	// Checkbox
	@FindBy(xpath = "//input[contains( @id,'HasValidationRuleChk')]")
	WebElement chk_AddRule;

	// Validation
	@FindBy(xpath = "//span[contains(@id,'Union_Name')]")
	WebElement alert_UnionName;
	@FindBy(xpath = "//span[contains(@id,'Union_Stateid')]")
	WebElement alert_UnionState;
	@FindBy(xpath = "//span[contains(@id,'Union_MinLength')]")
	WebElement alert_UnionMinLength;
	@FindBy(xpath = "//span[contains(@id,'Union_MaxLength')]")
	WebElement alert_UnionMaxLength;
	@FindBy(xpath = "//span[contains(@id,'Union_StringType')]")
	WebElement alert_UnionStringType;
	@FindBy(xpath = "//span[contains(@id,'Union_AlphaLocation')]")
	WebElement alert_UnionAlphaLocation;

	// Table Content
	@FindBy(xpath = "//table[contains(@id, 'UnionTable')]//tr//td[text() = 'AlphaNumeric1']")
	WebElement display_AlphaNumeric1;
	@FindBy(xpath="//span[contains( @id,'Union_Name')]")
	WebElement alert_Name;	
	
	
	// Required Field
	@FindBy(xpath = "//span[text()='This Union name already exists.']")
	WebElement required_Name;
	
	@FindBy(xpath="//table[contains(@id, 'UnionTable')]//tr//td[text() = 'Alpha1']//parent::tr//span[contains(@class, 'edit')]//parent::a")
	WebElement btn_Edit_2;//MW-180
	
	
	
	

	// ================================================== Initializing the Page Objects ==================================================
	public UnionListPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================

	public void clickAddUnion()throws Exception{
		CommonFunctions.clickElement(btn_AddUnion);
		CommonFunctions.pause(5000, false);
	}

	public void clickSaveUnion()throws Exception{
		CommonFunctions.clickElement(btn_Save);
		CommonFunctions.pause(5000, false);
	}

	public void clickCancelUnion()throws Exception{
		CommonFunctions.clickElement(btn_Cancel);
		CommonFunctions.pause(5000, false);
	}

	public void checkAddRule()throws Exception{
		CommonFunctions.clickElement(chk_AddRule);
		CommonFunctions.pause(5000, false);
	}

	// Alpha
	public void fillUpUnionDetails_alpha()throws Exception{
		//CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "Alpha1");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionState, "ACT");
		CommonFunctions.clickElement(chk_AddRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "1");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "10");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "Alpha");
		CommonFunctions.pause(5000, false);
	}

	// Numeric
	public void fillUpUnionDetails_numeric()throws Exception{
		//CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "Numeric1");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionState, "ACT");
		CommonFunctions.clickElement(chk_AddRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "1");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "10");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "Numeric");
		CommonFunctions.pause(5000, false);
	}

	// AlphaNumeric
	public void fillUpUnionDetails_numeric_alphanumeric()throws Exception{
		//CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "AlphaNumeric1");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionState, "ACT");
		CommonFunctions.clickElement(chk_AddRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "1");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "10");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "AlphaNumeric");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_AlphaLocation, "Prefix");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "3");
		CommonFunctions.pause(5000, false);
	}

	// SampleUnion for Min length > Max length
	public void fillUpUnionDetails_SampleUnion1()throws Exception{
		//CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "SampleUnion");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionState, "ACT");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clickElement(chk_AddRule);
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "11111111111111");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "5");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "AlphaNumeric");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_AlphaLocation, "Prefix");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "3");
		CommonFunctions.pause(5000, false);
	}

	// SampleUnion for Min length is less than zero
	public void fillUpUnionDetails_SampleUnion2()throws Exception{
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "-1");
		CommonFunctions.pause(5000, false);
	}

	// SampleUnion for alpha length equal to max length
	public void fillUpUnionDetails_SampleUnion3()throws Exception{
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "1");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "5");
		CommonFunctions.pause(5000, false);
	}

	// SampleUnion for alpha length greater than max length
	public void fillUpUnionDetails_SampleUnion4()throws Exception{
		CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "10");
		CommonFunctions.pause(5000, false);
	}

	// SampleUnion for alpha length cannot be equal to zero
	public void fillUpUnionDetails_SampleUnion5()throws Exception{
		CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "0");
		CommonFunctions.pause(5000, false);
	}

	// SampleUnion for alpha length cannot be less than to zero
	public void fillUpUnionDetails_SampleUnion6()throws Exception{
		CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "-1");
		CommonFunctions.pause(5000, false);
	}

	// SampleUnion for alpha length cannot be less than to zero
	public void fillUpUnionDetails_SampleUnion7()throws Exception{
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "99");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "1");
		CommonFunctions.pause(5000, false);
	}

	// Validation_Display
	public void alertMessageDisplay()throws Exception{
		CommonFunctions.elementDisplayed(alert_UnionName);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(alert_UnionState);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(alert_UnionMinLength);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(alert_UnionMaxLength);
		CommonFunctions.pause(5000, false);
		CommonFunctions.elementDisplayed(alert_UnionStringType);
		CommonFunctions.pause(5000, false);

	}

	public void selectAlphanumericStringType2()throws Exception{
		CommonFunctions.clickElement(chk_AddRule);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "AlphaNumeric");
		CommonFunctions.pause(5000, false);
	}
	public void selectAlphanumericStringType()throws Exception{
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "AlphaNumeric");
		CommonFunctions.pause(5000, false);
	}


	public void alertMessageDisplay_AlphaLocation()throws Exception{
		CommonFunctions.elementDisplayed(alert_UnionAlphaLocation);
		CommonFunctions.pause(5000, false);
	}

	public void clickEditButton()throws Exception{
		CommonFunctions.clickElement(btn_Edit);
		CommonFunctions.pause(5000, false);
	}

	public void clickEditButton1()throws Exception{
		CommonFunctions.clickElement(btn_Edit_1);
		CommonFunctions.pause(5000, false);
	}

	// Edit-Fillup Union
	public void fillUpEditUnionDetails_numeric_alphanumeric()throws Exception{
		CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "AlphaNumeric01");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionState, "VIC");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMinLength, "2");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionMaxLength, "11");
		CommonFunctions.pause(5000, false);
		CommonFunctions.selectValueFromDropdown(select_UnionStringType, "Numeric");
		CommonFunctions.pause(5000, false);
		// CommonFunctions.selectValueFromDropdown(select_AlphaLocation, "Prefix");
		// CommonFunctions.pause(5000, false);
		// CommonFunctions.clearThenEnterElementValue(field_AlphaLength, "3");
		// CommonFunctions.pause(5000, false);
	}

		
	public void fillUpEditUnionDetails_numeric()throws Exception{
		CommonFunctions.switchFrameByXPath("//*[text()='Add Union']");
		CommonFunctions.pause(5000, false);
		CommonFunctions.clearThenEnterElementValue(field_UnionName, "Numeric");
		CommonFunctions.pause(5000, false);
		}
		
		
	public void clickDeleteButton()throws Exception{
		CommonFunctions.clickElement(btn_Delete);
	}

	public void displayDeleteAlertMessage()throws Exception{
		CommonFunctions.isAlertPresentWithText("Are you sure you want to delete this Union from the rule engine?");
		CommonFunctions.pause(5000, false);
	}

	
	public void displayDuplicateAlertMessage()throws Exception{
		CommonFunctions.elementDisplayed(alert_Name);
		CommonFunctions.pause(5000, false);
	}
	public void clickEditButton2()throws Exception{
		CommonFunctions.clickElement(btn_Edit_2);
		CommonFunctions.pause(5000, false);
	}
	
	public void displayedRequiredName()throws Exception{
		CommonFunctions.elementDisplayed(required_Name);
		CommonFunctions.pause(3000, false);
	}
	
	
	
	

	
	
}
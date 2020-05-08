package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Base;
import utilities.CommonFunctions;

public class DashboardPage extends Base {
	// ========================================================== Page Objects ===========================================================

	/* Button */
	@FindBy(xpath = "//input[contains(@value, 'Search')]")
	WebElement button_Search;
	@FindBy(xpath = "//input[contains(@value, 'Reset Filter')]")
	WebElement button_Reset;

	/* Input */
	@FindBy(xpath = "//input[contains(@id,'SearchBox')]")
	WebElement input_SearchDashboard;

	/* Link */
	@FindBy(xpath = "//a[contains(@id,'MoreOptions')]")
	WebElement link_MoreOption;
	@FindBy(xpath = "//a[contains(@id,'HideOptions')]")
	WebElement link_HideOption;
	@FindBy(xpath = "//div[text() ='Union List']//parent::div//parent::a")
	WebElement button_UnionList;

	/* Table Row */
	@FindBy(xpath = "//*[text()='Name']//parent::th")
	WebElement tablerow_Name;
	@FindBy(xpath = "//*[text()='Surname']//parent::th")
	WebElement tablerow_Surname;
	@FindBy(xpath = "//*[text()='Updated']//parent::th")
	WebElement tablerow_Update;
	@FindBy(xpath = "//*[text()='Phone']//parent::th")
	WebElement tablerow_Phone;
	@FindBy(xpath = "//*[text()='Phone']//parent::th")
	WebElement tablerow_Email;
	@FindBy(xpath = "//*[text()='Single']//parent::th")
	WebElement tablerow_Single;
	@FindBy(xpath = "//*[text()='Union']//parent::th")
	WebElement tablerow_Union;
	@FindBy(xpath = "//*[text()='State']//parent::th")
	WebElement tablerow_State;
	@FindBy(xpath = "//*[text()='Status']//parent::th")
	WebElement tablerow_Status;
	@FindBy(xpath = "//*[text()='Action']//parent::th")
	WebElement tablerow_Action;
	@FindBy(xpath = "//*[text()='Action Date']//parent::th")
	WebElement tablerow_ActionDate;

	/* Table Row - More Option - Displays */
	@FindBy(xpath = "//div[contains(@id,'Options')]//parent::span[text()='Will Type']")
	WebElement option_WillType;
	@FindBy(xpath = "//div[contains(@id,'Options')]//parent::span[text()='Union Member']")
	WebElement option_UnionMember;
	@FindBy(xpath = "//div[contains(@id,'Options')]//parent::span[text()='State']")
	WebElement option_State;
	@FindBy(xpath = "//div[contains(@id,'Options')]//parent::span[text()='Status']")
	WebElement option_Status;
	@FindBy(xpath = "//div[contains(@id,'Options')]//parent::span[text()='Date range start']")
	WebElement option_DateStart;
	@FindBy(xpath = "//div[contains(@id,'Options')]//parent::span[text()='Date range end']")
	WebElement option_DateEnd;
	@FindBy(xpath = "//div[contains(@id,'Options')]//parent::span[text()='Actions']")
	WebElement option_Actions;

	/* Table Row - More Option - Options */
	// @FindBy(xpath = "//div[contains(@id,'Options')]//parent::select[contains(@id,'WillTypeId')]")
	@FindBy(xpath = "((//div[contains(@id, 'Options')]//table[contains(@class, 'seven')]//tbody//tr)[2]//td)[1]//select")
	WebElement dropdown_WillType;
	// @FindBy(xpath = "//div[contains(@id,'Options')]//parent::select[contains(@id,'')]")
	@FindBy(xpath = "((//div[contains(@id, 'Options')]//table[contains(@class, 'seven')]//tbody//tr)[2]//td)[2]//select")
	WebElement dropdown_UnionMember;
	// @FindBy(xpath = "//div[contains(@id,'Options')]//parent::select[contains(@id,'StatusId')]")
	@FindBy(xpath = "((//div[contains(@id, 'Options')]//table[contains(@class, 'seven')]//tbody//tr)[2]//td)[3]//select")
	WebElement dropdown_State;
	// @FindBy(xpath = "//div[contains(@id,'Options')]//parent::select[contains(@id,'')]")
	@FindBy(xpath = "((//div[contains(@id, 'Options')]//table[contains(@class, 'seven')]//tbody//tr)[2]//td)[4]//select")
	WebElement dropdown_Status;
	@FindBy(xpath = "//input[contains(@id,'DateRangeStart')]")
	WebElement input_DateStart;
	@FindBy(xpath = "//input[contains(@id,'DateRangeEnd')]")
	WebElement input_DateEnd;
	// @FindBy(xpath = "//div[contains(@id,'Options')]//parent::select[contains(@id,'')]")
	@FindBy(xpath = "((//div[contains(@id, 'Options')]//table[contains(@class, 'seven')]//tbody//tr)[2]//td)[7]//select")
	WebElement dropdown_Actions;

	/* Row Displays */
	@FindBy(xpath = "(//table[contains(@id,'FormItemTable')]//following-sibling::tr)[2]")
	WebElement tablerow_NewestRow;
	@FindBy(xpath = "(//table[contains(@id,'FormItemTable')]//following-sibling::tr)[11]")
	WebElement tablerow_OldestRow;
	@FindBy(xpath = "(//select[contains(@id,'FormItemTable_List_Current_Actions_Id')])[1]")
	WebElement dropdown_Action;
	@FindBy(xpath = "(//input[contains(@id,'ActionDate2')])[1]")
	WebElement input_ActionDate;

	// ================================================== Initializing the Page Objects ==================================================
	public DashboardPage()throws Exception{
		PageFactory.initElements(driver, this);
	}

	// ============================================================= Actions =============================================================
	public void clickSearchDashboard()throws Exception{
		CommonFunctions.clickElement(button_Search);
	}

	public void setInputSearchField(String searchdash)throws Exception{
		CommonFunctions.clearThenEnterElementValue(input_SearchDashboard, searchdash);
	}

	public void displayedButtonSearch()throws Exception{
		CommonFunctions.elementDisplayed(button_Search);
	}

	public void displayedSearchDashboard()throws Exception{
		CommonFunctions.elementDisplayed(input_SearchDashboard);
	}

	public void displayedNewestRow()throws Exception{
		CommonFunctions.elementDisplayed(tablerow_NewestRow);
		CommonFunctions.pause(3000, false);
	}

	public void displayedOldestRow()throws Exception{
		CommonFunctions.elementDisplayed(tablerow_OldestRow);
		CommonFunctions.pause(3000, false);
	}

	public void clickMoreOption()throws Exception{
		CommonFunctions.clickElement(link_MoreOption);
		CommonFunctions.pause(3000, false);
	}

	public void clickHideOption()throws Exception{
		CommonFunctions.clickElement(link_HideOption);
		CommonFunctions.pause(2500, false);
	}

	public void checksDashboardRows()throws Exception{
		CommonFunctions.elementDisplayed(tablerow_Name);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Surname);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Update);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Phone);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Email);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Single);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Union);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_State);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Status);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_Action);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(tablerow_ActionDate);
		CommonFunctions.pause(3000, false);
	}

	public void SearchDashboardUser()throws Exception{
		CommonFunctions.clearThenEnterElementValue(input_SearchDashboard, "bam");
		CommonFunctions.pause(3000, false);
		CommonFunctions.clickElement(button_Search);
		CommonFunctions.pause(3000, false);

	}

	public void SearchDashboardEmptyUser()throws Exception{
		CommonFunctions.clearThenEnterElementValue(input_SearchDashboard, "jose");
		CommonFunctions.pause(3000, false);
		CommonFunctions.clickElement(button_Search);
		CommonFunctions.pause(3000, false);

	}

	public void UpdateUserActions()throws Exception{
		CommonFunctions.selectValueFromDropdown(dropdown_Action, "Made contact");
		CommonFunctions.pause(3000, false);
		CommonFunctions.clearThenEnterElementValue(input_ActionDate, "05/09/20");
		CommonFunctions.clickKeys(Keys.chord(Keys.TAB));
		CommonFunctions.pause(3000, false);
	}

	public void enterInvalidDate()throws Exception{
		CommonFunctions.clearThenEnterElementValue(input_ActionDate, "05/09/111");
		CommonFunctions.pause(5000, false);
	}

	public void SortsColumnInDashboardTable()throws Exception{
		CommonFunctions.clickElement(tablerow_Update);
		CommonFunctions.pause(3000, false);
	}

	public void displayMoreOptionSearchFields()throws Exception{
		CommonFunctions.elementDisplayed(dropdown_WillType);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(dropdown_UnionMember);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(dropdown_State);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(dropdown_Status);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(input_DateStart);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(input_DateEnd);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(dropdown_Actions);
		CommonFunctions.pause(3000, false);
	}

	public void FillUpMoreOptionSearchFields()throws Exception{
		CommonFunctions.clearThenEnterElementValue(input_SearchDashboard, "Email");
		CommonFunctions.pause(3000, false);
		CommonFunctions.selectValueFromDropdown(dropdown_WillType, "Standard");
		CommonFunctions.pause(3000, false);
		CommonFunctions.selectValueFromDropdown(dropdown_UnionMember, "Without Union");
		CommonFunctions.pause(3000, false);
		CommonFunctions.selectValueFromDropdown(dropdown_State, "VIC");
		CommonFunctions.pause(3000, false);
		CommonFunctions.selectValueFromDropdown(dropdown_Status, "Initiated");
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(input_DateStart);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(input_DateEnd);
		CommonFunctions.pause(3000, false);
		CommonFunctions.elementDisplayed(dropdown_Actions);
		CommonFunctions.pause(3000, false);
		CommonFunctions.clickElement(button_Search);
		CommonFunctions.pause(3000, false);
	}

	public DashboardPage clickLoginDashboard()throws Exception{
		CommonFunctions.clickElement(button_Search);
		return new DashboardPage();
	}

	public UnionListPage clickUnionList()throws Exception{
		CommonFunctions.clickElement(button_UnionList);
		CommonFunctions.pause(5000, false);
		return new UnionListPage();
	}

}
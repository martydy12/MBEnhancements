package runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "com.cucumber.listener.ExtentCucumberFormatter:reports/Extent-Report.html" }, // Reports to be
																									// produced.
		glue = { "steps" }, // Name of folder that contains the steps.
		monochrome = true, // For code readability.
		strict = true, // Always set to true to check every undefined/pending steps.
		dryRun = false, // Checking of steps if implemented or not.
		// tags = { "@Sprint" }, // @WIP = Work in Progress. @Regression = For Repeating
		// Testing. @RegressionFail = Comment this line for testing multiple feature
		// files.
		// tags = { "@42-20" }, // @WIP = Work in Progress. @Regression = For Repeating
		// Testing. @RegressionFail = Comment this line for testing multiple feature
		// files.
		// features = "src/test/resources/features/" // Features used for Regression.
		// features = "src/test/resources/features/WIP.feature" // Feature file to use
		// for WIP.
		// features = "src/test/resources/features/Sprint 0/" // Feature file to use for
		// Sprint 0.
		// features = "src/test/resources/features/Sprint 1/MW - 27/MW - 27 -
		// QuestionsB.feature" // Feature file to use for Sprint 1.
		// features = "src/test/resources/features/Sprint 1/MW - 40.feature" // Feature
		// file to use for Sprint 1.
		// features = "src/test/resources/features/Sprint 2/MW - 175.feature" // Feature
		// file to use for Sprint 2.
		// features = "src/test/resources/features/Sprint 2/MW - 42/MW - 42A.feature" //
		// Feature file to use for Sprint 2.
		// features = "src/test/resources/features/Cheat.feature"
		// features = "src/test/resources/features/Enhancement/Solution 1/Solution1g.feature"
		// features = "src/test/resources/features/Enhancement/Solution 1/"
		// features = "src/test/resources/features/Enhancement/"
		features = "src/test/resources/features/Enhancement/6 months/6Months.feature"
// features = "src/test/resources/features/Enhancement/BackOffice"
 //features = "src/test/resources/features/Enhancement/Solution 2/SingleWithUnionMember.feature"
)

public class Runner {
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig("src\\main\\java\\utilities\\extent-config.xml");
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10 - 64 Bit");
		Reporter.setSystemInfo("Selenium", "3.14.0");
		Reporter.setSystemInfo("Maven", "3.8.0");
	}

}
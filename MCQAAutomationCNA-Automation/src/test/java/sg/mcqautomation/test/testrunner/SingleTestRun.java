package sg.mcqautomation.test.testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import sg.mcqautomation.utilities.FileUtilities;
import java.io.IOException;

@CucumberOptions(
		features = {"src/test/resources/Features"},
		glue = {"sg.mcqautomation.test.stepdefinition"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		tags="@CNA_Web_80",
		monochrome = true
		)

public class SingleTestRun extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}

	@AfterSuite
	public void fnAfterTestSuite() throws IOException
	{
		System.out.println("After Test Suite");
		FileUtilities.fnCopyToCICD();
	}
}

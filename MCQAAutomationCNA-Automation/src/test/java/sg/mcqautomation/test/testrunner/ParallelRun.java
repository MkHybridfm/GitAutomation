package sg.mcqautomation.test.testrunner;
import java.io.IOException;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import sg.mcqautomation.utilities.FileUtilities;

@CucumberOptions(
		features = {"src/test/resources/Features"},
		glue = {"sg.mcqautomation.test.stepdefinition"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
		tags="@WebFix",
		monochrome = true
		)

public class ParallelRun extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true)
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

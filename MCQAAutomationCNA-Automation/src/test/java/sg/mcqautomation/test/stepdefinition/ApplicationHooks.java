package sg.mcqautomation.test.stepdefinition;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.management.JiraIssueCreater;

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private RemoteWebDriver driver;
	public GlobalConfig objConfig;

	@Before(order = 0)
	public void getProperty() {
		this.objConfig=new GlobalConfig();
	}

	@Before(order = 1)
	public void launchBrowser() throws MalformedURLException {
		driverFactory = new DriverFactory();
		this.objConfig=this.objConfig.getGlobalConfigData();
		driver = driverFactory.init_driver(this.objConfig);		
	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) throws UnsupportedEncodingException {
		if (scenario.isFailed()) {
			if(DriverFactory.getGlobalConfig().JIRA_ISSUE)
			{
				String strScenarioName=scenario.getName();
				String strScenarioLocation=scenario.getUri().toString();
				String strLink=JiraIssueCreater.fnCreateJIRAIssueWithScreenShot(strScenarioName,strScenarioLocation, ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE));
				scenario.log(strLink);
			}
			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png","<B>Click on below Base64 button to See Error Screenshot</B>");
		}
		
	}
	@After(order = 3)
	public void BSScenarioID(Scenario scenario) throws MalformedURLException {
		if(this.objConfig.executionProvider==GlobalConfig.ExecutionProvider.Browserstack)
		{
			String strBSTestDetails="BrowserStack ID : " +this.objConfig.BSTestID;
			scenario.log(strBSTestDetails);					
		}		
	}
}

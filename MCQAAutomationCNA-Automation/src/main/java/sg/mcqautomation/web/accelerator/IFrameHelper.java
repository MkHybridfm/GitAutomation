package sg.mcqautomation.web.accelerator;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;

public class IFrameHelper {
	private RemoteWebDriver driver;
	private GlobalConfig objConfig;
	public IFrameHelper(RemoteWebDriver driver,GlobalConfig objConfig)
	{
		if(objConfig.applicationType==ApplicationType.WEB)
		{
			this.driver=driver;
		}
		else
		{
			this.driver=(AppiumDriver)driver;
		}
		this.objConfig=objConfig;
	}
}
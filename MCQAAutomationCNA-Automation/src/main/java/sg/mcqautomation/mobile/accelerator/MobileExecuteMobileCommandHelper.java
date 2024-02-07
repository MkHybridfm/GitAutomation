package sg.mcqautomation.mobile.accelerator;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;

public class MobileExecuteMobileCommandHelper {

	public AppiumDriver driver;
	public GlobalConfig objConfig;
	public MobileExecuteMobileCommandHelper(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = (AppiumDriver)driver;
    	this.objConfig=objConfig;
	}

}

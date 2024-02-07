package sg.mcqautomation.mobile.accelerator;
import java.util.Map;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;

public class MobileStatusHelper {

	public AppiumDriver driver;
	public GlobalConfig objConfig;
	public MobileStatusHelper(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = (AppiumDriver)driver;
    	this.objConfig=objConfig;
	}

	/*** 
	 * Name of Function :- fnGetStatus
	 * Class Name :- StatusHelper 
	 * Project :- Media Corp 
	 * Created By :- Pankaj Kumar 
	 * Date of Creation :-3-Feb-2022
	 */
	 public Map<String, Object> fnGetStatus()
	 {
	    Map<String, Object> obj=this.driver.getStatus();
	    return obj;
	 }

}

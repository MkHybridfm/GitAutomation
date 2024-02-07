package sg.mcqautomation.mobile.accelerator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;

public class MobileElementHelper {

	public AppiumDriver driver;
	public GlobalConfig objConfig;
	public MobileElementHelper(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = (AppiumDriver)driver;
    	this.objConfig=objConfig;
	}
	/***
	 * Name of Function :- fnSetValueFromWheeler
	 * Class Name :- ElementHelper
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-16-Feb-2022
	 */
	public void fnSetValueFromWheeler(By loc,String strValue)
	{
		WebElement el = this.driver.findElement(loc);
		el.sendKeys(strValue);
	}

}

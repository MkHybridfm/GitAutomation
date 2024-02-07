package sg.mcqautomation.mobile.accelerator;
import java.net.URL;
import java.time.Duration;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.Setting;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.driverscripts.ScriptOptions;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.serverevents.CustomEvent;
import io.appium.java_client.serverevents.ServerEvents;
import sg.mcqautomation.config.GlobalConfig;

public class MobileSessionHelper {

	public AppiumDriver driver;
	public GlobalConfig objConfig;
	public MobileSessionHelper(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = (AppiumDriver)driver;
    	this.objConfig=objConfig;
	}
	
	/*** 
    * Name of Function :- fnCreateAndroidSession
    * Class Name :- SessionHelper 
    * Project :- Media Corp 
    * Created By :- Pankaj Kumar 
    * Date of Creation :-3-Feb-2022
    */
    public AppiumDriver fnCreateAndroidSession(URL url,DesiredCapabilities caps)
    {
    	return new AppiumDriver(url,caps);
    }
    
    /***
    * Name of Function :- fnCreateIOSSession
    * Class Name :- SessionHelper 
    * Project :- Media Corp 
    * Created By :- Pankaj Kumar 
    * Date of Creation :-3-Feb-2022
    */
    public AppiumDriver fnCreateIOSSession(URL url,DesiredCapabilities caps)
    {
    	return new IOSDriver(url,caps);
    }
    
    /***
     * Name of Function :- End
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void End()
    {
    	this.driver.quit();
    }
    
    /***
     * Name of Function :- fnGetSessionCapabilities
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     * Update :- Method Deprecated
     */
//    public Map<String, Object> fnGetSessionCapabilities()
//    {
//    	Map<String, Object> caps = ((AndroidDriver)this.driver).getSessionDetails();
//    	return caps;
//    }
   
    /***
     * Name of Function :- fnGoBack
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnGoBack()
    {
    	this.driver.navigate().back();
    }
    
    /***
     * Name of Function :- fnTakeScreenShot
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public  byte[] fnTakeScreenShot()
    {
    	byte[] sourcePath = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.BYTES);
    	return sourcePath;
    }
    
    /***
     * Name of Function :-fnGetPageSource 
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public String fnGetPageSource()
    {
    	String pageSource = this.driver.getPageSource();
    	return pageSource;
    }
    
    /***
     * Name of Function :- fnSetPageLoadTimeouts
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnSetPageLoadTimeouts(int intSeconds)
    {
    	this.driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(intSeconds));
    }
    
    /***
     * Name of Function :-fnSetImplicitWait 
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnSetImplicitWait(int intSeconds)
    {
    	this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(intSeconds));
    }
    
    /***
     * Name of Function :- fnSetScriptTimeout
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnSetScriptTimeout(int intSeconds)
    {
    	this.driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(intSeconds));
    }
   
    /***
     * Name of Function :- fnGetOrientation
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public ScreenOrientation fnGetOrientation()
    {

    	ScreenOrientation orientation =((AndroidDriver)this.driver).getOrientation();
    	return orientation;
    }
   
    /***
     * Name of Function :- fnSetOrientationLandScape
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnSetOrientationLandScape()
    {
        ((AndroidDriver)this.driver).rotate(ScreenOrientation.LANDSCAPE);
    }
    
   /***
   * Name of Function :- fnSetOrientationPORTRAIT
   * Class Name :- SessionHelper 
   * Project :- Media Corp 
   * Created By :- Pankaj Kumar 
   * Date of Creation :-3-Feb-2022
   */
     public void fnSetOrientationPORTRAIT()
     {
         ((AndroidDriver)this.driver).rotate(ScreenOrientation.PORTRAIT);
     }
     
    /***
     * Name of Function :- fnGetGeoLocation
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public Location fnGetGeoLocation()
    {
    	Location location =  ((AndroidDriver)this.driver).location();
    	return location;
    }
    
    /***
     * Name of Function :- fnSetGetLocation
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnSetGetLocation(Location objLocation)
    {
        ((AndroidDriver)this.driver).setLocation(objLocation);
    }
    
    /***
     * Name of Function :- fnGetLogTypes
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public  Set<String> fnGetLogTypes()
    {
    	Set<String> logTypes = this.driver.manage().logs().getAvailableLogTypes();
    	return logTypes;
    }
    
    /***
     * Name of Function :- fnGetLogs
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public LogEntries fnGetLogs()
    {
    	LogEntries logEntries = this.driver.manage().logs().get("driver");
    	return logEntries;
    }
  
    /***
     * Name of Function :- fnLogEvent
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnLogEvent(CustomEvent evt)
    {
    	this.driver.logEvent(evt);
    }
    
    /***
     * Name of Function :- fnGetEvents
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public ServerEvents fnGetEvents()
    {
    	return this.driver.getEvents();
    }
    
    /***
     * Name of Function :- fnUpdateSettings
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnUpdateSettings(Setting objSettings,Object value)
    {
    	((AndroidDriver) this.driver).setSetting(objSettings,value);
    }
    
    /***
     * Name of Function :- fnGetDeviceSettings
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public  Map<String, Object> fnGetDeviceSettings()
    {
    	Map<String, Object> settings = ((AndroidDriver) this.driver).getSettings();
    	return settings;
    }
    
    /***
     * Name of Function :- fnExecuteDriverScript
     * Class Name :- SessionHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnExecuteDriverScript(String script,ScriptOptions objScriptOption)
    {
    	this.driver.executeDriverScript(script, objScriptOption);
    }

}

package sg.mcqautomation.driverfactory;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.config.GlobalConfig;

public class BrowserstackAppiumEngine {
	/***
	* Name of Function :- fnBrowserstackOpenAndroidApp
	* Class Name :- BrowserstackAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Date of Update :-25-Sep-2023
	*/
	public static RemoteWebDriver fnBrowserstackOpenAndroidApp(GlobalConfig objConfig) throws MalformedURLException
	{
		MutableCapabilities desiredCapability = GetAndroidDesiredCapabilitiesForApp(objConfig);
		URL strAppiumURL=new URL("http://hub.browserstack.com/wd/hub");
		AndroidDriver driver = new AndroidDriver(strAppiumURL,desiredCapability);
		return driver;
	}
	
	/***
	* Name of Function :- fnBrowserstackOpenAndroidChrome
	* Class Name :- BrowserstackAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 *  * Date of Update :-25-Sep-2023
	*/
	public static RemoteWebDriver fnBrowserstackOpenAndroidChrome(GlobalConfig objConfig) throws MalformedURLException
	{
		MutableCapabilities desiredCapability =  GetAndroidDesiredCapabilitiesForChrome(objConfig);
		URL strAppiumURL=new URL("http://hub.browserstack.com/wd/hub");
		AndroidDriver driver = new AndroidDriver(strAppiumURL,desiredCapability);
		return driver;
	}
	
	/***
	* Name of Function :- fnBrowserstackOpenIOSAPP
	* Class Name :- BrowserstackAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 *  * Date of Update :-25-Sep-2023
	*/
	public static RemoteWebDriver fnBrowserstackOpenIOSAPP(GlobalConfig objConfig) throws MalformedURLException
	{
		MutableCapabilities desiredCapability =  GetIOSDesiredCapabilitiesForAPP(objConfig);
		URL strAppiumURL=new URL("http://hub.browserstack.com/wd/hub");
		IOSDriver driver = new IOSDriver(strAppiumURL,desiredCapability);
		return driver;
	}
	
	/***
	* Name of Function :- fnBrowserstackOpenIOSSafari
	* Class Name :- BrowserstackAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 *  * Date of Update :-25-Sep-2023
	*/
	public static RemoteWebDriver fnBrowserstackOpenIOSSafari(GlobalConfig objConfig) throws MalformedURLException
	{
		MutableCapabilities desiredCapability =  GetIOSDesiredCapabilitiesForSafari(objConfig);
		URL strAppiumURL=new URL("http://hub.browserstack.com/wd/hub");
		IOSDriver driver = new IOSDriver(strAppiumURL,desiredCapability);
		return driver;
	}
	

	/***
	* Name of Function :- GetAndroidDesiredCapabilitiesForApp
	* Class Name :- BrowserstackAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 *  * Date of Update :-25-Sep-2023
	*/
	public static MutableCapabilities GetAndroidDesiredCapabilitiesForApp(GlobalConfig objConfig)
	{
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("userName", objConfig.BrowserStackName);
		browserstackOptions.put("accessKey", objConfig.BrowserStackKey);
		browserstackOptions.put("osVersion", objConfig.BSOSVersion);
		browserstackOptions.put("deviceName", objConfig.BSDevice);
		browserstackOptions.put("projectName", objConfig.BSProject);
		browserstackOptions.put("buildName", objConfig.BSAndroidBuildName);
		browserstackOptions.put("sessionName", objConfig.BSTestID);
		browserstackOptions.put("appiumVersion", "2.0.1");
		browserstackOptions.put("local", "false");
		browserstackOptions.put("debug", "true");
		MutableCapabilities objCapabilities = new MutableCapabilities();
		objCapabilities.setCapability("app", objConfig.BSAndroidAppName);
		objCapabilities.setCapability("bstack:options", browserstackOptions);
		if(objConfig.BSLocation)
			objCapabilities.setCapability("browserstack.geoLocation", objConfig.BSGeoLocation);
		return objCapabilities;
	}
	/***
	* Name of Function :- GetAndroidDesiredCapabilitiesForChrome
	* Class Name :- BrowserstackAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 *  * Date of Update :-25-Sep-2023
	*/
	public static MutableCapabilities GetAndroidDesiredCapabilitiesForChrome(GlobalConfig objConfig)
	{
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("userName", objConfig.BrowserStackName);
		browserstackOptions.put("accessKey", objConfig.BrowserStackKey);
		browserstackOptions.put("osVersion", objConfig.BSOSVersion);
		browserstackOptions.put("deviceName", objConfig.BSDevice);
		browserstackOptions.put("projectName", objConfig.BSProject);
		browserstackOptions.put("buildName", objConfig.BSAndroidBuildName);
		browserstackOptions.put("sessionName", objConfig.BSTestID);
		browserstackOptions.put("appiumVersion", "2.0.1");
		browserstackOptions.put("local", "false");
		browserstackOptions.put("debug", "true");
		MutableCapabilities objCapabilities = new MutableCapabilities();
		objCapabilities.setCapability("browserName", "chrome");
		objCapabilities.setCapability("bstack:options", browserstackOptions);
		if(objConfig.BSLocation)
			objCapabilities.setCapability("browserstack.geoLocation", objConfig.BSGeoLocation);
		return objCapabilities;
	}
	/***
	* Name of Function :- GetIOSDesiredCapabilitiesForSafari
	* Class Name :- BrowserstackAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 *  * Date of Update :-25-Sep-2023
	*/
	public static MutableCapabilities GetIOSDesiredCapabilitiesForSafari(GlobalConfig objConfig)
	{
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("userName", objConfig.BrowserStackName);
		browserstackOptions.put("accessKey", objConfig.BrowserStackKey);
		browserstackOptions.put("osVersion", objConfig.BSOSVersion);
		browserstackOptions.put("deviceName", objConfig.BSDevice);
		browserstackOptions.put("projectName", objConfig.BSProject);
		browserstackOptions.put("buildName", objConfig.BSIOSBuildName);
		browserstackOptions.put("sessionName", objConfig.BSTestID);
		browserstackOptions.put("appiumVersion", "2.0.1");
		browserstackOptions.put("local", "false");
		browserstackOptions.put("debug", "true");
		MutableCapabilities objCapabilities = new MutableCapabilities();
		objCapabilities.setCapability("bstack:options", browserstackOptions);
		if(objConfig.BSLocation)
			objCapabilities.setCapability("browserstack.geoLocation", objConfig.BSGeoLocation);
		return objCapabilities;
	}
	/***
	* Name of Function :- GetIOSDesiredCapabilitiesForAPP
	* Class Name :- BrowserstackAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 *  * Date of Update :-25-Sep-2023
	*/
	public static MutableCapabilities GetIOSDesiredCapabilitiesForAPP(GlobalConfig objConfig)
	{
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("userName", objConfig.BrowserStackName);
		browserstackOptions.put("accessKey", objConfig.BrowserStackKey);
		browserstackOptions.put("osVersion", objConfig.BSOSVersion);
		browserstackOptions.put("deviceName", objConfig.BSDevice);
		browserstackOptions.put("projectName", objConfig.BSProject);
		browserstackOptions.put("buildName", objConfig.BSIOSBuildName);
		browserstackOptions.put("sessionName", objConfig.BSTestID);
		browserstackOptions.put("appiumVersion", "2.0.1");
		browserstackOptions.put("local", "false");
		browserstackOptions.put("debug", "true");
		MutableCapabilities objCapabilities = new MutableCapabilities();
		objCapabilities.setCapability("app", objConfig.BSIOSAppName);
		objCapabilities.setCapability("bstack:options", browserstackOptions);
		objCapabilities.setCapability("browserstack.resignApp", "false");
		if(objConfig.BSLocation)
			objCapabilities.setCapability("browserstack.geoLocation", objConfig.BSGeoLocation);
		return objCapabilities;
	}
}

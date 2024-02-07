package sg.mcqautomation.driverfactory;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import sg.mcqautomation.config.GlobalConfig;

public class LocalAppiumEngine {
	/***
	 * Name of Function :- fnStartAppiumServerLocal
	 * Class Name :- LocalAppiumEngine
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-9-Oct-2023
	 */
	public static URL fnStartAppiumServerLocal(int intPortNumber)
	{
		AppiumDriverLocalService service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder().withIPAddress("127.0.0.1")
				.usingPort(intPortNumber)
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.withLogFile(new File(System.getProperty("user.dir")+ "\\appiumLogs.txt")));
		service.start();
		System.out.println("******************************************************");
		System.out.println("Local Appium is Started URl :- " + service.getUrl());
		System.out.println("******************************************************");
		return service.getUrl();
	}

	/***
	* Name of Function :- fnOpenAndroidApp
	* Class Name :- LocalAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Function Update Date :- 9-Oct-2023
	*/
	public static RemoteWebDriver fnOpenAndroidApp(GlobalConfig objConfig) throws MalformedURLException {
		URL strAppiumURL=new URL(objConfig.AppiumServer+":"+objConfig.AppiumPort);
		if(objConfig.StartAppiumServer) {
			strAppiumURL = fnStartAppiumServerLocal(1234);
		}
		UiAutomator2Options options =GetAndroidCapabilitiesForApp(objConfig);
		AndroidDriver driver = new AndroidDriver(strAppiumURL,options);
		try {
			Thread.sleep(10000);
		}catch(Exception e){}
		System.out.println("***********************************************************");
		System.out.println("Battery Status  ==> "+driver.getBatteryInfo().getState());
		System.out.println("Current Activity  ==> "+driver.currentActivity());
		System.out.println("WiFi Enabled  ==> "+driver.getConnection().isWiFiEnabled());
		System.out.println("***********************************************************");
		return driver;
	}
	
	/***
	* Name of Function :- fnOpenAndroidChrome
	* Class Name :- LocalAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Function Update Date :- 9-Oct-2023
	*/
	public static RemoteWebDriver fnOpenAndroidChrome(GlobalConfig objConfig) throws MalformedURLException
	{
		URL strAppiumURL=new URL(objConfig.AppiumServer+":"+objConfig.AppiumPort);
		if(objConfig.StartAppiumServer) {
			strAppiumURL = fnStartAppiumServerLocal(1234);
		}
		UiAutomator2Options options =GetAndroidDesiredCapabilitiesForChrome(objConfig);
		AndroidDriver driver = new AndroidDriver(strAppiumURL,options);
		try {
			Thread.sleep(10000);
			driver.hideKeyboard();
		}catch(Exception e){}
		System.out.println("***********************************************************");
		System.out.println("Battery Status  ==> "+driver.getBatteryInfo().getState());
		System.out.println("Current Activity  ==> "+driver.currentActivity());
		System.out.println("WiFi Enabled  ==> "+driver.getConnection().isWiFiEnabled());
		System.out.println("***********************************************************");
		return driver;
	}
	
	/***
	* Name of Function :- fnOpenIOSAPP
	* Class Name :- LocalAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Function Update Date :- 9-Oct-2023
	*/
	public static RemoteWebDriver fnOpenIOSAPP(GlobalConfig objConfig) throws MalformedURLException
	{
		URL strAppiumURL=new URL(objConfig.AppiumServer+":"+objConfig.AppiumPort);
		if(objConfig.StartAppiumServer) {
			strAppiumURL = fnStartAppiumServerLocal(1234);
		}
		UiAutomator2Options options =GetIOSDesiredCapabilitiesForAPP(objConfig);
		IOSDriver driver = new IOSDriver(strAppiumURL,options);
		try {
			Thread.sleep(10000);
			driver.hideKeyboard();
		}catch(Exception e){}
		System.out.println("***********************************************************");
		System.out.println("Battery Status  ==> "+driver.getBatteryInfo().getState());
		System.out.println("Get SessionId  ==> "+driver.getSessionId());
		System.out.println("***********************************************************");
		return driver;
	}
	
	/***
	* Name of Function :- fnOpenIOSSafari
	* Class Name :- LocalAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Function Update Date :- 9-Oct-2023
	*/
	public static RemoteWebDriver fnOpenIOSSafari(GlobalConfig objConfig) throws MalformedURLException
	{
		URL strAppiumURL=new URL(objConfig.AppiumServer+":"+objConfig.AppiumPort);
		if(objConfig.StartAppiumServer) {
			strAppiumURL = fnStartAppiumServerLocal(1234);
		}
		UiAutomator2Options options =GetIOSDesiredCapabilitiesForSafari(objConfig);
		IOSDriver driver = new IOSDriver(strAppiumURL,options);
		try {
			Thread.sleep(10000);
			driver.hideKeyboard();
		}catch(Exception e){}
		System.out.println("***********************************************************");
		System.out.println("Battery Status  ==> "+driver.getBatteryInfo().getState());
		System.out.println("Get SessionId  ==> "+driver.getSessionId());
		System.out.println("Get Browser Name  ==> "+driver.getCapabilities().getBrowserName());
		System.out.println("***********************************************************");
		return driver;
	}

	/***
	* Name of Function :- GetAndroidDesiredCapabilitiesForApp
	* Class Name :- LocalAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Function Update Date :- 9-Oct-2023
	*/
	public static UiAutomator2Options GetAndroidCapabilitiesForApp(GlobalConfig objConfig)
	{
		String androidAppUrl="";
		if(objConfig.AppPath.toLowerCase().contains("local"))
		{
			String app_path= System.getProperty("user.dir");
			androidAppUrl = app_path+ "//App_Path//"+objConfig.AndroidAppName;
		}
		else if(objConfig.AppPath.toLowerCase().contains("/"))
		{
			String app_path =objConfig.AppPath;
			androidAppUrl = app_path+ "/"+objConfig.AndroidAppName;
		}
		else if(objConfig.AppPath.toLowerCase().contains("install"))
		{
//			objCapabilities.setCapability(MobileCapabilityType.NO_RESET, objConfig.RESET);
//			objCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,objConfig.PackageName);
//			objCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,objConfig.AppActivity);
		}
		UiAutomator2Options options = new UiAutomator2Options().setApp(androidAppUrl)
				.setUdid(objConfig.DeviceName)
				.autoGrantPermissions()
				.setNewCommandTimeout(Duration.ofSeconds(60));
		return  options;
	}
	
	/***
	* Name of Function :- GetAndroidDesiredCapabilitiesForChrome
	* Class Name :- LocalAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Function Update Date :- 9-Oct-2023
	*/
	public static UiAutomator2Options GetAndroidDesiredCapabilitiesForChrome(GlobalConfig objConfig)
	{
		UiAutomator2Options options = new UiAutomator2Options()
				.setUdid(objConfig.DeviceName)
				.autoGrantPermissions()
				.withBrowserName("chrome")
				.setNewCommandTimeout(Duration.ofSeconds(60));
		return options;
	}
	/***
	* Name of Function :- GetIOSDesiredCapabilitiesForSafari
	* Class Name :- LocalAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Function Update Date :- 9-Oct-2023
	*/
	public static UiAutomator2Options GetIOSDesiredCapabilitiesForSafari(GlobalConfig objConfig)
	{
		UiAutomator2Options options = new UiAutomator2Options()
				.setUdid(objConfig.UDID)
				.autoGrantPermissions()
				.withBrowserName("safari")
				.setNewCommandTimeout(Duration.ofSeconds(60));
		return options;
	}
	/***
	* Name of Function :- GetIOSDesiredCapabilitiesForAPP
	* Class Name :- LocalAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Function Update Date :- 9-Oct-2023
	*/
	public static UiAutomator2Options GetIOSDesiredCapabilitiesForAPP(GlobalConfig objConfig)
	{
		String iosAppUrl="";
		if(objConfig.AppPath.toLowerCase().contains("local"))
		{
			String app_path= System.getProperty("user.dir");
			iosAppUrl = app_path+ "//App_Path//"+objConfig.AndroidAppName;
		}
		else if(objConfig.AppPath.toLowerCase().contains("/"))
		{
			String app_path =objConfig.AppPath;
			iosAppUrl = app_path+ "/"+objConfig.AndroidAppName;
		}
		else if(objConfig.AppPath.toLowerCase().contains("install"))
		{
//			objCapabilities.setCapability(MobileCapabilityType.NO_RESET, objConfig.RESET);
//			objCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,objConfig.PackageName);
//			objCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,objConfig.AppActivity);
		}
		UiAutomator2Options options = new UiAutomator2Options().setApp(iosAppUrl)
				.setAutomationName("XCUITest")
				.setUdid(objConfig.DeviceName)
				.autoGrantPermissions()
				.noReset()
				.setNewCommandTimeout(Duration.ofSeconds(60));
		return options;
	}
}

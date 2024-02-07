package sg.mcqautomation.driverfactory;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.utilities.FileUtilities;

public class GridAppiumEngine {
	/***
	* Name of Function :- fnOpenAndroidApp
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static RemoteWebDriver fnOpenAndroidApp(GlobalConfig objConfig) throws MalformedURLException
	{
		RemoteWebDriver driver;
		DesiredCapabilities desiredCapability =  GetAndroidDesiredCapabilitiesForApp();
		URL strAppiumURL=new URL("http://"+GetGridServer()+":"+GetGridPort());
		driver=new AndroidDriver(strAppiumURL,desiredCapability);
		return driver;
	}
	
	/***
	* Name of Function :- fnOpenAndroidChrome
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static RemoteWebDriver fnOpenAndroidChrome(GlobalConfig objConfig) throws MalformedURLException
	{
		RemoteWebDriver driver;
		DesiredCapabilities desiredCapability =  GetAndroidDesiredCapabilitiesForChrome();
		URL strAppiumURL=new URL("http://"+GetGridServer()+":"+GetGridPort());
		driver=new AndroidDriver(strAppiumURL,desiredCapability);
		return driver;
	}
	
	/***
	* Name of Function :- fnOpenIOSAPP
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022 
	*/
	public static RemoteWebDriver fnOpenIOSAPP(GlobalConfig objConfig) throws MalformedURLException
	{
		RemoteWebDriver driver;
		DesiredCapabilities desiredCapability =  GetIOSDesiredCapabilitiesForAPP();
		URL strAppiumURL=new URL("http://"+GetGridServer()+":"+GetGridPort());
		driver=new AndroidDriver(strAppiumURL,desiredCapability);
		return driver;
	}
	
	/***
	* Name of Function :- fnOpenIOSSafari
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static RemoteWebDriver fnOpenIOSSafari(GlobalConfig objConfig) throws MalformedURLException
	{
		RemoteWebDriver driver;
		DesiredCapabilities desiredCapability =  GetIOSDesiredCapabilitiesForSafari();
		URL strAppiumURL=new URL("http://"+GetGridServer()+":"+GetGridPort());
		driver=new AndroidDriver(strAppiumURL,desiredCapability);
		return driver;
	}
	

	/***
	* Name of Function :- GetAndroidDesiredCapabilitiesForApp
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static DesiredCapabilities GetAndroidDesiredCapabilitiesForApp()
	{
		DesiredCapabilities objCapabilities=new DesiredCapabilities();
		objCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		objCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		objCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, GetPlatformVersion());
		objCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, GetDeviceName());
		objCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, GetNEWCommandTimeOut());
		objCapabilities.setCapability(MobileCapabilityType.NO_RESET, GetReset());
		objCapabilities.setCapability(MobileCapabilityType.FULL_RESET,GetFullReset());
		objCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,GetPackageName());
		objCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,GetAppActivity());
		return objCapabilities;
		
	}
	/***
	* Name of Function :- GetAndroidDesiredCapabilitiesForChrome
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static DesiredCapabilities GetAndroidDesiredCapabilitiesForChrome()
	{
		DesiredCapabilities objCapabilities=new DesiredCapabilities();
		objCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		objCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		objCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, GetPlatformVersion());
		objCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, GetDeviceName());
		objCapabilities.setCapability(MobileBrowserType.BROWSER,MobileBrowserType.CHROME );
		objCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, GetNEWCommandTimeOut());
		return objCapabilities;		
	}
	/***
	* Name of Function :- GetIOSDesiredCapabilitiesForSafari
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static DesiredCapabilities GetIOSDesiredCapabilitiesForSafari()
	{
		DesiredCapabilities objCapabilities=new DesiredCapabilities();
		objCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		objCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.IOS);
		objCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, GetPlatformVersion());
		objCapabilities.setCapability(MobileCapabilityType.UDID, GetUDID());
		objCapabilities.setCapability(MobileBrowserType.BROWSER,MobileBrowserType.SAFARI );
		objCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, GetNEWCommandTimeOut());
		return objCapabilities;		
	}
	/***
	* Name of Function :- GetIOSDesiredCapabilitiesForAPP
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022 
	*/
	public static DesiredCapabilities GetIOSDesiredCapabilitiesForAPP()
	{
		DesiredCapabilities objCapabilities=new DesiredCapabilities();
		objCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		objCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.IOS);
		//objCapabilities.setCapability(IOSMobileCapabilityType.La, GetLaunchTime());
		objCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, GetNEWCommandTimeOut());
		objCapabilities.setCapability(IOSMobileCapabilityType.USE_NEW_WDA, GetWDA());
		objCapabilities.setCapability(IOSMobileCapabilityType.WAIT_FOR_APP_SCRIPT, "target.elements().length > 0; $.delay(6000); $.acceptAlert();");
		objCapabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID,GetBundleID());
		objCapabilities.setCapability(MobileCapabilityType.UDID, GetUDID());		
		return objCapabilities;		
	}
	/***
	* Name of Function :- GetPlatformVersion
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetPlatformVersion()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("PlatformVersion")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("PlatformVersion");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("PlatformVersion");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "";		
	}
	/***
	* Name of Function :- GetDeviceName
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetDeviceName()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("DeviceName")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("DeviceName");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("DeviceName");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "";		
	}
	/***
	* Name of Function :- GetPackageName
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetPackageName()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("PackageName")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("PackageName");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("PackageName");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "";		
	}
	/***
	* Name of Function :- GetAppActivity
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetAppActivity()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("AppActivity")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("AppActivity");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("AppActivity");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "";		
	}
	/***
	* Name of Function :- GetReset
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetReset()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("Reset")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("Reset");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("Reset");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "true";		
	}
	/***
	* Name of Function :- GetFullReset
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetFullReset()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("FullReset")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("FullReset");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("FullReset");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "false";		
	}
	/***
	* Name of Function :- GetNEWCommandTimeOut
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetNEWCommandTimeOut()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("NEWCommandTimeOut")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("NEWCommandTimeOut");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("NEWCommandTimeOut");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "8000";		
	}
	/***
	* Name of Function :- GetUDID
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetUDID()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("UDID")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("UDID");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("UDID");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "";		
	}
	/***
	* Name of Function :- GetWDA
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetWDA()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("WDA")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("WDA");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("WDA");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "true";		
	}
	/***
	* Name of Function :- GetBundleID
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetBundleID()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("BundleID")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("BundleID");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("BundleID");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "";		
	}
	/***
	* Name of Function :- GetAutoAcceptAlert
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetAutoAcceptAlert()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("AutoAcceptAlert")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("AutoAcceptAlert");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("AutoAcceptAlert");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "true";		
	}
	/***
	* Name of Function :- GetLaunchTime
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetLaunchTime()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("LaunchTime")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("LaunchTime");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("LaunchTime");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "10000";		
	}
	/***
	* Name of Function :- GetGridServer
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetGridServer()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("RemoteServer")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("RemoteServer");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("RemoteServer");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "localhost";		
	}
	/***
	* Name of Function :- GetGridPort
	* Class Name :- GridAppiumEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetGridPort()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("RemotePort")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("RemotePort");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("RemotePort");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "4444";		
	}
	

}

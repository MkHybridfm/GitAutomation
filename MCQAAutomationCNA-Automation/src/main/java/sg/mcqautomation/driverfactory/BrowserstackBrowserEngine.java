package sg.mcqautomation.driverfactory;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.OSType;
import sg.mcqautomation.utilities.FileUtilities;

public class BrowserstackBrowserEngine {
	/***
	* Name of Function :- fnBrowserStackBrowser
	* Class Name :- BrowserstackBrowserEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Date of Update :-6-Sep-2023
	*/
	public static RemoteWebDriver fnBrowserStackBrowser(MutableCapabilities caps) throws MalformedURLException
	{
		return new RemoteWebDriver(new URL("https://"+GetBrowserStackName()+":"+GetBrowserStackKey()+"@hub-cloud.browserstack.com/wd/hub"), caps);
	}
	/***
	* Name of Function :- GetBrowserStackKey
	* Class Name :- BrowserstackBrowserEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetBrowserStackKey()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("BrowserStackKey")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("BrowserStackKey");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("BrowserStackKey");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "";		
	}
	/***
	* Name of Function :- GetBrowserStackName
	* Class Name :- BrowserstackBrowserEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetBrowserStackName()
	{
		String strValue="";
		if(FileUtilities.fnGetGlobalValueFromPOM("BrowserStackName")!=null)
			strValue=FileUtilities.fnGetGlobalValueFromPOM("BrowserStackName");
		else
			strValue=FileUtilities.fnGetGlobalValueFromGlobalConfig("BrowserStackName");
		
		if(!strValue.isEmpty())
			return strValue;
		else
			return "";		
	}
	/***
	* Name of Function :- GeBrowserStackBrowserEngine
	* Class Name :- BrowserstackBrowserEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	 * Date of Update :-6-Sep-2023
	*/
	public static RemoteWebDriver GeBrowserStackBrowserEngine(GlobalConfig objConfig) throws MalformedURLException
	{
		MutableCapabilities capabilities = new MutableCapabilities();
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("browserVersion", "latest");
		browserstackOptions.put("local", "false");
		browserstackOptions.put("seleniumVersion", "4.11.0");
		browserstackOptions.put("projectName", objConfig.BSProject);
		browserstackOptions.put("sessionName", objConfig.BSTestID);
		if(objConfig.BSLocation)
			capabilities.setCapability("browserstack.geoLocation", objConfig.BSGeoLocation);
		if(objConfig.osType==OSType.Windows)
		{
			browserstackOptions.put("os", "Windows");
			browserstackOptions.put("osVersion", objConfig.BSPlatformVersion);
			if(objConfig.browserType==GlobalConfig.BrowserType.EDGE)
			{
				browserstackOptions.put("buildName", objConfig.BSWebBuildName+"_EDGE_Windows_"+objConfig.BSPlatformVersion);
				capabilities.setCapability("bstack:options", browserstackOptions);
				capabilities.setCapability("browserName", "Edge");
			}
			else if(objConfig.browserType==GlobalConfig.BrowserType.FIREFOX)
			{
				browserstackOptions.put("buildName", objConfig.BSWebBuildName+"_FIREFOX_Windows_"+objConfig.BSPlatformVersion);
				capabilities.setCapability("bstack:options", browserstackOptions);
				capabilities.setCapability("browserName", "Firefox");
			}
			else
			{
				browserstackOptions.put("buildName", objConfig.BSWebBuildName+"_CHROME_Windows_"+objConfig.BSPlatformVersion);
				capabilities.setCapability("bstack:options", browserstackOptions);
				capabilities.setCapability("browserName", "Chrome");
			}	
		}
		else if(objConfig.osType==OSType.Mac)
		{
			browserstackOptions.put("os", "OS X");
			browserstackOptions.put("osVersion", "Monterey");
			if(objConfig.browserType==GlobalConfig.BrowserType.SAFARI)
			{
				browserstackOptions.put("buildName", objConfig.BSWebBuildName+"_SAFARI_MAC_Monterey");
				capabilities.setCapability("bstack:options", browserstackOptions);
				capabilities.setCapability("browserName", "Safari");
			}
			else if(objConfig.browserType==GlobalConfig.BrowserType.FIREFOX)
			{
				browserstackOptions.put("buildName", objConfig.BSWebBuildName+"_FIREFOX_MAC_Monterey");
				capabilities.setCapability("bstack:options", browserstackOptions);
				capabilities.setCapability("browserName", "Firefox");
			}
			else
			{
				browserstackOptions.put("buildName", objConfig.BSWebBuildName+"_CHROME_MAC_Monterey");
				capabilities.setCapability("bstack:options", browserstackOptions);
				capabilities.setCapability("browserName", "Chrome");
			}	
		}
		else
		{
			browserstackOptions.put("os", "Windows");
			browserstackOptions.put("osVersion", objConfig.BSPlatformVersion);
			browserstackOptions.put("buildName", objConfig.BSWebBuildName+"_CHROME_Windows_"+objConfig.BSPlatformVersion);
			capabilities.setCapability("bstack:options", browserstackOptions);
			capabilities.setCapability("browserName", "Chrome");
		}
		return fnBrowserStackBrowser(capabilities);
	}
}

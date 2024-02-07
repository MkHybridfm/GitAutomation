package sg.mcqautomation.driverfactory;
import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.config.GlobalConfig;

public class DriverFactory {
	public RemoteWebDriver driver;
	public static ThreadLocal<RemoteWebDriver> tlDriver = new ThreadLocal<RemoteWebDriver>();
	public static ThreadLocal<GlobalConfig> objGlobalConfig = new ThreadLocal<GlobalConfig>();
	/***
	* Name of Function :- init_driver
	* Class Name :- DriverFactory 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-APR-2021
	*/
	public RemoteWebDriver init_driver(GlobalConfig objConfig) throws MalformedURLException 
	{
		objGlobalConfig.set(objConfig);
		String strAppiumURL="";
		if(objConfig.executionProvider==GlobalConfig.ExecutionProvider.Local)
		{
			if(objConfig.applicationType==GlobalConfig.ApplicationType.WEB)
			{
				tlDriver.set(LocalBrowserEngine.GetLocalBrowserEngine(objConfig));
				getDriver().manage().window().maximize();
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.ANDROID_APP)
			{
				tlDriver.set(LocalAppiumEngine.fnOpenAndroidApp(objConfig));
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.ANDROID_WEB)
			{
				tlDriver.set(LocalAppiumEngine.fnOpenAndroidChrome(objConfig));
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.IOS_APP)
			{
				tlDriver.set(LocalAppiumEngine.fnOpenIOSAPP(objConfig));
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.IOS_WEB)
			{
				tlDriver.set(LocalAppiumEngine.fnOpenIOSSafari(objConfig));
			}
		}
		else if(objConfig.executionProvider==GlobalConfig.ExecutionProvider.Grid)
		{
			if(objConfig.applicationType==GlobalConfig.ApplicationType.WEB)
			{
				tlDriver.set(GridBrowserEngine.GetLocalBrowserEngine(objConfig));
				getDriver().manage().window().maximize();
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.ANDROID_APP)
			{
				tlDriver.set(GridAppiumEngine.fnOpenAndroidApp(objConfig));
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.ANDROID_WEB)
			{
				tlDriver.set(GridAppiumEngine.fnOpenAndroidChrome(objConfig));
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.IOS_APP)
			{
				tlDriver.set(GridAppiumEngine.fnOpenIOSAPP(objConfig));
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.IOS_WEB)
			{
				tlDriver.set(GridAppiumEngine.fnOpenIOSSafari(objConfig));
			}
		}
		else if(objConfig.executionProvider==GlobalConfig.ExecutionProvider.Browserstack)
		{
			if(objConfig.applicationType==GlobalConfig.ApplicationType.WEB)
			{
				tlDriver.set(BrowserstackBrowserEngine.GeBrowserStackBrowserEngine(objConfig));
				getDriver().manage().window().maximize();
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.ANDROID_APP)
			{
				tlDriver.set(BrowserstackAppiumEngine.fnBrowserstackOpenAndroidApp(objConfig));
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.ANDROID_WEB)
			{
				tlDriver.set(BrowserstackAppiumEngine.fnBrowserstackOpenAndroidChrome(objConfig));
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.IOS_APP)
			{
				tlDriver.set(BrowserstackAppiumEngine.fnBrowserstackOpenIOSAPP(objConfig));
			}
			else if(objConfig.applicationType==GlobalConfig.ApplicationType.IOS_WEB)
			{
				tlDriver.set(BrowserstackAppiumEngine.fnBrowserstackOpenIOSSafari(objConfig));
			}
		}		
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(objConfig.DriverTimeOut));
		return getDriver();
	}

	/***
	* Name of Function :- getDriver
	* Class Name :- DriverFactory 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public static synchronized RemoteWebDriver getDriver() {
		return tlDriver.get();
	}
	
	
	/***
	* Name of Function :- getGlobalConfig
	* Class Name :- DriverFactory 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public static synchronized GlobalConfig getGlobalConfig() {
		return objGlobalConfig.get();
	}
	
}

package sg.mcqautomation.web.accelerator;
import java.time.Duration;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;

public class BrowserNavigationHelper {
	private RemoteWebDriver driver;
	private GlobalConfig objConfig;
	public BrowserNavigationHelper(RemoteWebDriver driver,GlobalConfig objConfig)
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
	/***
	* Name of Function :- fnGetURL
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnGetURL(String strURL)
	{
		boolean blnStatus=true;
		try
		{
			this.driver.get(strURL);
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnMaximizeBrowser
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Apr-2021
	*/
	public void fnMaximizeBrowser()
	{
		this.driver.manage().window().maximize();
	}
	
	/***
	* Name of Function :- fnImplicitWait
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Apr-2021
	*/
	public void fnImplicitWait() 
	{
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(objConfig.DriverTimeOut));
	}
	
	/***
	* Name of Function :- fnFullScreenBrowser
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Apr-2021
	*/
	public void fnFullScreenBrowser() 
	{
		this.driver.manage().window().fullscreen();
	}
	
	/***
	* Name of Function :- fnDeleteAllCookies
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Apr-2021
	*/
	public void fnDeleteAllCookies() 
	{
		this.driver.manage().deleteAllCookies();
	}
	
	/***
	* Name of Function :- fnCloseDriver
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Apr-2021
	*/
	public void fnCloseDriver()
	{
		this.driver.close();
	}
	
	/***
	* Name of Function :- fnQuitDriver
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Apr-2021
	*/
	public void fnQuitDriver() 
	{
		this.driver.quit();
	}
	
	/***
	* Name of Function :- fnGetTitle
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetTitle()
	{
		String strTitle="";
		try
		{
			strTitle=this.driver.getTitle();
		}
		catch(Exception e){}
		return strTitle;
	}
	/***
	* Name of Function :- fnGetPageSource
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetPageSource() 
	{
		String strPageSource="";
		try
		{
			strPageSource=this.driver.getPageSource();
		}
		catch(Exception e){}
		return strPageSource;
	}
	
	/***
	* Name of Function :- fnGetCurrentURL
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetCurrentURL() 
	{
		String strCurrentURL="";
		try
		{
			strCurrentURL=this.driver.getCurrentUrl();
		}
		catch(Exception e){}
		return strCurrentURL;
	}
	
	/***
	* Name of Function :- fnNavigateTo
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnNavigateTo(String strURL)
	{
		boolean blnStatus=true;
		try
		{
			this.driver.navigate().to(strURL);
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnNavigateBack
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnNavigateBack() 
	{
		boolean blnStatus=true;
		try
		{
			this.driver.navigate().back();
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnNavigateForward
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnNavigateForward()
	{
		boolean blnStatus=true;
		try
		{
			this.driver.navigate().forward();
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnRefresh
	* Class Name :- WebBrowserNavigationHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnRefresh() 
	{
		boolean blnStatus=true;
		try
		{
			this.driver.navigate().refresh();
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
}

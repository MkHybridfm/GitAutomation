package sg.mcqautomation.driverfactory;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.utilities.FileUtilities;

public class GridBrowserEngine {
	/***
	* Name of Function :- fnRemoteChromeBrowser
	* Class Name :- GridBrowserEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static RemoteWebDriver fnRemoteChromeBrowser(String strRemoteServer,String strRemotePort) throws MalformedURLException 
	{
		ChromeOptions cap = new ChromeOptions(); 
		cap.addArguments("--disable-gpu");
		cap.addArguments("--disable-dev-shm-usage");
		cap.addArguments("--disable-notifications");
		return new RemoteWebDriver(new URL(strRemoteServer+":"+strRemotePort+"/wd/hub"), cap);
	}
	
	/***
	* Name of Function :- fnRemoteFirefoxBrowser
	* Class Name :- GridBrowserEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static RemoteWebDriver fnRemoteFirefoxBrowser(String strRemoteServer,String strRemotePort) throws MalformedURLException
	{
		FirefoxOptions options = new FirefoxOptions();
		return new RemoteWebDriver(new URL(strRemoteServer+":"+strRemotePort+"/wd/hub"), options);
	}
	
	/***
	* Name of Function :- fnRemoteEdgeBrowser
	* Class Name :- GridBrowserEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static RemoteWebDriver fnRemoteEdgeBrowser(String strRemoteServer,String strRemotePort) throws MalformedURLException 
	{
		EdgeOptions options = new EdgeOptions();
		return new RemoteWebDriver(new URL(strRemoteServer+":"+strRemotePort+"/wd/hub"), options);
	}
	
	/***
	* Name of Function :- fnRemoteSafariBrowser
	* Class Name :- GridBrowserEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static RemoteWebDriver fnRemoteSafariBrowser(String strRemoteServer,String strRemotePort) throws MalformedURLException 
	{
		SafariOptions options = new SafariOptions();
		return new RemoteWebDriver(new URL(strRemoteServer+":"+strRemotePort+"/wd/hub"), options);
	}
	
	/***
	* Name of Function :- GetGridServer
	* Class Name :- GridBrowserEngine 
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
	* Class Name :- GridBrowserEngine 
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
	/***
	* Name of Function :- GetLocalBrowserEngine
	* Class Name :- GridBrowserEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static RemoteWebDriver GetLocalBrowserEngine(GlobalConfig objConfig) throws MalformedURLException
	{
		String strServer=GetGridServer();
		String strPort=GetGridPort();
		if(objConfig.browserType==GlobalConfig.BrowserType.EDGE)
			return fnRemoteEdgeBrowser(strServer,strPort);
		else if(objConfig.browserType==GlobalConfig.BrowserType.FIREFOX)
			return fnRemoteFirefoxBrowser(strServer,strPort);
		else if(objConfig.browserType==GlobalConfig.BrowserType.SAFARI)
			return fnRemoteSafariBrowser(strServer,strPort);
		else
			return fnRemoteChromeBrowser(strServer,strPort);
	}
}

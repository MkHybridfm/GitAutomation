package sg.mcqautomation.driverfactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import sg.mcqautomation.config.GlobalConfig;

public class LocalBrowserEngine {
	
	/***
	* Name of Function :- fnChromeBrowser
	* Class Name :- LocalWebDriverEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public static RemoteWebDriver fnChromeBrowser() 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		return new ChromeDriver(options);
	}

	/***
	* Name of Function :- fnFirefoxBrowser
	* Class Name :- LocalWebDriverEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public static RemoteWebDriver fnFirefoxBrowser() 
	{
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
	
	/***
	* Name of Function :- fnSafariBrowser
	* Class Name :- LocalWebDriverEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public static RemoteWebDriver fnSafariBrowser() {
		WebDriverManager.safaridriver().setup();
		return new SafariDriver();
	}
	
	/***
	* Name of Function :- fnEdgeBrowser
	* Class Name :- LocalWebDriverEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public static RemoteWebDriver fnEdgeBrowser() 
	{
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();
	}
	/***
	* Name of Function :- GetLocalBrowserEngine
	* Class Name :- LocalWebDriverEngine 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public static RemoteWebDriver GetLocalBrowserEngine(GlobalConfig objConfig)
	{
		if(objConfig.browserType==GlobalConfig.BrowserType.EDGE)
			return fnEdgeBrowser();
		else if(objConfig.browserType==GlobalConfig.BrowserType.FIREFOX)
			return fnFirefoxBrowser();
		else if(objConfig.browserType==GlobalConfig.BrowserType.SAFARI)
			return fnSafariBrowser();
		else
			return fnChromeBrowser();
	}
}

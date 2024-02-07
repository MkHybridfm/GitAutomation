package sg.mcqautomation.config;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import sg.mcqautomation.utilities.FileUtilities;

public class GlobalConfig {

	public ApplicationType applicationType;
	public BrowserType browserType;
	public OSType osType;
	public ExecutionProvider executionProvider;
	public ExecutionEnvironment executionEnvironment;
	public int DriverTimeOut;
	public int WaitTimeOut;
	public int FluentWaitTimeOut;
	public String JIRA_URL;
	public String JIRA_USERID;
	public String JIRA_USER_PASSWORD;
	public String JIRA_PROJECT;
	public String JIRA_ASSIGNEE;
	public boolean JIRA_ISSUE;
	public String username;
	public String password;
	public String appURL;
	public String appURL_LifeStyle;
	public String appURL_Luxry;
	public String BrowserStackName;
	public String BrowserStackKey;
	public String BSAndroidAppName;
	public String BSAndroidBuildName;
	public String BSIOSAppName;
	public String BSIOSBuildName;
	public String BSProject;
	public String BSDevice;
	public String BSOSVersion;	
	public String BSTestID;
	public String BSWebBuildName;
	public String BSWebBrowser;
	public String BSPlatformVersion;
	public String BSGeoLocation;
	public boolean BSLocation;
	public String DeviceName;
	public String RESET;
	public String FULL_RESET;
	public String NEWCommandTimeOut;
	public String UDID;
	public String WDA;
	public String BundleID;
	public String PackageName;
	public String AppActivity;
	public String AutoAcceptAlert;
	public String PlatformVersion;
	public String LaunchTime;
	public String AppiumServer;
	public String AppiumPort;
	public boolean StartAppiumServer;
	public String AppPath;
	public String AndroidAppName;
	public String IOSAppName;
	/**
	* Name of Function :- getGlobalConfigData 
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 
	public GlobalConfig getGlobalConfigData()
	{
		GlobalConfig objConfig=new GlobalConfig();
		objConfig.applicationType=GetApplicationType();
		objConfig.browserType=GetBrowserType();
		objConfig.osType=GetOSType();
		objConfig.executionProvider=GetExecutionProvider();
		objConfig.executionEnvironment=GetExecutionEnvironment();
		objConfig.DriverTimeOut=GetDriverTimeOut();
		objConfig.WaitTimeOut=GetWaitTimeOut();
		objConfig.FluentWaitTimeOut=GetFluentWaitTimeOut();		
		objConfig.JIRA_URL=	FileUtilities.GetValueFromPropOrPOM("JIRA_URL");
		objConfig.JIRA_USERID=	FileUtilities.GetValueFromPropOrPOM("JIRA_USERID");
		objConfig.JIRA_USER_PASSWORD=FileUtilities.GetValueFromPropOrPOM("JIRA_USER_PASSWORD");
		objConfig.JIRA_PROJECT=FileUtilities.GetValueFromPropOrPOM("JIRA_PROJECT");
		objConfig.JIRA_ASSIGNEE=FileUtilities.GetValueFromPropOrPOM("JIRA_ASSIGNEE");
		objConfig.JIRA_ISSUE=GetJIRAISSUE();
		objConfig.BrowserStackName=FileUtilities.GetValueFromPropOrPOM("BrowserStackName");
		objConfig.BrowserStackKey=FileUtilities.GetValueFromPropOrPOM("BrowserStackKey");
		objConfig.BSAndroidAppName=GetBSAndroidAppName();
		objConfig.BSAndroidBuildName=FileUtilities.GetValueFromPropOrPOM("BSAndroidBuildName");
		objConfig.BSIOSAppName=GetBSIOSAppName();
		objConfig.BSIOSBuildName=FileUtilities.GetValueFromPropOrPOM("BSIOSBuildName");
		objConfig.BSProject=GetBSProject();
		objConfig.BSDevice=GetBSDevice();
		objConfig.BSOSVersion=GetBSOSVersion();
		objConfig.BSTestID=objConfig.BSProject+"_"+FileUtilities.GetCurrentTimeStampAsString();
		objConfig.username=FileUtilities.GetValueFromPropOrPOM("username");
		objConfig.password=FileUtilities.GetValueFromPropOrPOM("password");
		objConfig.appURL=GetAppURL();
		objConfig.appURL_LifeStyle=GetAppURL_LifeStyle();
		objConfig.appURL_Luxry=GetAppURL_Luxry();
		objConfig.BSWebBuildName=GetBSWebBuildName();
		objConfig.BSWebBrowser=GetBSWebBrowser();
		objConfig.browserType=GetBSBrowsere(objConfig.browserType);
		objConfig.osType=GetBSOSType(objConfig.osType);
		objConfig.BSPlatformVersion=GetBSPlatformVersion();
		objConfig.BSGeoLocation=GetBSGeoLocation();
		objConfig.BSLocation=GetBSLocation();
		objConfig.DeviceName=FileUtilities.GetValueFromPropOrPOM("DeviceName");
		objConfig.RESET=FileUtilities.GetValueFromPropOrPOM("Reset");
		objConfig.FULL_RESET=	FileUtilities.GetValueFromPropOrPOM("FullReset");
		objConfig.NEWCommandTimeOut=FileUtilities.GetValueFromPropOrPOM("NEWCommandTimeOut");
		objConfig.UDID=FileUtilities.GetValueFromPropOrPOM("UDID");
		objConfig.WDA=FileUtilities.GetValueFromPropOrPOM("WDA");
		objConfig.BundleID=FileUtilities.GetValueFromPropOrPOM("BundleID");
		objConfig.PackageName=FileUtilities.GetValueFromPropOrPOM("PackageName");
		objConfig.AppActivity=FileUtilities.GetValueFromPropOrPOM("AppActivity");
		objConfig.AutoAcceptAlert=GetAutoAcceptAlert();
		objConfig.PlatformVersion=FileUtilities.GetValueFromPropOrPOM("PlatformVersion");
		objConfig.LaunchTime=GetLaunchTime();
		objConfig.AppiumServer=GetAppiumServer();
		objConfig.AppiumPort=GetAppiumPort();
		objConfig.StartAppiumServer=StartAppiumServer();
		objConfig.AppPath=FileUtilities.GetValueFromPropOrPOM("AppPath");
		objConfig.AndroidAppName=FileUtilities.GetValueFromPropOrPOM("AndroidAppName");
		objConfig.IOSAppName=FileUtilities.GetValueFromPropOrPOM("IOSAppName");
		return objConfig;
	}
	/**
	 * Name of Enum :- ApplicationType
	 * Class Name :- GlobalConfig
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-15-Feb-2022
	 */
	public enum ApplicationType
	{
		WEB,
		PWA,
		ANDROID_APP,
		ANDROID_WEB,
		IOS_APP,
		IOS_WEB,
		API;
	}
	/**
	 * Name of Enum :- BrowserType
	 * Class Name :- GlobalConfig
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-15-Feb-2022
	 */
	public enum BrowserType
	{
		CHROME,
		FIREFOX,
		EDGE,
		SAFARI;
	}
	/**
	 * Name of Enum :- OSType
	 * Class Name :- GlobalConfig
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-15-Feb-2022
	 */
	public enum OSType
	{
		Windows,
		Linux,
		Mac;
	}
	/**
	 * Name of Enum :- ExecutionProvider
	 * Class Name :- GlobalConfig
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-15-Feb-2022
	 */
	public enum ExecutionProvider
	{
		Local,
		Grid,
		Browserstack;
	}
	/**
	 * Name of Enum :- ExecutionEnvironment
	 * Class Name :- GlobalConfig
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-15-Feb-2022
	 */
	public enum ExecutionEnvironment
	{
		Dev,
		QA,
		Stage,
		Prod;
	}

	/**
	* Name of Function :- GetJIRAISSUE 
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 
	public boolean GetJIRAISSUE()
	{
		return FileUtilities.GetValueFromPropOrPOM("JIRA_ISSUE").toLowerCase().contains("true") ? true:false;
	}


	/**
	* Name of Function :-  GetDriverTimeOut
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 
	public int GetDriverTimeOut()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("DriverTimeOut");
		if(!strValue.isEmpty())
			return Integer.parseInt(strValue);
		else
			return 20;		
	}
	/**
	* Name of Function :-  GetWaitTimeOut
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 
	public int GetWaitTimeOut()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("WaitTimeOut");
		if(!strValue.isEmpty())
			return Integer.parseInt(strValue);
		else
			return 20;		
	}
	/**
	* Name of Function :-  GetFluentWaitTimeOut
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 
	public int GetFluentWaitTimeOut()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("FluentWaitTimeOut");
		if(!strValue.isEmpty())
			return Integer.parseInt(strValue);
		else
			return 20;		
	}
	/**
	* Name of Function :-  GetExecutionEnvironment
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 	
	public ExecutionEnvironment GetExecutionEnvironment()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("ExecutionEnvironment");
		if(strValue.toLowerCase().startsWith("dev"))
			return ExecutionEnvironment.Dev;
		else if(strValue.toLowerCase().startsWith("stage"))
			return ExecutionEnvironment.Stage;
		else if(strValue.toLowerCase().startsWith("prod"))
			return ExecutionEnvironment.Prod;
		else if(strValue.toLowerCase().startsWith("pre"))
			return ExecutionEnvironment.QA;
		else
			return ExecutionEnvironment.QA;		
	}
	/**
	* Name of Function :-  GetExecutionProvider
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 
	public ExecutionProvider GetExecutionProvider()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("ExecutionProvider");
		if(strValue.toLowerCase().contains("grid"))
			return ExecutionProvider.Grid;
		else if(strValue.toLowerCase().contains("browserstack"))
			return ExecutionProvider.Browserstack;
		else
			return ExecutionProvider.Local;			
	}
	/**
	* Name of Function :-  GetOSType
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 
	public OSType GetOSType()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("OSType");
		if(strValue.toLowerCase().contains("linux"))
			return OSType.Linux;
		else if(strValue.toLowerCase().contains("mac"))
			return OSType.Mac;
		else
			return OSType.Windows;			
	}
	/**
	* Name of Function :-  GetBrowserType
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 
	public BrowserType GetBrowserType()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("BrowserType");
		if(strValue.toLowerCase().contains("safari"))
			return BrowserType.SAFARI;
		else if(strValue.toLowerCase().contains("firefox"))
			return BrowserType.FIREFOX;
		else if(strValue.toLowerCase().contains("edge"))
			return BrowserType.EDGE;
		else
			return BrowserType.CHROME;			
	}
	/**
	* Name of Function :-  GetApplicationType
	* Class Name :- GlobalConfig 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/ 
	public ApplicationType GetApplicationType()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("ApplicationType");
		if(strValue.toLowerCase().contains("android_app"))
			return ApplicationType.ANDROID_APP;
		else if(strValue.toLowerCase().contains("android_web"))
			return ApplicationType.ANDROID_WEB;
		else if(strValue.toLowerCase().contains("ios_app"))
			return ApplicationType.IOS_APP;
		else if(strValue.toLowerCase().contains("ios_web"))
			return ApplicationType.IOS_WEB;
		else
			return ApplicationType.WEB;			
	}

	/***
	* Name of Function :- GetBSAndroidAppName
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetBSAndroidAppName()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("BSAndroidAppName");
		if(!strValue.isEmpty())
		{
			if(strValue.contains("["))
			{
				String strNewValue=strValue.split("\\[")[1].replaceAll("]", "");
				return strNewValue;
			}
			else
			{
				return strValue;
			}
		}
		else
			return "";		
	}

	public static String GetBSIOSAppName()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("BSIOSAppName");
		if(!strValue.isEmpty())
		{
			if(strValue.contains("["))
			{
				String strNewValue=strValue.split("\\[")[1].replaceAll("]", "");
				return strNewValue;
			}
			else
			{
				return strValue;
			}
		}
		else
			return "";	
		
	}

	/***
	* Name of Function :- GetBSProject()
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetBSProject()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("BSProject");
		String strAppType=FileUtilities.GetValueFromPropOrPOM("ApplicationType");
		String strBSProject=strValue+"_"+strAppType;
		return strBSProject;
	}
	
	/***
	* Name of Function :- GetBSDevice()
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetBSDevice()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("BSDevice");
		if(!strValue.isEmpty())
		{
			if(strValue.contains("["))
			{
				strValue=strValue.split("\\[")[0].replace("_", " ");
				return strValue;
			}
			else
			{
				return strValue;
			}			
		}
		else
			return "";		
	}
	/***
	* Name of Function :- GetBSOSVersion()
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-4-Feb-2022
	*/
	public static String GetBSOSVersion()
	{
		String strValueDevice=FileUtilities.GetValueFromPropOrPOM("BSDevice");
		if(strValueDevice.contains("["))
		{
			strValueDevice=strValueDevice.split("\\[")[1].replaceAll("\\]", "");
			return strValueDevice;
		}
		String strValue=FileUtilities.GetValueFromPropOrPOM("BSOSVersion");
		if(!strValue.isEmpty())
		{
			return strValue;
		}
		else
			return "";		
	}


	/***
	* Name of Function :- GetAppURL()
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-10-Oct-2022
	*/
	public String GetAppURL()
	{
		String strValue="";
		ExecutionEnvironment env=GetExecutionEnvironment();
		if(env==ExecutionEnvironment.Prod)
		{
			return FileUtilities.GetValueFromPropOrPOM("prodAppURL");
		}
		else if(env==ExecutionEnvironment.Stage)
		{
			strValue=FileUtilities.GetValueFromPropOrPOM("stageAppURL");
			String username = FileUtilities.GetValueFromPropOrPOM("auth_username");
	    	String password = FileUtilities.GetValueFromPropOrPOM("auth_password");
			String strAuthKey=GetLoginAuthenticationString(username,password);
			strValue=strValue.replace("https://", "").replace("http://", "");
			strValue=strAuthKey+strValue;
			return strValue;			
		}
		else
		{
			strValue=FileUtilities.GetValueFromPropOrPOM("qaAppURL");
			String username = FileUtilities.GetValueFromPropOrPOM("auth_username");
			String password = FileUtilities.GetValueFromPropOrPOM("auth_password");
			String strAuthKey=GetLoginAuthenticationString(username,password);
			strValue=strValue.replace("https://", "").replace("http://", "");
			strValue=strAuthKey+strValue;
			return strValue;
		}
	}
	
	/***
	* Name of Function :- GetBSWebBuildName
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-10-Oct-2022
	*/
	public static String GetBSWebBuildName()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("BSWebBuildName");
		if(!strValue.isEmpty())
			return strValue;
		else
			return "Web_Application";
	}
	/***
	* Name of Function :- GetBSWebBrowser
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-10-Oct-2022
	*/
	public String GetBSWebBrowser() {
		ExecutionProvider executionProvider=GetExecutionProvider();
		if(executionProvider==ExecutionProvider.Browserstack)
		{
			return FileUtilities.GetValueFromPropOrPOM("BSWebBrowser");
		}
		else
			return null;
	}
	/***
	* Name of Function :- GetBSOSType
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-10-Oct-2022
	*/
	public OSType GetBSOSType(OSType osName) {
		ExecutionProvider executionProvider=GetExecutionProvider();
		if(executionProvider==ExecutionProvider.Browserstack)
		{
			String strValue=FileUtilities.GetValueFromPropOrPOM("BSWebBrowser");
			if(strValue.toLowerCase().startsWith("win"))
				return OSType.Windows;
			else if(strValue.toLowerCase().startsWith("mac"))
				return OSType.Mac;
			else if(strValue.toLowerCase().startsWith("linux"))
				return OSType.Linux;
			else
				return osName;
		}
		else
			return osName;
	}
	/***
	* Name of Function :- GetBSBrowsere
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-10-Oct-2022
	*/
	public BrowserType GetBSBrowsere(BrowserType browserType) {
		ExecutionProvider executionProvider=GetExecutionProvider();
		if(executionProvider==ExecutionProvider.Browserstack)
		{
			String strValue=FileUtilities.GetValueFromPropOrPOM("BSWebBrowser");
			String strValueBrowser=strValue.split("\\[")[1].replaceAll("\\]", "");
			if(strValueBrowser.toLowerCase().contains("chrome"))
				return BrowserType.CHROME;
			else if(strValueBrowser.toLowerCase().contains("firefox"))
				return BrowserType.FIREFOX;
			else if(strValueBrowser.toLowerCase().contains("edge"))
				return BrowserType.EDGE;
			else if(strValueBrowser.toLowerCase().contains("safari"))
				return BrowserType.SAFARI;
			else
				return browserType;			
		}
		else
			return browserType;
	}
	/***
	* Name of Function :- GetBSPlatformVersion
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-10-Oct-2022
	*/
	public String GetBSPlatformVersion() {
		ExecutionProvider executionProvider=GetExecutionProvider();
		if(executionProvider==ExecutionProvider.Browserstack)
		{
			String strValue=FileUtilities.GetValueFromPropOrPOM("BSWebBrowser");
			String strValueOSVersion=strValue.split("\\[")[0].replaceAll("\\]", "");
			if(strValueOSVersion.contains("_"))
				return strValueOSVersion.split("_")[1];
			else
				return "";
		}
		else
			return "";
	}
	/***
	* Name of Function :- GetBSGeoLocation
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-2-Feb-2023
	*/
	public String GetBSGeoLocation() {
		ExecutionProvider executionProvider=GetExecutionProvider();
		if(executionProvider==ExecutionProvider.Browserstack)
			return FileUtilities.GetValueFromPropOrPOM("BSGeoLocation");
		else
			return "SG";
	}
	/***
	* Name of Function :- GetBSLocation
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-2-Feb-2023
	*/
	public boolean GetBSLocation() {
		ExecutionProvider executionProvider=GetExecutionProvider();
		if(executionProvider==ExecutionProvider.Browserstack)
		{
			String strValue="FALSE";
			strValue=FileUtilities.GetValueFromPropOrPOM("BSLocation");
			if(strValue.toLowerCase().contains("true"))
				return true;
			else
				return false;
		}
		else
			return false;
	}
	
	/***
	* Name of Function :- GetLoginAuthenticationString
	* Class Name :- GlobalConfig 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-14-APR-2023
	 * @throws UnsupportedEncodingException
	*/
	public String GetLoginAuthenticationString(String username,String password)  {
		String encode_userName ="";
		String encode_password = "";
    	try
    	{
    		encode_userName = URLEncoder.encode(username, StandardCharsets.UTF_8.toString());
    		encode_password = URLEncoder.encode(password, StandardCharsets.UTF_8.toString());
    	}
    	catch(Exception e){}
    	String URL = "https://" +encode_userName +":" +encode_password +"@";
		return URL;
	}


	/***
	 * Name of Function :- GetAutoAcceptAlert
	 * Class Name :- LocalAppiumEngine
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-4-Feb-2022
	 */
	public static String GetAutoAcceptAlert()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("AutoAcceptAlert");
		if(!strValue.isEmpty())
			return strValue;
		else
			return "true";
	}

	/***
	 * Name of Function :- GetLaunchTime
	 * Class Name :- LocalAppiumEngine
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-4-Feb-2022
	 */
	public static String GetLaunchTime()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("LaunchTime");
		if(!strValue.isEmpty())
			return strValue;
		else
			return "10000";
	}

	/***
	 * Name of Function :- GetGridServer
	 * Class Name :- LocalAppiumEngine
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-4-Feb-2022
	 */
	public static String GetAppiumServer()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("AppiumServer");
		if(!strValue.isEmpty())
			return strValue;
		else
			return "localhost";
	}
	/***
	 * Name of Function :- GetGridPort
	 * Class Name :- LocalAppiumEngine
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-4-Feb-2022
	 */
	public static String GetAppiumPort()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("AppiumPort");
		if(!strValue.isEmpty())
			return strValue;
		else
			return "4723";
	}
	/***
	 * Name of Function :- StartAppiumServer
	 * Class Name :- LocalAppiumEngine
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-4-Feb-2022
	 */
	public static boolean StartAppiumServer()
	{
		String strValue=FileUtilities.GetValueFromPropOrPOM("StartAppiumServer");
		if(!strValue.isEmpty())
			return Boolean.parseBoolean(strValue);
		else
			return true;
	}

	/***
	 * Name of Function :- GetAppURL_LifeStyle()
	 * Class Name :- GlobalConfig
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-11-Apr-2023
	 */
	public String GetAppURL_LifeStyle()
	{
		String strValue="";
		ExecutionEnvironment env=GetExecutionEnvironment();
		if(env==ExecutionEnvironment.Prod)
		{
			return FileUtilities.GetValueFromPropOrPOM("prodAppURL_LifeStyle");
		}
		else if(env==ExecutionEnvironment.Stage)
		{
			strValue=FileUtilities.GetValueFromPropOrPOM("stageAppURL_LifeStyle");
			String username = FileUtilities.GetValueFromPropOrPOM("auth_username");
			String password = FileUtilities.GetValueFromPropOrPOM("auth_password");
			String strAuthKey=GetLoginAuthenticationString(username,password);
			strValue=strValue.replace("http://", "").replace("https://", "");
			strValue=strAuthKey+strValue;
			return strValue;
		}
		else
		{
			strValue=FileUtilities.GetValueFromPropOrPOM("qaAppURL_LifeStyle");
			String username = FileUtilities.GetValueFromPropOrPOM("auth_username");
			String password = FileUtilities.GetValueFromPropOrPOM("auth_password");
			String strAuthKey=GetLoginAuthenticationString(username,password);
			strValue=strValue.replace("http://", "").replace("https://", "");
			strValue=strAuthKey+strValue;
			return strValue;
		}
	}

	/***
	 * Name of Function :- GetAppURL_Luxry
	 * Class Name :- GlobalConfig
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-11-Apr-2023
	 */
	public String GetAppURL_Luxry()
	{
		String strValue="";
		ExecutionEnvironment env=GetExecutionEnvironment();
		if(env==ExecutionEnvironment.Prod)
		{
			return FileUtilities.GetValueFromPropOrPOM("prodAppURL_Luxry");
		}
		else if(env==ExecutionEnvironment.Stage)
		{
			strValue=FileUtilities.GetValueFromPropOrPOM("stageAppURL_Luxry");
			String username = FileUtilities.GetValueFromPropOrPOM("auth_username");
			String password = FileUtilities.GetValueFromPropOrPOM("auth_password");
			String strAuthKey=GetLoginAuthenticationString(username,password);
			strValue=strValue.replace("http://", "").replace("https://", "");
			strValue=strAuthKey+strValue;
			return strValue;
		}
		else
		{
			strValue=FileUtilities.GetValueFromPropOrPOM("qaAppURL_Luxry");
			String username = FileUtilities.GetValueFromPropOrPOM("auth_username");
			String password = FileUtilities.GetValueFromPropOrPOM("auth_password");
			String strAuthKey=GetLoginAuthenticationString(username,password);
			strValue=strValue.replace("http://", "").replace("https://", "");
			strValue=strAuthKey+strValue;
			return strValue;
		}
	}
}


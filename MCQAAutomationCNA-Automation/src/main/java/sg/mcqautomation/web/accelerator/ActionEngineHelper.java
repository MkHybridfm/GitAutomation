package sg.mcqautomation.web.accelerator;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;
import sg.mcqautomation.mobile.accelerator.MobileActionEngineHelper;

public class ActionEngineHelper {
	public RemoteWebDriver driver;
	public GlobalConfig objConfig;
	public AccessHelper accessHelper;
	public ActionHelper actionHelper;
	public AuthenticationHelper authenticationHelper;
	public BrowserAlertHelper browserAlert;
	public BrowserNavigationHelper browserNavigationHelper;
	public DropDownHelper dropDownHelper;
	public ElementHelper elementHelper;
	public IFrameHelper iframeHelper;
	public JavaScriptHelper javaScriptHelper;
	public WaitHelper waitHelper;
	public WindowSwitchHelper windowSwitchHelper;
	public MobileActionEngineHelper mobileActionEngineHelper;
	/**
	* Name of Constructor :- ActionEngineHelper 
	* Class Name :- ActionEngineHelper 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public ActionEngineHelper(RemoteWebDriver driver,GlobalConfig objConfig)
	{
		this.driver=driver;
		this.objConfig=objConfig;
		accessHelper=new AccessHelper(driver, objConfig);
		actionHelper=new ActionHelper(driver, objConfig);
		authenticationHelper=new AuthenticationHelper(driver, objConfig);
		browserAlert=new BrowserAlertHelper(driver, objConfig);
		browserNavigationHelper=new BrowserNavigationHelper(driver, objConfig);
		dropDownHelper=new DropDownHelper(driver, objConfig);
		elementHelper=new ElementHelper(driver, objConfig);
		iframeHelper=new IFrameHelper(driver, objConfig);
		javaScriptHelper=new JavaScriptHelper(driver, objConfig);
		waitHelper=new WaitHelper(driver, objConfig);
		windowSwitchHelper=new WindowSwitchHelper(driver, objConfig);
		if(objConfig.applicationType!=ApplicationType.WEB)
			mobileActionEngineHelper=new MobileActionEngineHelper(driver, objConfig);
	}
}

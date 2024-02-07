package sg.mcqautomation.mobile.accelerator;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.config.GlobalConfig;

public class MobileActionEngineHelper {

	public MobileContextHelper mobileContextHelper;
	public MobileDeviceHelper mobileDeviceHelper;
	public MobileElementHelper mobileElementHelper;
	public MobileExecuteMobileCommandHelper mobileExecuteMobileCommandHelper;
	public MobileInteractionHelper mobileInteractionHelper;
	public MobileSessionHelper mobileSessionHelper;
	public MobileStatusHelper mobileStatusHelper;
	public MobileWebHelper mobileWebHelper;
	/**
	* Name of Constructor :- MobileActionEngineHelper 
	* Class Name :- MobileActionEngineHelper 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public MobileActionEngineHelper(RemoteWebDriver driver,GlobalConfig objConfig)
	{
		mobileContextHelper=new MobileContextHelper(driver,objConfig);
		mobileDeviceHelper=new MobileDeviceHelper(driver,objConfig);
		mobileElementHelper=new MobileElementHelper(driver,objConfig);
		mobileExecuteMobileCommandHelper=new MobileExecuteMobileCommandHelper(driver,objConfig);
		mobileInteractionHelper=new MobileInteractionHelper(driver,objConfig);
		mobileSessionHelper=new MobileSessionHelper(driver,objConfig);
		mobileStatusHelper=new MobileStatusHelper(driver,objConfig);
		mobileWebHelper=new MobileWebHelper(driver,objConfig);
	}
	
}

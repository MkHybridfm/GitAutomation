package sg.mcqautomation.applocatos.config;
import org.openqa.selenium.By;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.driverfactory.DriverFactory;

public class AppLocator {
	
	/**
	* Name of Function :- GetLocator 
	* Class Name :- AppLocator 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/ 
	
	public static By GetLocator(AppLocatorType... appLocatorType)
	{
		GlobalConfig objConfig=DriverFactory.getGlobalConfig();
		for(int i=0;i<appLocatorType.length;i++)
		{
			AppLocatorType objLocType=appLocatorType[i];
			if(objConfig.applicationType==objLocType.AppType)
			{
				return objLocType.locStategy;
			}
		}
		return null; 
	}
}

package sg.mcqautomation.applocatos.config;
import org.openqa.selenium.By;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;

public class AppLocatorType {

	public By locStategy;
	public ApplicationType AppType;
	
	/**
	* Name of Enum :- LocatorStrategy 
	* Class Name :- AppLocatorType 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public enum LocatorStrategy
	{
		ID,
		XPATH,
		PartialLinkText,
		LinkText,
		ClassName,
		CssSelector,
		Name,
		TagName,
		AccessibilityId,
		AndroidUIAutomator,
		Custom;		
	}
	/**
	* Name of Function :- GetLocator 
	* Class Name :- AppLocatorType 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-15-Feb-2022
	*/
	public static AppLocatorType GetLocator(ApplicationType appType,LocatorStrategy locType,String strLoc,Object... b)
	{
		AppLocatorType objAppLocType=new AppLocatorType();
		By loc=null;
		if(appType==ApplicationType.WEB)
		{
			if(locType==LocatorStrategy.ID)
				loc=By.id(strLoc);
			else if(locType==LocatorStrategy.XPATH)
				loc=By.xpath(strLoc);
			else if(locType==LocatorStrategy.PartialLinkText)
				loc=By.partialLinkText(strLoc);
			else if(locType==LocatorStrategy.LinkText)
				loc=By.linkText(strLoc);
			else if(locType==LocatorStrategy.ClassName)
				loc=By.className(strLoc);
			else if(locType==LocatorStrategy.CssSelector)
				loc=By.cssSelector(strLoc);
			else if(locType==LocatorStrategy.Name)
				loc=By.name(strLoc);
			else if(locType==LocatorStrategy.TagName)
				loc=By.tagName(strLoc);
			else if(locType==LocatorStrategy.Custom)
			{
				String strExpected=strLoc.replaceAll("%d", b[0].toString());
				loc=By.xpath(strExpected);
			}
		}
		else if(appType==ApplicationType.ANDROID_APP)
		{
			if(locType==LocatorStrategy.ID)
				loc=By.id(strLoc);
			else if(locType==LocatorStrategy.XPATH)
				loc=By.xpath(strLoc);
			else if(locType==LocatorStrategy.PartialLinkText)
				loc=By.partialLinkText(strLoc);
			else if(locType==LocatorStrategy.LinkText)
				loc=By.linkText(strLoc);
			else if(locType==LocatorStrategy.ClassName)
				loc=By.className(strLoc);
			else if(locType==LocatorStrategy.CssSelector)
				loc=By.cssSelector(strLoc);
			else if(locType==LocatorStrategy.Name)
				loc=By.name(strLoc);
			else if(locType==LocatorStrategy.TagName)
				loc=By.tagName(strLoc);
			else if(locType==LocatorStrategy.Custom)
			{
				String strExpected=strLoc.replaceAll("%d", b[0].toString());
				loc=By.xpath(strExpected);
			}
			else if(LocatorStrategy.AccessibilityId==locType.AccessibilityId)
				loc=By.id(strLoc);
		}
		else if(appType==ApplicationType.ANDROID_WEB)
		{
			if(locType==LocatorStrategy.ID)
				loc=By.id(strLoc);
			else if(locType==LocatorStrategy.XPATH)
				loc=By.xpath(strLoc);
			else if(locType==LocatorStrategy.PartialLinkText)
				loc=By.partialLinkText(strLoc);
			else if(locType==LocatorStrategy.LinkText)
				loc=By.linkText(strLoc);
			else if(locType==LocatorStrategy.ClassName)
				loc=By.className(strLoc);
			else if(locType==LocatorStrategy.CssSelector)
				loc=By.cssSelector(strLoc);
			else if(locType==LocatorStrategy.Name)
				loc=By.name(strLoc);
			else if(locType==LocatorStrategy.TagName)
				loc=By.tagName(strLoc);
			else if(locType==LocatorStrategy.Custom)
			{
				String strExpected=strLoc.replaceAll("%d", b[0].toString());
				loc=By.xpath(strExpected);
			}
		}
		else if(appType==ApplicationType.IOS_APP)
		{
			if(locType==LocatorStrategy.ID)
				loc=By.id(strLoc);
			else if(locType==LocatorStrategy.XPATH)
				loc=By.xpath(strLoc);
			else if(locType==LocatorStrategy.PartialLinkText)
				loc=By.partialLinkText(strLoc);
			else if(locType==LocatorStrategy.LinkText)
				loc=By.linkText(strLoc);
			else if(locType==LocatorStrategy.ClassName)
				loc=By.className(strLoc);
			else if(locType==LocatorStrategy.CssSelector)
				loc=By.cssSelector(strLoc);
			else if(locType==LocatorStrategy.Name)
				loc=By.name(strLoc);
			else if(locType==LocatorStrategy.TagName)
				loc=By.tagName(strLoc);
			else if(locType==LocatorStrategy.Custom)
			{
				String strExpected=strLoc.replaceAll("%d", b[0].toString());
				loc=By.xpath(strExpected);
			}
			
		}
		else if(appType==ApplicationType.IOS_WEB)
		{
			if(locType==LocatorStrategy.ID)
				loc=By.id(strLoc);
			else if(locType==LocatorStrategy.XPATH)
				loc=By.xpath(strLoc);
			else if(locType==LocatorStrategy.PartialLinkText)
				loc=By.partialLinkText(strLoc);
			else if(locType==LocatorStrategy.LinkText)
				loc=By.linkText(strLoc);
			else if(locType==LocatorStrategy.ClassName)
				loc=By.className(strLoc);
			else if(locType==LocatorStrategy.CssSelector)
				loc=By.cssSelector(strLoc);
			else if(locType==LocatorStrategy.Name)
				loc=By.name(strLoc);
			else if(locType==LocatorStrategy.TagName)
				loc=By.tagName(strLoc);
			else if(locType==LocatorStrategy.Custom)
			{
				String strExpected=strLoc.replaceAll("%d", b[0].toString());
				loc=By.xpath(strExpected);
			}
		}
		else if(appType==ApplicationType.PWA)
		{
			if(locType==LocatorStrategy.ID)
				loc=By.id(strLoc);
			else if(locType==LocatorStrategy.XPATH)
				loc=By.xpath(strLoc);
			else if(locType==LocatorStrategy.PartialLinkText)
				loc=By.partialLinkText(strLoc);
			else if(locType==LocatorStrategy.LinkText)
				loc=By.linkText(strLoc);
			else if(locType==LocatorStrategy.ClassName)
				loc=By.className(strLoc);
			else if(locType==LocatorStrategy.CssSelector)
				loc=By.cssSelector(strLoc);
			else if(locType==LocatorStrategy.Name)
				loc=By.name(strLoc);
			else if(locType==LocatorStrategy.TagName)
				loc=By.tagName(strLoc);
			else if(locType==LocatorStrategy.Custom)
			{
				String strExpected=strLoc.replaceAll("%d", b[0].toString());
				loc=By.xpath(strExpected);
			}
		}
		objAppLocType.AppType=appType;
		objAppLocType.locStategy=loc;		
		return objAppLocType;
	}
	
}

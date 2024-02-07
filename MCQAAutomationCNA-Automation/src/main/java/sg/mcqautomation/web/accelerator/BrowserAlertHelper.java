package sg.mcqautomation.web.accelerator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;

public class BrowserAlertHelper {
	private RemoteWebDriver driver;
	private GlobalConfig objConfig;
	public BrowserAlertHelper(RemoteWebDriver driver,GlobalConfig objConfig)
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
	* Name of Function :- fnVerifyAlert
	* Class Name :- WebBrowserAlertHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnVerifyAlert()
	{
		boolean blnStatus=false;
		try
		{
			Alert alert=this.driver.switchTo().alert();
			if(alert!=null)
				return true;
		}
		catch(Exception e){}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnAcceptAlert
	* Class Name :- WebBrowserAlertHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnAcceptAlert()
	{
		boolean blnStatus=false;
		try
		{
			Alert alert=this.driver.switchTo().alert();
			if(alert!=null)
			{
				alert.accept();
				return true;
			}
		}
		catch(Exception e){}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnDismissAlert
	* Class Name :- WebBrowserAlertHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnDismissAlert()
	{
		boolean blnStatus=false;
		try
		{
			Alert alert=this.driver.switchTo().alert();
			if(alert!=null)
			{
				alert.dismiss();
				return true;
			}
		}
		catch(Exception e){}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnAlertSendKey
	* Class Name :- WebBrowserAlertHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnAlertSendKey(String strText)
	{
		boolean blnStatus=false;
		try
		{
			Alert alert=this.driver.switchTo().alert();
			if(alert!=null)
			{
				alert.sendKeys(strText);
				return true;
			}
		}
		catch(Exception e){}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnAlertSendKey
	* Class Name :- WebBrowserAlertHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnAlertGetText()
	{
		String strText="";
		try
		{
			Alert alert=this.driver.switchTo().alert();
			if(alert!=null)
			{
				strText=alert.getText();
				return strText;
			}
		}
		catch(Exception e){}
		return strText;
	}
}

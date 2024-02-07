package sg.mcqautomation.web.accelerator;
import java.util.Iterator;
import java.util.Set;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;

public class WindowSwitchHelper {
	public RemoteWebDriver driver;
	private GlobalConfig objConfig;
	private JavaScriptHelper jsJavaScriptHelper;
	public WindowSwitchHelper(RemoteWebDriver driver,GlobalConfig objConfig)
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
		this.jsJavaScriptHelper=new JavaScriptHelper(driver, objConfig);
		
	}
	
	/***
	* Name of Function :- fnSwitchToFrameByName
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-24-Feb-2021
	*/
	public void fnSwitchToFrameByName(String strFrameName) 
	{
		try
		{
			this.driver.switchTo().frame(strFrameName);
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnSwitchToFrameByName
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-24-Feb-2021
	*/
	public void fnSwitchToFrameByID(int intID) 
	{
		try
		{
			this.driver.switchTo().frame(intID);
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnSwitchToFrameByElement
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-24-Feb-2021
	*/
	public void fnSwitchToFrameByElement(WebElement elem)
	{
		try
		{
			this.driver.switchTo().frame(elem);
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnSwitchToParentFrame
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-24-Feb-2021
	*/
	public void fnSwitchToParentFrame()
	{
		try
		{
			this.driver.switchTo().parentFrame();
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnSwitchToDefault
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-24-Feb-2021
	*/
	public void fnSwitchToDefault() 
	{
		try
		{
			this.driver.switchTo().defaultContent();
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnSwitchToWindow
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-24-Feb-2021
	*/
	public boolean fnSwitchToWindow(String strWindowTitle)
	{
		try
		{
			   Set<String> allWindowHandles = this.driver.getWindowHandles();
		       Iterator<String> iterator = allWindowHandles.iterator();
		       // Here we will check if child window has other child windows and will fetch the heading of the child window
		       while (iterator.hasNext()) {
		           String ChildWindow = iterator.next();
		            this.driver.switchTo().window(ChildWindow);
		            if(this.driver.getTitle().equals(strWindowTitle))
		            return true;
		       }
		}
		catch(Exception e){}
		return false;
	}
	
	/***
	* Name of Function :- fnSwitchToWindowAfterClick
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-24-Feb-2021
	*/
	public boolean fnSwitchToWindowAfterClick(WebElement elem) 
	{
		try
		{
				String mainWindowHandle = this.driver.getWindowHandle();
				this.jsJavaScriptHelper.fnJSClick(elem);
				Set<String> allWindowHandles = this.driver.getWindowHandles();
				Iterator<String> iterator = allWindowHandles.iterator();
		       // Here we will check if child window has other child windows and will fetch the heading of the child window
				while (iterator.hasNext()) {
		           String ChildWindow = iterator.next();
		           System.out.println("child window ==> "+ChildWindow);
		               if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
		                this.driver.switchTo().window(ChildWindow);
		                return true;
		           }
		       }
		}
		catch(Exception e){}
	return false;
	}
	
	/***
	* Name of Function :- fnSwitchToWindowAfterClick
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-24-Feb-2021
	*/
	public boolean fnSwitchToWindowAfterClick(By loc)
	{
		try
		{
			   String mainWindowHandle = this.driver.getWindowHandle();
			   this.jsJavaScriptHelper.fnJSScrollToView(loc);
			   this.jsJavaScriptHelper.fnJSClick(loc);
			   Set<String> allWindowHandles = this.driver.getWindowHandles();
		       Iterator<String> iterator = allWindowHandles.iterator();
		       // Here we will check if child window has other child windows and will fetch the heading of the child window
		       while (iterator.hasNext()) {
		           String ChildWindow = iterator.next();
		           System.out.println("child window ==> "+ChildWindow);
		               if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
		                this.driver.switchTo().window(ChildWindow);
		                return true;
		           }
		       }
		}
		catch(Exception e){}
		return false;
	}
	
	/***
	* Name of Function :- fnGetmainWindow
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Feb-2021
	*/
	public String fnGetmainWindow()
	{
		try
		{
			String mainWindowHandle = this.driver.getWindowHandle();
			return mainWindowHandle;
		}
		catch(Exception e){return "";}
	}
		  
	/***
	* Name of Function :- fnSwitchToWindowByWindowHandle
	* Class Name :- ActionEngine 
	* Project :- Media Corp
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Feb-2021
	*/
	public void fnSwitchToWindowByWindowHandle(String strWindowHandle)
	{
		try
		{
			this.driver.switchTo().window(strWindowHandle);
		}
		catch(Exception e){}
	}
	
}

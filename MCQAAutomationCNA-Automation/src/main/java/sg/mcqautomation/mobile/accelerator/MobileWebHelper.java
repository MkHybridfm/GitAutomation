package sg.mcqautomation.mobile.accelerator;
import java.util.Set;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;

public class MobileWebHelper {

	public AppiumDriver driver;
	public GlobalConfig objConfig;
	public MobileWebHelper(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = (AppiumDriver)driver;
    	this.objConfig=objConfig;
	}
   
	/***
	 * Name of Function :- fnSetWindow
	 * Class Name :- MobileWebHelper 
	 * Project :- Media Corp 
	 * Created By :- Pankaj Kumar 
	 * Date of Creation :-3-Feb-2022
	 */
    public void fnSetWindow(String strWindowHandle)
    {
    	this.driver.switchTo().window(strWindowHandle);
    }
    
    /***
    * Name of Function :- fnCloseWindow
    * Class Name :- MobileWebHelper 
    * Project :- Media Corp 
    * Created By :- Pankaj Kumar 
    * Date of Creation :-3-Feb-2022
    */
    public void fnCloseWindow()
    {
    	this.driver.close();
    }
    
    /***
    * Name of Function :- fnGetHandle
    * Class Name :- MobileWebHelper 
    * Project :- Media Corp 
    * Created By :- Pankaj Kumar 
    * Date of Creation :-3-Feb-2022
    */
    public String fnGetHandle()
    {
    	String windowHandle = this.driver.getWindowHandle();
    	return windowHandle;
    }
    
    /***
    * Name of Function :- fnGetHandles
    * Class Name :- MobileWebHelper 
    * Project :- Media Corp 
    * Created By :- Pankaj Kumar 
    * Date of Creation :-3-Feb-2022
    */
    public Set<String> fnGetHandles()
    {
    	Set<String> windowHandles = this.driver.getWindowHandles();
    	return windowHandles;
    }
   
    /***
    * Name of Function :- fnGetTitle
    * Class Name :- MobileWebHelper 
    * Project :- Media Corp 
    * Created By :- Pankaj Kumar 
    * Date of Creation :-3-Feb-2022
    */
    public String fnGetTitle()
    {
    	String title = this.driver.getTitle();
    	return title;
    }
    
    /***
     * Name of Function :- fnGetWindowSize
     * Class Name :- MobileWebHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public Dimension fnGetWindowSize()
    {
    	Dimension windowSize = this.driver.manage().window().getSize();
    	return windowSize;
    }
    
    /***
     * Name of Function :- fnSetWindowSize
     * Class Name :- MobileWebHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnSetWindowSize(Dimension objDimension)
    {
    	this.driver.manage().window().setSize(objDimension);
    }
    
    /***
     * Name of Function :- fnGetWindowPosition
     * Class Name :- MobileWebHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public Point fnGetWindowPosition()
    {
    	 Point windowPosition = this.driver.manage().window().getPosition();
    	 return windowPosition;
    }
   
    /***
     * Name of Function :- fnSetWindowPosition
     * Class Name :- MobileWebHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnSetWindowPosition(Point objPoint)
    {
    	this.driver.manage().window().setPosition(objPoint);
    }
    
    /***
     * Name of Function :- fnMaximizeWindow
     * Class Name :- MobileWebHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnMaximizeWindow()
    {
    	 this.driver.manage().window().maximize();
    }
    
    /***
     * Name of Function :- fnGoToURL
     * Class Name :- MobileWebHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnGoToURL(String strURL)
    {
    	 this.driver.get(strURL);
    }
   /***
    * Name of Function :- fnGetCurrentURL
    * Class Name :- MobileWebHelper 
    * Project :- Media Corp 
    * Created By :- Pankaj Kumar 
    * Date of Creation :-3-Feb-2022
    */
    public String fnGetCurrentURL()
    {
    	String url = this.driver.getCurrentUrl();
    	return url;
    }
    
    /***
     * Name of Function :- fnNavigateBack
     * Class Name :- MobileWebHelper 
     * Project :- Media Corp 
     * Created By :- Pankaj Kumar 
     * Date of Creation :-3-Feb-2022
     */
    public void fnNavigateBack()
    {
    	 this.driver.navigate().back();
    }
    
  /***
   * Name of Function :- fnNavigateForward
   * Class Name :- MobileWebHelper 
   * Project :- Media Corp 
   * Created By :- Pankaj Kumar 
   * Date of Creation :-3-Feb-2022
   */
   public void fnNavigateForward()
   {
	   this.driver.navigate().forward();
   }
   
  /***
  * Name of Function :- fnRefresh
  * Class Name :- MobileWebHelper 
  * Project :- Media Corp 
  * Created By :- Pankaj Kumar 
  * Date of Creation :-3-Feb-2022
  */
  public void fnRefresh()
  {
	  this.driver.navigate().refresh();
  }
  
  /***
  * Name of Function :- fnGetAllCookies
  * Class Name :- MobileWebHelper 
  * Project :- Media Corp 
  * Created By :- Pankaj Kumar 
  * Date of Creation :-3-Feb-2022
  */
  public Set<Cookie> fnGetAllCookies()
  {
	  Set<Cookie> allcookies = this.driver.manage().getCookies();
	  return allcookies;
   }
   
  /***
   * Name of Function :- fnSetCookies
   * Class Name :- MobileWebHelper 
   * Project :- Media Corp 
   * Created By :- Pankaj Kumar 
   * Date of Creation :-3-Feb-2022
   */
  public void fnSetCookies(Cookie objCookie)
  {
	  this.driver.manage().addCookie(objCookie);
  }
  
  /***
  * Name of Function :- fnDeleteCookies
  * Class Name :- MobileWebHelper 
  * Project :- Media Corp 
  * Created By :- Pankaj Kumar 
  * Date of Creation :-3-Feb-2022
  */
  public void fnDeleteCookies(String strCookieName)
  {
	  this.driver.manage().deleteCookieNamed(strCookieName);
  }
  
  /***
  * Name of Function :- fnDeleteAllCookies
  * Class Name :- MobileWebHelper 
  * Project :- Media Corp 
  * Created By :- Pankaj Kumar 
  * Date of Creation :-3-Feb-2022
  */
  public void fnDeleteAllCookies()
  {
	  this.driver.manage().deleteAllCookies();
  }
  
  /***
  * Name of Function :- fnSwitchtoFrame
  * Class Name :- MobileWebHelper 
  * Project :- Media Corp 
  * Created By :- Pankaj Kumar 
  * Date of Creation :-3-Feb-2022
  */
  public void fnSwitchtoFrame(int intFrameID)
  {
	  this.driver.switchTo().frame(intFrameID);
  }
  
  /***
  * Name of Function :- fnSwitchtoParentFrame
  * Class Name :- MobileWebHelper 
  * Project :- Media Corp 
  * Created By :- Pankaj Kumar 
  * Date of Creation :-3-Feb-2022
  */
  public void fnSwitchtoParentFrame()
  {
	  this.driver.switchTo().parentFrame();
  }
  
  /***
  * Name of Function :- fnExecuteAsync
  * Class Name :- MobileWebHelper 
  * Project :- Media Corp 
  * Created By :- Pankaj Kumar 
  * Date of Creation :-3-Feb-2022
  */
  public void fnExecuteAsync(String strScriptName)
  {
	  ((JavascriptExecutor) this.driver).executeAsyncScript(strScriptName);
  }
  
  /***
  * Name of Function :- fnExecute
  * Class Name :- MobileWebHelper 
  * Project :- Media Corp 
  * Created By :- Pankaj Kumar 
  * Date of Creation :-3-Feb-2022
  */
   public void fnExecute(String strScriptName)
   {
	   ((JavascriptExecutor) this.driver).executeScript(strScriptName);
   }

}

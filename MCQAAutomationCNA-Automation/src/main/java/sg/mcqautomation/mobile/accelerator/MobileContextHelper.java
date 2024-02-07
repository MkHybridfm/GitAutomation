package sg.mcqautomation.mobile.accelerator;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;

public class MobileContextHelper {
	public AppiumDriver driver;
	public GlobalConfig objConfig;
	public MobileContextHelper(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = (AppiumDriver)driver;
    	this.objConfig=objConfig;
	}

	/***
	 * Name of Function :- fnGetContext
	 * Class Name :- ContextHelper
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-3-Feb-2022
	 */
   /* public String fnGetContext()
    {
//    	String context = this.driver.getContext();
//    	return context;
    }*/
	/***
	 * Name of Function :- fnGetAllContext
	 * Class Name :- ContextHelper
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-3-Feb-2022
	 */
   /* public Set<String> fnGetAllContext()
    {
    	Set<String> contextNames = this.driver.getContextHandles();
    	return contextNames;
    }*/
	/***
	 * Name of Function :- fnSetContext
	 * Class Name :- ContextHelper
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-3-Feb-2022
	 */
   /* public void fnSetContext(String strContextName)
    {
    	this.driver.context(strContextName);
    }*/
	/***
	 * Name of Function :- fnHandleAndroidChromePopup
	 * Class Name :- ContextHelper
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-9-Feb-2023
	 */
   /* public void fnHandleAndroidChromePopup() throws InterruptedException
	{
			Thread.sleep(10000);
			String webContext = ((AppiumDriver) this.driver).getContext();
			try
			{
			Set<String> contexts = ((AppiumDriver) this.driver).getContextHandles();
			   for (String context: contexts)
			   {
			    if (context.contains("NATIVE_APP"))
			    {
			           ((AppiumDriver) this.driver).context(context);
			           break;
			   }
			}
			   this.driver.findElement(By.id("com.android.chrome:id/positive_button")).click();
			}
			catch(Exception e){}
			   ((AppiumDriver) this.driver).context(webContext);
			}

}*/
}
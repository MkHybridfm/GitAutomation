package sg.mcqautomation.web.accelerator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;

public class JavaScriptHelper {
	private RemoteWebDriver driver;
	private GlobalConfig objConfig;
	private ElementHelper elementHelper;
	public JavaScriptHelper(RemoteWebDriver driver,GlobalConfig objConfig)
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
		this.elementHelper=new ElementHelper(driver, objConfig);
	}
	
	/***
	* Name of Function :- fnJSClick
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnJSClick(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				String javascript = "arguments[0].click()";      
				JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;        
				jsExecutor.executeScript(javascript, elem);   
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	/***
	* Name of Function :- fnJSClick
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnJSClick(By loc)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				WebElement elem=driver.findElement(loc);
				String javascript = "arguments[0].click()";      
				JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;        
				jsExecutor.executeScript(javascript, elem);  
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnJSType
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnJSType(WebElement elem,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				String javascript = "arguments[0].value='"+strText+"'";      
				JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;        
				jsExecutor.executeScript(javascript, elem);   
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnJSType
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnJSType(By loc,String strText)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				WebElement elem=driver.findElement(loc);
				String javascript = "arguments[0].value='"+strText+"'";         
				JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;        
				jsExecutor.executeScript(javascript, elem);  
			}
			else 
				throw new NoSuchElementException("Element Not Present");
			}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	/***
	* Name of Function :- fnJSGetText
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnJSGetText(WebElement elem)
	{
		String strText="";
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				String javascript = "arguments[0].value";      
				JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;        
				strText = (String)jsExecutor.executeScript(javascript, elem);   
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnJSGetText
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnJSGetText(By loc) 
	{
		String strText="";
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				WebElement elem=driver.findElement(loc);
				String javascript = "arguments[0].value";           
				JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;        
				strText = (String)jsExecutor.executeScript(javascript, elem);  
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnJSScrollToView
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnJSScrollToView(By loc)
	{
		try
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;   
			WebElement elem=driver.findElement(loc);
			String javascript = "arguments[0].scrollIntoView(true);";           
			jsExecutor.executeScript(javascript, elem);  
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnJSScrollToView
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-8-Mar-2022
	*/
	public void fnJSScrollToView(WebElement elem)
	{
		try
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;   
			String javascript = "arguments[0].scrollIntoView(true);";           
			jsExecutor.executeScript(javascript, elem);  
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnJSCreateAlert
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnJSCreateAlert(String strText) 
	{
		try
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;   
			jsExecutor.executeScript("alert('"+strText+"');");   
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnJSGetDomain
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnJSGetDomain()
	{
		String DomainName="";
		try
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;   
			DomainName = jsExecutor.executeScript("return document.domain;").toString();
		}
		catch(Exception e){}
		return DomainName;
	}
	
	/***
	* Name of Function :- fnJSGetTitle
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnJSGetTitle() 
	{
		String strTitle="";
		try
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;   
			strTitle = jsExecutor.executeScript("return document.title;").toString(); 
		}
		catch(Exception e){}
		return strTitle;
	}
	
	/***
	* Name of Function :- fnJSGetURL
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnJSGetURL() 
	{
		String strURL="";
		try
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;   
			strURL = jsExecutor.executeScript("return document.URL;").toString();
		}
		catch(Exception e){}
		return strURL;
	}
	
	/***
	* Name of Function :- fnJSNavigateToURL
	* Class Name :- WebJavaScriptHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnJSNavigateToURL(String strInputURL) 
	{
		String strURL="";
		try
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;   
			strURL = jsExecutor.executeScript("window.location = '"+strInputURL+"'").toString();
		}
		catch(Exception e){}
		return strURL;
	}
	/***
	 * Name of Function :- fnJSScrollToViewWithDimension
	 * Class Name :- WebJavaScriptHelper
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-28-Jan-2022
	 */
	public void fnJSScrollToViewWithDimension()
	{
		try
		{
			JavascriptExecutor jsExecutor = (JavascriptExecutor) this.driver;
			jsExecutor.executeScript("window.scrollBy(0,-200)");
		}
		catch(Exception e){}
	}
}

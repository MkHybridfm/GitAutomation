package sg.mcqautomation.web.accelerator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;

public class ActionHelper {
	private RemoteWebDriver driver;
	private GlobalConfig objConfig;
	private ElementHelper elementHelper;
	public ActionHelper(RemoteWebDriver driver,GlobalConfig objConfig)
	{
		if(objConfig.applicationType==ApplicationType.WEB)
		{
			this.driver=driver;
		}
		else
		{
			this.driver=(AppiumDriver) driver;
		}
		this.objConfig=objConfig;
		this.elementHelper=new ElementHelper(driver, objConfig);
	}
	
	/***
	* Name of Function :- fnActionType
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionType(WebElement elem,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Actions actions=new Actions(this.driver);
				actions.moveToElement(elem).sendKeys(strText).build().perform(); 
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
	* Name of Function :- fnActionType
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionType(By loc,String strText)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				WebElement elem=this.driver.findElement(loc);
				Actions actions=new Actions(driver);
				actions.moveToElement(elem).sendKeys(strText).build().perform(); 
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
	* Name of Function :- fnActionClick
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionClick(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Actions actions=new Actions(this.driver);
				actions.moveToElement(elem).click().build().perform(); 
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
	* Name of Function :- fnActionClick
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionClick(By loc)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				WebElement elem=this.driver.findElement(loc);
				Actions actions=new Actions(this.driver);
				actions.moveToElement(elem).click().build().perform(); 
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
	* Name of Function :- fnActionDoubleClick
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionDoubleClick(WebElement elem,String strText)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Actions actions=new Actions(this.driver);
				actions.moveToElement(elem).doubleClick().build().perform(); 
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
	* Name of Function :- fnActionDoubleClick
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionDoubleClick(By loc,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
			WebElement elem=this.driver.findElement(loc);
			Actions actions=new Actions(this.driver);
			actions.moveToElement(elem).doubleClick().build().perform(); 
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
	* Name of Function :- fnActionMouseMove
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionMouseMove(WebElement elem)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Actions actions=new Actions(this.driver);
				actions.moveToElement(elem).build().perform(); 
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
	* Name of Function :- fnActionMouseMove
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionMouseMove(By loc) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				WebElement elem=this.driver.findElement(loc);
				Actions actions=new Actions(this.driver);
				actions.moveToElement(elem).build().perform(); 
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
	* Name of Function :- fnActionContextClick
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionContextClick(WebElement elem,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Actions actions=new Actions(this.driver);
				actions.contextClick(elem).build().perform(); 
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
	* Name of Function :- fnActionContextClick
	* Class Name :- WebActionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnActionContextClick(By loc,String strText)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				WebElement elem=this.driver.findElement(loc);
				Actions actions=new Actions(this.driver);
				actions.contextClick(elem).build().perform(); 
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
}

package sg.mcqautomation.web.accelerator;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;

public class ElementHelper {
	private RemoteWebDriver driver;
	private GlobalConfig objConfig;
	public ElementHelper(RemoteWebDriver driver,GlobalConfig objConfig)
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
	* Name of Function :- fnIsElementPresent
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsElementPresent(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=elem.isDisplayed();
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	/***
	* Name of Function :- fnIsEnabled
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsEnabled(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=elem.isEnabled();
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnIsEnabled
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsEnabled(By loc) 
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=this.driver.findElement(loc).isEnabled();
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnIsSelected
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsSelected(WebElement elem)
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=elem.isSelected();
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnIsSelected
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsSelected(By loc)
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=this.driver.findElement(loc).isSelected();
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnIsElementPresent
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsElementPresent(By loc) 
	{
		boolean blnStatus=false;
//		try
//		{
			if(this.driver.findElements(loc).size()>0)
				blnStatus=true;
//		}
//		catch(Exception e)
//		{
//			blnStatus=false;
//		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnType
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnType(WebElement elem,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(elem))
			{
				elem.sendKeys(strText);
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
	* Name of Function :- fnClear
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnClear(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(elem))
			{
				elem.clear();
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
	* Name of Function :- fnClear
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnClear(By loc) 
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(loc))
			{
				this.driver.findElement(loc).clear();
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
	* Name of Function :- fnType
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnType(By loc,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(loc))
			{
				this.driver.findElement(loc).sendKeys(strText);
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
	* Name of Function :- fnClick
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnClick(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(elem))
			{
				elem.click();
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
	* Name of Function :- fnClick
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnClick(By loc) 
	{
		this.driver.findElement(loc).click();
		boolean blnStatus=true;
//		try
//		{
//			//if(fnIsElementPresent(loc))
//			{
//				this.driver.findElement(loc).click();
//			}
//			/*else
//				throw new ElementNotVisibleException("Element Not Present");*/
//		}
//		catch(Exception e)
//		{
//			blnStatus=false;
//		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnGetText
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetText(WebElement elem)
	{
		String strText="";
		try
		{
			if(fnIsElementPresent(elem))
			{
				strText=elem.getText();
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnGetText
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetText(By loc) 
	{
		String strText="";
//		try
//		{
			if(fnIsElementPresent(loc))
			{
				strText=this.driver.findElement(loc).getText();
			}
//			else
//				throw new ElementNotVisibleException("Element Not Present");
//		}
//		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnGetTagName
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetTagName(WebElement elem) 
	{
		String strText="";
		try
		{
			if(fnIsElementPresent(elem))
			{
				strText=elem.getTagName();
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnGetTagName
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetTagName(By loc)
	{
		String strText="";
		try
		{
			if(fnIsElementPresent(loc))
			{
				strText=this.driver.findElement(loc).getTagName();
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){ }
		return strText;
	}
	
	/***
	* Name of Function :- fnGetAttribute
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetAttribute(WebElement elem,String strAttributeName)
	{
		String strText="";
		try
		{
			if(fnIsElementPresent(elem))
			{
				strText=elem.getAttribute(strAttributeName);
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnGetAttribute
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetAttribute(By loc,String strAttributeName) 
	{
		String strText="";
		try
		{
			if(fnIsElementPresent(loc))
			{
				strText=this.driver.findElement(loc).getAttribute(strAttributeName);
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnGetCSSValue
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetCSSValue(WebElement elem,String strCSSValue)
	{
		String strText="";
		try
		{
			if(fnIsElementPresent(elem))
			{
				strText=elem.getAttribute(strCSSValue);
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnGetCSSValue
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetCSSValue(By loc,String strCSSValue) 
	{
		String strText="";
		try
		{
			if(fnIsElementPresent(loc))
			{
				strText=this.driver.findElement(loc).getAttribute(strCSSValue);
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnGetSize
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public Dimension fnGetSize(WebElement elem) 
	{
		Dimension size=null;
		try
		{
			if(fnIsElementPresent(elem))
			{
				size=elem.getSize();
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return size;
	}
	
	/***
	* Name of Function :- fnGetSize
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public Dimension fnGetSize(By loc)
	{
		Dimension size=null;
		try
		{
			if(fnIsElementPresent(loc))
			{
				size=this.driver.findElement(loc).getSize();
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return size;
	}
	
	/***
	* Name of Function :- fnGetLocation
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public Point fnGetLocation(WebElement elem) 
	{
		Point size=null;
		try
		{
			if(fnIsElementPresent(elem))
			{
				size=elem.getLocation();
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return size;
	}
	
	/***
	* Name of Function :- fnGetLocation
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public Point fnGetLocation(By loc) 
	{
		Point size=null;
		try
		{
			if(fnIsElementPresent(loc))
			{
				size=this.driver.findElement(loc).getLocation();
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return size;
	}
	/***
	* Name of Function :- fnSubmit
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnSubmit(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(elem))
			{
				elem.submit();
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
	* Name of Function :- fnSubmit
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnSubmit(By loc)
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(loc))
			{
				this.driver.findElement(loc).submit();
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
	* Name of Function :- fnIsElementDisplayed
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsElementDisplayed(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(elem))
			{
				blnStatus=elem.isDisplayed();
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
	* Name of Function :- fnIsElementDisplayed
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsElementDisplayed(By loc)
	{
		boolean blnStatus=false;
//		try
//		{
			if(fnIsElementPresent(loc))
			{
				blnStatus=this.driver.findElement(loc).isDisplayed();
			}
			else
				throw new NoSuchElementException("Element Not Present");
//		}
//		catch(Exception e)
//		{
//			blnStatus=false;
//		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnVerifyIsDisplayed
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnVerifyIsDisplayed(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=fnIsElementPresent(elem);
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnVerifyIsDisplayed
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnVerifyIsDisplayed(By loc) 
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=fnIsElementPresent(loc);
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnVerifyIsEnabled
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnVerifyIsEnabled(WebElement elem)
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=fnIsEnabled(elem);
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnVerifyIsEnabled
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnVerifyIsEnabled(By loc) 
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=fnIsEnabled(loc);
		}
		catch(Exception e)
		{
			blnStatus=false;
		}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnIsElementSelected
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsElementSelected(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(elem))
			{
				blnStatus=fnIsSelected(elem);
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
	* Name of Function :- fnIsElementSelected
	* Class Name :- WebElementHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnIsElementSelected(By loc)
	{
		boolean blnStatus=true;
		try
		{
			if(fnIsElementPresent(loc))
			{
				blnStatus=fnIsSelected(loc);
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
	* Name of Function :- fnGetListofElement
	* Class Name :- WebElementHelper
	* Project :- Media Corp
	* Created By :- Pankaj Kumar
	* Date of Creation :-1-Mar-2022
	*/
	public List<WebElement> fnGetListofElement(By loc)
	{
		List<WebElement> eleList=null;
		try
		{
			if(fnIsElementPresent(loc))
			{
				eleList=this.driver.findElements(loc);
			}
			else
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e)
		{

		}
		return eleList;
	}
	/***
	* Name of Function :- fnVerifyTextInList
	* Class Name :- WebElementHelper
	* Project :- Media Corp
	* Created By :- Pankaj Kumar
	* Date of Creation :-3-Mar-2022
	*/
	public boolean fnVerifyTextInList(List<WebElement> eleList,String strValue)
	{
		try
		{
			for(int i=0;i<eleList.size();i++)
			{
				String strText=eleList.get(i).getText();
				if(strText.toLowerCase().contains(strValue.toLowerCase()))
					return true;
			}
		}
		catch(Exception e){}
		return false;
	}



}

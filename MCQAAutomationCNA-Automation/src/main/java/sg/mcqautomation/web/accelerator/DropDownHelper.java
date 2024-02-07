package sg.mcqautomation.web.accelerator;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;

public class DropDownHelper {
	private RemoteWebDriver driver;
	private GlobalConfig objConfig;
	private ElementHelper elementHelper;
	public DropDownHelper(RemoteWebDriver driver,GlobalConfig objConfig)
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
	* Name of Function :- fnIsMultiple
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-24-Feb-2021
	*/
	public boolean fnIsMultiple(Select objSelect) 
	{
		boolean blnStatus=true;
		try
		{
			blnStatus=objSelect.isMultiple();
		}
		catch(Exception e){}
		return blnStatus;
	}
	
	/***
	* Name of Function :- fnVerifySelectOption
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public Select fnVerifySelectOption(By loc) 
	{
		Select objSelect=null;
		try
		{
			objSelect=new Select(this.driver.findElement(loc));
		}
		catch(Exception e){}
		return objSelect;
	}
	/***
	* Name of Function :- fnVerifySelectOption
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public Select fnVerifySelectOption(WebElement elem) 
	{
		Select objSelect=null;
		try
		{
			objSelect=new Select(elem);
		}
		catch(Exception e){}
		return objSelect;
	}
	
	/***
	* Name of Function :- fnGetAllOptions
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public List<WebElement> fnGetAllOptions(Select objSelect) 
	{
		List<WebElement> objElement=null;
		try
		{
			objElement=objSelect.getOptions();
		}
		catch(Exception e){}
		return objElement;
	}
	
	/***
	* Name of Function :- fnGetSelectedOption
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public String fnGetSelectedOption(Select objSelect) 
	{
		String strText="";
		try
		{
			strText=objSelect.getAllSelectedOptions().get(0).getText();
		}
		catch(Exception e){}
		return strText;
	}
	
	/***
	* Name of Function :- fnGetAllSelectedOption
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public List<String> fnGetAllSelectedOption(Select objSelect) 
	{
		List<String> objText=new ArrayList<String>();
		try
		{
			for (WebElement elem : objSelect.getAllSelectedOptions()) 
			{
				objText.add(elem.getText());
			} 
		}
		catch(Exception e){}
		return objText;
	}
	
	/***
	* Name of Function :- fnGetAllOptionsAsText
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public List<String> fnGetAllOptionsAsText(Select objSelect)
	{
		List<String> objElement=new ArrayList<String>();
		try
		{
			for (WebElement elem : objSelect.getOptions()) 
			{
				objElement.add(elem.getText());
			}
		}
		catch(Exception e){}
		return objElement;
	}
	
	/***
	* Name of Function :- fnGetOptionCount
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public int fnGetOptionCount(Select objSelect) 
	{
		int  intCount=0;
		try
		{
			intCount=objSelect.getOptions().size();
		}
		catch(Exception e){}
		return intCount;
	}
	
	/***
	* Name of Function :- fnSelectByVisibleText
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnSelectByVisibleText(By loc,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				if(objSelect!=null)
				{
					objSelect.selectByVisibleText(strText);
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnSelectByVisibleText
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnSelectByVisibleText(WebElement elem,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				if(objSelect!=null)
				{
					objSelect.selectByVisibleText(strText);
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnSelectByValue
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnSelectByValue(By loc,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				if(objSelect!=null)
				{
					objSelect.selectByVisibleText(strText);
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnSelectByValue
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnSelectByValue(WebElement elem,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				if(objSelect!=null)
				{
					objSelect.selectByVisibleText(strText);
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnSelectByValue
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnSelectByIndex(By loc,int intIndex)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				if(objSelect!=null)
				{
					objSelect.selectByIndex(intIndex);
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnSelectByValue
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnSelectByIndex(WebElement elem,int intIndex)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				if(objSelect!=null)
				{
					objSelect.selectByIndex(intIndex);
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnVerifyIsMultiple
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnVerifyIsMultiple(By loc) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnVerifyIsMultiple
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnVerifyIsMultiple(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnDeSelectAll
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnDeSelectAll(By loc) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
					if(blnStatus)
					{
						objSelect.deselectAll();
					}
				else 
					throw new NoSuchElementException("Element Not Present");
			}
			else 
				throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnDeSelectAll
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnDeSelectAll(WebElement elem) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
					if(blnStatus)
					{
						objSelect.deselectAll();
					}
					else 
						throw new NoSuchElementException("Element Not Present");
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnDeSelectByVisibleText
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnDeSelectByVisibleText(By loc,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
					if(blnStatus)
					{
						objSelect.deselectByVisibleText(strText);
					}
				else 
					throw new NoSuchElementException("Element Not Present");
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnDeSelectByVisibleText
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnDeSelectByVisibleText(WebElement elem,String strText)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
					if(blnStatus)
					{
						objSelect.deselectByVisibleText(strText);
					}
					else 
						throw new NoSuchElementException("Element Not Present");
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnDeSelectByValue
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnDeSelectByValue(By loc,String strText)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
					if(blnStatus)
					{
						objSelect.deselectByValue(strText);
					}
					else 
						throw new NoSuchElementException("Element Not Present");
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnDeSelectByValue
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnDeSelectByValue(WebElement elem,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
					if(blnStatus)
					{
						objSelect.deselectByValue(strText);
					}
				else 
					throw new NoSuchElementException("Element Not Present");
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnDeSelectByIndex
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnDeSelectByIndex(By loc,int intIndex)
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
					if(blnStatus)
					{
						objSelect.deselectByIndex(intIndex);
					}
					else 
						throw new NoSuchElementException("Element Not Present");
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnDeSelectByIndex
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnDeSelectByIndex(WebElement elem,int intIndex) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				if(objSelect!=null)
				{
					blnStatus=fnIsMultiple(objSelect);
					if(blnStatus)
					{
						objSelect.deselectByIndex(intIndex);
					}
					else 
						throw new NoSuchElementException("Element Not Present");
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnVerifySelectOptionCount
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public int fnVerifySelectOptionCount(WebElement elem) 
	{
		int intCount=0;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				intCount=fnGetOptionCount(objSelect);
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}
		catch(Exception e){}
		return intCount;
	}
	
	/***
	* Name of Function :- fnVerifySelectOptionCount
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public int fnVerifySelectOptionCount(By loc) 
	{
		int intCount=0;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				intCount=fnGetOptionCount(objSelect);
			}
			else 
				throw new NoSuchElementException("Element Not Present");
		}	
		catch(Exception e){}
		return intCount;
	}
	
	/***
	* Name of Function :- fnVerifySelecedOption
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnVerifySelecedOption(By loc,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(loc))
			{
				Select objSelect=fnVerifySelectOption(loc);
				if(objSelect!=null)
				{
					if(fnGetSelectedOption(objSelect).equalsIgnoreCase(strText.toLowerCase()))
						blnStatus=true;
					else 
						blnStatus=false;
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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
	* Name of Function :- fnVerifySelecedOption
	* Class Name :- WebDropDownHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public boolean fnVerifySelecedOption(WebElement elem,String strText) 
	{
		boolean blnStatus=true;
		try
		{
			if(this.elementHelper.fnIsElementPresent(elem))
			{
				Select objSelect=fnVerifySelectOption(elem);
				if(objSelect!=null)
				{
					if(fnGetSelectedOption(objSelect).equalsIgnoreCase(strText.toLowerCase()))
						blnStatus=true;
					else 
						blnStatus=false;
				}
				else 
					throw new NoSuchElementException("Element Not Present");
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

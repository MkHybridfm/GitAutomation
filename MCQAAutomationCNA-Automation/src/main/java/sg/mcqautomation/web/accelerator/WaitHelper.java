package sg.mcqautomation.web.accelerator;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;
import java.time.Duration;
import java.util.function.Function;

public class WaitHelper {
	private RemoteWebDriver driver;
	private GlobalConfig objConfig;
	public WaitHelper(RemoteWebDriver driver,GlobalConfig objConfig)
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
	* Name of Function :- fnWaitForElementClickable
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForElementClickable(By loc)
	{
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.elementToBeClickable(loc));
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnWaitForElementPresent
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForElementPresent(By loc) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		}
		catch(Exception e){}
	}
		
	/***
	* Name of Function :- fnWaitForalertIsPresent
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForalertIsPresent() {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.alertIsPresent());
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnWaitForelementSelectionStateToBe
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForelementSelectionStateToBe(By loc,boolean blnSelected) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.elementSelectionStateToBe(loc, blnSelected));
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnWaitForelementSelectionStateToBe
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForelementSelectionStateToBe(WebElement elem,boolean blnSelected) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.elementSelectionStateToBe(elem, blnSelected));
		}
		catch(Exception e){}
	}
		
	/***
	* Name of Function :- fnWaitForelementToBeSelected
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForelementToBeSelected(By loc) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.elementToBeSelected(loc));
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnWaitForelementToBeSelected
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForelementToBeSelected(WebElement elem) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.elementToBeSelected(elem));
		}
		catch(Exception e){}
	}
	
	
	/***
	* Name of Function :- fnWaitForframeToBeAvaliableAndSwitchToIt
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForframeToBeAvaliableAndSwitchToIt(By loc) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(loc));
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnWaitForframeToBeAvaliableAndSwitchToIt
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForframeToBeAvaliableAndSwitchToIt(WebElement elem) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(elem));
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnWaitForinvisibilityOfTheElementLocated
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForinvisibilityOfTheElementLocated(WebElement elem) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.invisibilityOf(elem));
		}
		catch(Exception e){}
	}	
	
	
	/***
	* Name of Function :- fnWaitForinvisibilityOfElementWithText
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForinvisibilityOfElementWithText(By loc,String strText) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.invisibilityOfElementWithText(loc,strText));
		}
		catch(Exception e){}
	}	
		
	/***
	* Name of Function :- fnWaitForpresenceOfAllElementsLocatedBy
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForpresenceOfAllElementsLocatedBy(By loc) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(loc));
		}
		catch(Exception e){}
	}	
	
	
	/***
	* Name of Function :- fnWaitForpresenceOfElementLocated
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForpresenceOfElementLocated(By loc) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.presenceOfElementLocated(loc));
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnWaitFortextToBePresentInElement
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitFortextToBePresentInElement(WebElement elem,String strText) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.textToBePresentInElement(elem, strText));
		}
		catch(Exception e){}
	}
		
	/***
	* Name of Function :- fnWaitFortextToBePresentInElementLocated
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitFortextToBePresentInElementLocated(By loc,String strText) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.textToBePresentInElementLocated(loc, strText));
		}
		catch(Exception e){}
	}
	
	/***
	* Name of Function :- fnWaitFortextToBePresentInElementValue
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitFortextToBePresentInElementValue(WebElement elem,String strText) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.textToBePresentInElementValue(elem, strText));
		}
		catch(Exception e){}
	}
			
	/***
	* Name of Function :- fnWaitFortitleIs
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitFortitleIs(String strText) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.titleIs(strText));
		}
		catch(Exception e){}
	}	
		
	/***
	* Name of Function :- fnWaitfortitleContains
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitfortitleContains(String strText) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.titleContains(strText));
		}
		catch(Exception e){}
	}	
		
		
	/***
	* Name of Function :- fnWaitforvisibilityOf
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForVisibilityOf(WebElement elem) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.visibilityOf(elem));
		}
		catch(Exception e){}
	}	
		
	/***
	* Name of Function :- fnWaitforvisibilityOfAllElements
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitforvisibilityOfAllElements(WebElement elem) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.visibilityOfAllElements(elem));
		}
		catch(Exception e){}
	}	
	
	/***
	* Name of Function :- fnWaitforvisibilityOfAllElementsLocatedBy
	* Class Name :- WebWaitHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-28-Jan-2022
	*/
	public void fnWaitForVisibilityOfAllElementsLocatedBy(By loc) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(loc));
		}
		catch(Exception e){}
	}

	public void fnWaitForVisibilityOf(By loc) {
		try
		{
			WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(objConfig.WaitTimeOut));
			wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		}
		catch(Exception e){}
	}
	public WebElement waitFor(final By loc){
		Wait wait = new FluentWait(this.driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);

		WebElement foo = (WebElement) wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver driver) {
				return driver.findElement(loc);
			}
		});
		return foo;
	}
}



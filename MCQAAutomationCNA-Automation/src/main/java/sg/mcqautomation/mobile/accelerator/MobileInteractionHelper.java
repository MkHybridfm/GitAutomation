package sg.mcqautomation.mobile.accelerator;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofSeconds;
import java.time.Duration;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import sg.mcqautomation.config.GlobalConfig;

public class MobileInteractionHelper {

	public AppiumDriver driver;
	public GlobalConfig objConfig;
	public MobileInteractionHelper(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = (AppiumDriver)driver;
    	this.objConfig=objConfig;
	}

	/***
	* Name of Function :- fnMoveToElement
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	 public void fnMoveToElement(WebElement element,int xOffset,int yOffset)
    {
	    Actions action = new Actions(this.driver);
	    action.moveToElement(element, xOffset, yOffset);
	    action.perform();
    }
	 
	/***
	* Name of Function :- fnMoveToElement
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	 public void fnMoveToElement(By loc,int xOffset,int yOffset)
	 {
	      WebElement element=this.driver.findElement(loc);
	      Actions action = new Actions(this.driver);
	      action.moveToElement(element, xOffset, yOffset);
	      action.perform();
	  }
	 
	 /***
	  * Name of Function :- fnActionClick
	  * Class Name :- InteractionHelper 
	  * Project :- Media Corp 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-3-Feb-2022
	  */
	   public void fnActionClick(WebElement element)
	   {
		   Actions action = new Actions(this.driver);
		   action.moveToElement(element);
		   action.click();
		   action.perform();
	   }
	   
	   /***
	   * Name of Function :- fnActionClick
	   * Class Name :- InteractionHelper 
	   * Project :- Media Corp 
	   * Created By :- Pankaj Kumar 
	   * Date of Creation :-3-Feb-2022
	   */
	   public void fnActionClick(By loc)
	   {
		   WebElement element=this.driver.findElement(loc);
		   Actions action = new Actions(this.driver);
		   action.moveToElement(element);
		   action.click();
		   action.perform();
	    }
	/***
	* Name of Function :- fnActionDoubleClick
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	 public void fnActionDoubleClick(WebElement element)
	 {
	    Actions action = new Actions(this.driver);
	    action.moveToElement(element);
	    action.doubleClick();
	    action.perform();
	  }
	 
	 /***
	 * Name of Function :- fnActionDoubleClick
	 * Class Name :- InteractionHelper 
	 * Project :- Media Corp 
	 * Created By :- Pankaj Kumar 
	 * Date of Creation :-3-Feb-2022
	 */
	 public void fnActionDoubleClick(By loc)
	 {
		 WebElement element=this.driver.findElement(loc);
	      Actions action = new Actions(this.driver);
	      action.moveToElement(element);
	      action.doubleClick();
	      action.perform();
	   }
	 
	/***
	* Name of Function :- fnActionBottomDown
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public void fnActionBottomDown(WebElement element)
	{
	    Actions action = new Actions(this.driver);
	    action.moveToElement(element);
	    action.clickAndHold();
	    action.perform();
	 }
	
	/***
	* Name of Function :- fnActionBottomDown
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public void fnActionBottomDown(By loc)
	{
			WebElement element= this.driver.findElement(loc);
			Actions action = new Actions(this.driver);
			action.moveToElement(element);
			action.clickAndHold();
			action.perform();
	  }
	  
	/***
	* Name of Function :- fnActionBottomUp
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public void fnActionBottomUp(WebElement element,int xOffset,int yOffset)
	{
		Actions action = new Actions(this.driver);
	    action.moveToElement(element);
	    action.clickAndHold();
	    action.moveToElement(element, xOffset, yOffset);
	    action.release();
	    action.perform();
	  }
	
	 /***
	 * Name of Function :- fnActionBottomUp
	 * Class Name :- InteractionHelper 
	 * Project :- Media Corp 
	 * Created By :- Pankaj Kumar 
	 * Date of Creation :-3-Feb-2022
	 */
	  public void fnActionBottomUp(By loc,int xOffset,int yOffset)
	  {
		  WebElement element= this.driver.findElement(loc);
	      Actions action = new Actions(this.driver);
	      action.moveToElement(element);
	      action.clickAndHold();
	      action.moveToElement(element, xOffset, yOffset);
	      action.release();
	      action.perform();
	  }
	  
	    
	/***
	* Name of Function :- fnActionSingleTap
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public void fnActionSingleTap(WebElement element)
	{
	    TouchAction action = new TouchAction((PerformsTouchActions) this.driver);
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
	    action.perform();
	}
	
	/***
	* Name of Function :- fnActionSingleTap
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public void fnActionSingleTap(By loc)
	{
		WebElement element= this.driver.findElement(loc);
		TouchAction action = new TouchAction((PerformsTouchActions) this.driver);
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element))).perform();
		action.perform();
	}
	
	/***
	* Name of Function :- fnActionDoubleTap
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public void fnActionDoubleTap(WebElement element)
	{
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
	}
	
	/***
	* Name of Function :- fnActionDoubleTap
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public void fnActionDoubleTap(By loc)
	{
		WebElement element=this.driver.findElement(loc);
		TouchAction action = new TouchAction((PerformsTouchActions) driver);
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)).withTapsCount(2)).perform();
	}
	
	/***
	* Name of Function :- fnActionMoveUsingXYCoordinate
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	 public void fnActionMoveUsingXYCoordinate(int intStartX,int intStartY,int intEndX,int intEndY)
	 {
		/* TouchAction action = new TouchAction(this.driver);
		 action.down(intStartX, intStartY);
		 action.move(intEndX, intEndY);
		 action.perform();*/
	 }
	 
	 /***
	* Name of Function :- fnActionTouchDownXYCoOrdinate
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	 public void fnActionTouchDownXYCoOrdinate(int intStartX,int intStartY,int intEndX,int intEndY)
	 {
	   /* TouchActions action = new TouchActions(this.driver);
	    action.down(intStartX, intStartY);
	    action.move(intEndX, intEndY);
	    action.perform();*/
	 }
	 
	/***
	* Name of Function :- fnActionTouchUp
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public void fnActionTouchUp(int intStartX,int intStartY,int intEndX,int intEndY)
	{
	  /*  TouchActions action = new TouchActions(this.driver);
	    action.down(intStartX, intStartY);
	    action.up(intEndX, intEndY);
	    action.perform();*/
	}
	
	/***
	* Name of Function :- fnActionLongPress
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	public void fnActionLongPress(WebElement element)
	{
	    /*TouchActions action = new TouchActions(this.driver);
	    action.longPress(element);
	    action.perform();*/
	}
	
	/***
	* Name of Function :- fnActionLongPress
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	 public void fnActionLongPress(By loc)
	 {
	     /* MobileElement element=(MobileElement) this.driver.findElement(loc);
	      TouchActions action = new TouchActions(this.driver);
	      action.longPress(element);
	      action.perform();*/
	 }
	 
   /***
	* Name of Function :- fnScrollScroll
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	 public void fnScrollScroll(WebElement element,int XOfset,int YOfset)
	 {
	   /* TouchActions action = new TouchActions(this.driver);
	    action.scroll(element, XOfset, YOfset);
	    action.perform();*/
	 }
	 
	 /***
	  * Name of Function :- fnScrollScroll
	  * Class Name :- InteractionHelper 
	  * Project :- Media Corp 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-3-Feb-2022
	  */
	 public void fnScrollScroll(By loc,int XOfset,int YOfset)
	 {
		/* MobileElement element=(MobileElement) this.driver.findElement(loc);
		 TouchAction action = new TouchAction(this.driver);
		 action.scroll(element, XOfset, YOfset);
		 action.perform();*/
	 }
	 
	/***
	* Name of Function :- fnActionFlick
	* Class Name :- InteractionHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*/
	 public void fnActionFlick(WebElement element,int xOffset,int yOffset,int speed)
	 {
		/* TouchActions action = new TouchActions(this.driver);
		 action.flick(element,xOffset,yOffset,speed);
		 action.perform();*/
	 }
	 
	 /***
	  * Name of Function :- fnActionFlick
	  * Class Name :- InteractionHelper 
	  * Project :- Media Corp 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-3-Feb-2022
	  */
	 public void fnActionFlick(By loc,int xOffset,int yOffset,int speed)
	 {
		/* MobileElement element=(MobileElement) this.driver.findElement(loc);
		 TouchActions action = new TouchActions(this.driver);
		 action.flick(element,xOffset,yOffset,speed);
		 action.perform();*/
	 }
	   
	/***
	* Name of Function :- fnPressByCoordinates
	* Class Name :- MobileHelper 
	* Project :- Automation  - Java 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-13-Sep-2021
	*/
	 public void fnPressByCoordinates (int x, int y, long seconds) 
	 {
	    new TouchAction((PerformsTouchActions) this.driver)
	        .press(point(x,y))
	        .waitAction(waitOptions(ofSeconds(seconds)))
	        .release()
	        .perform();
	}
	 
	/***
    * Name of Function :- fnPressByElement
    * Class Name :- MobileHelper 
	* Project :- Automation  - Java 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-13-Sep-2021
	*/
	 public  void fnPressByElement (WebElement element, long seconds)
	 {
		 new TouchAction((PerformsTouchActions) this.driver)
		 .press(element(element))
		 .waitAction(waitOptions(ofSeconds(seconds)))
		 .release()
		 .perform();
	 }
	 
	 /***
	  * Name of Function :- fnPressByElement
	  * Class Name :- MobileHelper 
	  * Project :- Automation  - Java 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-13-Sep-2021
	  */
	 public  void fnPressByElement (By loc, long seconds) 
	 {
		 WebElement element= this.driver.findElement(loc);
		 new TouchAction((PerformsTouchActions) this.driver)
	            .press(element(element))
	            .waitAction(waitOptions(ofSeconds(seconds)))
	            .release()
	            .perform();
	 }
	 
	 /***
	  * Name of Function :- fnScrollAndClick
	  * Class Name :- MobileHelper 
	  * Project :- Automation  - Java 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-13-Sep-2021
	  */
	    public  void fnScrollAndClick(String visibleText) 
	    {
	    	//((AndroidDriver) this.driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+visibleText+"\").instance(0))").click();
	    }
	    
	  /***
	   * Name of Function :- fnScrollToId
	   * Class Name :- MobileHelper 
	   * Project :- Automation  - Java 
	   * Created By :- Pankaj Kumar 
	   * Date of Creation :-13-Sep-2021
	   */
	    public  void fnScrollToId(String id) 
	    {
//	    	((AndroidDriver) this.driver).findElementByAndroidUIAutomator(
//	    			"new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView("
//	    					+ "new UiSelector().resourceIdMatches(\"" + id + "\"));");
	    }
	    
	 /***
	  * Name of Function :- fnScrollToText
	  * Class Name :- MobileHelper 
	  * Project :- Automation  - Java 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-13-Sep-2021
	  */
	    public void fnScrollToText(String text) 
	    {
//	    	((AndroidDriver) this.driver).findElementByAndroidUIAutomator("new UiScrollable("
//	    			+ "new UiSelector().scrollable(true)).scrollIntoView(" + "new UiSelector().text(\"" + text + "\"));");
	    }
	    
	    /***
	    * Name of Function :- fnSwipeScreenSmall
	    * Class Name :- MobileHelper 
	    * Project :- Automation  - Java 
	    * Created By :- Pankaj Kumar 
	    * Date of Creation :-13-Sep-2021
	    */    
	    public  void fnSwipeScreenSmall(Direction dir) 
	    {
	    	System.out.println("swipeScreenSmall(): dir: '" + dir + "'"); // always log your actions
	   // Animation default time:
	   //  - Android: 300 ms
	   //  - iOS: 200 ms
	   // final value depends on your app and could be greater
	   final int ANIMATION_TIME = 200; // ms
	   final int PRESS_TIME = 200; // ms
	   PointOption pointOptionStart, pointOptionEnd;
	   // init screen variables
	   org.openqa.selenium.Dimension dims = this.driver.manage().window().getSize();
	   // init start point = center of screen
	   pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
	   // reduce swipe move into multiplier times comparing to swipeScreen move
	   int mult = 10; // multiplier
	   switch (dir) {
	       case DOWN: // center of footer
	           pointOptionEnd = PointOption.point(dims.width / 2, (dims.height / 2) + (dims.height / 2) / mult);
	           break;
	       case UP: // center of header
	           pointOptionEnd = PointOption.point(dims.width / 2, (dims.height / 2) - (dims.height / 2) / mult);
	           break;
	       case LEFT: // center of left side
	           pointOptionEnd = PointOption.point((dims.width / 2) - (dims.width / 2) / mult, dims.height / 2);
	           break;
	       case RIGHT: // center of right side
	           pointOptionEnd = PointOption.point((dims.width / 2) + (dims.width / 2) / mult, dims.height / 2);
	           break;
	       default:
	           throw new IllegalArgumentException("swipeScreenSmall(): dir: '" + dir.toString() + "' NOT supported");
	   }

	   // execute swipe using TouchAction
	   try {
		   new TouchAction((PerformsTouchActions) this.driver)
	               .press(pointOptionStart)
	               // a bit more reliable when we add small wait
	               .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
	               .moveTo(pointOptionEnd)
	               .release().perform();
	   } catch (Exception e) {
	       System.err.println("swipeScreenSmall(): TouchAction FAILED\n" + e.getMessage());
	       return;
	   }

	   // always allow swipe action to complete
	   try {
	       Thread.sleep(ANIMATION_TIME);
	   } catch (InterruptedException e) {
	       // ignore
	   }
	}
	    
	 /***
	  * Name of Function :- Direction
	  * Class Name :- MobileHelper 
	  * Project :- Automation  - Java 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-13-Sep-2021
	  */
	    public enum Direction 
	    {
	    	UP,
	    	DOWN,
	    	LEFT,
	    	RIGHT;
	    }
	    
	/***
	 * Name of Function :- fnTapByCoordinates
	 * Class Name :- MobileHelper 
	 * Project :- Automation  - Java 
	 * Created By :- Pankaj Kumar 
	 * Date of Creation :-13-Sep-2021
	 */
	 public void fnTapByCoordinates (int x, int y, long seconds) 
	 {
	     new TouchAction((PerformsTouchActions) this.driver)
	          .tap(point(x,y))
	          .waitAction(waitOptions(ofMillis(seconds))).perform();
	 }
	 
	 /***
	  * Name of Function :- fnTapByElement
	  * Class Name :- MobileHelper 
	  * Project :- Automation  - Java 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-13-Sep-2021
	  */
	 public  void fnTapByElement(WebElement element)
	 {
	       new TouchAction((PerformsTouchActions) this.driver)
	           .tap(tapOptions().withElement(element(element)))
	           .waitAction(waitOptions(ofMillis(250))).perform();
	 }
	 
	 /***
	  * Name of Function :- fnTapByElement
	  * Class Name :- MobileHelper 
	  * Project :- Automation  - Java 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-13-Sep-2021
	  */
	 public  void fnTapByElement(By loc)
	 {
		 WebElement element=this.driver.findElement(loc);
		 new TouchAction((PerformsTouchActions) this.driver)
	           .tap(tapOptions().withElement(element(element)))
	           .waitAction(waitOptions(ofMillis(250))).perform();
	 }
	 
	 /***
	  * Name of Function :- fnscrollInsideFrameByText
	  * Class Name :- MobileHelper 
	  * Project :- Automation  - Java 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-13-Sep-2021
	  */
	 public  void fnscrollInsideFrameByText(WebElement topElement, String strText)
	 {
		 WebElement radioGroup = topElement
	     .findElement(MobileBy
	         .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
	             + "new UiSelector().text(\""+strText+"\"));"));
	}
	 
	 /***
	  * Name of Function :- fnscrollInsideFrameByID
	  * Class Name :- MobileHelper 
	  * Project :- Automation  - Java 
	  * Created By :- Pankaj Kumar 
	  * Date of Creation :-13-Sep-2021
	  */
	 public  void fnscrollInsideFrameByID(WebElement topElement, String id)
	 {
		 WebElement radioGroup = topElement
				 .findElement(MobileBy
						 .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
								 + "new UiSelector().resourceIdMatches(\""+id+"\"));"));
	 }
	 /***
	    * Name of Function :- fnSwipeScreenSmall
	    * Class Name :- MobileHelper 
	    * Project :- Automation  - Java 
	    * Created By :- Pankaj Kumar 
	    * Date of Creation :-14-Sep-2021
	    */   
	 public  void fnSwipeScreenSmall(Direction dir,int intNo)
	 {
		 for(int i=0;i<intNo;i++)
		 {
			 this.fnSwipeScreenSmall(dir);
		 }
	 }

	public boolean ScrollToElement(By loc) {
		int intLimit=30;
		boolean blnStatus=false;
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		for(int i=0;i<intLimit;i++)
		{
			if(this.driver.findElements(loc).size()>0)
			{
				blnStatus=true;
				break;
			}
			fnSwipeScreenSmall(Direction.UP, 5);
		}
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(this.objConfig.DriverTimeOut));
		//fnSwipeScreenSmall(Direction.UP, 3);
		return blnStatus;
	}

	public boolean ScrollToElement(By loc,int intLimit) {
		boolean blnStatus=false;
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		for(int i=0;i<intLimit;i++)
		{
			if(this.driver.findElements(loc).size()>0)
			{
				blnStatus=true;
				break;
			}
			fnSwipeScreenSmall(Direction.UP, 5);
		}
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(this.objConfig.DriverTimeOut));
		//fnSwipeScreenSmall(Direction.UP, 3);
		return blnStatus;
	}

	public boolean ScrollToElement(By loc,Direction dir) {
		int intLimit=25;
		boolean blnStatus=false;
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		for(int i=0;i<intLimit;i++)
		{
			if(this.driver.findElements(loc).size()>0)
			{
				blnStatus=true;
				break;
			}
			fnSwipeScreenSmall(dir, 3);
		}
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(this.objConfig.DriverTimeOut));
		//fnSwipeScreenSmall(Direction.UP, 3);
		return blnStatus;
	}
	/***
	 * Name of Function :- fnActionClick
	 * Class Name :- InteractionHelper
	 * Project :- Media Corp
	 * Created By :- Pankaj Kumar
	 * Date of Creation :-3-Feb-2022
	 */
	public void fnActionClickUsingCoOrdinate(By loc)
	{
		WebElement element= this.driver.findElement(loc);
		Point location = element.getLocation();
		TouchAction action= new TouchAction((PerformsTouchActions) driver);
		point(location.x,location.y);
		action.perform();
	}
	public  void fnSwipeScreenBig(Direction dir,int intCount)
	{
		for(int i=0;i<intCount;i++)
			fnSwipeScreenBig(dir);
	}

	public  void fnSwipeScreenBig(Direction dir)
	{
		System.out.println("swipeScreenSmall(): dir: '" + dir + "'"); // always log your actions
		// Animation default time:
		//  - Android: 300 ms
		//  - iOS: 200 ms
		// final value depends on your app and could be greater
		final int ANIMATION_TIME = 200; // ms
		final int PRESS_TIME = 200; // ms
		PointOption pointOptionStart, pointOptionEnd;
		// init screen variables
		org.openqa.selenium.Dimension dims = this.driver.manage().window().getSize();
		// init start point = center of screen
		pointOptionStart = PointOption.point(dims.width / 2, dims.height / 2);
		// reduce swipe move into multiplier times comparing to swipeScreen move
		//int mult = 10; // multiplier
		switch (dir) {
			case DOWN: // center of footer
				pointOptionEnd = PointOption.point(dims.width / 2, (dims.height / 2) + (dims.height / 2) );
				break;
			case UP: // center of header
				pointOptionEnd = PointOption.point(dims.width / 2, (dims.height / 2) - (dims.height / 2) );
				break;
			case LEFT: // center of left side
				pointOptionEnd = PointOption.point((dims.width / 2) - (dims.width / 2) , dims.height / 2);
				break;
			case RIGHT: // center of right side
				pointOptionEnd = PointOption.point((dims.width / 2) + (dims.width / 2) , dims.height / 2);
				break;
			default:
				throw new IllegalArgumentException("swipeScreenSmall(): dir: '" + dir.toString() + "' NOT supported");
		}

		// execute swipe using TouchAction
		try {
			new TouchAction((PerformsTouchActions) this.driver)
					.press(pointOptionStart)
					// a bit more reliable when we add small wait
					.waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
					.moveTo(pointOptionEnd)
					.release().perform();
		} catch (Exception e) {
			System.err.println("swipeScreenSmall(): TouchAction FAILED\n" + e.getMessage());
			return;
		}

		// always allow swipe action to complete
		try {
			Thread.sleep(ANIMATION_TIME);
		} catch (InterruptedException e) {
			// ignore
		}
	}
	}



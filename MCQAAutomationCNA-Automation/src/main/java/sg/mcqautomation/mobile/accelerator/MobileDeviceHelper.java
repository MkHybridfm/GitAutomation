package sg.mcqautomation.mobile.accelerator;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.appium.java_client.AppiumDriver;
import sg.mcqautomation.config.GlobalConfig;


public class MobileDeviceHelper {

	public AppiumDriver driver;
	public GlobalConfig objConfig;
	public MobileDeviceHelper(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = (AppiumDriver)driver;
    	this.objConfig=objConfig;
	}
	
   /* *//***
	* Name of Function :- fnStartActivity
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    *//*public void fnStartActivity(String strPackage,String strActivity)
    {
    	((AndroidDriver<WebElement>) this.driver).startActivity(new Activity(strPackage, strActivity));
    }*//*
    
    *//***
	* Name of Function :- fnGetCurrentActivity
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    *//*public String fnGetCurrentActivity()
    {
    	String activity = ((AndroidDriver) this.driver).currentActivity();
    	return activity;
    }*//*
    
    *//***
	* Name of Function :- fnGetCurrentPackage
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public String fnGetCurrentPackage()
    {
    	String strPackage = ((StartsActivity) this.driver).getCurrentPackage();
    	return strPackage;
    }
    
    *//***
	* Name of Function :- fnInstalledApp
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnInstalledApp(String strAPKPath)
    {
    	this.driver.installApp(strAPKPath);
    }
    
    *//***
	* Name of Function :- fnIsAppInstalled
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public boolean fnIsAppInstalled(String strPackage)
    {
    	return this.driver.isAppInstalled(strPackage);
    }
    
    *//***
	* Name of Function :- fnLaunchApp
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnLaunchApp()
    {
    	this.driver.launchApp();
    }
    
    *//***
	* Name of Function :- fnRunAppInBackground
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnRunAppInBackground(int intSeconds)
    {
    	this.driver.runAppInBackground(Duration.ofSeconds(intSeconds));
    }
    
    *//***
	* Name of Function :- fnCloseCloseApp
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnCloseCloseApp()
    {
    	this.driver.closeApp();
    }
	
    *//***
	* Name of Function :- fnResetApp
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnResetApp()
    {
    	this.driver.resetApp();
    }
    
    *//***
	* Name of Function :- fnRemoveApp
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnRemoveApp(String strPackage)
    {
    	this.driver.removeApp(strPackage);
    }
    
    *//***
	* Name of Function :- fnActivateApp
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnActivateApp(String strAppPackage)
    {
    	this.driver.activateApp(strAppPackage);
    }
    
    *//***
	* Name of Function :- fnTerminateApp
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnTerminateApp(String strAppPackage)
    {
    	this.driver.terminateApp(strAppPackage);
    }
    
    *//***
	* Name of Function :- fnGetAppState
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public ApplicationState fnGetAppState(String bundleID)
    {
    	ApplicationState appState=this.driver.queryAppState(bundleID);
    	return appState;
    }
   
    *//***
	* Name of Function :- fnPushFile
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnPushFile(String strLocalFileLocation,String strMobileLocation) throws IOException
    {
    	((AndroidDriver<WebElement>) this.driver).pushFile(strMobileLocation, new File(strLocalFileLocation));
    }
    
    *//***
	* Name of Function :- fnPullFile
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public byte[] fnPullFile(String strMobileLocation)
    {
    	byte[] fileBase64 = this.driver.pullFile(strMobileLocation);
    	return fileBase64;
    }
    
    *//***
	* Name of Function :- fnPullFolder
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public byte[] fnPullFolder(String strMobileFolder)
    {
	    byte[] folder = this.driver.pullFolder(strMobileFolder);
	    return folder;
    }
    
    *//***
	* Name of Function :- fnLockDevice
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnLockDevice()
    {
    	((AndroidDriver<WebElement>) this.driver).lockDevice();
    }
    
    *//***
	* Name of Function :- fnUnlockDevice
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnUnlockDevice()
    {
    	((AndroidDriver<WebElement>) this.driver).unlockDevice();
    }
    
    *//***
	* Name of Function :- fnIsLockedDevice
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public boolean fnIsLockedDevice()
    {
    	boolean isLocked =((AndroidDriver<WebElement>) this.driver).isDeviceLocked();
    	return isLocked;
    }
    
    *//***
	* Name of Function :- fnRotateDevice
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnRotateDevice(DeviceRotation objRotation)
    {
    	((AndroidDriver<WebElement>) this.driver).rotate(objRotation);
    }
   
   
    *//***
	* Name of Function :- fnHideKeyboard
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnHideKeyboard()
    {
    	this.driver.hideKeyboard();
    }
    
    *//***
	* Name of Function :- fnIsKeyboardShown
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public boolean fnIsKeyboardShown()
    {
    	boolean isKeyboardShown = ((AndroidDriver<WebElement>) this.driver).isKeyboardShown();
    	return isKeyboardShown;
    }
    
    *//***
	* Name of Function :- fnToggleAirplaneMode
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnToggleAirplaneMode()
    {
    	((AndroidDriver<WebElement>) this.driver).toggleAirplaneMode();
    }
    
    *//***
	* Name of Function :- fnToggleData
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnToggleData()
    {
    	((AndroidDriver<WebElement>) this.driver).toggleData();
    }
    
    *//***
	* Name of Function :- fnToggleWifi
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnToggleWifi()
    {
    	((AndroidDriver<WebElement>) this.driver).toggleWifi();
    }
    
     
    *//***
	* Name of Function :- fnStartScreenRecording
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnStartScreenRecording()
    {
    	((AndroidDriver<WebElement>) this.driver).startRecordingScreen();
    }
    *//***
	* Name of Function :- fnStopScreenRecording
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnStopScreenRecording()
    {
    	((AndroidDriver<WebElement>) this.driver).stopRecordingScreen();
    }
   
    *//***
	* Name of Function :- fnOpenNotifications
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public void fnOpenNotifications()
    {
    	((AndroidDriver<WebElement>) this.driver).openNotifications();
    }
   
    *//***
	* Name of Function :- fnGetDeviceTime
	* Class Name :- DeviceHelper 
	* Project :- Media Corp 
	* Created By :- Pankaj Kumar 
	* Date of Creation :-3-Feb-2022
	*//*
    public String fnGetDeviceTime()
    {
	    String time = this.driver.getDeviceTime();
	    return time;
    }*/


}

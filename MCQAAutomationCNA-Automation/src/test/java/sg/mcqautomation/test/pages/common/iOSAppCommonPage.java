package sg.mcqautomation.test.pages.common;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iOSAppCommonPage {
	public RemoteWebDriver driver;
	public GlobalConfig objConfig;
	public ActionEngineHelper action;

	public iOSAppCommonPage(RemoteWebDriver driver, GlobalConfig objConfig) {
		this.driver=driver;
		this.objConfig=objConfig;
		this.action=new ActionEngineHelper(this.driver, this.objConfig);
		this.initElements();
	}
	private By bluetoothNotification;
	private By allowNotification;
	private By allowContinueButton;
	private By allowAppTracking;
	private By allowAppTracking14;
	private By backArrowIcon;
	private By btnCloseAds;
	public void initElements()
	{
		this.bluetoothNotification=MobileAppLocator.GetLocator("OK", MobileAppLocator.MobileElementType.XCUIElementTypeButton, MobileAppLocator.ElementAttribute.visible);
		this.allowNotification=MobileAppLocator.GetLocator("Allow", MobileAppLocator.MobileElementType.XCUIElementTypeButton,MobileAppLocator.ElementAttribute.visible);
		this.allowContinueButton=MobileAppLocator.GetLocator("Continue", MobileAppLocator.MobileElementType.XCUIElementTypeButton,MobileAppLocator.ElementAttribute.visible);
		this.allowAppTracking=MobileAppLocator.GetLocator("Allow", MobileAppLocator.MobileElementType.XCUIElementTypeButton,MobileAppLocator.ElementAttribute.visible);
		this.allowAppTracking14=MobileAppLocator.GetLocator("Allow Tracking", MobileAppLocator.MobileElementType.XCUIElementTypeButton,MobileAppLocator.ElementAttribute.visible);
		this.backArrowIcon=MobileAppLocator.GetLocator("//XCUIElementTypeButton[contains(@name,'back')]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.btnCloseAds=MobileAppLocator.GetLocator("Close", MobileAppLocator.MobileElementType.XCUIElementTypeButton);
	}

	public boolean fnVerifyInfo(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeStaticText);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public boolean fnVerifyInfoVisible(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeStaticText);
		return this.action.elementHelper.fnIsElementPresent(loc);
	}

	public boolean fnVerifyButton(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeButton);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public boolean fnVerifyButtonNot(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeButton);
		return this.action.elementHelper.fnIsElementPresent(loc);
	}
	public void fnClickOnButton(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeButton, MobileAppLocator.ElementAttribute.visible);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
		this.action.elementHelper.fnClick(loc);
	}

	public void fnClickOnText(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeStaticText, MobileAppLocator.ElementAttribute.visible);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
		this.action.elementHelper.fnClick(loc);
	}

	public boolean fnVerifyImage(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeImage);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public void fnClickImage(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeImage, MobileAppLocator.ElementAttribute.visible);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
		this.action.elementHelper.fnClick(loc);
	}

	public boolean fnVerifyTextField(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeTextField);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public void fnEnterTextField(String strValue,String strText)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeTextField, MobileAppLocator.ElementAttribute.visible);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
		this.action.elementHelper.fnType(loc,strText);
	}

	public boolean fnVerifyPasswordTextField(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeSecureTextField);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public void launchApplication() throws InterruptedException {
		///Thread.sleep(15000);
		/*if (this.action.elementHelper.fnIsElementPresent(this.btnCloseAds))
			this.action.elementHelper.fnClick(this.btnCloseAds);
		if (this.action.elementHelper.fnIsElementPresent(this.allowNotification))
			this.action.elementHelper.fnClick(this.allowNotification);
		if (this.action.elementHelper.fnIsElementPresent(this.bluetoothNotification))
			this.action.elementHelper.fnClick(this.bluetoothNotification);
		if (this.action.elementHelper.fnIsElementPresent(this.btnCloseAds))
			this.action.elementHelper.fnClick(this.btnCloseAds);
		 */
	}

	public void fnHandlePopup()
	{
		/*boolean blnTracking=false;
		if(this.action.elementHelper.fnIsElementPresent(this.allowContinueButton)) {
			this.action.elementHelper.fnClick(this.allowContinueButton);
			blnTracking=true;
		}*/
		boolean blnPopup = true;
		if (this.action.elementHelper.fnIsElementPresent(this.allowAppTracking)) {
			this.action.elementHelper.fnClick(this.allowAppTracking);
			System.out.println("Click Successfully Allow Tracking");
			blnPopup = false;
		}
		if (blnPopup) {
			if (this.action.elementHelper.fnIsElementPresent(this.allowAppTracking14)) {
				this.action.elementHelper.fnClick(this.allowAppTracking14);
				System.out.println("Click Successfully Allow App Tracking");
			}
		}
	}

	public boolean fnVerifyNavigationBar(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.XCUIElementTypeNavigationBar);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public void fnClickBack()
	{
		this.action.elementHelper.fnClick(this.backArrowIcon);
	}

	public void fnSelectBottomTab(String strValue)
	{
		By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strValue+"']//..//XCUIElementTypeImage");
		this.action.elementHelper.fnClick(loc);
	}

	public void fnScrollUp()
	{
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.UP,3);
	}
}



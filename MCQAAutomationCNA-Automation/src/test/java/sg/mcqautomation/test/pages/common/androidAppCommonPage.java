package sg.mcqautomation.test.pages.common;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class androidAppCommonPage {
	public RemoteWebDriver driver;
	public GlobalConfig objConfig;
	public ActionEngineHelper action;

	public androidAppCommonPage(RemoteWebDriver driver, GlobalConfig objConfig) {
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



	public void initElements()
	{
		this.bluetoothNotification=MobileAppLocator.GetLocator("OK", MobileAppLocator.MobileElementType.AndroidButton);
		this.allowNotification=MobileAppLocator.GetLocator("Allow", MobileAppLocator.MobileElementType.AndroidButton);
		this.allowContinueButton=MobileAppLocator.GetLocator("Continue", MobileAppLocator.MobileElementType.AndroidButton);
		this.allowAppTracking=MobileAppLocator.GetLocator("Allow", MobileAppLocator.MobileElementType.AndroidButton);
		this.allowAppTracking14=MobileAppLocator.GetLocator("Allow Tracking", MobileAppLocator.MobileElementType.AndroidButton);
	}

	public boolean fnVerifyInfo(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidTextView);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public boolean fnVerifyInfoVisible(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidTextView);
		return this.action.elementHelper.fnIsElementPresent(loc);
	}

	public boolean fnVerifyButton(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidButton);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public void fnClickOnButton(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidButton);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
		this.action.elementHelper.fnClick(loc);
	}

	public void fnClickOnText(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidTextView);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
		this.action.elementHelper.fnClick(loc);
	}

	public boolean fnVerifyImage(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidImageView);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public void fnClickImage(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidImageView);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
		this.action.elementHelper.fnClick(loc);
	}

	public boolean fnVerifyTextField(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidEditText);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public void fnEnterTextField(String strValue,String strText)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidEditText, MobileAppLocator.ElementAttribute.visible);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
		this.action.elementHelper.fnType(loc,strText);
	}

	public boolean fnVerifyPasswordTextField(String strValue)
	{
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidEditText);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

	public void launchApplication() throws InterruptedException {
		Thread.sleep(15000);
		if (this.action.elementHelper.fnIsElementPresent(this.allowNotification))
			this.action.elementHelper.fnClick(this.allowNotification);
		if (this.action.elementHelper.fnIsElementPresent(this.bluetoothNotification))
			this.action.elementHelper.fnClick(this.bluetoothNotification);
	}

	public void fnHandlePopup()
	{
		boolean blnTracking=false;
		if(this.action.elementHelper.fnIsElementPresent(this.allowContinueButton)) {
			this.action.elementHelper.fnClick(this.allowContinueButton);
			blnTracking=true;
		}
		if(blnTracking) {
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

	}
	public boolean fnVerifyText(String strValue)
	{
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToText(strValue);
		By loc=MobileAppLocator.GetLocator(strValue, MobileAppLocator.MobileElementType.AndroidTextView);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc);
	}

}



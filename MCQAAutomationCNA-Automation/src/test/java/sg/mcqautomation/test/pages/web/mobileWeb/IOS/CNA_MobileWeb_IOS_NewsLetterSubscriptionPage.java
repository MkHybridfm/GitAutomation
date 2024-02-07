package sg.mcqautomation.test.pages.web.mobileWeb.IOS;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.utilities.FileUtilities;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_MobileWeb_IOS_NewsLetterSubscriptionPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;
    private IOSDriver iosDriver;

    public CNA_MobileWeb_IOS_NewsLetterSubscriptionPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.iosDriver = (IOSDriver) driver;
        this.initElements();
    }

    private By footerSection;
    private By subscribeButton;
    private By invalidErrorMessage;
    private By newsLetterCategory;
    private By emailAddressText;
    private By enterValidMailErrorMessage;
    private By successMessage;

    public void initElements() {
        this.footerSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='footer__content']"));
        this.subscribeButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='subscribe-form-wrapper']//input[@id='edit-news-letter-submit-id']"));
        this.invalidErrorMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='block-footersubscription']//div[@id[contains(.,'form-error-subscription')]]/div"));
        this.newsLetterCategory = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='block-footersubscription']//select[@id='edit-newsletter-shortcode']"));
        this.emailAddressText = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='block-footersubscription']//input[@id='edit-email']"));
        this.enterValidMailErrorMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id[contains(.,'form-error-subscription_form')]][contains(.,'Please enter a valid email address')]"));
        this.successMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.IOS_WEB, AppLocatorType.LocatorStrategy.XPATH, "//h3[contains(.,'Thank you for subscribing')]"));
    }

    public void scrollToFooterSection() throws InterruptedException {
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.UP, 2);
        Thread.sleep(1000);
        this.action.javaScriptHelper.fnJSScrollToView(iosDriver.findElement(footerSection));
        Thread.sleep(1000);
        this.action.actionHelper.fnActionMouseMove(subscribeButton);
        this.action.javaScriptHelper.fnJSScrollToView(subscribeButton);
        this.action.javaScriptHelper.fnJSScrollToView(subscribeButton);
    }

    public void clickOnSubscribeButton() throws InterruptedException {
        this.action.javaScriptHelper.fnJSClick(iosDriver.findElement(emailAddressText));
        Thread.sleep(2000);
        this.action.javaScriptHelper.fnJSClick(iosDriver.findElement(subscribeButton));
        this.action.javaScriptHelper.fnJSClick(iosDriver.findElement(subscribeButton));
        this.action.elementHelper.fnClick(iosDriver.findElement(subscribeButton));
    }

    public boolean validateInvalidErrorMessage(){
        this.action.waitHelper.waitFor(invalidErrorMessage);
        return this.action.elementHelper.fnIsElementPresent(invalidErrorMessage);
    }

    public void selectNewslettercategory(){
        this.action.dropDownHelper.fnSelectByValue(newsLetterCategory, "Morning Brief");
    }

    public void enterInvalidEmailID(){
        this.action.elementHelper.fnType(emailAddressText, "TRtgx#565@tyfgcv");
    }

    public boolean validateInvalidEmailErrorMessage(){
        this.action.waitHelper.waitFor(enterValidMailErrorMessage);
        return this.action.elementHelper.fnVerifyIsDisplayed(enterValidMailErrorMessage);
    }

    public void enterValidEmailID(){
        String strRandomValue= FileUtilities.GetCurrentTimeStampAsString();
        String email = "cna.test" + strRandomValue + "@gmail.com";
        this.action.elementHelper.fnClick(emailAddressText);
        this.action.elementHelper.fnClear(emailAddressText);
        this.action.elementHelper.fnType(emailAddressText, email);
    }

    public boolean validateSuccessMessage(){
        this.action.waitHelper.waitFor(successMessage);
        return this.action.elementHelper.fnIsElementPresent(successMessage);
    }


}

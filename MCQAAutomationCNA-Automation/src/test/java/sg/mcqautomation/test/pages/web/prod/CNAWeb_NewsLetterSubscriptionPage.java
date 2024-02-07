package sg.mcqautomation.test.pages.web.prod;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.utilities.FileUtilities;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNAWeb_NewsLetterSubscriptionPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNAWeb_NewsLetterSubscriptionPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
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
        this.footerSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='footer__content']//h2[@id='block-mc-cna-theme-socialmedialinks']"));
        this.subscribeButton = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='subscribe-form-wrapper']//input[@id='edit-news-letter-submit-id']"));
        this.invalidErrorMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='block-footersubscription']//div[@id[contains(.,'form-error-subscription')]]/div"));
        this.newsLetterCategory = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='block-footersubscription']//select[@id='edit-newsletter-shortcode']"));
        this.emailAddressText = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id='block-footersubscription']//input[@id='edit-email']"));
        this.enterValidMailErrorMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@id[contains(.,'form-error-subscription_form')]][contains(.,'Please enter a valid email address')]"));
        this.successMessage = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//h3[contains(.,'Thank you for subscribing')]"));
    }

    public void scrollToFooterSection(){
        this.action.javaScriptHelper.fnJSScrollToView(footerSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();
    }

    public void clickOnSubscribeButton() throws InterruptedException {
        this.action.actionHelper.fnActionClick(emailAddressText);
        Thread.sleep(2000);
        this.action.actionHelper.fnActionMouseMove(subscribeButton);
        Thread.sleep(1000);
        this.action.actionHelper.fnActionClick(subscribeButton);
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

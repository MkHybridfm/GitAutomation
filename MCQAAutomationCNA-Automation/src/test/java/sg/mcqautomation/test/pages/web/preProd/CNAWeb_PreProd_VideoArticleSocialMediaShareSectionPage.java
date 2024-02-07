package sg.mcqautomation.test.pages.web.preProd;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNAWeb_PreProd_VideoArticleSocialMediaShareSectionPage {

    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public CNAWeb_PreProd_VideoArticleSocialMediaShareSectionPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By shareSection;
    private By whatsappOption;
    private By telegramOption;
    private By facebookOption;
    private By twitterOption;
    private By mailOption;
    private By linkedInOption;

    public void initElements() {
        this.shareSection = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='layout__region layout__region--first']//div[@class='bookmark-share']"));
        this.whatsappOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='layout__region layout__region--first']//div[@class='bookmark-share']//span[contains(.,'WhatsApp')]"));
        this.telegramOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='layout__region layout__region--first']//div[@class='bookmark-share']//span[contains(.,'Telegram')]"));
        this.facebookOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='layout__region layout__region--first']//div[@class='bookmark-share']//span[contains(.,'Facebook')]"));
        this.twitterOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='layout__region layout__region--first']//div[@class='bookmark-share']//span[contains(.,'Twitter')]"));
        this.mailOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='layout__region layout__region--first']//div[@class='bookmark-share']//span[contains(.,'Email')]"));
        this.linkedInOption = AppLocator.GetLocator(AppLocatorType.GetLocator(GlobalConfig.ApplicationType.WEB, AppLocatorType.LocatorStrategy.XPATH, "//div[@class='layout__region layout__region--first']//div[@class='bookmark-share']//span[contains(.,'LinkedIn')]"));
    }


    public boolean ValidateSocialMediaShareOption(){
        boolean shareOptions=false;
        boolean sec1=false;
        boolean sec2=false;
        boolean sec3=false;
        boolean sec4=false;
        boolean sec5=false;
        boolean sec6=false;
        boolean sec7=false;

        this.action.javaScriptHelper.fnJSScrollToView(shareSection);
        this.action.javaScriptHelper.fnJSScrollToViewWithDimension();

        sec1 = this.action.elementHelper.fnVerifyIsDisplayed(shareSection);
        sec2 = this.action.elementHelper.fnVerifyIsDisplayed(whatsappOption);
        sec3 = this.action.elementHelper.fnVerifyIsDisplayed(telegramOption);
        sec4 = this.action.elementHelper.fnVerifyIsDisplayed(facebookOption);
        sec5 = this.action.elementHelper.fnVerifyIsDisplayed(twitterOption);
        sec6 = this.action.elementHelper.fnVerifyIsDisplayed(mailOption);
        sec7 = this.action.elementHelper.fnVerifyIsDisplayed(linkedInOption);

        if(sec1 && sec2&& sec3 && sec4 &&  sec5&& sec6 && sec7 )
            shareOptions=true;
        return shareOptions;
    }
}

package sg.mcqautomation.test.pages.app.ios.iPad;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;
import java.util.List;

public class iPadCNASettingsPage {
    private RemoteWebDriver driver;
    private GlobalConfig objConfig;
    private ActionEngineHelper action;

    public iPadCNASettingsPage(RemoteWebDriver driver, GlobalConfig objConfig) {
        this.driver = driver;
        this.objConfig = objConfig;
        this.action = new ActionEngineHelper(this.driver, this.objConfig);
        this.initElements();
    }

    private By meRewardsButton;
    private By cashBack;
    private By coupons;
    private By surveys;
    private By meRewardsSectionHeader;
    private By backButton;
    private By loginButton_searchPage;
    private By manageMeConnectButton;
    private By contentOnconformationMessage;
    private By yesButton;
    private By noButton;
    private By alertsButton;
    private By asia_AlertMeOn;
    private By singapore_AlertMeOn;
    private By world_AlertMeOn;
    private By cnaInsider_AlertMeOn;
    private By titleHeader_display;
    private By textSize_display;
    private By onlyOnWifi_display;
    private By videoAutoPlay_display;
    private By Theme_display;
    private By titleHeader_edition;
    private By singapore_edition;
    private By asia_edition;
    private By titleHeader_eyeWitness;
    private By content_eyeWitness;
    private By submitYourTip_eyeWitness;
    private By findMyLocationButton_eyeWitness;
    private By submitNewTipsButton;
    private By webUrl_helpAndFeedBack;
    private By contactUsHeader_helpAndFeedBackWebView;
    private By appVersion;
    private By appConformationMessage;
    private By cancelButton;
    private By contentHeaderOnWebView;
    private By logoutOK;
    private By logedInUserDetails;
    private By meConnectWelcome;
    private By meConnectEditYourProfile;
    private By textSizeButton;
    private By channelID;
    private By channelIDDetails;
    private By channelDCanel;
    private By channelDCopy;

    public void initElements() {
        this.logoutOK= MobileAppLocator.GetLocator("//XCUIElementTypeAlert[@name='Are you sure you want to log out?']//XCUIElementTypeButton[@name='Log out']", MobileAppLocator.MobileElementType.XCUICustomElement);

    //****
        this.meRewardsButton = MobileAppLocator.GetLocator("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.meRewardsSectionHeader = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='meRewards']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.cashBack =MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='CashBack: ']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.coupons = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Coupons:']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.surveys = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Surveys:']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.backButton = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='icon back']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.loginButton_searchPage =MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Log in']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.manageMeConnectButton = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Manage meCONNECT account']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.contentOnconformationMessage = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Do you want to change password, update personal details and more?']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.yesButton = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Yes']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.noButton = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='No']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.alertsButton = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Alerts']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.asia_AlertMeOn = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Asia']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.singapore_AlertMeOn = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Singapore']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.world_AlertMeOn = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='World']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.cnaInsider_AlertMeOn = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='CNA Insider']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.titleHeader_display =MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"Display\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.textSize_display = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Text size \"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.videoAutoPlay_display = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"Video autoplay\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.onlyOnWifi_display = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Only on Wi-Fi\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.Theme_display = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"Theme\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.titleHeader_edition = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"Edition\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.singapore_edition = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Singapore\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.asia_edition = MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name=\"Asia\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.titleHeader_eyeWitness = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"CNA Eyewitness\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.content_eyeWitness =MobileAppLocator.GetLocator( "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.findMyLocationButton_eyeWitness = MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name=\"Find my location\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.submitYourTip_eyeWitness = MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name=\"Submit Your News Tip\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.submitNewTipsButton = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Submit my news tip\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.webUrl_helpAndFeedBack = MobileAppLocator.GetLocator( "//XCUIElementTypeOther[@name='URL']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.contactUsHeader_helpAndFeedBackWebView = MobileAppLocator.GetLocator( "(//XCUIElementTypeStaticText[@name=\"Contact Us\"])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.appVersion =MobileAppLocator.GetLocator( "(//XCUIElementTypeStaticText[@name='App version']//..//XCUIElementTypeStaticText)[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.appConformationMessage = MobileAppLocator.GetLocator("(//XCUIElementTypeStaticText[@name=\"Channel Id\"])[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.cancelButton =MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Cancel\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.contentHeaderOnWebView = MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name=\"Cancel\"]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.logedInUserDetails=MobileAppLocator.GetLocator( "(//XCUIElementTypeStaticText[@name='Account']//..//XCUIElementTypeStaticText)[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.meConnectWelcome=MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[contains(@name,'Welcome')]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.meConnectEditYourProfile=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='EDIT']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.textSizeButton=MobileAppLocator.GetLocator( "//XCUIElementTypeStaticText[@name='Text size ']//..//XCUIElementTypeButton", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.channelID=MobileAppLocator.GetLocator( "//XCUIElementTypeAlert[@name='Channel Id']//XCUIElementTypeStaticText[@name='Channel Id']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.channelIDDetails=MobileAppLocator.GetLocator("(//XCUIElementTypeAlert[@name='Channel Id']//XCUIElementTypeStaticText)[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.channelDCanel=MobileAppLocator.GetLocator( "//XCUIElementTypeAlert[@name='Channel Id']//XCUIElementTypeButton[@name='Cancel']", MobileAppLocator.MobileElementType.XCUICustomElement);
        this.channelDCopy=MobileAppLocator.GetLocator( "//XCUIElementTypeAlert[@name='Channel Id']//XCUIElementTypeButton[@name='Copy']", MobileAppLocator.MobileElementType.XCUICustomElement);
    }


    public boolean validateMeRewardsSection() throws InterruptedException {
       boolean bln1=this.action.elementHelper.fnIsElementPresent(this.meRewardsSectionHeader);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.cashBack);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.coupons);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.surveys);
        boolean bln5=this.action.elementHelper.fnIsElementPresent(this.backButton);
        if(bln1 && bln2 && bln3 && bln4 && bln5)
            return true;
        return false;
    }

    public boolean VerifymeRewardsSectionHeader(){
        return this.action.elementHelper.fnIsElementPresent(this.meRewardsSectionHeader);
    }

    public boolean VerifymeRewardscashBack(){
        return this.action.elementHelper.fnIsElementPresent(this.cashBack);
    }

    public boolean VerifymeRewardscoupons(){
        return this.action.elementHelper.fnIsElementPresent(this.coupons);
    }

    public boolean VerifymeRewardssurveys(){
        return this.action.elementHelper.fnIsElementPresent(this.surveys);
    }

    public boolean VerifybackButton(){
        return this.action.elementHelper.fnIsElementPresent(this.backButton);
    }

    public void clickONMeRewardsSec(){
        this.action.elementHelper.fnClick(this.meRewardsButton);
    }

    public void clickOnBackButton(){
        this.action.elementHelper.fnClick(this.backButton);
    }

    public boolean verifyLoginButtonOnSettingsPage(){
        return this.action.elementHelper.fnIsElementPresent(this.loginButton_searchPage);
    }

    public void clickOnManageMeConnectAccount(){
        this.action.waitHelper.waitFor(this.manageMeConnectButton);
        this.action.elementHelper.fnClick(this.manageMeConnectButton);
    }

    public boolean validataConformationMessage() {
      boolean  bln1=this.action.elementHelper.fnIsElementPresent(this.contentOnconformationMessage);
      boolean bln2=this.action.elementHelper.fnIsElementPresent(this.yesButton);
      boolean bln3=this.action.elementHelper.fnIsElementPresent(this.noButton);
      if(bln1 && bln2 && bln3 )
          return true;
      return false;
    }

    public void clickOnNoButtonOnConformationMessage(){
        this.action.waitHelper.waitFor(this.noButton);
        this.action.elementHelper.fnClick(this.noButton);
    }

    public void clickOnYesButtonOnConformationMessage(){
        this.action.waitHelper.waitFor(this.yesButton);
        this.action.elementHelper.fnClick(this.yesButton);
    }

    public boolean verifyMessage(String strMessage) {
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strMessage+"']");
        return this.action.elementHelper.fnIsElementPresent(loc);
    }

    public boolean verifyMessageText(String strMessage) {
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strMessage+"']");
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc, MobileInteractionHelper.Direction.UP);
    }

    public boolean verifyMessageButton(String strMessage) {
        By loc=By.xpath("//XCUIElementTypeButton[@name='"+strMessage+"']");
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc, MobileInteractionHelper.Direction.UP);
    }

    public boolean verifyMessage(String strMessage,String strSubMenu) {
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strMessage+"']//..//XCUIElementTypeStaticText[@name='"+strSubMenu+"' and @visible ='true']");
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN,3);
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc, MobileInteractionHelper.Direction.UP);
    }

    public void SelectSubMenu(String strMessage,String strSubMenu) {
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strMessage+"']//..//XCUIElementTypeStaticText[@name='"+strSubMenu+"' and @visible ='true']");
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN,3);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(loc, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(loc);
    }

    public boolean verifyAlertOption(String strMessage) {
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strMessage+"']//..//XCUIElementTypeSwitch");
        return this.action.elementHelper.fnIsElementPresent(loc);
    }

    public void SwitchAlertOption(String strMessage,String strOption) throws InterruptedException {
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strMessage+"']//..//XCUIElementTypeSwitch");
        String strValue=this.action.elementHelper.fnGetAttribute(loc,"value");
        if(strOption.equalsIgnoreCase("ON"))
        {
            if(strValue.equalsIgnoreCase("1"))
            {
                this.action.elementHelper.fnClick(loc);
                Thread.sleep(2000);
                this.action.elementHelper.fnClick(loc);
            }
            else
            {
                this.action.elementHelper.fnClick(loc);
            }
        }
        else if(strOption.equalsIgnoreCase("OFF"))
        {
            if(strValue.equalsIgnoreCase("0"))
            {
                this.action.elementHelper.fnClick(loc);
                Thread.sleep(2000);
                this.action.elementHelper.fnClick(loc);
            }
            else
            {
                this.action.elementHelper.fnClick(loc);
            }
        }
    }

    public boolean SwitchAlertOptionVerify(String strMessage,String strOption) {
        boolean blnStatus=false;
        By loc=By.xpath("//XCUIElementTypeStaticText[@name='"+strMessage+"']//..//XCUIElementTypeSwitch");
        String strValue=this.action.elementHelper.fnGetAttribute(loc,"value");
        if(strOption.equalsIgnoreCase("ON"))
        {
            if(strValue.equalsIgnoreCase("1"))
                blnStatus=true;
            else
                blnStatus=false;
        }
        else if(strOption.equalsIgnoreCase("OFF"))
        {
            if(strValue.equalsIgnoreCase("0"))
                blnStatus=true;
            else
                blnStatus=false;
        }
        return blnStatus;
    }

    public boolean validateNotificationsPage() {
      boolean  bln1=this.action.elementHelper.fnIsElementPresent(this.alertsButton);
      boolean  bln2=this.action.elementHelper.fnIsElementPresent(this.asia_AlertMeOn);
      boolean bln3=this.action.elementHelper.fnIsElementPresent(this.singapore_AlertMeOn);
      boolean bln4=this.action.elementHelper.fnIsElementPresent(this.world_AlertMeOn);
      if(bln1 && bln2 && bln3 && bln4 )
            return true;
      return false;
    }

    public boolean validateDisplayPage() {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.titleHeader_display);
        boolean bln2=this.action.elementHelper.fnIsElementPresent(this.backButton);
        boolean bln3=this.action.elementHelper.fnIsElementPresent(this.textSize_display);
        boolean bln4=this.action.elementHelper.fnIsElementPresent(this.videoAutoPlay_display);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.onlyOnWifi_display, MobileInteractionHelper.Direction.UP);
        boolean bln5=this.action.elementHelper.fnIsElementPresent(this.onlyOnWifi_display);
        boolean bln6=this.action.elementHelper.fnIsElementPresent(this.Theme_display);
        if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6 )
            return true;
        return false;
    }

    public boolean validateEditionPage() {
      boolean  bln1=this.action.elementHelper.fnIsElementPresent(this.titleHeader_edition);
       boolean bln2=this.action.elementHelper.fnIsElementPresent(this.backButton);
       boolean bln3=this.action.elementHelper.fnIsElementPresent(this.singapore_edition);
       boolean bln4=this.action.elementHelper.fnIsElementPresent(this.asia_edition);
       if(bln1 && bln2 && bln3 && bln4 )
            return true;
       return false;
    }

    public boolean validateEyeWitnessPage() {
      boolean  bln1=this.action.elementHelper.fnIsElementPresent(this.titleHeader_eyeWitness);
      boolean  bln2=this.action.elementHelper.fnIsElementPresent(this.backButton);
       boolean bln3=this.action.elementHelper.fnIsElementPresent(this.content_eyeWitness);
       boolean bln4=this.action.elementHelper.fnIsElementPresent(this.submitYourTip_eyeWitness);
       this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.findMyLocationButton_eyeWitness, MobileInteractionHelper.Direction.UP);
       boolean bln5=this.action.elementHelper.fnIsElementPresent(this.findMyLocationButton_eyeWitness);
       this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.submitNewTipsButton, MobileInteractionHelper.Direction.UP);
       boolean bln6=this.action.elementHelper.fnIsElementPresent(this.submitNewTipsButton);
       if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6 )
            return true;
       return false;
    }

    public boolean validateWebPageUrl() throws InterruptedException {
        return this.action.elementHelper.fnGetAttribute(this.webUrl_helpAndFeedBack,"value").contains("mediacorp.sg");
    }

    public boolean validateContactUsHeaderOnWebView(){
        return this.action.elementHelper.fnIsElementPresent(this.contactUsHeader_helpAndFeedBackWebView);
    }

    public boolean validateAppVersion(){
        String strAppVersion=this.action.elementHelper.fnGetText(this.appVersion);
        if(strAppVersion.length()>3 && strAppVersion.contains("."))
            return true;
        else
            return false;
    }

    public boolean validateAppConformationMessage(){
        return this.action.elementHelper.fnIsElementPresent(this.appConformationMessage);
    }

    public void clickOnCancelButton(){
        this.action.waitHelper.waitFor(this.cancelButton);
        this.action.elementHelper.fnClick(this.cancelButton);
    }

    public boolean validateContentHeaderOnWebView(){
        return this.action.elementHelper.fnIsElementPresent(this.contentHeaderOnWebView);
    }


    public void selectSettingsOption(String strOption) {
        By locOption =By.xpath("//XCUIElementTypeStaticText[@name='"+strOption+"' and @visible ='true']");
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN,3);
        this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(locOption, MobileInteractionHelper.Direction.UP);
        this.action.elementHelper.fnClick(locOption);
    }

    public boolean verifySettingsOption(String strOption) {
        By locOption =By.xpath("//XCUIElementTypeStaticText[@name='"+strOption+"' and @visible ='true']");
        this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(MobileInteractionHelper.Direction.DOWN,3);
        return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(locOption, MobileInteractionHelper.Direction.UP);
    }

    public void LogoutPopup() {
        this.action.elementHelper.fnClick(this.logoutOK);
    }

    public boolean LogedInUserDetails() {
        if(this.action.elementHelper.fnGetText(this.logedInUserDetails).length()>5)
            return true;
        return false;
    }

    public boolean verifymeConnect() throws InterruptedException {
        Thread.sleep(60000);
        boolean  bln1=this.action.elementHelper.fnIsElementPresent(this.meConnectWelcome);
        boolean  bln2=this.action.elementHelper.fnIsElementPresent(this.meConnectEditYourProfile);
        if(bln1 && bln2)
            return true;
        else
            return false;
    }

    public boolean verifyTextSize() throws InterruptedException {
      List<WebElement> eleList=this.action.elementHelper.fnGetListofElement(this.textSizeButton);
      if(eleList.size()==5)
      {
          this.action.elementHelper.fnClick(eleList.get(0));
          Thread.sleep(3000);
          this.action.elementHelper.fnClick(eleList.get(1));
          Thread.sleep(3000);
          this.action.elementHelper.fnClick(eleList.get(2));
          Thread.sleep(3000);
          this.action.elementHelper.fnClick(eleList.get(3));
          Thread.sleep(3000);
          this.action.elementHelper.fnClick(eleList.get(4));
          Thread.sleep(3000);
          return true;
      }
      return false;
    }

    public void selectEditionOption(String strMessage) {
        By loc=By.xpath("//XCUIElementTypeButton[@name='"+strMessage+"']");
        this.action.elementHelper.fnClick(loc);
    }

    public boolean VerifyChanelIDDetails() {
        boolean bln1=this.action.elementHelper.fnIsElementPresent(this.channelID);
        boolean bln2=this.action.elementHelper.fnGetText(this.channelIDDetails).length()>7;
        if(bln1 && bln2)
            return true;
        else
            return false;
    }
    public void ChanelIDcancel() {
        this.action.elementHelper.fnClick(this.channelDCanel);
    }
}
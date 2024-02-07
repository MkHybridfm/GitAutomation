package sg.mcqautomation.test.pages.app.ios.iPad;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.MobileAppLocator;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper.Direction;
import sg.mcqautomation.utilities.FileUtilities;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class iPadCNALoginPage {
	public RemoteWebDriver driver;
	public GlobalConfig objConfig;
	public ActionEngineHelper action;
	public AppiumDriver mobdriver;

	public iPadCNALoginPage(RemoteWebDriver driver, GlobalConfig objConfig) {
		this.driver=driver;
		this.objConfig=objConfig;
		this.action=new ActionEngineHelper(this.driver, this.objConfig);
		this.initElements();
	}

	private By birth_day;
	private By birth_month;
	private By birth_year;
	private By products_policy_picker;
	private By register_third_page_next_button;
	private By gender_edittext;
	private By email_first_name;
	private By email_last_name;

	private By login_next_button;
	private By meConnectLogin;
	private By allowNotification;
	private By allowContinueButton;
	private By allowAppTracking;
	private By signInWithMeConnectButton;
	private By signInWithCreateMeConnectAccountButton;
	private By continueWithAppleAccountButton;
	private By continueWithFaceBookAccountButton;
	private By continueWithGoogleAccountButton;
	private By contentTitleOnFirstPageOfCreateAccount;
	private By BackButtonFirstPageOfCreateAccount;
	private By NextButtonFirstPageOfCreateAccount;
	private By cancelButtonOnFirstPageOfCreateAccount;
	private By logoOnFirstPageOfCreateAccount;
	private By successMessageOnCreateAccount;
	private By logInHereButton;
	private By pageIndicators;
	private By OkButtonOnSuccessMessagePage;
	private By skipButton;
	private By signInSignUp;
	private By login_email_new;
	private By login_password_new;
	private By email_password_confirm;
	private By gender_bottom_sheet_male;
	private By createAccountNext;
	private By settingsIcon;
	private By logout;
	private By accountSectionLabel;
	private By username_accountSection;
	private By meRewards_accountSection;
	private By manage_accountSection;
	private By generalSectionLabel;
	private By notifications_generalSection;
	private By display_generalSection;
	private By edition_generalSection;
	private By contactSectionLabel;
	private By cnaEyewitness_contactSection;
	private By helpAndFeedback_contactSection;
	private By advertiseWithMe_contactSection;
	private By aboutSectionLabel;
	private By mediaCorpDigitalNetwork_aboutSection;
	private By appVersion_aboutSection;
	private By channelId_aboutSection;
	private By termsOfService_aboutSection;
	private By privacyPolicy_aboutSection;
	private By closeButtonOnSignUp;
	private By luxury;
	private By lifeStyle;
	private By logoutContentMessage;
	private By submitLogoutOnContentMessage;
	private By cancelLogoutOnContentMessage;
	private By browseAllSec;
	private By topStories_BrowseAll;
	private By watch_menu;
	private By specialReports;
	private By specialReportsHeader;
	private By eyeWitness_menu;
	private By brandedContent;
	private By brandedContentHeader;
	private By doneButtonOnRegistration;
	private By allowNotificationsAndroid;

	//******
	private By email_address;
	private By email_password;



	public void initElements()
	{
		this.email_address= MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Email']//..//XCUIElementTypeTextField", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.email_password=MobileAppLocator.GetLocator("//XCUIElementTypeSecureTextField", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.createAccountNext=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Next']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.birth_day=MobileAppLocator.GetLocator( "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.birth_month=MobileAppLocator.GetLocator( "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.birth_year=MobileAppLocator.GetLocator( "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[3]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.products_policy_picker=MobileAppLocator.GetLocator( "//XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.register_third_page_next_button=MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Create Now']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.email_first_name=MobileAppLocator.GetLocator("//XCUIElementTypeCell[2]/XCUIElementTypeTextField", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.gender_edittext=MobileAppLocator.GetLocator( "//XCUIElementTypeCell[4]/XCUIElementTypeTextField", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.email_last_name=MobileAppLocator.GetLocator( "//XCUIElementTypeCell[3]/XCUIElementTypeTextField", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.gender_bottom_sheet_male=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Done']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.login_next_button=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Sign In']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.meConnectLogin=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Sign in with meconnect']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.email_password_confirm=MobileAppLocator.GetLocator( "(//XCUIElementTypeSecureTextField)[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.login_email_new=MobileAppLocator.GetLocator( "(//XCUIElementTypeTextField)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.login_password_new=MobileAppLocator.GetLocator( "(//XCUIElementTypeSecureTextField)[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.allowContinueButton=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Continue']" , MobileAppLocator.MobileElementType.XCUICustomElement);
		this.allowAppTracking=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Allow']" , MobileAppLocator.MobileElementType.XCUICustomElement);
		this.allowNotification=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Allow']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.signInSignUp=MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Don’t have an account yet? Create one now']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.skipButton=MobileAppLocator.GetLocator( "//XCUIElementTypeButton[@name='Skip']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.signInWithMeConnectButton=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Sign in with meconnect']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.signInWithCreateMeConnectAccountButton=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[contains(@name,'Create one now')]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.continueWithAppleAccountButton=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Continue with Apple']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.continueWithFaceBookAccountButton=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Continue with Facebook']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.continueWithGoogleAccountButton=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Continue with Google']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.contentTitleOnFirstPageOfCreateAccount=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Create your meconnect account']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.BackButtonFirstPageOfCreateAccount=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Back']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.NextButtonFirstPageOfCreateAccount=MobileAppLocator.GetLocator("(//XCUIElementTypeButton[@name='Next'])[1]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.cancelButtonOnFirstPageOfCreateAccount=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Cancel']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.logoOnFirstPageOfCreateAccount=MobileAppLocator.GetLocator("//XCUIElementTypeImage[contains(@name,'cna')]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.successMessageOnCreateAccount=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Thank you! Your meconnect account has been successfully created.']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.logInHereButton=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Log in here']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.pageIndicators=MobileAppLocator.GetLocator("//XCUIElementTypeApplication[@name='CNA']/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePageIndicator", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.OkButtonOnSuccessMessagePage=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='OK']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.settingsIcon=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='icon settings']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.logout=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Log out']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.accountSectionLabel=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Account']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.manage_accountSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Manage meconnect account']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.meRewards_accountSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='meRewards']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.username_accountSection=MobileAppLocator.GetLocator("//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.generalSectionLabel=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='General']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.notifications_generalSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Notifications']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.display_generalSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Display']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.edition_generalSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Edition']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.contactSectionLabel=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Contact']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.cnaEyewitness_contactSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='CNA Eyewitness']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.helpAndFeedback_contactSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Help and feedback']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.advertiseWithMe_contactSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Advertise with us']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.aboutSectionLabel=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='About']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.mediaCorpDigitalNetwork_aboutSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Mediacorp Digital Network']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.appVersion_aboutSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='App version']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.channelId_aboutSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Channel Id']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.termsOfService_aboutSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Terms of Service']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.privacyPolicy_aboutSection=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Privacy Policy']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.closeButtonOnSignUp=MobileAppLocator.GetLocator("//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.luxury=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='luxury brand icon']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.lifeStyle=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='lifestyle brand icon']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.cancelLogoutOnContentMessage=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Cancel']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.submitLogoutOnContentMessage=MobileAppLocator.GetLocator("(//XCUIElementTypeButton[@name='Log out'])[2]", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.logoutContentMessage=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Are you sure you want to log out?']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.browseAllSec=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Browse All']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.topStories_BrowseAll=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Top Stories']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.watch_menu=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Watch']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.specialReports=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Special Reports']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.specialReportsHeader=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Special Reports']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.eyeWitness_menu=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='CNA Eyewitness']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.brandedContent=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Branded Content']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.brandedContentHeader=MobileAppLocator.GetLocator("//XCUIElementTypeStaticText[@name='Branded Content']", MobileAppLocator.MobileElementType.XCUICustomElement);
		this.doneButtonOnRegistration=MobileAppLocator.GetLocator("//XCUIElementTypeButton[@name='Done']", MobileAppLocator.MobileElementType.XCUICustomElement);
	}

	public void launchApplication() {
		/*if(this.action.elementHelper.fnIsElementPresent(this.allowNotification))
			this.action.elementHelper.fnClick(this.allowNotification);
		if(this.action.elementHelper.fnIsElementPresent(this.allowContinueButton))
			this.action.elementHelper.fnClick(this.allowContinueButton);
		if(this.action.elementHelper.fnIsElementPresent(this.allowAppTracking))
			this.action.elementHelper.fnClick(this.allowAppTracking);

		 */
	   }

	public void pressLoginBtn()
	{
		this.action.elementHelper.fnClick(this.login_next_button);
	}

	public void login(String username, String password) throws InterruptedException {
		clickOnLogin();
	}


	public boolean fnGetResetPasswordInfo(String strMessage) {
		return false;
	}
	public boolean validateSignInWithMeConnectButton(){
		return this.action.elementHelper.fnIsElementPresent(this.signInWithMeConnectButton);
    }

	public boolean validateSignInWithCreateMeConnectAccountButton(){
		return this.action.elementHelper.fnIsElementPresent(this.signInWithCreateMeConnectAccountButton);
	}

	public boolean validateContinueWithAppleAccountButton(){
		return this.action.elementHelper.fnIsElementPresent(this.continueWithAppleAccountButton);
	}

	public boolean validateContinueWithFaceBookAccountButton(){
		return this.action.elementHelper.fnIsElementPresent(this.continueWithFaceBookAccountButton);
	}

	public boolean validateContinueWithGoogleAccountButton(){
		return this.action.elementHelper.fnIsElementPresent(this.continueWithGoogleAccountButton);
	}

	public void createNewMeConnectAccountButton(){
		 this.action.elementHelper.fnClick(this.signInWithCreateMeConnectAccountButton);
	}

	public boolean validateLogoOnCreateMeConnectAccountPage(){
		return this.action.elementHelper.fnIsElementPresent(this.logoOnFirstPageOfCreateAccount);
	}

	public boolean validateCancelButtonOnCreateMeConnectAccountPage(){
		return this.action.elementHelper.fnIsElementPresent(this.cancelButtonOnFirstPageOfCreateAccount);
	}

	public boolean validateContentOnCreateMeConnectAccountPage(){
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.contentTitleOnFirstPageOfCreateAccount);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.login_email_new);
		boolean bln3=this.action.elementHelper.fnIsElementPresent(this.login_password_new);
		boolean bln4=this.action.elementHelper.fnIsElementPresent(this.email_password_confirm);
		boolean bln5=this.action.elementHelper.fnIsElementPresent(this.BackButtonFirstPageOfCreateAccount);
		boolean bln6=this.action.elementHelper.fnIsElementPresent(this.NextButtonFirstPageOfCreateAccount);
		if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6)
			return true;
		return false;
	}

	public void loginCredentials() throws InterruptedException {
		this.action.elementHelper.fnType(this.email_address,objConfig.username);
		this.action.elementHelper.fnClear(this.email_password);
		Thread.sleep(5000);
		this.action.elementHelper.fnType(this.email_password, objConfig.password);
	}

	public void loginCredentialsForNewUser() throws InterruptedException {
		String strRandomValue=FileUtilities.GetCurrentTimeStampAsString();
		String email = "meListen.testautomation" + strRandomValue + "@gmail.com";
		String password = "meListen123$";
		Thread.sleep(1000);
		this.action.elementHelper.fnType(this.login_email_new,email);
		Thread.sleep(4000);
		this.action.elementHelper.fnType(this.login_password_new, password);
		this.action.elementHelper.fnType(this.email_password_confirm, password);
	}

	public void clickOnNextButtonOnFirstPageOfCreateAccount(){
		this.action.elementHelper.fnClick(this.NextButtonFirstPageOfCreateAccount);

	}

	public boolean validateContentOnCreateMeConnectAccountSecondPage(){
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.contentTitleOnFirstPageOfCreateAccount);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.email_first_name);
		boolean bln3=this.action.elementHelper.fnIsElementPresent(this.email_last_name);
		boolean bln4=this.action.elementHelper.fnIsElementPresent(this.gender_edittext);
		boolean bln5=this.action.elementHelper.fnIsElementPresent(this.BackButtonFirstPageOfCreateAccount);
		boolean bln6=this.action.elementHelper.fnIsElementPresent(this.NextButtonFirstPageOfCreateAccount);
		if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6)
			return true;
		return false;
	}

	public void userCredentialsOfSecondPage() throws InterruptedException {
		Thread.sleep(12000);
		this.action.waitHelper.waitFor(email_first_name);
		this.action.elementHelper.fnType(this.email_first_name,"Automation");
		this.action.elementHelper.fnClear(this.email_last_name);
		this.action.elementHelper.fnType(this.email_last_name, "QA");
		this.action.elementHelper.fnClear(this.gender_edittext);
		this.action.elementHelper.fnClick(this.gender_edittext);
		this.action.elementHelper.fnClick(this.createAccountNext);
	}

	public boolean validateContentOnCreateMeConnectAccountThirdPage(){
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.contentTitleOnFirstPageOfCreateAccount);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.birth_day);
		boolean bln3=this.action.elementHelper.fnIsElementPresent(this.birth_month);
		boolean bln4=this.action.elementHelper.fnIsElementPresent(this.birth_year);
		boolean bln7=this.action.elementHelper.fnIsElementPresent(this.products_policy_picker);
		boolean bln5=this.action.elementHelper.fnIsElementPresent(this.BackButtonFirstPageOfCreateAccount);
		boolean bln6=this.action.elementHelper.fnIsElementPresent(this.register_third_page_next_button);
		if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6 && bln7)
			return true;
		return false;
	}

	public void userCredentialsOfThirdPage(){
		this.action.elementHelper.fnType(this.birth_day, "01");
		this.action.elementHelper.fnType(this.birth_month, "01");
		this.action.elementHelper.fnType(this.birth_year, "1985");
		this.action.elementHelper.fnClick(this.products_policy_picker);
		this.action.elementHelper.fnClick(this.doneButtonOnRegistration);
		this.action.elementHelper.fnClick(this.register_third_page_next_button);
	}
	public boolean validateContentOnCreateMeConnectAccountSuccessPage(){
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.successMessageOnCreateAccount);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.OkButtonOnSuccessMessagePage);
		if(bln1 && bln2)
			return true;
		return false;
	}

	public void clickonOkSucessfull(){
		this.action.elementHelper.fnClick(this.OkButtonOnSuccessMessagePage);
	}

	public boolean validateOnBoardingScreen(){
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.skipButton);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.signInSignUp);
		boolean bln3=this.action.elementHelper.fnIsElementPresent(this.logInHereButton);
		boolean bln4=this.action.elementHelper.fnIsElementPresent(this.pageIndicators);
		if(bln1 && bln2 && bln3 && bln4)
			return true;
		return false;
	}

	public void verifySwipingOnBoardingScreen(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(Direction.LEFT);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenBig(Direction.RIGHT);
	}

	public void clickOnSignUpButton(){
		this.action.elementHelper.fnClick(this.signInSignUp);
	}

	public void clickOnMeConnectLoginButton(){
		this.action.elementHelper.fnClick(this.meConnectLogin);
	}

	public void clickOnLogin() {
		this.action.elementHelper.fnClick(this.login_next_button);
	}

	public void logoutFromApp(){
		//this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(MobileInteractionHelper.Direction.DOWN, 2);
		this.action.elementHelper.fnClick(this.settingsIcon);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.logout);
		this.action.elementHelper.fnClick(this.logout);
	}

	public void clickOnSettingsIcon(){
		this.action.elementHelper.fnClick(this.settingsIcon);
	}

	public boolean validateAccountSection(){
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.accountSectionLabel);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.username_accountSection);
		boolean bln3=this.action.elementHelper.fnIsElementPresent(this.meRewards_accountSection);
		boolean bln4=this.action.elementHelper.fnIsElementPresent(this.manage_accountSection);
		if(bln1 && bln2 && bln3 && bln4)
			return true;
		return false;
	}

	public boolean validateGeneralSection(){
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.generalSectionLabel);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.notifications_generalSection);
		boolean bln3=this.action.elementHelper.fnIsElementPresent(this.display_generalSection);
		boolean bln4=this.action.elementHelper.fnIsElementPresent(this.edition_generalSection);
		if(bln1 && bln2 && bln3 && bln4)
			return true;
		return false;
	}

	public boolean validateContactSection() throws InterruptedException {
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.advertiseWithMe_contactSection, Direction.UP);
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.contactSectionLabel);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.cnaEyewitness_contactSection);
		boolean bln3=this.action.elementHelper.fnIsElementPresent(this.helpAndFeedback_contactSection);
		boolean bln4=this.action.elementHelper.fnIsElementPresent(this.advertiseWithMe_contactSection);
		if(bln1 && bln2 && bln3 && bln4)
			return true;
		return false;
	}

	public boolean validateAboutSection() throws InterruptedException {
		Thread.sleep(5000);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.aboutSectionLabel, Direction.UP);
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.aboutSectionLabel);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.mediaCorpDigitalNetwork_aboutSection);
		boolean bln3=this.action.elementHelper.fnIsElementPresent(this.appVersion_aboutSection);
		boolean bln4=this.action.elementHelper.fnIsElementPresent(this.channelId_aboutSection);
		boolean bln5=this.action.elementHelper.fnIsElementPresent(this.termsOfService_aboutSection);
		boolean bln6=this.action.elementHelper.fnIsElementPresent(this.privacyPolicy_aboutSection);
		if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6)
			return true;
		return false;
	}

	public void clickOnCloseButtonOnSignUpPage(){
		this.action.elementHelper.fnClick(this.closeButtonOnSignUp);
	}

	public void clickONSkipButton(){
		this.action.elementHelper.fnClick(this.skipButton);
	}

	public void clickOnLifeStyle(){
		this.action.elementHelper.fnClick(this.lifeStyle);
	}

	public void clickOnLuxury(){
		this.action.elementHelper.fnClick(this.luxury);
	}

	public void clickOnNotifications(){
		this.action.waitHelper.waitFor(this.notifications_generalSection);
		this.action.elementHelper.fnClick(this.notifications_generalSection);
	}

	public void clickOnDisplaySec(){
		this.action.waitHelper.waitFor(this.display_generalSection);
		this.action.elementHelper.fnClick(this.display_generalSection);
	}

	public void clickOnEditionSec(){
		this.action.waitHelper.waitFor(this.edition_generalSection);
		this.action.elementHelper.fnClick(this.edition_generalSection);
	}

	public void clickOnEyeWitnessSec(){
		this.action.waitHelper.waitFor(this.cnaEyewitness_contactSection);
		this.action.elementHelper.fnClick(this.cnaEyewitness_contactSection);
	}

	public void clickOnHelpAndfeedbackButton(){
		this.action.waitHelper.waitFor(this.helpAndFeedback_contactSection);
		this.action.elementHelper.fnClick(this.helpAndFeedback_contactSection);
	}

	public void clickOnAdvertisementSec(){
		this.action.waitHelper.waitFor(this.advertiseWithMe_contactSection);
		this.action.elementHelper.fnClick(this.advertiseWithMe_contactSection);
	}

	public void clickOnMediaCorpDigitalFieldButton(){
		this.action.waitHelper.waitFor(this.mediaCorpDigitalNetwork_aboutSection);
		this.action.elementHelper.fnClick(this.mediaCorpDigitalNetwork_aboutSection);
	}

	public void clickOnChannelId(){
		this.action.waitHelper.waitFor(this.channelId_aboutSection);
		this.action.elementHelper.fnClick(this.channelId_aboutSection);
	}

	public void clickOnTermsOfService(){
		this.action.waitHelper.waitFor(this.termsOfService_aboutSection);
		this.action.elementHelper.fnClick(this.termsOfService_aboutSection);
	}

	public void clickOnPrivacyPolicy(){
		this.action.waitHelper.waitFor(this.privacyPolicy_aboutSection);
		this.action.elementHelper.fnClick(this.privacyPolicy_aboutSection);
	}

	public boolean validateLogoutSection(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.logout, Direction.UP);
		boolean bln4= this.action.elementHelper.fnIsElementPresent(this.logout);
		this.action.elementHelper.fnClick(this.logout);
		boolean bln1=this.action.elementHelper.fnIsElementPresent(this.logoutContentMessage);
		boolean bln2=this.action.elementHelper.fnIsElementPresent(this.submitLogoutOnContentMessage);
		boolean bln3=this.action.elementHelper.fnIsElementPresent(this.cancelLogoutOnContentMessage);
		if(bln1 && bln2 && bln3 && bln4 )
			return true;
		else
			return false;
	}

	public boolean verifyBrowseAllSec(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.browseAllSec, Direction.UP);
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.browseAllSec, Direction.UP);
	}

	public void clickOnTopStoriesUnderBrowseAllSec(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.topStories_BrowseAll, Direction.UP);
		this.action.elementHelper.fnClick(this.topStories_BrowseAll);
	}

	public void clickOnWatchPage(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.UP,5);
		this.action.elementHelper.fnClick(this.watch_menu);
	}

	public void clickOnSpecialReports(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.specialReports, Direction.UP);
		this.action.elementHelper.fnClick(this.specialReports);
	}

	public boolean verifyHeaderOfSpecialReports(){
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.specialReportsHeader, Direction.UP);
	}

	public void clickOnEyeWitness(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.eyeWitness_menu, Direction.UP);
		this.action.elementHelper.fnClick(this.eyeWitness_menu);
	}

	public void clickOnBrandedContent(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.brandedContent, Direction.UP);
		this.action.elementHelper.fnClick(this.brandedContent);
	}

	public boolean verifyHeaderOfBrandedContent(){
		return this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.brandedContentHeader, Direction.UP);
	}

	public void clickOkButtonOnSuccessMessagePage(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.ScrollToElement(this.OkButtonOnSuccessMessagePage, Direction.UP);
		this.action.elementHelper.fnClick(this.OkButtonOnSuccessMessagePage);
	}

	//*****
	public void fnEnterValidUserEmail()
	{
		this.action.elementHelper.fnType(this.email_address,this.objConfig.username);
	}

	public void fnEnterValidPassword()
	{
		this.action.elementHelper.fnType(this.email_password,this.objConfig.password);
	}
}
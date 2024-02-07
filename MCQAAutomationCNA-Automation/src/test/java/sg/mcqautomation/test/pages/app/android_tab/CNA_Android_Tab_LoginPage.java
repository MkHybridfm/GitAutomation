package sg.mcqautomation.test.pages.app.android_tab;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;
import sg.mcqautomation.applocatos.config.AppLocator;
import sg.mcqautomation.applocatos.config.AppLocatorType;
import sg.mcqautomation.applocatos.config.AppLocatorType.LocatorStrategy;
import sg.mcqautomation.config.GlobalConfig;
import sg.mcqautomation.config.GlobalConfig.ApplicationType;
import sg.mcqautomation.mobile.accelerator.MobileInteractionHelper.Direction;
import sg.mcqautomation.utilities.FileUtilities;
import sg.mcqautomation.web.accelerator.ActionEngineHelper;

public class CNA_Android_Tab_LoginPage {
	public RemoteWebDriver driver;
	public GlobalConfig objConfig;
	public ActionEngineHelper action;
	public AppiumDriver mobdriver;

	public CNA_Android_Tab_LoginPage(RemoteWebDriver driver, GlobalConfig objConfig) {
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
	private By email_address;
	private By email_password;
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


	public void initElements()
	{
		this.createAccountNext=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"btn_next"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name='Next']"));
		this.birth_day=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.ID, "dob_day"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "et_dob_dd"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[1]"));
		this.birth_month=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.ID, "dob_month"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "et_dob_mm"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[2]"));
		this.birth_year=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.ID, "dob_year"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "et_dob_yy"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeTextField[3]"));
		this.products_policy_picker=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//div[@class='mp-checkbox required']/label"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "cb_term_condition"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]"));
		this.register_third_page_next_button=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "btn_create_now"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name='Create Now']"));
		this.email_first_name=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//input[@id='first_name']"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "text_input_editText"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeCell[2]/XCUIElementTypeTextField"));
		this.email_last_name=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//input[@id='last_name']"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH, "//android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeCell[3]/XCUIElementTypeTextField"));
		this.gender_edittext=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//div[@class='dk-selected']"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH, "//android.widget.EditText[@text='Gender']"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeCell[4]/XCUIElementTypeTextField"));
		this.gender_bottom_sheet_male=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//li[@id='dk0-male']"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "btn_male"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Done\"]"));
		this.email_address=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//input[@id='username']"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "text_input_editText"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField"));
		this.email_password=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//input[@id='password']"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH, "//android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeSecureTextField"));
		this.login_next_button=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.ID, "mpSignInBtn"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "btn_sign_in"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name='Sign In']"));
		this.meConnectLogin=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//*[contains(text(),'Sign In or Create Account')]"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"cl_me_connect" ),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name='Sign in with meCONNECT']"));
		this.email_password_confirm=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//input[@id='confirmpassword']"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH, "//android.widget.EditText[@text='Confirm Password']"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeCell[4]/XCUIElementTypeSecureTextField"));
		this.login_email_new=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//input[@type='text']"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "text_input_editText"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeTextField[@value='Email']"));
		this.login_password_new=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.XPATH, "//input[@type='password']"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH, "//android.view.ViewGroup[@resource-id='com.channelnewsasia:id/til_password']//android.widget.EditText[@text='Password']"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeTable/XCUIElementTypeCell[3]/XCUIElementTypeSecureTextField"));
		this.allowContinueButton=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name='Continue']" ));
		this.allowAppTracking=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name='Allow']" ));
		this.allowNotification=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name='Allow']" ,
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH, "//android.widget.Button[normalize-space(@text) = 'Allow']")));
		this.signInSignUp=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "com.channelnewsasia:id/tv_create_me_connect_account"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Sign Up\"]"));
		this.skipButton=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.WEB,LocatorStrategy.ClassName, "btn-close"),
				AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID, "tv_skip"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH, "//XCUIElementTypeButton[@name=\"Skip\"]"));
		this.signInWithMeConnectButton=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"cl_me_connect"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Sign in with meCONNECT\"]"));
		this.signInWithCreateMeConnectAccountButton=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"com.channelnewsasia:id/tv_create_me_connect_account"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Create your meCONNECT account\"]"));
		this.continueWithAppleAccountButton=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"btn_social_login_apple"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Continue with Apple\"]"));
		this.continueWithFaceBookAccountButton=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"cl_facebook_login"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Continue with Facebook\"]"));
		this.continueWithGoogleAccountButton=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"btn_social_login_google"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Continue with Google\"]"));
		this.contentTitleOnFirstPageOfCreateAccount=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Create your meconnect account')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Create your meCONNECT account\"]"));
		this.BackButtonFirstPageOfCreateAccount=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"btn_back"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Back\"]"));
		this.NextButtonFirstPageOfCreateAccount=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"btn_next"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"(//XCUIElementTypeButton[@name=\"Next\"])[1]"));
		this.cancelButtonOnFirstPageOfCreateAccount=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_cancel"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Cancel\"]"));
		this.logoOnFirstPageOfCreateAccount=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"com.channelnewsasia:id/iv_logo"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeImage[@name=\"logo-cna-new\"]"));
		this.successMessageOnCreateAccount=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"activity_account_created_tv_term_of_use"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Thank you! Your meCONNECT account has been successfully created.\"]"));
		this.logInHereButton=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_login"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Log in here\"]"));
		this.pageIndicators=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"view"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeApplication[@name=\"CNA\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePageIndicator"));
		this.OkButtonOnSuccessMessagePage=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"btn_account_created"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"OK\"]"));
		this.settingsIcon=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"iv_setting"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"icon settings\"]"));
		this.logout=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.Button[contains(@text,'Log out')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Log out\"]"));
		this.accountSectionLabel=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Account')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Account\"]"));
		this.manage_accountSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_manage_me_connect_account"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Manage meCONNECT account\"]"));
		this.meRewards_accountSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_me_reward"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"meRewards\"]"));
		this.username_accountSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_username"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeScrollView/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeStaticText"));
		this.generalSectionLabel=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'General')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"General\"]"));
		this.notifications_generalSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_notifications"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Notifications\"]"));
		this.display_generalSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_display"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Display\"]"));
		this.edition_generalSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_edition"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Edition\"]"));
		this.contactSectionLabel=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Contact')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Contact\"]"));
		this.cnaEyewitness_contactSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_cna_eye_witness"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"CNA Eyewitness\"]"));
		this.helpAndFeedback_contactSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_help_and_feedback"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Help and feedback\"]"));
		this.advertiseWithMe_contactSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_advertise_with_us"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Advertise with us\"]"));
		this.aboutSectionLabel=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'About')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"About\"]"));
		this.mediaCorpDigitalNetwork_aboutSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_mediacorp_digital_network"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Mediacorp Digital Network\"]"));
		this.appVersion_aboutSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'App version')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"App version\"]"));
		this.channelId_aboutSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_channel_id"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Channel Id\"]"));
		this.termsOfService_aboutSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_terms_of_service"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Terms of Service\"]"));
		this.privacyPolicy_aboutSection=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"tv_privacy_policy"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Privacy Policy\"]"));
		this.closeButtonOnSignUp=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"iv_btn_close"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeButton"));
		this.luxury=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"iv_two"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"luxury brand icon\"]"));
		this.lifeStyle=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"iv_one"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"lifestyle brand icon\"]"));
		this.cancelLogoutOnContentMessage=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.Button[contains(@text,'Cancel')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Cancel\"]"));
		this.submitLogoutOnContentMessage=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.Button[contains(@text,'OK')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"(//XCUIElementTypeButton[@name=\"Log out\"])[2]"));
		this.logoutContentMessage=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"android:id/message"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Are you sure you want to log out?\"]"));
		this.browseAllSec=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Browse All')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Browse All\"]"));
		this.topStories_BrowseAll=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Top Stories')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Top Stories\"]"));
		this.watch_menu=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Watch')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Watch\"]"));
		this.specialReports=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Special Reports')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Special Reports\"]"));
		this.specialReportsHeader=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Special Reports')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Special Reports\"]"));
		this.eyeWitness_menu=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'CNA Eyewitness')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"CNA Eyewitness\"]"));
		this.brandedContent=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Branded Content')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Branded Content\"]"));
		this.brandedContentHeader=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.TextView[contains(@text,'Branded Content')]"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeStaticText[@name=\"Branded Content\"]"));
		this.doneButtonOnRegistration=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.ID,"textinput_error"),
				AppLocatorType.GetLocator(ApplicationType.IOS_APP,LocatorStrategy.XPATH,"//XCUIElementTypeButton[@name=\"Done\"]"));
		this.allowNotificationsAndroid=AppLocator.GetLocator(AppLocatorType.GetLocator(ApplicationType.ANDROID_APP,LocatorStrategy.XPATH,"//android.widget.Button[normalize-space(@text) = 'Allow']" ));
	}

	public void launchApplication() {

		 if(this.objConfig.applicationType==ApplicationType.IOS_APP) {

			/*	if(this.action.elementHelper.fnIsElementPresent(this.bluetoothNotification)) {

					//this.action.elementHelper.fnClick(this.bluetoothNotification);
					this.action.elementHelper.fnClick(this.allowNotification);
					//this.action.elementHelper.fnClick(this.signInSignUp);
					this.action.elementHelper.fnClick(this.allowContinueButton);
					this.action.elementHelper.fnClick(this.allowAppTracking);
					this.action.elementHelper.fnClick(this.signInSignUp);
				}
				else{*/

					this.action.elementHelper.fnClick(this.allowNotification);
					this.action.elementHelper.fnClick(this.allowContinueButton);
					this.action.elementHelper.fnClick(this.allowAppTracking);
		}
	    else if (this.objConfig.applicationType==ApplicationType.ANDROID_APP) {
			/*if(this.action.elementHelper.fnIsElementPresent(allowNotificationsAndroid)){
				 this.action.elementHelper.fnClick(allowNotificationsAndroid);
			 }*/
		}
		else{

		 }
	   // this.action.elementHelper.fnClick(this.meConnectLogin);
	   }

	public void pressLoginBtn()
	{
		this.action.elementHelper.fnClick(login_next_button);
	}

	public void login(String username, String password) throws InterruptedException {
		clickOnLogin();
	}


	public boolean fnGetResetPasswordInfo(String strMessage) {
		boolean statusInfo= false;
		if (this.objConfig.applicationType == ApplicationType.WEB) {
			By loc = By.xpath("//*[contains(text(),'" + strMessage + "')]");
			if (this.action.elementHelper.fnIsElementPresent(loc))
				return statusInfo= true;
			else
				return statusInfo;
		}
		return statusInfo;
	}

	
	


	public boolean validateSignInWithMeConnectButton(){
		return this.action.elementHelper.fnIsElementDisplayed(signInWithMeConnectButton);
    }

	public boolean validateSignInWithCreateMeConnectAccountButton(){
		return this.action.elementHelper.fnIsElementDisplayed(signInWithCreateMeConnectAccountButton);
	}

	public boolean validateContinueWithAppleAccountButton(){
		return this.action.elementHelper.fnIsElementDisplayed(continueWithAppleAccountButton);
	}

	public boolean validateContinueWithFaceBookAccountButton(){
		return this.action.elementHelper.fnIsElementDisplayed(continueWithFaceBookAccountButton);
	}

	public boolean validateContinueWithGoogleAccountButton(){
		return this.action.elementHelper.fnIsElementDisplayed(continueWithGoogleAccountButton);
	}

	public void createNewMeConnectAccountButton(){
		 this.action.elementHelper.fnClick(signInWithCreateMeConnectAccountButton);
	}

	public boolean validateLogoOnCreateMeConnectAccountPage(){
		//this.action.elementHelper.fnIsElementPresent(logoOnFirstPageOfCreateAccount);
		return this.action.elementHelper.fnIsElementPresent(this.logoOnFirstPageOfCreateAccount);
	}

	public boolean validateCancelButtonOnCreateMeConnectAccountPage(){
		return this.action.elementHelper.fnIsElementDisplayed(cancelButtonOnFirstPageOfCreateAccount);
	}

	public boolean validateContentOnCreateMeConnectAccountPage(){
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;
		boolean bln3=false;
		boolean bln4=false;
		boolean bln5=false;
		boolean bln6=false;


		bln1=this.action.elementHelper.fnIsElementDisplayed(contentTitleOnFirstPageOfCreateAccount);
		bln2=this.action.elementHelper.fnIsElementDisplayed(login_email_new);
		bln3=this.action.elementHelper.fnIsElementDisplayed(login_password_new);
		bln4=this.action.elementHelper.fnIsElementDisplayed(email_password_confirm);
		bln5=this.action.elementHelper.fnIsElementDisplayed(BackButtonFirstPageOfCreateAccount);
		bln6=this.action.elementHelper.fnIsElementDisplayed(NextButtonFirstPageOfCreateAccount);
		if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6)
			blnStatus=true;
		return blnStatus;
	}

	public void loginCredentials() throws InterruptedException {
		this.action.elementHelper.fnType(this.email_address,objConfig.username);
		this.action.elementHelper.fnClear(email_password);
		Thread.sleep(5000);
		this.action.elementHelper.fnType(this.email_password, objConfig.password);
	}

	public void loginCredentialsForNewUser() throws InterruptedException {
		String strRandomValue=FileUtilities.GetCurrentTimeStampAsString();
		String email = "meListen.testautomation" + strRandomValue + "@gmail.com";
		String password = "testautomation1@";
		Thread.sleep(1000);
		this.action.elementHelper.fnType(this.login_email_new,email);
		/*this.action.elementHelper.fnClick(this.login_password_new);
		this.action.elementHelper.fnClear(this.login_password_new);*/
		Thread.sleep(1000);
		this.driver.findElement(login_password_new).sendKeys("Test@123");
		/*this.action.elementHelper.fnClick(this.email_password_confirm);
		this.action.elementHelper.fnClear(this.email_password_confirm);*/
		Thread.sleep(1000);
		this.driver.findElement(email_password_confirm).sendKeys("Test@123");
	}

	public void clickOnNextButtonOnFirstPageOfCreateAccount(){
		this.action.elementHelper.fnClick(NextButtonFirstPageOfCreateAccount);
	}

	public boolean validateContentOnCreateMeConnectAccountSecondPage(){
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;
		boolean bln3=false;
		boolean bln4=false;
		boolean bln5=false;
		boolean bln6=false;


		bln1=this.action.elementHelper.fnIsElementDisplayed(contentTitleOnFirstPageOfCreateAccount);
		bln2=this.action.elementHelper.fnIsElementDisplayed(email_first_name);
		bln3=this.action.elementHelper.fnIsElementDisplayed(email_last_name);
		bln4=this.action.elementHelper.fnIsElementDisplayed(gender_edittext);
		bln5=this.action.elementHelper.fnIsElementDisplayed(BackButtonFirstPageOfCreateAccount);
		bln6=this.action.elementHelper.fnIsElementDisplayed(NextButtonFirstPageOfCreateAccount);
		if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6)
			blnStatus=true;
		return blnStatus;
	}

	public void userCredentialsOfSecondPage() throws InterruptedException {
		Thread.sleep(12000);
		this.action.waitHelper.waitFor(email_first_name);
		this.action.elementHelper.fnType(this.email_first_name,"Automation");
		this.action.elementHelper.fnClear(this.email_last_name);
		this.action.elementHelper.fnType(this.email_last_name, "QA");
		this.action.elementHelper.fnClear(this.gender_edittext);
		this.action.elementHelper.fnClick(this.gender_edittext);
		if(this.objConfig.applicationType==ApplicationType.IOS_APP) {
		}
		else {
			this.action.elementHelper.fnClick(this.gender_bottom_sheet_male);
		}
		this.action.elementHelper.fnClick(this.createAccountNext);
	}

	public boolean validateContentOnCreateMeConnectAccountThirdPage(){
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;
		boolean bln3=false;
		boolean bln4=false;
		boolean bln5=false;
		boolean bln6=false;
		boolean bln7=false;


		bln1=this.action.elementHelper.fnIsElementDisplayed(contentTitleOnFirstPageOfCreateAccount);
		bln2=this.action.elementHelper.fnIsElementDisplayed(birth_day);
		bln3=this.action.elementHelper.fnIsElementDisplayed(birth_month);
		bln4=this.action.elementHelper.fnIsElementDisplayed(birth_year);
		bln7=this.action.elementHelper.fnIsElementDisplayed(products_policy_picker);
		bln5=this.action.elementHelper.fnIsElementDisplayed(BackButtonFirstPageOfCreateAccount);
		bln6=this.action.elementHelper.fnIsElementDisplayed(register_third_page_next_button);
		if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6 && bln7)
			blnStatus=true;
		return blnStatus;
	}

	public void userCredentialsOfThirdPage(){
		this.action.elementHelper.fnType(this.birth_day, "01");
		this.action.elementHelper.fnType(this.birth_month, "01");
		this.action.elementHelper.fnType(this.birth_year, "1985");
		this.action.elementHelper.fnClick(this.products_policy_picker);
		if(this.objConfig.applicationType==ApplicationType.IOS_APP) {
			this.action.elementHelper.fnClick(this.doneButtonOnRegistration);
		}
		this.action.elementHelper.fnClick(this.register_third_page_next_button);
	}
	public boolean validateContentOnCreateMeConnectAccountSuccessPage(){
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;

		bln1=this.action.elementHelper.fnIsElementDisplayed(successMessageOnCreateAccount);
		bln2=this.action.elementHelper.fnIsElementDisplayed(OkButtonOnSuccessMessagePage);

		if(bln1 && bln2)
			blnStatus=true;
		return blnStatus;
	}

	public boolean validateOnBoardingScreen(){
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;
		boolean bln3=false;
		boolean bln4=false;

		bln1=this.action.elementHelper.fnIsElementDisplayed(this.skipButton);
		bln2=this.action.elementHelper.fnIsElementDisplayed(this.signInSignUp);
		bln3=this.action.elementHelper.fnIsElementDisplayed(this.logInHereButton);
		bln4=this.action.elementHelper.fnIsElementDisplayed(this.pageIndicators);

		if(bln1 && bln2 && bln3 && bln4)
			blnStatus=true;
		return blnStatus;
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
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.DOWN, 2);
		this.action.elementHelper.fnClick(this.settingsIcon);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToText("Log out");
		this.action.elementHelper.fnClick(this.logout);
	}

	public void clickOnSettingsIcon(){
		this.action.elementHelper.fnClick(this.settingsIcon);
	}

	public boolean validateAccountSection() throws InterruptedException {
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;
		boolean bln3=false;
		boolean bln4=false;

		Thread.sleep(1000);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToText("Account");
		bln1=this.action.elementHelper.fnIsElementDisplayed(this.accountSectionLabel);
		bln2=this.action.elementHelper.fnIsElementDisplayed(this.username_accountSection);
		bln3=this.action.elementHelper.fnIsElementDisplayed(this.meRewards_accountSection);
		bln4=this.action.elementHelper.fnIsElementDisplayed(this.manage_accountSection);

		if(bln1 && bln2 && bln3 && bln4)
			blnStatus=true;
		return blnStatus;
	}

	public boolean validateGeneralSection(){
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;
		boolean bln3=false;
		boolean bln4=false;

		bln1=this.action.elementHelper.fnIsElementDisplayed(this.generalSectionLabel);
		bln2=this.action.elementHelper.fnIsElementDisplayed(this.notifications_generalSection);
		bln3=this.action.elementHelper.fnIsElementDisplayed(this.display_generalSection);
		bln4=this.action.elementHelper.fnIsElementDisplayed(this.edition_generalSection);

		if(bln1 && bln2 && bln3 && bln4)
			blnStatus=true;
		return blnStatus;
	}

	public boolean validateContactSection() throws InterruptedException {
		for(int i=0;i<=5; i++){
			Thread.sleep(4000);
			this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.UP,1);
			if(this.action.elementHelper.fnIsElementPresent(advertiseWithMe_contactSection))
				break;
		}
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;
		boolean bln3=false;
		boolean bln4=false;

		bln1=this.action.elementHelper.fnIsElementDisplayed(this.contactSectionLabel);
		bln2=this.action.elementHelper.fnIsElementDisplayed(this.cnaEyewitness_contactSection);
		bln3=this.action.elementHelper.fnIsElementDisplayed(this.helpAndFeedback_contactSection);
		bln4=this.action.elementHelper.fnIsElementDisplayed(this.advertiseWithMe_contactSection);

		if(bln1 && bln2 && bln3 && bln4)
			blnStatus=true;
		return blnStatus;
	}

	public boolean validateAboutSection() throws InterruptedException {
		Thread.sleep(5000);
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToId("com.channelnewsasia:id/tv_privacy_policy");
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;
		boolean bln3=false;
		boolean bln4=false;
		boolean bln5=false;
		boolean bln6=false;

		bln1=this.action.elementHelper.fnIsElementDisplayed(this.aboutSectionLabel);
		bln2=this.action.elementHelper.fnIsElementDisplayed(this.mediaCorpDigitalNetwork_aboutSection);
		bln3=this.action.elementHelper.fnIsElementDisplayed(this.appVersion_aboutSection);
		bln4=this.action.elementHelper.fnIsElementDisplayed(this.channelId_aboutSection);
		bln5=this.action.elementHelper.fnIsElementDisplayed(this.termsOfService_aboutSection);
		bln6=this.action.elementHelper.fnIsElementDisplayed(this.privacyPolicy_aboutSection);

		if(bln1 && bln2 && bln3 && bln4 && bln5 && bln6)
			blnStatus=true;
		return blnStatus;
	}

	public void clickOnCloseButtonOnSignUpPage(){
		this.action.elementHelper.fnClick(closeButtonOnSignUp);
	}

	public void clickONSkipButton(){
		this.action.elementHelper.fnClick(this.skipButton);
	}

	public void clickOnLifeStyle(){
		this.action.elementHelper.fnClick(this.lifeStyle);
	}

	public void clickOnLuxury(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.DOWN,6);
		this.action.elementHelper.fnClick(this.luxury);
	}

	public void clickOnNotifications(){
		this.action.waitHelper.waitFor(notifications_generalSection);
		this.action.elementHelper.fnClick(this.notifications_generalSection);
	}

	public void clickOnDisplaySec(){
		this.action.waitHelper.waitFor(display_generalSection);
		this.action.elementHelper.fnClick(this.display_generalSection);
	}

	public void clickOnEditionSec(){
		this.action.waitHelper.waitFor(edition_generalSection);
		this.action.elementHelper.fnClick(this.edition_generalSection);
	}

	public void clickOnEyeWitnessSec(){
		this.action.waitHelper.waitFor(cnaEyewitness_contactSection);
		this.action.elementHelper.fnClick(this.cnaEyewitness_contactSection);
	}

	public void clickOnHelpAndfeedbackButton(){
		this.action.waitHelper.waitFor(helpAndFeedback_contactSection);
		this.action.elementHelper.fnClick(this.helpAndFeedback_contactSection);
	}

	public void clickOnAdvertisementSec(){
		this.action.waitHelper.waitFor(advertiseWithMe_contactSection);
		this.action.elementHelper.fnClick(this.advertiseWithMe_contactSection);
	}

	public void clickOnMediaCorpDigitalFieldButton(){
		this.action.waitHelper.waitFor(mediaCorpDigitalNetwork_aboutSection);
		this.action.elementHelper.fnClick(this.mediaCorpDigitalNetwork_aboutSection);
	}

	public void clickOnChannelId(){
		this.action.waitHelper.waitFor(channelId_aboutSection);
		this.action.elementHelper.fnClick(this.channelId_aboutSection);
	}

	public void clickOnTermsOfService(){
		this.action.waitHelper.waitFor(termsOfService_aboutSection);
		this.action.elementHelper.fnClick(this.termsOfService_aboutSection);
	}

	public void clickOnPrivacyPolicy(){
		this.action.waitHelper.waitFor(privacyPolicy_aboutSection);
		this.action.elementHelper.fnClick(this.privacyPolicy_aboutSection);
	}

	public boolean validateLogoutSection(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnScrollToText("Log out");
		boolean blnStatus=false;
		boolean bln1=false;
		boolean bln2=false;
		boolean bln3=false;
		boolean bln4=false;
		boolean bln5=false;
		boolean bln6=false;

		bln4= this.action.elementHelper.fnIsElementDisplayed(logout);
		this.action.elementHelper.fnClick(logout);
		bln1=this.action.elementHelper.fnIsElementDisplayed(this.logoutContentMessage);
		bln2=this.action.elementHelper.fnIsElementDisplayed(this.submitLogoutOnContentMessage);
		bln3=this.action.elementHelper.fnIsElementDisplayed(this.cancelLogoutOnContentMessage);

		if(bln1 && bln2 && bln3 && bln4 )
			blnStatus=true;
		return blnStatus;
	}

	public boolean verifyBrowseAllSec(){
		for (int i = 0; i <= 10; i++) {
			try {
				this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.UP, 2);
				if (this.action.elementHelper.fnIsElementPresent(browseAllSec))
					break;
			} catch (Exception e) {
			}
		}
		return this.action.elementHelper.fnIsElementDisplayed(browseAllSec);
	}

	public void clickOnTopStoriesUnderBrowseAllSec(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.UP,1);
		this.action.waitHelper.waitFor(topStories_BrowseAll);
		this.action.elementHelper.fnClick(topStories_BrowseAll);
	}

	public void clickOnWatchPage(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.UP,6);
		this.action.waitHelper.waitFor(watch_menu);
		this.action.elementHelper.fnClick(watch_menu);
	}

	public void clickOnSpecialReports(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.UP,12);
		this.action.waitHelper.waitFor(specialReports);
		this.action.elementHelper.fnClick(specialReports);
	}

	public boolean verifyHeaderOfSpecialReports(){
		return this.action.elementHelper.fnIsElementDisplayed(specialReportsHeader);
	}

	public void clickOnEyeWitness(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.UP,13);
		this.action.waitHelper.waitFor(eyeWitness_menu);
		this.action.elementHelper.fnClick(eyeWitness_menu);
	}

	public void clickOnBrandedContent(){
		this.action.mobileActionEngineHelper.mobileInteractionHelper.fnSwipeScreenSmall(Direction.UP,14);
		this.action.waitHelper.waitFor(brandedContent);
		this.action.elementHelper.fnClick(brandedContent);
	}

	public boolean verifyHeaderOfBrandedContent(){
		return this.action.elementHelper.fnIsElementDisplayed(brandedContentHeader);
	}

	public void clickOkButtonOnSuccessMessagePage(){
		this.action.waitHelper.waitFor(OkButtonOnSuccessMessagePage);
		this.action.elementHelper.fnClick(OkButtonOnSuccessMessagePage);
	}

}



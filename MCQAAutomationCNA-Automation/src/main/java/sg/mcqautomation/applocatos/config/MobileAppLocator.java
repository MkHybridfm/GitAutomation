package sg.mcqautomation.applocatos.config;
import org.openqa.selenium.By;
public class MobileAppLocator {
    /**
     * Name of Function :- GetLocator
     * Class Name :- MobileAppLocator
     * Project :- Media Corp
     * Created By :- Pankaj Kumar
     * Date of Creation :-13-Mar-2023
     */
    public static By GetLocator(String strValue,MobileElementType elementType,ElementAttribute... elementAttribute)
    {

        switch (elementType)
        {
            case XCUIElementTypeApplication:
            case XCUIElementTypeWindow:
            case XCUIElementTypeOther:
            case XCUIElementTypeTable:
            case XCUIElementTypeStaticText:
            case XCUIElementTypeImage:
            case XCUIElementTypeCell:
            case XCUIElementTypeButton:
            case XCUIElementTypeTextField:
            case XCUIElementTypeSecureTextField:
            case XCUIElementTypeNavigationBar:
            case XCUIElementTypeSearchField:
            case XCUIElementTypeAlert:
            case XCUIElementTypeTextView:
            case XCUICustomElement:
                String streleAttribute="contains(@name,\""+strValue+"\")";
                String strLocator="";
                for(int i=0;i<elementAttribute.length;i++)
                {
                    if(elementAttribute[i]==ElementAttribute.visible)
                        streleAttribute=streleAttribute+" and @visible='true'";
                    else if(elementAttribute[i]==ElementAttribute.label) {
                        streleAttribute = "contains(@label,\"" + strValue + "\")";
                    }
                    else if(elementAttribute[i]==ElementAttribute.value) {
                        streleAttribute ="contains(@value,\"" + strValue + "\")";
                    }
                    else if(elementAttribute[i]==ElementAttribute.enabled)
                        streleAttribute=streleAttribute+" and @enabled='true'";
                }
                switch (elementType)
                {
                    case XCUIElementTypeApplication: strLocator="//XCUIElementTypeApplication["+streleAttribute+"]";break;
                    case XCUIElementTypeButton: strLocator="//XCUIElementTypeButton["+streleAttribute+"]"; break;
                    case XCUIElementTypeCell: strLocator="//XCUIElementTypeCell["+streleAttribute+"]"; break;
                    case XCUIElementTypeImage: strLocator="//XCUIElementTypeImage["+streleAttribute+"]"; break;
                    case XCUIElementTypeOther: strLocator="//XCUIElementTypeOther["+streleAttribute+"]"; break;
                    case XCUIElementTypeSecureTextField: strLocator="//XCUIElementTypeSecureTextField["+streleAttribute+"]"; break;
                    case XCUIElementTypeStaticText: strLocator="//XCUIElementTypeStaticText["+streleAttribute+"]"; break;
                    case XCUIElementTypeTable: strLocator="//XCUIElementTypeTable["+streleAttribute+"]"; break;
                    case XCUIElementTypeTextField: strLocator="//XCUIElementTypeTextField["+streleAttribute+"]"; break;
                    case XCUIElementTypeWindow: strLocator="//XCUIElementTypeWindow["+streleAttribute+"]"; break;
                    case XCUIElementTypeNavigationBar: strLocator="//XCUIElementTypeNavigationBar["+streleAttribute+"]"; break;
                    case XCUIElementTypeSearchField: strLocator="//XCUIElementTypeSearchField["+streleAttribute+"]"; break;
                    case XCUIElementTypeAlert:strLocator="//XCUIElementTypeSearchField["+streleAttribute+"]"; break;
                    case XCUIElementTypeTextView:strLocator="//XCUIElementTypeTextView["+streleAttribute+"]"; break;
                    case XCUICustomElement: strLocator=strValue; break;
                }
                return By.xpath(strLocator);
            case AndroidEditText:
            case AndroidButton:
            case AndroidLinearLayout:
            case AndroidTextView:
            case AndroidViewGroup:
            case AndroidImageView:
            case AndroidRecyclerView:
            case AndroidFrameLayout:
            case AndroidRelativeLayout:
            case AndroidCustomElement:
            case AndroidView:
            case AndroidScrollView:
            case AndroidCheckBox:
            case AndroidViewPager:
            case AndroidWebView:
            case AndroidHorizontalScrollView:
                streleAttribute="contains(@text,\""+strValue+"\")";
                strLocator="";
                for(int i=0;i<elementAttribute.length;i++)
                {
                    if(elementAttribute[i]==ElementAttribute.visible)
                        streleAttribute=streleAttribute+" and @visible='true'";
                    else if(elementAttribute[i]==ElementAttribute.label) {
                        streleAttribute = "contains(@label,\"" + strValue + "\")";
                    }
                    else if(elementAttribute[i]==ElementAttribute.value) {
                        streleAttribute ="contains(@value,\"" + strValue + "\")";
                    }
                    else if(elementAttribute[i]==ElementAttribute.enabled)
                        streleAttribute=streleAttribute+" and @enabled='true'";
                }
                switch (elementType)
                {
                    case AndroidEditText: strLocator="//android.widget.EditText["+streleAttribute+"]";break;
                    case AndroidButton: strLocator="//android.widget.Button["+streleAttribute+"]"; break;
                    case AndroidLinearLayout: strLocator="//android.widget.LinearLayout["+streleAttribute+"]"; break;
                    case AndroidTextView: strLocator="//android.widget.TextView["+streleAttribute+"]"; break;
                    case AndroidViewGroup: strLocator="//android.view.ViewGroup["+streleAttribute+"]"; break;
                    case AndroidImageView: strLocator="//android.widget.ImageView["+streleAttribute+"]"; break;
                    case AndroidRecyclerView: strLocator="//androidx.recyclerview.widget.RecyclerView["+streleAttribute+"]"; break;
                    case AndroidFrameLayout: strLocator="//android.widget.FrameLayout["+streleAttribute+"]"; break;
                    case AndroidRelativeLayout: strLocator="//android.widget.RelativeLayout["+streleAttribute+"]"; break;
                    case AndroidView: strLocator="//android.view.View["+streleAttribute+"]"; break;
                    case AndroidScrollView:strLocator="//android.widget.ScrollView["+streleAttribute+"]"; break;
                    case AndroidCheckBox:strLocator="//android.widget.CheckBox["+streleAttribute+"]"; break;
                    case AndroidViewPager:strLocator="//androidx.viewpager.widget.ViewPager["+streleAttribute+"]"; break;
                    case AndroidWebView:strLocator="//android.webkit.WebView["+streleAttribute+"]"; break;
                    case AndroidHorizontalScrollView:strLocator="//android.widget.HorizontalScrollView["+streleAttribute+"]"; break;
                    case AndroidCustomElement: strLocator=strValue; break;
                }
                return By.xpath(strLocator);
        }
        return By.xpath(strValue);
    }
    /**
     * Name of Enum :- MobileElementType
     * Class Name :- MobileAppLocator
     * Project :- Media Corp
     * Created By :- Pankaj Kumar
     * Date of Creation :-13-Mar-2023
     */
    public enum MobileElementType
    {
        XCUIElementTypeApplication,
        XCUIElementTypeWindow,
        XCUIElementTypeOther,
        XCUIElementTypeTable,
        XCUIElementTypeStaticText,
        XCUIElementTypeImage,
        XCUIElementTypeCell,
        XCUIElementTypeButton,
        XCUIElementTypeTextField,
        XCUIElementTypeSecureTextField,
        XCUIElementTypeNavigationBar,
        XCUIElementTypeSearchField,
        XCUIElementTypeAlert,
        XCUIElementTypeTextView,
        XCUICustomElement,
        AndroidEditText,
        AndroidButton,
        AndroidLinearLayout,
        AndroidTextView,
        AndroidViewGroup,
        AndroidImageView,
        AndroidRecyclerView,
        AndroidFrameLayout,
        AndroidRelativeLayout,
        AndroidCustomElement,
        AndroidView,
        AndroidScrollView,
        AndroidCheckBox,
        AndroidViewPager,
        AndroidWebView,
        AndroidHorizontalScrollView
    }
    /**
     * Name of Enum :- ElementAttribute
     * Class Name :- MobileAppLocator
     * Project :- Media Corp
     * Created By :- Pankaj Kumar
     * Date of Creation :-13-Mar-2023
     */
    public enum ElementAttribute
    {
        type,
        name,
        label,
        enabled,
        visible,
        accessible,
        index,
        value
    }

    /**
     * Name of Enum :- LocatorStrategy
     * Class Name :- MobileAppLocator
     * Project :- Media Corp
     * Created By :- Pankaj Kumar
     * Date of Creation :-13-Mar-2023
     */
    public enum LocatorStrategy
    {
        ID,
        XPATH,
        PartialLinkText,
        LinkText,
        ClassName,
        CssSelector,
        Name,
        TagName,
        AccessibilityId,
        AndroidUIAutomator,

    }
    /**
     * Name of Function :- GetLocator
     * Class Name :- MobileAppLocator
     * Project :- Media Corp
     * Created By :- Pankaj Kumar
     * Date of Creation :-13-Mar-2023
     */
    public By GetLocator(String strValue,LocatorStrategy locatorStrategy)
    {
        switch (locatorStrategy)
        {
            case ID: return By.id(strValue);
            case XPATH: return By.xpath(strValue);
            case PartialLinkText: return By.partialLinkText(strValue);
            case LinkText: return By.linkText(strValue);
            case ClassName:return By.className(strValue);
            case CssSelector:return By.cssSelector(strValue);
            case Name:return By.name(strValue);
            case TagName:return By.tagName(strValue);
            case AccessibilityId:By.id(strValue);
        }
        return By.xpath(strValue);
    }
}

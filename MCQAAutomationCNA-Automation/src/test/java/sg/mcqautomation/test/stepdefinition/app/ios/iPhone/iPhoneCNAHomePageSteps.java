package sg.mcqautomation.test.stepdefinition.app.ios.iPhone;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.ios.iPhone.iPhoneCNAHomePage;

public class iPhoneCNAHomePageSteps {

    iPhoneCNAHomePage cnaHomePage = new iPhoneCNAHomePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Then("I validate the Home Screen section landing header in iPhone")
    public void iValidateTheHomePageHeader() throws InterruptedException {
        cnaHomePage.validateHomePageSectionLandingHeader();
    }

    @Then("I Verify {string} Section on Home Page in iPhone")
    public void iValidateTheHomePageTab(String strSectionName) throws InterruptedException {
        cnaHomePage.validateHomePageSectionLandingTab(strSectionName);
    }

    @And("I Swipe Left to view other section on Home Page in iPhone")
    public void iSwipeToOtherSecLandingPage() {
        cnaHomePage.swipeSecLandingPageLeft();
    }

    @And("I Swipe Right to view other section on Home Page in iPhone")
    public void iSwipeRightToOtherSecLandingPage() {
        cnaHomePage.swipeSecLandingPageRight();
    }
}
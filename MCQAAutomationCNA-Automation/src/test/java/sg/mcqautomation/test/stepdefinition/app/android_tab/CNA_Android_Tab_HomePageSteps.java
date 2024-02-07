package sg.mcqautomation.test.stepdefinition.app.android_tab;
import io.cucumber.java.en.Then;
import org.assertj.core.api.SoftAssertions;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android_tab.CNA_Android_Tab_HomePage;

public class CNA_Android_Tab_HomePageSteps {

    CNA_Android_Tab_HomePage cnaHomePage = new CNA_Android_Tab_HomePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Then("I validate the Home Page section landing header in Android App in Tab")
    public void iValidateTheHomePageHeader() throws InterruptedException {
        cnaHomePage.validateHomePageSectionLandingHeader();
    }
}

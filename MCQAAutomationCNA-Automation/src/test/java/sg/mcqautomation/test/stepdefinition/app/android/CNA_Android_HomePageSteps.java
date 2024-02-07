package sg.mcqautomation.test.stepdefinition.app.android;
import org.assertj.core.api.SoftAssertions;
import io.cucumber.java.en.Then;
import sg.mcqautomation.driverfactory.DriverFactory;
import sg.mcqautomation.test.pages.app.android.CNA_Android_HomePage;

public class CNA_Android_HomePageSteps {

    CNA_Android_HomePage cnaHomePage = new CNA_Android_HomePage(DriverFactory.getDriver(),
            DriverFactory.getGlobalConfig());

    public SoftAssertions softAssert =new SoftAssertions();

    @Then("I validate the Home Page section landing header in Android App")
    public void iValidateTheHomePageHeader() throws InterruptedException {
        cnaHomePage.validateHomePageSectionLandingHeader();
    }
}

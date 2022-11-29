package StepDefinitions;
import PageObjects.TracePartsPage;
import Utilities.ConfigFileReader;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TracePartsStepDefs {

    private WebDriver driver = Hooks.driver;
    private WebDriverWait wait;
    TracePartsPage tracePartsPage = new TracePartsPage(driver, wait);
    public TracePartsStepDefs() throws Exception {
        ConfigFileReader configFileReader = new ConfigFileReader();
        this.wait = new WebDriverWait(driver, configFileReader.getTimeout());
    }

    @Given("^Load Trace Parts website$")
    public void loginToAmazonWebsite() throws InterruptedException {
        tracePartsPage.homePageIsDisplayed();
    }

    @When("^I enter Photoelectric Sensor in the textbox and click the Search icon$")
    public void enterTextandSearch() throws InterruptedException {
        tracePartsPage.closePopUpIfItAppears();
        tracePartsPage.enterText();
        tracePartsPage.clickOnsearchIcon();
    }

    @Then("^I select the first product that is displayed$")
    public void selectFirstProductThatIsDisplayed() throws InterruptedException {
        tracePartsPage.clickOnFirstProduct();
    }


    @Then("^I verify that the Product Title has LD46$")
    public void verifyProductTitle() throws InterruptedException {
        tracePartsPage.verifyProductTitle();
    }

    @And("^I verify that the Product Description has LD46-UL-715$")
    public void verifyProductDescription() throws InterruptedException {
        tracePartsPage.verifyProductDescription();
    }

    @Then("^I Right click on the 3D Model Product Image that is displayed in the 3D Viewer$")
    public void rightClickOn3DModelProductImage() throws InterruptedException {
        tracePartsPage.rightClickOn3DModelProductImage();
    }

    @Then("^In the Views option that is displayed I Click on Left and verify that the 3D Viewer displays the left side of the image$")
    public void clickOnLeftViewAndVerifyImage() throws InterruptedException {
        tracePartsPage.clickOnLeftViewAndVerifyImage();
    }
}
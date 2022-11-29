package PageObjects;
import Utilities.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class TracePartsPage extends BaseClass{

    private static String finalPrice;

    private WebDriver driver;

    public TracePartsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
    }


    private By searchBox = By.id("searchBox");
    private By searchIcon = By.id("search-button");
    private By acceptPopUp = By.id("didomi-notice-agree-button");
    private By firstProduct = By.xpath("//*[@id=\"search-results-items\"]/div[1]/a/div[2]/div/h5");
    private By productTitle = By.xpath("//*[@id=\"overview\"]/h1");
    private By productDesc = By.xpath("//*[@class=\"bomfields-listing\"]/tbody/tr[2]/td");
    private By preview = By.id("overview-slider-preview");
    private By viewsbutton = By.xpath("//*[@id=\"overview-slider-preview\"]/div/div[1]/ul/li[1]");
    private By frontView = By.xpath("//*[@id=\"overview-slider-preview\"]/div/div[1]/ul/li[1]/ul/li[3]");
    private By leftView = By.xpath("//*[@id=\"overview-slider-preview\"]/div/div[1]/ul/li[1]/ul/li[3]/button/i");




    public void homePageIsDisplayed() {
        Assert.assertTrue(driver.getCurrentUrl().contains("traceparts.com"));


    }

    public void enterText() {
        driver.findElement(searchBox).click();
        driver.findElement(searchBox).sendKeys("Photoelectric Sensor");
    }

    public void closePopUpIfItAppears() {
        driver.switchTo().defaultContent();
        driver.findElement(acceptPopUp).click();
    }


    public void clickOnsearchIcon() {
        driver.findElement(searchIcon).click();
    }

    public void clickOnFirstProduct() {
        WebDriverWait wait = new WebDriverWait(driver,60);
        driver.findElement(firstProduct).click();
    }

    public void verifyProductTitle() {

        String ProductTitleText =  driver.findElement(productTitle).getText();
        String CheckString = "LD46";
        Assert.assertTrue(ProductTitleText.contains(CheckString));
    }

    public void verifyProductDescription() {

        String ProductDescText =  driver.findElement(productDesc).getText();
        String CheckString = "LD46-UL-715";
        Assert.assertTrue(ProductDescText.contains(CheckString));
    }

    public void rightClickOn3DModelProductImage() throws InterruptedException {

        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver,60);
        Thread.sleep(3000);
        wait.until(ExpectedConditions.presenceOfElementLocated(preview));
        wait.until(ExpectedConditions.elementToBeClickable(preview));
        WebElement elementLocator2 = driver.findElement(preview);
        actions.contextClick(elementLocator2);
        actions.build().perform();
        wait.until(ExpectedConditions.presenceOfElementLocated(viewsbutton));
        driver.findElement(viewsbutton).click();
    }

    public void clickOnLeftViewAndVerifyImage() throws InterruptedException {

        Actions actionsBuilder = new Actions(driver);
        actionsBuilder.moveToElement(driver.findElement((frontView))).perform();
        actionsBuilder.moveToElement(driver.findElement((leftView))).perform();
        driver.findElement(leftView).click();
        Thread.sleep(5000);
    }
}

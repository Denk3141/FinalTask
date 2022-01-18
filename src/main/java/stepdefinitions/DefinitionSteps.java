package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;
import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertTrue;
public class DefinitionSteps {

    private static final long DEFAULT_TIMEOUT = 100;

    WebDriver driver;
    HomePage homePage;
    LoginPage loginPage;
    SavedListPage savedListPage;
    CatalogSkirtsPage catalogSkirtsPage;
    AboutUsPage aboutUsPage;
    PageFactoryManager pageFactoryManager;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @And("User click on Clothing button")
     public void userClickOnClothingButton() {
        homePage.clickHeaderClothing();
     }

    @And("User click on skirts")
    public void userClickOnSkirts() {
        homePage.clickHeaderSkirts();
    }

    @And("User click on home page asos")
    public void userClickOnHomePageAsos() {
        homePage.clickAsosHomeButton();
    }

    @Then("User checks that current url contains {string}")
    public void userChecksThatCurrentUrlContainsURL(final String URLpage) {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        assertTrue(driver.getCurrentUrl().contains(URLpage));
    }

    @And("User send {string} in search")
    public void userSendSearchInSearch(final String Puma) {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.enterInputFieldSearch(Puma);
    }

    @And("User click on search button")
    public void userClickOnSearchButton() {
        homePage.clickSearchButtons();
    }

    @Then("User check that current url contains {string}")
    public void userCheckThatCurrentUrlContainsURL(final String URLPuma) {
        assertTrue(driver.getCurrentUrl().contains(URLPuma));
    }

    @And("User click on Saved Lists in header")
    public void userClickOnSavedListsInHeader()  {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.clickHeaderSavedLists();
    }

    @And("User click on LogIn")
    public void userClickOnLogIn()  {
        savedListPage = pageFactoryManager.getSavedListPage();
        savedListPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        savedListPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, savedListPage.getWaitSignIn());
        savedListPage.isSavedListVisible();
        savedListPage.clickSingInInSavedList();
    }

    @And("User send {string} in email address")
    public void userSendMailInEmailAddress(final String mail) {
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterEmailAddress(mail);
    }

    @And("User send {string} on password")
    public void userSendNumOnPassword(final String pas) {
        loginPage = pageFactoryManager.getLoginPage();
        loginPage.enterPassword(pas);}

    @And("User send {string} on password without new loginPage")
    public void userSendPasOnPasswordWithoutNewLoginPage(final String pass) {
        loginPage.enterPassword(pass);
    }

    @Then("User sees a pop-up message {string}")
    public void userSeesAPopUpMessageFail(final String fail) {
        assertTrue(driver.getPageSource().contains(fail));
    }

    @Then("User see a message on screen {string}")
    public void userSeeAMessageOnScreenMessage(final String mes) {
        assertTrue(driver.getPageSource().contains(mes));
    }

    @And("User click on Sign In")
    public void userClickOnSignIn() {
        loginPage.clickSignInButton();
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
    }

    @And("User clicks on the heart next to the first item")
    public void userClicksOnTheHeartNextToTheFirstItem() {
        catalogSkirtsPage = pageFactoryManager.getCatalogSkirtsPage();
        catalogSkirtsPage.clickSaveForLaterButton();
    }

    @And("User clicks the delete from saved button")
    public void userClicksTheDeleteFromSavedButton()  {
        savedListPage = pageFactoryManager.getSavedListPage();
        savedListPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        savedListPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);

        savedListPage.waitVisibilityOfElement(DEFAULT_TIMEOUT,savedListPage.getDelete());
        savedListPage.clickDeleteItem();
    }

    @Then("User see a massage on screen {string}")
    public void userSeeAMassageOnScreenMes(final String text) {
        savedListPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        savedListPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        savedListPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, savedListPage.getNoItem());
        assertTrue(driver.getPageSource().contains(text));
    }

    @Then("User see a message after search {string}")
    public void userSeeAMessageAfterSearchMessage(final String spChar) {
        assertTrue(driver.getPageSource().contains(spChar));
    }

    @And("User click on Header Currency Button")
    public void userClickOnHeaderCurrencyButton()  {
        homePage.clickHeaderCurrencyButton();
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getwisiblePanel());
    }

    @And("User click Select Currency")
    public void userClickSelectCurrency() {
        homePage.clickSelectCurrency();
    }

    @And("click Select RUB")
    public void clickSelectRUB() {
        homePage.clickSelectRUB();
    }

    @And("click Update Preferences")
    public void clickUpdatePreferences() {
        homePage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        homePage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        homePage.clickUpdatePreferences();
    }

    @Then("User check that currency contains {string}")
    public void userCheckThatCurrencyContainsCur(final String rub) {
        assertTrue(driver.getPageSource().contains(rub));
    }

    @And("User click on the first item")
    public void userClickOnTheFirstItem() {
        catalogSkirtsPage = pageFactoryManager.getCatalogSkirtsPage();
        catalogSkirtsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        catalogSkirtsPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        catalogSkirtsPage.clickFirstItemInCatalog();
    }

    @And("User click on Size Guide button")
    public void userClickOnSizeGuideButton() {
        catalogSkirtsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        catalogSkirtsPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        catalogSkirtsPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, catalogSkirtsPage.getWisiblelAyoutWidth());
        catalogSkirtsPage.clickSizeGuide();
    }

    @Then("User check that the size window is visible")
    public void userCheckThatTheSizeWindowIsVisible() {
        assertTrue(catalogSkirtsPage.isWindowSizeGuideVisible());
    }

    @And("User click on Shipping Restrictions button")
    public void userClickOnShippingRestrictionsButton() {
        catalogSkirtsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
        catalogSkirtsPage.waitForAjaxToComplete(DEFAULT_TIMEOUT);
        catalogSkirtsPage.waitVisibilityOfElement(DEFAULT_TIMEOUT, catalogSkirtsPage.getWisiblelAyoutWidth());
        catalogSkirtsPage.clickShippingRestrictionsButton();
        catalogSkirtsPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @Then("User check that the Shipping Restrictions window is visible")
    public void userCheckThatTheShippingRestrictionsWindowIsVisible() {
        assertTrue(catalogSkirtsPage.isWindowShippingRestrictionsVisible());

    }

    @And("User click on About Us Button")
    public void userClickOnAboutUsButton() {
        homePage.clickAboutUs();
    }

    @And("User click on The ASOS Button")
    public void userClickOnTheASOSButton() {
       aboutUsPage = pageFactoryManager.getAboutUsPage();
       aboutUsPage.clickReadTheASOS101Button();
    }

    @Then("User checks that current url\\(who we are) contains {string}")
    public void userChecksThatCurrentUrlWhoWeAreContainsURL(final String url) {
        assertTrue(driver.getCurrentUrl().contains(url));
    }
     @After
   public void tearDown() {
      driver.close();}
}

package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class HomePage extends BasePage {



    @FindBy(xpath = "//button[@data-id='96b432e3-d374-4293-8145-b00772447cde']")
    private WebElement headerClothing;

    @FindBy(xpath = "//a[text()='Skirts'][1]")
    private WebElement headerSkirts;

    @FindBy(xpath = "//a[@class='_24SZgSx _6DZZlcW']")
    private WebElement asosHomeButton;

    @FindBy(xpath = "//input[@type='search']")
    private WebElement inputFieldSearch;

    @FindBy(xpath = "//button[@class='kH5PAAC _1KRfEms']")
    private WebElement searchButtons;

    @FindBy(xpath = "//button[@aria-label='My Account']")
    private WebElement headerMyAccount;

    @FindBy(xpath = "//span[@type='heartUnfilled']")
    private WebElement headerSavedLists;

    @FindBy(xpath = "//div[@class='_25L--Pi']//img[@class='RLpiNyQ']")
    private WebElement headerCurrencyButton;

    @FindBy(xpath = "//select[@id='currency']")
    private WebElement selectCurrency;

    @FindBy(xpath = "//option[@value='10123']")
    private WebElement selectRUB;

    @FindBy(xpath = "//button[@class='_3jBV0Hh _2h9sodS']")
    private WebElement updatePreferences;

    @FindBy(xpath = "//div[@class='_3bZNClC']")
    private WebElement wisiblePanel;

    @FindBy(xpath = "//a[text()='About us']")
    private WebElement aboutUsButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickHeaderClothing() {headerClothing.click();}
    public void clickHeaderSkirts () {headerSkirts.click();}
    public void clickAsosHomeButton() {asosHomeButton.click();}
    public void enterInputFieldSearch(final String search){
        inputFieldSearch.clear();
        inputFieldSearch.sendKeys(search);}
    public void clickSearchButtons() {searchButtons.click();}
    public void clickHeaderSavedLists() {headerSavedLists.click();}
    public void openHomePage(String url) {
        driver.get(url);
    }
    public void clickHeaderCurrencyButton() {headerCurrencyButton.click();}
    public void clickSelectCurrency() {selectCurrency.click();}
    public void clickSelectRUB() {selectRUB.click();}
    public void clickUpdatePreferences() {updatePreferences.click();}
    public WebElement getwisiblePanel() {
        return wisiblePanel;
    }
    public void clickAboutUs() {aboutUsButton.click();}

}

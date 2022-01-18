package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatalogSkirtsPage extends BasePage{


    @FindBy(xpath = "//span[@class='_30BqGyh'][1]")
    private WebElement saveForLaterButton;

    @FindBy(xpath = "//article[@data-auto-id='productTile'][1]")
    private WebElement firstItemInCatalog;

    @FindBy(xpath = "//button[@data-test-id='size-guide-button']")
    private WebElement sizeGuide;

    @FindBy(xpath = "//iframe[@data-test-id='size-guide-iframe']")
    private WebElement windowSizeGuide;

    @FindBy(xpath = "//div[@data-test-id='sideModal']")
    private WebElement windowShippingRestrictions;

    @FindBy(xpath = "//div[@class='_2U_UZ dlmhi']")
    private WebElement shippingRestrictionsButton;

    @FindBy(xpath = "//li[@class='item']")
    private WebElement layoutWidth;

    public CatalogSkirtsPage(WebDriver driver) {
        super(driver);
    }

    public void clickSaveForLaterButton() {saveForLaterButton.click();}

    public void clickFirstItemInCatalog() {firstItemInCatalog.click();}

    public void clickSizeGuide() {sizeGuide.click();}

    public boolean isWindowSizeGuideVisible() {return windowSizeGuide.isDisplayed();}

    public boolean isWindowShippingRestrictionsVisible() {return windowShippingRestrictions.isDisplayed();}

    public void clickShippingRestrictionsButton() {shippingRestrictionsButton.click();}

    public WebElement getWisiblelAyoutWidth() {return layoutWidth;}


}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavedListPage extends BasePage{



    @FindBy(xpath = "//button[@class='button_3q7p7 noItemsButton_3WaaQ']")
    private WebElement singInInSavedList;

    @FindBy(xpath = "//button[@aria-label='Delete']")
    private WebElement deleteItem;

    @FindBy(xpath = "//h2[@class='noItemsTitle_zbzNG title_3EWj2']")
    private WebElement noSavedItems;

    @FindBy(xpath = "//h2[@class='noItemsTitle_zbzNG title_3EWj2']")
    private WebElement noItem;

    @FindBy(xpath = "//button[@class='button_3q7p7 noItemsButton_3WaaQ']")
    private WebElement waitSignIn;

    public SavedListPage(WebDriver driver) {
        super(driver);
    }

    public void clickSingInInSavedList() {singInInSavedList.click();}

    public void isSavedListVisible(){
        singInInSavedList.isDisplayed();
    }

    public void clickDeleteItem() {deleteItem.click();}

    public WebElement getNoItem() {
        return noItem;
    }

    public WebElement getWaitSignIn() {return waitSignIn; }

    public WebElement getDelete() {return deleteItem;}




}

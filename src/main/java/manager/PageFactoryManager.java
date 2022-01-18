package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public LoginPage getLoginPage() {return new LoginPage(driver);}

    public SavedListPage getSavedListPage() {return new SavedListPage(driver);}

    public CatalogSkirtsPage getCatalogSkirtsPage() {return new CatalogSkirtsPage(driver);}

    public AboutUsPage getAboutUsPage() {return new AboutUsPage(driver);}

}

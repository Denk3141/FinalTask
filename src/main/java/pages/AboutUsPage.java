package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutUsPage extends BasePage{

    @FindBy(xpath = "//span[text()='READ THE ASOS 101']")
    private WebElement readTheASOS101Button;

    public AboutUsPage(WebDriver driver) {
        super(driver);
    }
    public void clickReadTheASOS101Button() {readTheASOS101Button.click();}
}

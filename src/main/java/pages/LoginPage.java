package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {





    @FindBy(xpath = "//input[@name='Username']")
    private WebElement emailAddress;

    @FindBy(xpath = "//input[@autocomplete='off']")
    private WebElement password;

    @FindBy(xpath = "//input[@value='Sign in']")
    private WebElement signInButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailAddress(final String email){
        emailAddress.clear();
        emailAddress.sendKeys(email);
    }

    public void enterPassword(final String pass){
        password.clear();
        password.sendKeys(pass);
    }
    public void clickSignInButton(){
        signInButton.click();
    }













}

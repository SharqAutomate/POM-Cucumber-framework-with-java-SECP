package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public WebDriver driver;

    public loginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//button[@type='submit']//span[@class='mat-button-wrapper']")
    WebElement loginBtn;

    @FindBy(xpath="//*[@id=\"mat-input-0\"]")
    WebElement userId;

    @FindBy(xpath="//*[@id=\"mat-input-1\"]")
    WebElement password;


    @FindBy(xpath="//*[contains(text(),\"Welcome to your LEAP dashboard\")]")
    WebElement dashboard;

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void enterUserId(String EnterUserId) {
        userId.clear();
        userId.sendKeys(EnterUserId);
    }

    public void enterPassword(String EnterUserPass) {
        password.clear();
        password.sendKeys(EnterUserPass);
    }

    public void dashboard() {
        dashboard.isDisplayed();
    }

}

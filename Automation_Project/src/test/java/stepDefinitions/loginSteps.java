package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.loginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class loginSteps {
    WebDriver driver;
    public loginPage lpObj;
    @Given("I am in the login page of the SECP Application")
    public void i_am_in_the_login_page_of_the_secp_application() {
        System.setProperty("webdriver.chrome.driver","C:/Users/Sharqua.Naz/Intellij-workspace/Automation_Project/src/test/java/driver/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Page title is: " + driver.getTitle());
        driver.get("https://uat1bleap.secp.gov.pk/#/user/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
    }
    @When("I enter valid credentials")
    public void i_enter_valid_credentials() throws InterruptedException {
        loginPage lpObj = new loginPage(driver);
        Thread.sleep(3000);
        lpObj.enterUserId("sh12345");
        lpObj.enterPassword("Admin@1234");
        Thread.sleep(3000);
        lpObj.clickLoginBtn();
    }
    @Then("I should be taken to the Overview page")
    public void i_should_be_taken_to_the_overview_page() throws InterruptedException {
        Thread.sleep(3000);
        lpObj.dashboard();
    }

}

package za.co.tshimx.stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import za.co.tshimx.base.BaseUtil;
import za.co.tshimx.pages.LoginPage;

public class LoginStepdefs extends BaseUtil {

    WebDriver driver;
    LoginPage loginPage;

    public LoginStepdefs() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        //driver= BaseUtil.driver;
    }

    @Given("the user is browsing")
    public void theUseIsBrowsing() {
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
    }

    @When("the user enters the {string} and {string}")
    public void theUserEntersTheAnd(String username, String password) throws InterruptedException {
        loginPage.setUsername(username);
        loginPage.setPassword(password);
    }

    @Then("Clicks the login button")
    public void clicksTheLoginButton() throws InterruptedException {
        loginPage.clickLoginButton();
        driver.close();
    }
}

package za.co.tshimx.stepdefs;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import za.co.tshimx.base.BaseUtil;
import za.co.tshimx.pages.LoginPage;
import za.co.tshimx.utils.PagesUtil;

import java.util.Date;

public class LoginStepdefs extends BaseUtil {

    WebDriver driver;
    LoginPage loginPage;

    public LoginStepdefs() {

    }

    @Given("the user is browsing")
    public void theUseIsBrowsing() {
        driver = ApplicationHooks.driver;
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    @When("the user enters the {string} and {string}")
    public void theUserEntersTheAnd(String username, String password) throws Exception {
        loginPage = new LoginPage(driver);
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        PagesUtil.takeSnapShot(driver,"./screenshots/test"+ new Date().toInstant().getEpochSecond()+".png");
    }

    @Then("Clicks the login button")
    public void clicksTheLoginButton() throws Exception {
        loginPage.clickLoginButton();
        Assert.assertEquals(loginPage.getLabel(),"Login Successfully");
        PagesUtil.takeSnapShot(driver,"./screenshots/test"+ new Date().toInstant().getEpochSecond()+".png");
    }
}

package za.co.tshimx.stepdefs;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import za.co.tshimx.pages.LoginPage;
import za.co.tshimx.pages.RegisterUserPage;
import za.co.tshimx.pages.RegistrationSuccessPage;
import za.co.tshimx.utils.PagesUtil;


import java.util.Date;

public class RegisterUserStepDefs {

    WebDriver webDriver;
    LoginPage loginPage;
    RegisterUserPage registerUserPage;
    RegistrationSuccessPage registrationSuccessPage;

    String username;

    public RegisterUserStepDefs() {

    }
    @Given("The user browses {string}")
    public void theUserBrowses(String url) {
        webDriver = ApplicationHooks.driver;
        webDriver.get(url);
    }

    @When("The user clicks register link")
    public void theUserClicksRegisterLink() {
        loginPage = new LoginPage(webDriver);
        loginPage.clickRegisterLink();
    }


    @And("The user captures contact information {string}, {string}, {string}, and {string}")
    public void theUserCapturesContactInformationAnd(String firstName, String lastName, String phone, String email) throws Exception {
        registerUserPage = new RegisterUserPage(webDriver);
        registerUserPage.setFirstName(firstName);
        registerUserPage.setLastName(lastName);
        registerUserPage.setPhone(phone);
        registerUserPage.setEmail(email);
        PagesUtil.takeSnapShot(webDriver,"./screenshots/test"+ new Date().toInstant().getEpochSecond()+".png");
    }


    @And("The user captures Mailing information {string}, {string}, {string}, {string}, and  {string}")
    public void theUserCapturesMailingInformationAnd(String address, String city, String province, String postalCode, String country) throws Exception {
        registerUserPage.setAddress(address);
        registerUserPage.setCity(city);
        registerUserPage.setProvince(province);
        registerUserPage.setPostalCode(postalCode);
        registerUserPage.setCountry(country);
        PagesUtil.takeSnapShot(webDriver,"./screenshots/test"+ new Date().toInstant().getEpochSecond()+".png");
    }


    @And("The user captures user information {string}, {string}, and {string}")
    public void theUserCapturesUserInformationAnd(String username, String password, String confirmPassword) throws Exception {
        this.username=username;
        registerUserPage.setUserName(username);
        registerUserPage.setPassword(password);
        registerUserPage.setConfirmPassword(confirmPassword);
        PagesUtil.takeSnapShot(webDriver,"./screenshots/test"+ new Date().toInstant().getEpochSecond()+".png");

    }

    @Then("clicks register button")
    public void clicksRegisterButton() throws Exception {

        registerUserPage.clickSubmitButton();
        registrationSuccessPage = new RegistrationSuccessPage(webDriver);
        String textLabel= registrationSuccessPage.getLabel().trim();
        PagesUtil.takeSnapShot(webDriver,"./screenshots/test"+ new Date().toInstant().getEpochSecond()+".png");
        Assert.assertEquals(textLabel,"Note: Your user name is "+username+".");
    }
}

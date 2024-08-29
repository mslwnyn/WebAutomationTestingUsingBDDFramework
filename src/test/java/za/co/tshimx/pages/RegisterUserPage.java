package za.co.tshimx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import za.co.tshimx.utils.PagesUtil;

public class RegisterUserPage extends PagesUtil {

    WebDriver webDriver;
    By firstNameTextField = By.name("firstName");
    By lastNameTextField = By.name("lastName");
    By phoneTextField = By.name("phone");
    By emailTextField = By.name("userName");


    By addressTextField = By.name("address1");
    By cityTextField = By.name("city");
    By provinceField = By.name("state");
    By postalCodeTextField = By.name("postalCode");
    By countryDropDown = By.name("lastName");


    By usernameTextField = By.name("email");
    By passwordTextField = By.name("password");
    By confirmPasswordTextField = By.name("confirmPassword");

    By submitButton = By.name("submit");
    // By  tesxtLabel= By.xpath("//h3[text()='Login Successfully']");

    public RegisterUserPage() {

    }
    public RegisterUserPage(WebDriver driver) {
        webDriver=driver;
        PageFactory.initElements(webDriver,this);

    }




    public void setFirstName(String user){
        getElement(firstNameTextField,webDriver).sendKeys(user);
    }

    public void setLastName(String pass){
        getElement(lastNameTextField,webDriver).sendKeys(pass);
    }
    public void setPhone(String user){
        getElement(phoneTextField,webDriver).sendKeys(user);
    }

    public void setEmail(String pass){
        getElement(emailTextField,webDriver).sendKeys(pass);
    }
    //-------------------------------------------------------------------

    public void setAddress(String user){
        getElement(addressTextField,webDriver).sendKeys(user);
    }

    public void setCity(String pass){
        getElement(cityTextField,webDriver).sendKeys(pass);
    }
    public void setProvince(String user){
        getElement(provinceField,webDriver).sendKeys(user);
    }

    public void setPostalCode(String pass){
        getElement(postalCodeTextField,webDriver).sendKeys(pass);
    }

    public void setCountry(String pass){
        Select dropdown = new Select(webDriver.findElement(By.name("country")));
        dropdown.selectByVisibleText(pass);
        //getElement(countryDropDown,webDriver).sendKeys(pass);
    }



    //----------------------------------------------------------------

    public void setUserName(String user){
        getElement(usernameTextField,webDriver).sendKeys(user);
    }

    public void setPassword(String pass){
        getElement(passwordTextField,webDriver).sendKeys(pass);
    }
    public void setConfirmPassword(String pass){
        getElement(confirmPasswordTextField,webDriver).sendKeys(pass);
    }

    public void clickSubmitButton(){
        getElement(submitButton,webDriver).click();
    }

}


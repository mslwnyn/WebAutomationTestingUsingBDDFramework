package za.co.tshimx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import za.co.tshimx.utils.PagesUtil;

public class LoginPage extends PagesUtil {

    WebDriver driver;
    By username = By.name("userName");
    By password = By.name("password");
    By loginButton = By.name("submit");



    public LoginPage() {
       PageFactory.initElements(driver,this);
    }

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public void setUsername(String user){
        getElement(username,driver).sendKeys(user);
    }

    public void setPassword (String usePassword){
        getElement(password,driver).sendKeys(usePassword);
    }


    public void clickLoginButton(){
        getElement(loginButton,driver).click();
    }



}

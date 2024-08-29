package za.co.tshimx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import za.co.tshimx.utils.PagesUtil;

public class RegistrationSuccessPage extends PagesUtil {

    WebDriver driver;
    By textLabel= By.xpath("//b[contains(text(),' Note: Your user name')]");

    public RegistrationSuccessPage() {

    }
    public RegistrationSuccessPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }

    public String getLabel(){
        return getElement(textLabel,driver).getText();
    }



}

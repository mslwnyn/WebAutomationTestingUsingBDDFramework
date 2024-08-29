package za.co.tshimx.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import za.co.tshimx.utils.PagesUtil;

public class LandingPage extends PagesUtil {

    WebDriver driver;
    By  textLabel= By.xpath("//h3[text()='Login Successfully']");

    public LandingPage() {

    }
    public LandingPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);

    }


    public String getLabel(){
        return getElement(textLabel,driver).getText();
    }

}
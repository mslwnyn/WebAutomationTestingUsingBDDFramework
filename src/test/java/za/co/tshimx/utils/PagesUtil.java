package za.co.tshimx.utils;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class PagesUtil {

    public  WebDriver driver;

    public PagesUtil( ) {
    }

    public PagesUtil(WebDriver driver) {
        this.driver = driver;
    }

    public  WebElement getElement(By by,WebDriver driver ){

        WebElement element = new FluentWait<>(driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(10,TimeUnit.MILLISECONDS)
                .ignoring(WebDriverException.class)
                .until(ExpectedConditions.visibilityOfElementLocated(by));
        return  element;
    }
}

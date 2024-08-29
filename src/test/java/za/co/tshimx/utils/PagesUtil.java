package za.co.tshimx.utils;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
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
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
        TakesScreenshot scrShot =((TakesScreenshot)webdriver);  //Convert web driver object to TakeScreenshot
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE); //Call getScreenshotAs method to create image file
        File DestFile=new File(fileWithPath);  //Move image file to new destination
        FileUtils.copyFile(SrcFile, DestFile); //Copy file at destination
    }
}

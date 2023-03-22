package pages;

import config.browser_factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BasePage {


    public static void write(By by, String text) throws Exception {
        DriverFactory.getDriver().findElement(by).clear();
        DriverFactory.getDriver().findElement(by).sendKeys(text);
    }
    public static void click(By by) throws Exception{
        DriverFactory.getDriver().findElement(by).click();
    }
    public static void scrollToElement(By by) throws Exception {
        JavascriptExecutor js = (JavascriptExecutor) DriverFactory.getDriver();
        WebElement element = DriverFactory.getDriver().findElement(by);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public static String getText(By by) throws Exception {
        return DriverFactory.getDriver().findElement(by).getText();
    }
    public static boolean alertMessageContains(By by, String message) throws Exception {
        boolean alertMessage = false;
        String fullNameReturn = BasePage.getText(by);
        if (fullNameReturn.contains(message)) {
            alertMessage = true;
        }
        return alertMessage;
    }
    public static void switchToNextWindow()throws Exception{
        //Store the ID of the original window
        String originalWindow  = DriverFactory.getDriver().getWindowHandle();

        //Loop through until we find a new window handle
        for (String windowHandle : DriverFactory.getDriver().getWindowHandles()) {
            if(!originalWindow.contentEquals(windowHandle)) {
                DriverFactory.getDriver().switchTo().window(windowHandle);
                break;
            }
        }
    }
}

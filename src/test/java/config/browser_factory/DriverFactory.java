package config.browser_factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.BasePage;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    public DriverFactory() {
    }

    private static WebDriver driver;

    public static WebDriver getDriver(){

        try {
            if(driver == null){
                switch(DriverType.browser){
                    case CHROME:
                        System.setProperty("webdriver.chrome.driver","D:\\Projetos\\DesafioInmetrics\\src\\test\\java\\resources\\chromedriver\\chromedriver.exe");
                        ChromeOptions options = new ChromeOptions();
                        driver = new ChromeDriver(options);
                        break;
                }
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("https://www.inmetrics.com.br/");
                //BasePage.openHomePage();

            }
        } catch (Exception e) {

        }
        return driver;
    }
    public static void killDriver() {
        if (driver != null) {
            driver.close();
            driver = null;
        }
    }
}

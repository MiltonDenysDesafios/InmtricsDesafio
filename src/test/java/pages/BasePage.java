package pages;

import config.browser_factory.DriverFactory;
import io.github.cdimascio.dotenv.Dotenv;

public class BasePage {
    public static void openHomePage() throws Exception {
        Dotenv dotenv = Dotenv.load();
        //DriverFactory.getDriver().get(dotenv.get("APP_URL"));
        DriverFactory.getDriver().get("https://www.inmetrics.com.br/");
    }

}

package config.hooks;

import config.browser_factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import resources.ApiSetup;


public class Hooks {

    @Before
    public void init() {
        ApiSetup.setup();
        //DriverFactory.getDriver();
    }

    @After
    public void finish() {
        //DriverFactory.killDriver();
    }
}

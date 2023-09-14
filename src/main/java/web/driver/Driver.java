package web.driver;

import org.openqa.selenium.WebDriver;
import web.config.factory.ConfigFactory;
import web.driver.entity.WebDriverData;
import web.driver.factory.DriverFactory;
import java.util.Objects;

public final class Driver {

    private Driver() {
    }

    public static void initDriverForWeb() {
        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(ConfigFactory.getConfig().browser(), ConfigFactory.getConfig().browserRemoteMode());
            WebDriver driver = DriverFactory
                    .getDriverForWeb(ConfigFactory.getConfig().browserRunMode())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().get(ConfigFactory.getConfig().webUrl());
        }
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }
    }
}

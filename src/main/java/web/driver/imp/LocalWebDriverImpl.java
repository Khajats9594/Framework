package web.driver.imp;

import org.openqa.selenium.WebDriver;
import web.driver.IWebDriver;
import web.driver.entity.WebDriverData;
import web.driver.factory.local.LocalDriverFactory;

public class LocalWebDriverImpl implements IWebDriver {

    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return LocalDriverFactory.getDriver(driverData.getBrowserType());
    }
}

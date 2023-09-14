package web.driver.factory.local;

import org.openqa.selenium.WebDriver;
import web.driver.IWebDriver;
import web.driver.entity.WebDriverData;
import web.driver.factory.remote.RemoteDriverFactory;

public class RemoteWebDriverImpl implements IWebDriver {
    @Override
    public WebDriver getDriver(WebDriverData driverData) {
        return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
    }
}

package web.driver;

import org.openqa.selenium.WebDriver;
import web.driver.entity.WebDriverData;

public interface IWebDriver {
    WebDriver getDriver(WebDriverData driverData);
}


package web.driver.factory.local;

import org.openqa.selenium.WebDriver;
import web.driver.manager.local.ChromeManager;
import web.driver.manager.local.FirefoxManager;
import web.enums.BrowserType;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }
    private static final Map<BrowserType, Supplier<WebDriver>> MAP =
            new EnumMap<>(BrowserType.class);

    static {
        MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
        MAP.put(BrowserType.FIREFOX, FirefoxManager::getDriver);
    }
    public static WebDriver getDriver(BrowserType browserType) {
        return MAP.get(browserType).get();
    }
}

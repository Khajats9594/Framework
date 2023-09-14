package web.driver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import web.enums.BrowserRemoteModeType;
import web.enums.BrowserType;

@AllArgsConstructor
@Getter
public class WebDriverData {
    private BrowserType browserType;
    private BrowserRemoteModeType browserRemoteModeType;
}


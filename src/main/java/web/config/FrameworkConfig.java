package web.config;

import org.aeonbits.owner.Config;
import web.config.converters.StringToBrowserTypeConverter;
import web.config.converters.StringToRemoteModeBrowserTypeConverter;
import web.config.converters.StringToRunModeBrowserTypeConverter;
import web.config.converters.StringToURLConverter;
import web.enums.BrowserRemoteModeType;
import web.enums.BrowserType;
import web.enums.RunModeType;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        "file:${user.dir}/src/test/resources/staging-config.properties",
        "file:${user.dir}/src/test/resources/dev-config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("staging")
    String environment();

    @Key("${environment}.webUrl")
    String webUrl();

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBrowser")
    @ConverterClass(StringToRunModeBrowserTypeConverter.class)
    RunModeType browserRunMode();

    @Key("browserRemoteMode")
    @ConverterClass(StringToRemoteModeBrowserTypeConverter.class)
    BrowserRemoteModeType browserRemoteMode();

    @ConverterClass(StringToURLConverter.class)
    URL seleniumGridURL();

}

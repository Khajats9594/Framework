package web.config.factory;

import org.aeonbits.owner.ConfigCache;
import web.config.BrowserStackConfig;

public final class BrowserStackConfigFactory {

    private BrowserStackConfigFactory() {
    }

    public static BrowserStackConfig getConfig() {
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}

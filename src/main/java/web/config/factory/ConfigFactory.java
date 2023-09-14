package web.config.factory;

import org.aeonbits.owner.ConfigCache;
import web.config.FrameworkConfig;

public final class ConfigFactory {

    private ConfigFactory() {
    }

    public static FrameworkConfig getConfig() {
        return ConfigCache.getOrCreate(FrameworkConfig.class);
    }
}

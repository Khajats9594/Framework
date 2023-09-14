package org.example.test;



import org.testng.annotations.Test;
import web.config.FrameworkConfig;
import web.config.factory.ConfigFactory;
import web.enums.ConfigProperties;
import web.utils.PropertyUtils;

public class Sample {

    @Test
    public static void test() {
        //Driver.initDriverForWeb();
        FrameworkConfig config = ConfigFactory.getConfig();
        System.out.println(config.webUrl());
//        String url = PropertyUtils.get(ConfigProperties.RUNMODEBROWSER);
//        System.out.println(url);

    }
}

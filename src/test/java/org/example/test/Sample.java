package org.example.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import web.config.FrameworkConfig;
import web.config.factory.ConfigFactory;

public class Sample {

    private static final Logger log = LoggerFactory.getLogger(Sample.class);
    @Test
    public  void test() {
        //Driver.initDriverForWeb();
//        log.error("Testing the config file properties");
//        log.info("Testing the config file properties");
//        log.debug("Testing the config file properties");
        FrameworkConfig config = ConfigFactory.getConfig();
        String url1 = config.webUrl();
        System.out.println(url1);
        log.warn("URl used {} :",url1);
//        String url = PropertyUtils.get(ConfigProperties.BROWSER);
//        System.out.println(url);

    }
}

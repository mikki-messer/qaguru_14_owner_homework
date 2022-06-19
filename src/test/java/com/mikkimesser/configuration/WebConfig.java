package com.mikkimesser.configuration;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${env}.properties")
public interface WebConfig extends Config {
    @Key("browser")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("remoteWebDriver")
    String remoteWebDriver();
}

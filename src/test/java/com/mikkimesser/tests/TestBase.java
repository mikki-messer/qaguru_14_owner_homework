package com.mikkimesser.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.mikkimesser.configuration.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    public static void setUp()
    {
        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

        Configuration.browser = webConfig.browser();
        Configuration.browserVersion = webConfig.browserVersion();
        Configuration.remote = webConfig.remoteWebDriver();

        Configuration.baseUrl = "https://redrift.com";
    }
}

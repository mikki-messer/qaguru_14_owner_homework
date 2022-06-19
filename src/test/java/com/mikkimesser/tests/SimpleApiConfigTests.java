package com.mikkimesser.tests;

import com.mikkimesser.configuration.ApiConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleApiConfigTests {

    @Test
    @Tag("propFileTest")
    @DisplayName("Api Config Test taking token from the file")
    public void apiConfigFileTest()
    {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        System.out.println(apiConfig.baseURL());
        System.out.println(apiConfig.token());
        assertThat(apiConfig.baseURL()).isEqualTo("https://github.com");
        assertThat(apiConfig.token()).isEqualTo("GlobalDrakkar2022");
    }

    @Test
    @Tag("syspPropTest")
    @DisplayName("Api Config Test taking token from the system properties")
    public void apiConfigPropTest()
    {
        ApiConfig apiConfig = ConfigFactory.create(ApiConfig.class, System.getProperties());
        System.out.println(apiConfig.baseURL());
        System.out.println(apiConfig.token());
        assertThat(apiConfig.baseURL()).isEqualTo("https://google.com");
        assertThat(apiConfig.token()).isEqualTo("MiniSmurf2022");
    }
}

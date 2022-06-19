package com.mikkimesser.configuration;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
                "file:/tmp/secret.properties", //file is missing, just as an illustration
                "classpath:config/ApiConfig.properties"})
public interface ApiConfig extends Config {
    @Key("baseUrl")
    String baseURL();

    @Key("token")
    String token();
}


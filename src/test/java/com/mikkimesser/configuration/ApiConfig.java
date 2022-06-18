package com.mikkimesser.configuration;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources("file:/tmp/secret.properties")
public interface ApiConfig extends Config {
    @Key("baseUrl")
    String baseURL();

    @Key("token")
    String token();
}

package com.github.thriveframework.support.mongo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Slf4j
@PropertySource({
    "classpath:/thrive-support/mongo.properties",
})
@Import(ThriveMongoConfig.LocalProfile.class)
public class ThriveMongoConfig {
    @Configuration
    @Profile("local")
    @PropertySource({
        "classpath:/thrive-support/mongo-local.properties",
    })
    public static class LocalProfile {

    }
}

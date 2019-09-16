package com.github.thriveframework.support.mongo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * This has no -Reactive- infix, because this only provides property sources right now.
 * If we'd want blocking Mongo support as well, we should split this module into
 * core/reactive/blocking and keep properties as close as possible.
 */
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

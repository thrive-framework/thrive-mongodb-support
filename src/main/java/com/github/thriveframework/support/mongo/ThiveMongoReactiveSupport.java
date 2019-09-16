package com.github.thriveframework.support.mongo;

import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@EnableReactiveMongoRepositories
@Import({ThriveMongoConfig.class, })
public @interface ThiveMongoReactiveSupport {
}

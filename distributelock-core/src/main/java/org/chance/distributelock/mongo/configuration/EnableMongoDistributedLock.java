package org.chance.distributelock.mongo.configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.chance.distributelock.core.configuration.DistributedLockConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({DistributedLockConfiguration.class, MongoDistributedLockConfiguration.class})
public @interface EnableMongoDistributedLock {
}
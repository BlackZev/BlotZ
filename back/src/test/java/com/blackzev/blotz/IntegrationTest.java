package com.blackzev.blotz;

import com.blackzev.blotz.config.AsyncSyncConfiguration;
import com.blackzev.blotz.config.EmbeddedRedis;
import com.blackzev.blotz.config.EmbeddedSQL;
import com.blackzev.blotz.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { BlotzBackApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedRedis
@EmbeddedSQL
public @interface IntegrationTest {
}

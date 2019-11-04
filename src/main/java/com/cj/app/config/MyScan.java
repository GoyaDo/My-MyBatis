package com.cj.app.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author cj
 * @date 2019-11-04 - 23:11
 */
@Import(MyBeanFactoryPostProcessor.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyScan {
}

package com.mindlin.m2hw.sql;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SQLSerializable {
	String value() default "";
}

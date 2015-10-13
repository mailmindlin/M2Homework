package com.mindlin.m2hw.sql;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SQLSerializableField {
	String name() default "";
	StdSQLDataType type() default StdSQLDataType.DETECT;
	String arg() default "";
}

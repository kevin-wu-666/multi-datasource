package com.wjl.multidatasource.annotation;

import com.wjl.multidatasource.configure.DBType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author kevin.wu
 * @date 2019/7/3 16:50
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface DataSourceType {
	DBType type() default DBType.MASTER;
}

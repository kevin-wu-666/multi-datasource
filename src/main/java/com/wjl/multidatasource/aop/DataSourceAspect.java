package com.wjl.multidatasource.aop;

import com.wjl.multidatasource.annotation.DataSourceType;
import com.wjl.multidatasource.configure.DBType;
import com.wjl.multidatasource.configure.DataSourceContextHolder;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @author kevin.wu
 * @date 2019/7/3 16:57
 */
@Aspect
@Component
@Slf4j
public class DataSourceAspect {

	@Autowired
	private DataSourceContextHolder holder;

	@Pointcut("@annotation(com.wjl.multidatasource.annotation.DataSourceType)")
	public void pointCut(){ }

	@Before("pointCut()")
	public void test(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		Annotation annotation = method.getAnnotation(DataSourceType.class);
		if (annotation != null){
			DataSourceType type = ((DataSourceType) annotation);
			if (type.type().equals(DBType.MASTER)){
				holder.set(DBType.MASTER);
				log.info("master dataSource");
			}else {
				holder.set(DBType.SLAVE1);
				log.info("slave1 dataSource");
			}
		}
	}
}

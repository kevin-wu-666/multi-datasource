package com.wjl.multidatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 需要排除 springBoot 自带的自动配置对象DataSourceAutoConfiguration，因为系统使用了数据源路由对象 DynamicDataSource
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
@EnableTransactionManagement
public class MultiDatasourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiDatasourceApplication.class, args);
	}

}

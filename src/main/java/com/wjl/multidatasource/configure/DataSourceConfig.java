package com.wjl.multidatasource.configure;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kevin.wu
 * @date 2019/7/3 18:06
 */
@Configuration
public class DataSourceConfig {

	@Bean("myDataSource")
	@Primary
	public DataSource dataSource(){
		Map<Object, Object> targetDataSources = new HashMap<>(3);
		targetDataSources.put(DBType.MASTER, masterDataSource());
		targetDataSources.put(DBType.SLAVE1, slave1DataSource());
		DynamicDataSource dynamicDataSource = new DynamicDataSource();
		dynamicDataSource.setDefaultTargetDataSource(masterDataSource());
		dynamicDataSource.setTargetDataSources(targetDataSources);
		dynamicDataSource.afterPropertiesSet();
		return dynamicDataSource;
	}

	@Bean("masterDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.master")
	public DataSource masterDataSource(){
		return DruidDataSourceBuilder.create().build();
	}

	@Bean("slave1DataSource")
	@ConfigurationProperties(prefix = "spring.datasource.slave1")
	public DataSource slave1DataSource(){
		return DruidDataSourceBuilder.create().build();
	}

}

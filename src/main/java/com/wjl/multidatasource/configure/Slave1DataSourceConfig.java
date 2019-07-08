/*
package com.wjl.multidatasource.configure;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

*/
/**
 * @author kevin.wu
 * @date 2019/7/3 16:34
 *//*

@Configuration
@MapperScan(basePackages = "com.wjl.multidatasource.dao.master",sqlSessionFactoryRef = "slave1SqlSessionFactory")
public class Slave1DataSourceConfig {

	@Bean("slave1DataSource")
	@ConfigurationProperties(prefix = "spring.datasource.slave1")
	public DataSource slave1DataSource(){
		return DruidDataSourceBuilder.create().build();
	}

	@Bean("slave1DataSourceTransactionManager")
	public DataSourceTransactionManager slave1DataSourceTransactionManager(){
		return new DataSourceTransactionManager(slave1DataSource());
	}

	@Bean("slave1SqlSessionFactory")
	public SqlSessionFactory slave1SqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(slave1DataSource());
		return sqlSessionFactoryBean.getObject();
	}
}
*/

/*
package com.wjl.multidatasource.configure;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

*/
/**
 * @author kevin.wu
 * @date 2019/7/3 16:02
 *//*

@Configuration
@MapperScan(basePackages = "com.wjl.multidatasource.dao.master",sqlSessionFactoryRef = "masterSqlSessionFactory")
public class MasterDataSourceConfig {

	@Bean("masterDataSource")
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource.master")
	public DataSource masterDataSource(){
		return DruidDataSourceBuilder.create().build();
	}

	@Bean("masterDataSourceTransactionManager")
	@Primary
	public DataSourceTransactionManager masterDataSourceTransactionManager(){
		return new DataSourceTransactionManager(masterDataSource());
	}

	@Bean("masterSqlSessionFactory")
	@Primary
	public SqlSessionFactory masterSqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(masterDataSource());
		return sqlSessionFactoryBean.getObject();
	}

}
*/

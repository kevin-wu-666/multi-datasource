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

/**
 * @author kevin.wu
 * @date 2019/7/3 16:34
 */

@Configuration
@MapperScan(basePackages = "com.wjl.multidatasource.dao.slave2",sqlSessionFactoryRef = "slave2SqlSessionFactory")
public class Slave2DataSourceConfig {

	@Bean("slave2DataSource")
	@ConfigurationProperties(prefix = "spring.datasource.slave2")
	public DataSource slave2DataSource(){
		return DruidDataSourceBuilder.create().build();
	}

	@Bean("slave2DataSourceTransactionManager")
	public DataSourceTransactionManager slave2DataSourceTransactionManager(){
		return new DataSourceTransactionManager(slave2DataSource());
	}

	@Bean("slave2SqlSessionFactory")
	public SqlSessionFactory slave2SqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(slave2DataSource());
		return sqlSessionFactoryBean.getObject();
	}
}

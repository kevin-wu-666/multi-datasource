package com.wjl.multidatasource.configure;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author kevin.wu
 * @date 2019/7/3 19:04
 */
@Configuration
@MapperScan(basePackages = "com.wjl.multidatasource.dao.master",sqlSessionFactoryRef = "mySqlSessionFactory")
public class SessionFactoryConfig {

	@Resource(name = "myDataSource")
	private DataSource dataSource;

	@Bean("myDataSourceTransactionManager")
	@Primary
	public DataSourceTransactionManager masterDataSourceTransactionManager(){
		return new DataSourceTransactionManager(dataSource);
	}

	@Bean("mySqlSessionFactory")
	@Primary
	public SqlSessionFactory masterSqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		return sqlSessionFactoryBean.getObject();
	}
}

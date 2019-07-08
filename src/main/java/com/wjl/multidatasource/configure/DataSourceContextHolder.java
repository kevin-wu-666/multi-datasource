package com.wjl.multidatasource.configure;

import org.springframework.stereotype.Component;

/**
 * @author kevin.wu
 * @date 2019/7/3 17:50
 */
@Component
public class DataSourceContextHolder {

	private static ThreadLocal<DBType> threadLocal = new ThreadLocal<>();

	public DataSourceContextHolder() {
		threadLocal.set(DBType.MASTER);
	}

	public static void set(DBType type){
		threadLocal.set(type);
	}

	public static DBType get(){
		return threadLocal.get();
	}
}

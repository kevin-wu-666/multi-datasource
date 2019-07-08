package com.wjl.multidatasource.service;

import com.wjl.multidatasource.model.Slave2;

import java.util.List;

/**
 * @author kevin.wu
 * @date 2019/7/4 16:10
 */
public interface Slave2Service {

	List<Slave2> list();

	Slave2 findById(Integer id);
}

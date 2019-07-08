package com.wjl.multidatasource.service;

import com.wjl.multidatasource.model.Master;

import java.util.List;

/**
 * @author kevin.wu
 * @date 2019/7/4 16:10
 */
public interface MasterService {

	List<Master> list();

	Master findById(Integer id);

	void update(String name, Integer id);
}

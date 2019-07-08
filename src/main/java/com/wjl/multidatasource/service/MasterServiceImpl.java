package com.wjl.multidatasource.service;

import com.wjl.multidatasource.annotation.DataSourceType;
import com.wjl.multidatasource.configure.DBType;
import com.wjl.multidatasource.dao.master.MasterDao;
import com.wjl.multidatasource.model.Master;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kevin.wu
 * @date 2019/7/4 16:11
 */
@Service
@Transactional
public class MasterServiceImpl implements MasterService {

	@Autowired
	private MasterDao masterDao;

	@DataSourceType(type = DBType.SLAVE1)
	@Override
	public List<Master> list() {
		return masterDao.list();
	}

	@DataSourceType(type = DBType.SLAVE1)
	@Override
	public Master findById(Integer id) {
		return masterDao.findById(id);
	}

	@DataSourceType(type = DBType.MASTER)
	@Override
	public void update(String name, Integer id) {
		masterDao.update(name,id);
	}
}

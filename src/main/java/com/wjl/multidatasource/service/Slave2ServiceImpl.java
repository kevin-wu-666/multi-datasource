package com.wjl.multidatasource.service;

import com.wjl.multidatasource.dao.slave2.Slave2Dao;
import com.wjl.multidatasource.model.Slave2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kevin.wu
 * @date 2019/7/4 16:11
 */
@Service
public class Slave2ServiceImpl implements Slave2Service {

	@Autowired
	private Slave2Dao slave2Dao;

	@Override
	public List<Slave2> list() {
		return slave2Dao.list();
	}

	@Override
	public Slave2 findById(Integer id) {
		return slave2Dao.findById(id);
	}
}

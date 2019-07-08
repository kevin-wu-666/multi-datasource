package com.wjl.multidatasource.dao.slave2;

import com.wjl.multidatasource.model.Slave2;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface Slave2Dao {
	@Select("select * from test_user")
	List<Slave2> list();

	@Select("select * from test_user where id = #{id}")
	Slave2 findById(Integer id);
}

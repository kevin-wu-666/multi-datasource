package com.wjl.multidatasource.dao.master;

import com.wjl.multidatasource.model.Master;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface MasterDao {
	@Select("select * from master")
	List<Master> list();

	@Select("select * from master where id = #{id}")
	Master findById(Integer id);

	@Update("update master set name = #{name} where id = #{id}")
	void update(@Param("name") String name, @Param("id") Integer id);
}

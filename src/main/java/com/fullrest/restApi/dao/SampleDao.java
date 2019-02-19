package com.fullrest.restApi.dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.fullrest.restApi.entity.SampleEntity;

@Dao
@ConfigAutowireable
public interface SampleDao {

	@Select	
	List<SampleEntity> selectAll();

}

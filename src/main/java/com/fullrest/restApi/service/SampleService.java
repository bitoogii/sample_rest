package com.fullrest.restApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fullrest.restApi.dao.SampleDao;
import com.fullrest.restApi.entity.SampleEntity;

@Component
public class SampleService {

	@Autowired
	private SampleDao dao;

	public List<SampleEntity> getAll(){
		return dao.selectAll();
	}
}

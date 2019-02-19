package com.fullrest.restApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullrest.restApi.entity.SampleEntity;
import com.fullrest.restApi.service.SampleService;

@RestController
@Transactional
public class SampleController {

	@Autowired
	private SampleService sampleService;

	@GetMapping("/sample")
    public List<SampleEntity> selectAll() {
        return sampleService.getAll();
    }
}

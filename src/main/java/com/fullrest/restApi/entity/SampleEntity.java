package com.fullrest.restApi.entity;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "sample")
public class SampleEntity {

	@Id
	private int id;

	private String name;
}

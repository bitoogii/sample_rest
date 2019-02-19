package com.fullrest.restApi.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class UserDetails {

	private String id;

	private String name;

	private String email;
	private String password;

	private String address;



}

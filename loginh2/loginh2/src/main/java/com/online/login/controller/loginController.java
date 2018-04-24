package com.online.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class loginController {

	@Autowired
	private JdbcTemplate jdbctemplate;
	
	@RequestMapping(value="/createtable",method = RequestMethod.GET)
	public void createTable() {
		
		try {
			
			jdbctemplate.execute("create Table user(" +
							"id SERIAL, username VARCHAR(10), password VARCHAR(15))");
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@RequestMapping(value="/adduser", method = RequestMethod.GET)
	public void PutData() {
		try{
			jdbctemplate.execute("insert into user(id,username,password) VALUES (1,'sitha','sairam007')");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}


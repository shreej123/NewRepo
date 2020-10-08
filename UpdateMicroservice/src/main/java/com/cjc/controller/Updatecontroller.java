package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.Customer;
import com.cjc.service.updateservice;

@RestController
public class Updatecontroller {

	@Autowired
	updateservice us;

	
	@PutMapping("/upd")
	public String update(@RequestBody Customer c)
	{
		us.update(c);
		System.out.println("new update commit");
		return "Update Succefully";
				
	}
		
	
}

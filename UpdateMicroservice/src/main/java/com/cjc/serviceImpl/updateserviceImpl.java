package com.cjc.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.Customer;
import com.cjc.repository.UpdateRepository;
import com.cjc.service.updateservice;

@Service
public class updateserviceImpl implements updateservice{

	@Autowired
	UpdateRepository ur;

	@Override
	public void update(Customer c) {
   System.out.println("in update save");
		ur.save(c);
		
	}



	
	
}

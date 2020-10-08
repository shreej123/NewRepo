package com.cjc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cjc.model.Customer;

@Repository
public interface UpdateRepository extends JpaRepository<Customer, Integer>
{

	

}

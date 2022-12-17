package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Bill;


@Repository
public interface BillRepository extends CrudRepository<Bill, Integer> {
	
}

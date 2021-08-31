package com.bhn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bhn.model.AddressModel;
import com.bhn.model.OrderCentralModel;
import com.bhn.repository.AddressRepo;

@RestController
public class AddressController {
@Autowired
	private AddressRepo repo;
@GetMapping("/findAddress")
public List<OrderCentralModel> getDetails()
{
	return repo.findAll();
}
	
}
